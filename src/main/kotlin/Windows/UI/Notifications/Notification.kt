package Windows.UI.Notifications

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.interfaces.IActivationFactory
import com.github.knk190001.winrtbinding.runtime.interfaces.IActivationFactory.Companion.IID
import com.github.knk190001.winrtbinding.runtime.interfaces.IUnknownVtbl
import com.github.knk190001.winrtbinding.runtime.interfaces.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.interfaces.IWinRTObject
import com.github.knk190001.winrtbinding.runtime.interfaces.getValue
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import kotlin.Array
import kotlin.Unit

public class Notification(
  ptr: Pointer? = Pointer.NULL,
) : PointerType(ptr), INotification, IWinRTObject {
  public val INotification_Interface: INotification by lazy {
    asINotification()
  }


  public override val INotification_Ptr: Pointer? by lazy {
    INotification_Interface.INotification_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(INotification_Interface)

  public constructor() : this(ABI.activate())

  private fun asINotification(): INotification {
    if(pointer == Pointer.NULL) {
      return(INotification.ABI.makeINotification(Pointer.NULL))
    }
    val refiid = Guid.REFIID(INotification.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(INotification.ABI.makeINotification(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue(): Notification = Notification(pointer.getPointer(0))

    public fun setValue(`value`: Notification): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Notifications.Notification".toHandle(),refiid,iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): Pointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }
  }
}

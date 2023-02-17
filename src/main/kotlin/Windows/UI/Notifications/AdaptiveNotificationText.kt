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

public class AdaptiveNotificationText(
  ptr: Pointer? = Pointer.NULL,
) : PointerType(ptr), IAdaptiveNotificationText, IAdaptiveNotificationContent, IWinRTObject {
  public val IAdaptiveNotificationText_Interface: IAdaptiveNotificationText by lazy {
    asIAdaptiveNotificationText()
  }


  public val IAdaptiveNotificationContent_Interface: IAdaptiveNotificationContent by lazy {
    asIAdaptiveNotificationContent()
  }


  public override val IAdaptiveNotificationText_Ptr: Pointer? by lazy {
    IAdaptiveNotificationText_Interface.IAdaptiveNotificationText_Ptr
  }


  public override val IAdaptiveNotificationContent_Ptr: Pointer? by lazy {
    IAdaptiveNotificationContent_Interface.IAdaptiveNotificationContent_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(IAdaptiveNotificationText_Interface, IAdaptiveNotificationContent_Interface)

  public constructor() : this(ABI.activate())

  private fun asIAdaptiveNotificationText(): IAdaptiveNotificationText {
    if(pointer == Pointer.NULL) {
      return(IAdaptiveNotificationText.ABI.makeIAdaptiveNotificationText(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IAdaptiveNotificationText.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAdaptiveNotificationText.ABI.makeIAdaptiveNotificationText(ref.value))
  }

  private fun asIAdaptiveNotificationContent(): IAdaptiveNotificationContent {
    if(pointer == Pointer.NULL) {
      return(IAdaptiveNotificationContent.ABI.makeIAdaptiveNotificationContent(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IAdaptiveNotificationContent.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAdaptiveNotificationContent.ABI.makeIAdaptiveNotificationContent(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue(): AdaptiveNotificationText =
        AdaptiveNotificationText(pointer.getPointer(0))

    public fun setValue(`value`: AdaptiveNotificationText): Unit {
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
          INSTANCE.RoGetActivationFactory("Windows.UI.Notifications.AdaptiveNotificationText".toHandle(),refiid,iAFPtr)
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

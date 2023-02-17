package Windows.UI.Notifications

import Windows.Data.Xml.Dom.XmlDocument
import Windows.UI.Notifications.ITileFlyoutNotificationFactory.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.checkHR
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

public class TileFlyoutNotification(
  ptr: Pointer? = Pointer.NULL,
) : PointerType(ptr), ITileFlyoutNotification, IWinRTObject {
  public val ITileFlyoutNotification_Interface: ITileFlyoutNotification by lazy {
    asITileFlyoutNotification()
  }


  public override val ITileFlyoutNotification_Ptr: Pointer? by lazy {
    ITileFlyoutNotification_Interface.ITileFlyoutNotification_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(ITileFlyoutNotification_Interface)

  public constructor(content: XmlDocument) : this(ABI.activate(content))

  private fun asITileFlyoutNotification(): ITileFlyoutNotification {
    if(pointer == Pointer.NULL) {
      return(ITileFlyoutNotification.ABI.makeITileFlyoutNotification(Pointer.NULL))
    }
    val refiid = Guid.REFIID(ITileFlyoutNotification.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITileFlyoutNotification.ABI.makeITileFlyoutNotification(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue(): TileFlyoutNotification = TileFlyoutNotification(pointer.getPointer(0))

    public fun setValue(`value`: TileFlyoutNotification): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI {
    public val ITileFlyoutNotificationFactory_Instance: ITileFlyoutNotificationFactory by lazy {
      createITileFlyoutNotificationFactory()
    }


    public fun createITileFlyoutNotificationFactory(): ITileFlyoutNotificationFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Notifications.TileFlyoutNotification".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ITileFlyoutNotificationFactory.ABI.makeITileFlyoutNotificationFactory(factoryActivatorPtr.value))
    }

    public fun activate(content: XmlDocument): Pointer =
        ITileFlyoutNotificationFactory_Instance.CreateTileFlyoutNotification(content).pointer
  }
}

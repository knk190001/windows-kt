package Windows.UI.Notifications

import Windows.Data.Xml.Dom.XmlDocument
import Windows.UI.Notifications.IBadgeNotificationFactory.ABI.IID
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

public class BadgeNotification(
  ptr: Pointer? = Pointer.NULL,
) : PointerType(ptr), IBadgeNotification, IWinRTObject {
  public val IBadgeNotification_Interface: IBadgeNotification by lazy {
    asIBadgeNotification()
  }


  public override val IBadgeNotification_Ptr: Pointer? by lazy {
    IBadgeNotification_Interface.IBadgeNotification_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(IBadgeNotification_Interface)

  public constructor(content: XmlDocument) : this(ABI.activate(content))

  private fun asIBadgeNotification(): IBadgeNotification {
    if(pointer == Pointer.NULL) {
      return(IBadgeNotification.ABI.makeIBadgeNotification(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IBadgeNotification.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBadgeNotification.ABI.makeIBadgeNotification(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue(): BadgeNotification = BadgeNotification(pointer.getPointer(0))

    public fun setValue(`value`: BadgeNotification): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI {
    public val IBadgeNotificationFactory_Instance: IBadgeNotificationFactory by lazy {
      createIBadgeNotificationFactory()
    }


    public fun createIBadgeNotificationFactory(): IBadgeNotificationFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Notifications.BadgeNotification".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IBadgeNotificationFactory.ABI.makeIBadgeNotificationFactory(factoryActivatorPtr.value))
    }

    public fun activate(content: XmlDocument): Pointer =
        IBadgeNotificationFactory_Instance.CreateBadgeNotification(content).pointer
  }
}

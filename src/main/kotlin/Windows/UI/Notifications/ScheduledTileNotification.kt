package Windows.UI.Notifications

import Windows.Data.Xml.Dom.XmlDocument
import Windows.Foundation.DateTime
import Windows.UI.Notifications.IScheduledTileNotificationFactory.ABI.IID
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

public class ScheduledTileNotification(
  ptr: Pointer? = Pointer.NULL,
) : PointerType(ptr), IScheduledTileNotification, IWinRTObject {
  public val IScheduledTileNotification_Interface: IScheduledTileNotification by lazy {
    asIScheduledTileNotification()
  }


  public override val IScheduledTileNotification_Ptr: Pointer? by lazy {
    IScheduledTileNotification_Interface.IScheduledTileNotification_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(IScheduledTileNotification_Interface)

  public constructor(content: XmlDocument, deliveryTime: DateTime.ByValue) :
      this(ABI.activate(content, deliveryTime))

  private fun asIScheduledTileNotification(): IScheduledTileNotification {
    if(pointer == Pointer.NULL) {
      return(IScheduledTileNotification.ABI.makeIScheduledTileNotification(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IScheduledTileNotification.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IScheduledTileNotification.ABI.makeIScheduledTileNotification(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue(): ScheduledTileNotification =
        ScheduledTileNotification(pointer.getPointer(0))

    public fun setValue(`value`: ScheduledTileNotification): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI {
    public val IScheduledTileNotificationFactory_Instance: IScheduledTileNotificationFactory by
        lazy {
      createIScheduledTileNotificationFactory()
    }


    public fun createIScheduledTileNotificationFactory(): IScheduledTileNotificationFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Notifications.ScheduledTileNotification".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IScheduledTileNotificationFactory.ABI.makeIScheduledTileNotificationFactory(factoryActivatorPtr.value))
    }

    public fun activate(content: XmlDocument, deliveryTime: DateTime.ByValue): Pointer =
        IScheduledTileNotificationFactory_Instance.CreateScheduledTileNotification(content,
        deliveryTime).pointer
  }
}

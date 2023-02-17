package Windows.UI.Notifications

import Windows.Data.Xml.Dom.XmlDocument
import Windows.Foundation.DateTime
import Windows.Foundation.TimeSpan
import Windows.UI.Notifications.IScheduledToastNotificationFactory.ABI.IID
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
import com.sun.jna.platform.win32.WinDef
import com.sun.jna.ptr.PointerByReference
import kotlin.Array
import kotlin.Unit

public class ScheduledToastNotification(
  ptr: Pointer? = Pointer.NULL,
) : PointerType(ptr), IScheduledToastNotification, IScheduledToastNotification2,
    IScheduledToastNotification3, IScheduledToastNotification4, IWinRTObject {
  public val IScheduledToastNotification_Interface: IScheduledToastNotification by lazy {
    asIScheduledToastNotification()
  }


  public val IScheduledToastNotification2_Interface: IScheduledToastNotification2 by lazy {
    asIScheduledToastNotification2()
  }


  public val IScheduledToastNotification3_Interface: IScheduledToastNotification3 by lazy {
    asIScheduledToastNotification3()
  }


  public val IScheduledToastNotification4_Interface: IScheduledToastNotification4 by lazy {
    asIScheduledToastNotification4()
  }


  public override val IScheduledToastNotification_Ptr: Pointer? by lazy {
    IScheduledToastNotification_Interface.IScheduledToastNotification_Ptr
  }


  public override val IScheduledToastNotification2_Ptr: Pointer? by lazy {
    IScheduledToastNotification2_Interface.IScheduledToastNotification2_Ptr
  }


  public override val IScheduledToastNotification3_Ptr: Pointer? by lazy {
    IScheduledToastNotification3_Interface.IScheduledToastNotification3_Ptr
  }


  public override val IScheduledToastNotification4_Ptr: Pointer? by lazy {
    IScheduledToastNotification4_Interface.IScheduledToastNotification4_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(IScheduledToastNotification_Interface, IScheduledToastNotification2_Interface,
        IScheduledToastNotification3_Interface, IScheduledToastNotification4_Interface)

  public constructor(content: XmlDocument, deliveryTime: DateTime.ByValue) :
      this(ABI.activate(content, deliveryTime))

  public constructor(
    content: XmlDocument,
    deliveryTime: DateTime.ByValue,
    snoozeInterval: TimeSpan.ByValue,
    maximumSnoozeCount: WinDef.UINT,
  ) : this(ABI.activate(content, deliveryTime, snoozeInterval, maximumSnoozeCount))

  private fun asIScheduledToastNotification(): IScheduledToastNotification {
    if(pointer == Pointer.NULL) {
      return(IScheduledToastNotification.ABI.makeIScheduledToastNotification(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IScheduledToastNotification.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IScheduledToastNotification.ABI.makeIScheduledToastNotification(ref.value))
  }

  private fun asIScheduledToastNotification2(): IScheduledToastNotification2 {
    if(pointer == Pointer.NULL) {
      return(IScheduledToastNotification2.ABI.makeIScheduledToastNotification2(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IScheduledToastNotification2.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IScheduledToastNotification2.ABI.makeIScheduledToastNotification2(ref.value))
  }

  private fun asIScheduledToastNotification3(): IScheduledToastNotification3 {
    if(pointer == Pointer.NULL) {
      return(IScheduledToastNotification3.ABI.makeIScheduledToastNotification3(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IScheduledToastNotification3.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IScheduledToastNotification3.ABI.makeIScheduledToastNotification3(ref.value))
  }

  private fun asIScheduledToastNotification4(): IScheduledToastNotification4 {
    if(pointer == Pointer.NULL) {
      return(IScheduledToastNotification4.ABI.makeIScheduledToastNotification4(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IScheduledToastNotification4.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IScheduledToastNotification4.ABI.makeIScheduledToastNotification4(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue(): ScheduledToastNotification =
        ScheduledToastNotification(pointer.getPointer(0))

    public fun setValue(`value`: ScheduledToastNotification): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI {
    public val IScheduledToastNotificationFactory_Instance: IScheduledToastNotificationFactory by
        lazy {
      createIScheduledToastNotificationFactory()
    }


    public fun createIScheduledToastNotificationFactory(): IScheduledToastNotificationFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Notifications.ScheduledToastNotification".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IScheduledToastNotificationFactory.ABI.makeIScheduledToastNotificationFactory(factoryActivatorPtr.value))
    }

    public fun activate(content: XmlDocument, deliveryTime: DateTime.ByValue): Pointer =
        IScheduledToastNotificationFactory_Instance.CreateScheduledToastNotification(content,
        deliveryTime).pointer

    public fun activate(
      content: XmlDocument,
      deliveryTime: DateTime.ByValue,
      snoozeInterval: TimeSpan.ByValue,
      maximumSnoozeCount: WinDef.UINT,
    ): Pointer =
        IScheduledToastNotificationFactory_Instance.CreateScheduledToastNotificationRecurring(content,
        deliveryTime, snoozeInterval, maximumSnoozeCount).pointer
  }
}

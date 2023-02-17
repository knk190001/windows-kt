package Windows.UI.Notifications

import Windows.Data.Xml.Dom.XmlDocument
import Windows.UI.Notifications.IToastNotificationFactory.ABI.IID
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

public class ToastNotification(
  ptr: Pointer? = Pointer.NULL,
) : PointerType(ptr), IToastNotification, IToastNotification2, IToastNotification3,
    IToastNotification4, IToastNotification6, IWinRTObject {
  public val IToastNotification_Interface: IToastNotification by lazy {
    asIToastNotification()
  }


  public val IToastNotification2_Interface: IToastNotification2 by lazy {
    asIToastNotification2()
  }


  public val IToastNotification3_Interface: IToastNotification3 by lazy {
    asIToastNotification3()
  }


  public val IToastNotification4_Interface: IToastNotification4 by lazy {
    asIToastNotification4()
  }


  public val IToastNotification6_Interface: IToastNotification6 by lazy {
    asIToastNotification6()
  }


  public override val IToastNotification_Ptr: Pointer? by lazy {
    IToastNotification_Interface.IToastNotification_Ptr
  }


  public override val IToastNotification2_Ptr: Pointer? by lazy {
    IToastNotification2_Interface.IToastNotification2_Ptr
  }


  public override val IToastNotification3_Ptr: Pointer? by lazy {
    IToastNotification3_Interface.IToastNotification3_Ptr
  }


  public override val IToastNotification4_Ptr: Pointer? by lazy {
    IToastNotification4_Interface.IToastNotification4_Ptr
  }


  public override val IToastNotification6_Ptr: Pointer? by lazy {
    IToastNotification6_Interface.IToastNotification6_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(IToastNotification_Interface, IToastNotification2_Interface,
        IToastNotification3_Interface, IToastNotification4_Interface, IToastNotification6_Interface)

  public constructor(content: XmlDocument) : this(ABI.activate(content))

  private fun asIToastNotification(): IToastNotification {
    if(pointer == Pointer.NULL) {
      return(IToastNotification.ABI.makeIToastNotification(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IToastNotification.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IToastNotification.ABI.makeIToastNotification(ref.value))
  }

  private fun asIToastNotification2(): IToastNotification2 {
    if(pointer == Pointer.NULL) {
      return(IToastNotification2.ABI.makeIToastNotification2(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IToastNotification2.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IToastNotification2.ABI.makeIToastNotification2(ref.value))
  }

  private fun asIToastNotification3(): IToastNotification3 {
    if(pointer == Pointer.NULL) {
      return(IToastNotification3.ABI.makeIToastNotification3(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IToastNotification3.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IToastNotification3.ABI.makeIToastNotification3(ref.value))
  }

  private fun asIToastNotification4(): IToastNotification4 {
    if(pointer == Pointer.NULL) {
      return(IToastNotification4.ABI.makeIToastNotification4(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IToastNotification4.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IToastNotification4.ABI.makeIToastNotification4(ref.value))
  }

  private fun asIToastNotification6(): IToastNotification6 {
    if(pointer == Pointer.NULL) {
      return(IToastNotification6.ABI.makeIToastNotification6(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IToastNotification6.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IToastNotification6.ABI.makeIToastNotification6(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue(): ToastNotification = ToastNotification(pointer.getPointer(0))

    public fun setValue(`value`: ToastNotification): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI {
    public val IToastNotificationFactory_Instance: IToastNotificationFactory by lazy {
      createIToastNotificationFactory()
    }


    public fun createIToastNotificationFactory(): IToastNotificationFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Notifications.ToastNotification".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IToastNotificationFactory.ABI.makeIToastNotificationFactory(factoryActivatorPtr.value))
    }

    public fun activate(content: XmlDocument): Pointer =
        IToastNotificationFactory_Instance.CreateToastNotification(content).pointer
  }
}

package Windows.UI.Notifications

import Windows.Foundation.Collections.IIterable_IKeyValuePair_String_String__
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
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
import com.sun.jna.platform.win32.WinDef
import com.sun.jna.ptr.PointerByReference
import kotlin.Array
import kotlin.Unit

public class NotificationData(
  ptr: Pointer? = Pointer.NULL,
) : PointerType(ptr), INotificationData, IWinRTObject {
  public val INotificationData_Interface: INotificationData by lazy {
    asINotificationData()
  }


  public override val INotificationData_Ptr: Pointer? by lazy {
    INotificationData_Interface.INotificationData_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(INotificationData_Interface)

  public constructor() : this(ABI.activate())

  public constructor(initialValues: IIterable_IKeyValuePair_String_String__,
      sequenceNumber: WinDef.UINT) : this(ABI.activate(initialValues, sequenceNumber))

  public constructor(initialValues: IIterable_IKeyValuePair_String_String__) :
      this(ABI.activate(initialValues))

  private fun asINotificationData(): INotificationData {
    if(pointer == Pointer.NULL) {
      return(INotificationData.ABI.makeINotificationData(Pointer.NULL))
    }
    val refiid = Guid.REFIID(INotificationData.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(INotificationData.ABI.makeINotificationData(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue(): NotificationData = NotificationData(pointer.getPointer(0))

    public fun setValue(`value`: NotificationData): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val INotificationDataFactory_Instance: INotificationDataFactory by lazy {
      createINotificationDataFactory()
    }


    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Notifications.NotificationData".toHandle(),refiid,iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): Pointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public fun createINotificationDataFactory(): INotificationDataFactory {
      val refiid = Guid.REFIID(INotificationDataFactory.ABI.IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Notifications.NotificationData".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(INotificationDataFactory.ABI.makeINotificationDataFactory(factoryActivatorPtr.value))
    }

    public fun activate(initialValues: IIterable_IKeyValuePair_String_String__,
        sequenceNumber: WinDef.UINT): Pointer =
        INotificationDataFactory_Instance.CreateNotificationData(initialValues,
        sequenceNumber).pointer

    public fun activate(initialValues: IIterable_IKeyValuePair_String_String__): Pointer =
        INotificationDataFactory_Instance.CreateNotificationData(initialValues).pointer
  }
}

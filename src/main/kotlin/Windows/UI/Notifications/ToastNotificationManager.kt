package Windows.UI.Notifications

import Windows.System.User
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.checkHR
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
import kotlin.String
import kotlin.Unit

public class ToastNotificationManager(
  ptr: Pointer? = Pointer.NULL,
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue(): ToastNotificationManager =
        ToastNotificationManager(pointer.getPointer(0))

    public fun setValue(`value`: ToastNotificationManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI {
    public val IToastNotificationManagerStatics_Instance: IToastNotificationManagerStatics by lazy {
      createIToastNotificationManagerStatics()
    }


    public val IToastNotificationManagerStatics2_Instance: IToastNotificationManagerStatics2 by
        lazy {
      createIToastNotificationManagerStatics2()
    }


    public val IToastNotificationManagerStatics5_Instance: IToastNotificationManagerStatics5 by
        lazy {
      createIToastNotificationManagerStatics5()
    }


    public val IToastNotificationManagerStatics4_Instance: IToastNotificationManagerStatics4 by
        lazy {
      createIToastNotificationManagerStatics4()
    }


    public fun createIToastNotificationManagerStatics(): IToastNotificationManagerStatics {
      val refiid = Guid.REFIID(IToastNotificationManagerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Notifications.ToastNotificationManager".toHandle(),refiid,interfacePtr)
      val result =
          IToastNotificationManagerStatics.ABI.makeIToastNotificationManagerStatics(interfacePtr.value)
      return result
    }

    public fun createIToastNotificationManagerStatics2(): IToastNotificationManagerStatics2 {
      val refiid = Guid.REFIID(IToastNotificationManagerStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Notifications.ToastNotificationManager".toHandle(),refiid,interfacePtr)
      val result =
          IToastNotificationManagerStatics2.ABI.makeIToastNotificationManagerStatics2(interfacePtr.value)
      return result
    }

    public fun createIToastNotificationManagerStatics5(): IToastNotificationManagerStatics5 {
      val refiid = Guid.REFIID(IToastNotificationManagerStatics5.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Notifications.ToastNotificationManager".toHandle(),refiid,interfacePtr)
      val result =
          IToastNotificationManagerStatics5.ABI.makeIToastNotificationManagerStatics5(interfacePtr.value)
      return result
    }

    public fun createIToastNotificationManagerStatics4(): IToastNotificationManagerStatics4 {
      val refiid = Guid.REFIID(IToastNotificationManagerStatics4.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Notifications.ToastNotificationManager".toHandle(),refiid,interfacePtr)
      val result =
          IToastNotificationManagerStatics4.ABI.makeIToastNotificationManagerStatics4(interfacePtr.value)
      return result
    }
  }

  public companion object {
    public fun CreateToastNotifier() =
        ABI.IToastNotificationManagerStatics_Instance.CreateToastNotifier()

    public fun CreateToastNotifier(applicationId: String) =
        ABI.IToastNotificationManagerStatics_Instance.CreateToastNotifier(applicationId)

    public fun GetTemplateContent(type: ToastTemplateType) =
        ABI.IToastNotificationManagerStatics_Instance.GetTemplateContent(type)

    public fun get_History() = ABI.IToastNotificationManagerStatics2_Instance.get_History()

    public fun GetDefault() = ABI.IToastNotificationManagerStatics5_Instance.GetDefault()

    public fun GetForUser(user: User) =
        ABI.IToastNotificationManagerStatics4_Instance.GetForUser(user)

    public fun ConfigureNotificationMirroring(`value`: NotificationMirroring) =
        ABI.IToastNotificationManagerStatics4_Instance.ConfigureNotificationMirroring(value)
  }
}

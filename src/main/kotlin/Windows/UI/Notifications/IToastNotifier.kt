package Windows.UI.Notifications

import Windows.Foundation.Collections.IVectorView_ScheduledToastNotification_
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.handleToString
import com.github.knk190001.winrtbinding.runtime.interfaces.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.interfaces.getValue
import com.github.knk190001.winrtbinding.runtime.invokeHR
import com.github.knk190001.winrtbinding.runtime.makeOutArray
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Function
import com.sun.jna.Function.ALT_CONVENTION
import com.sun.jna.Native
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import java.lang.RuntimeException
import kotlin.Array
import kotlin.Int
import kotlin.Unit

public interface IToastNotifier : NativeMapped, IWinRTInterface {
  public val IToastNotifier_Ptr: Pointer?

  public val IToastNotifier_VtblPtr: Pointer?
    get() = IToastNotifier_Ptr?.getPointer(0)

  public fun Show(notification: ToastNotification): Unit {
    val fnPtr = IToastNotifier_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(IToastNotifier_Ptr, notification,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun Hide(notification: ToastNotification): Unit {
    val fnPtr = IToastNotifier_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(IToastNotifier_Ptr, notification,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun get_Setting(): NotificationSetting {
    val fnPtr = IToastNotifier_VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.UI.Notifications.NotificationSetting.ByReference()
    val hr = fn.invokeHR(arrayOf(IToastNotifier_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun AddToSchedule(scheduledToast: ScheduledToastNotification): Unit {
    val fnPtr = IToastNotifier_VtblPtr!!.getPointer(9L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(IToastNotifier_Ptr, scheduledToast,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun RemoveFromSchedule(scheduledToast: ScheduledToastNotification): Unit {
    val fnPtr = IToastNotifier_VtblPtr!!.getPointer(10L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(IToastNotifier_Ptr, scheduledToast,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun GetScheduledToastNotifications(): IVectorView_ScheduledToastNotification_ {
    val fnPtr = IToastNotifier_VtblPtr!!.getPointer(11L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result =
        Windows.Foundation.Collections.IVectorView_ScheduledToastNotification_.ByReference()
    val hr = fn.invokeHR(arrayOf(IToastNotifier_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIToastNotifier(pointer.getPointer(0))

    public fun setValue(`value`: IToastNotifier_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IToastNotifier_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IToastNotifier {
    public override val IToastNotifier_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("75927b9303f341ec91d36e5bac1b38e7")

    public fun makeIToastNotifier(ptr: Pointer?): IToastNotifier = IToastNotifier_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IToastNotifier): Array<IToastNotifier> = (elements as
        Array<IToastNotifier>).castToImpl<IToastNotifier,IToastNotifier_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IToastNotifier?> =
        arrayOfNulls<IToastNotifier_Impl>(size) as Array<IToastNotifier?>
  }
}

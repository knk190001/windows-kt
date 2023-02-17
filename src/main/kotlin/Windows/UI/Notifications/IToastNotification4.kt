package Windows.UI.Notifications

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

public interface IToastNotification4 : NativeMapped, IWinRTInterface {
  public val IToastNotification4_Ptr: Pointer?

  public val IToastNotification4_VtblPtr: Pointer?
    get() = IToastNotification4_Ptr?.getPointer(0)

  public fun get_Data(): NotificationData {
    val fnPtr = IToastNotification4_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.UI.Notifications.NotificationData.ByReference()
    val hr = fn.invokeHR(arrayOf(IToastNotification4_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun put_Data(`value`: NotificationData): Unit {
    val fnPtr = IToastNotification4_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(IToastNotification4_Ptr, value,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun get_Priority(): ToastNotificationPriority {
    val fnPtr = IToastNotification4_VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.UI.Notifications.ToastNotificationPriority.ByReference()
    val hr = fn.invokeHR(arrayOf(IToastNotification4_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun put_Priority(`value`: ToastNotificationPriority): Unit {
    val fnPtr = IToastNotification4_VtblPtr!!.getPointer(9L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(IToastNotification4_Ptr, value,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIToastNotification4(pointer.getPointer(0))

    public fun setValue(`value`: IToastNotification4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IToastNotification4_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IToastNotification4 {
    public override val IToastNotification4_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("1515493528ea472788e9c58680e2d118")

    public fun makeIToastNotification4(ptr: Pointer?): IToastNotification4 =
        IToastNotification4_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IToastNotification4): Array<IToastNotification4> =
        (elements as
        Array<IToastNotification4>).castToImpl<IToastNotification4,IToastNotification4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IToastNotification4?> =
        arrayOfNulls<IToastNotification4_Impl>(size) as Array<IToastNotification4?>
  }
}

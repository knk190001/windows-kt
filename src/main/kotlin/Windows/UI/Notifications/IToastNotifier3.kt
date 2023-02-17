package Windows.UI.Notifications

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler_ToastNotifier_ScheduledToastNotificationShowingEventArgs_
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

public interface IToastNotifier3 : NativeMapped, IWinRTInterface {
  public val IToastNotifier3_Ptr: Pointer?

  public val IToastNotifier3_VtblPtr: Pointer?
    get() = IToastNotifier3_Ptr?.getPointer(0)

  public
      fun add_ScheduledToastNotificationShowing(handler: TypedEventHandler_ToastNotifier_ScheduledToastNotificationShowingEventArgs_):
      EventRegistrationToken {
    val fnPtr = IToastNotifier3_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.EventRegistrationToken.ByReference()
    val hr = fn.invokeHR(arrayOf(IToastNotifier3_Ptr, handler, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun remove_ScheduledToastNotificationShowing(token: EventRegistrationToken.ByValue): Unit {
    val fnPtr = IToastNotifier3_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(IToastNotifier3_Ptr, token,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIToastNotifier3(pointer.getPointer(0))

    public fun setValue(`value`: IToastNotifier3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IToastNotifier3_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IToastNotifier3 {
    public override val IToastNotifier3_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("ae75a04a3b0c51adb7e8b08ab6052549")

    public fun makeIToastNotifier3(ptr: Pointer?): IToastNotifier3 = IToastNotifier3_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IToastNotifier3): Array<IToastNotifier3> = (elements as
        Array<IToastNotifier3>).castToImpl<IToastNotifier3,IToastNotifier3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IToastNotifier3?> =
        arrayOfNulls<IToastNotifier3_Impl>(size) as Array<IToastNotifier3?>
  }
}

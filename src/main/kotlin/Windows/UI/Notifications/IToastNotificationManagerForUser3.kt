package Windows.UI.Notifications

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler_ToastNotificationManagerForUser_Object_
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

public interface IToastNotificationManagerForUser3 : NativeMapped, IWinRTInterface {
  public val IToastNotificationManagerForUser3_Ptr: Pointer?

  public val IToastNotificationManagerForUser3_VtblPtr: Pointer?
    get() = IToastNotificationManagerForUser3_Ptr?.getPointer(0)

  public fun get_NotificationMode(): ToastNotificationMode {
    val fnPtr = IToastNotificationManagerForUser3_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.UI.Notifications.ToastNotificationMode.ByReference()
    val hr = fn.invokeHR(arrayOf(IToastNotificationManagerForUser3_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public
      fun add_NotificationModeChanged(handler: TypedEventHandler_ToastNotificationManagerForUser_Object_):
      EventRegistrationToken {
    val fnPtr = IToastNotificationManagerForUser3_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.EventRegistrationToken.ByReference()
    val hr = fn.invokeHR(arrayOf(IToastNotificationManagerForUser3_Ptr, handler, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun remove_NotificationModeChanged(token: EventRegistrationToken.ByValue): Unit {
    val fnPtr = IToastNotificationManagerForUser3_VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(IToastNotificationManagerForUser3_Ptr, token,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIToastNotificationManagerForUser3(pointer.getPointer(0))

    public fun setValue(`value`: IToastNotificationManagerForUser3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IToastNotificationManagerForUser3_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IToastNotificationManagerForUser3 {
    public override val IToastNotificationManagerForUser3_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("3efcb1766cc156dc973b251f7aacb1c5")

    public fun makeIToastNotificationManagerForUser3(ptr: Pointer?):
        IToastNotificationManagerForUser3 = IToastNotificationManagerForUser3_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IToastNotificationManagerForUser3):
        Array<IToastNotificationManagerForUser3> = (elements as
        Array<IToastNotificationManagerForUser3>).castToImpl<IToastNotificationManagerForUser3,IToastNotificationManagerForUser3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IToastNotificationManagerForUser3?> =
        arrayOfNulls<IToastNotificationManagerForUser3_Impl>(size) as
        Array<IToastNotificationManagerForUser3?>
  }
}

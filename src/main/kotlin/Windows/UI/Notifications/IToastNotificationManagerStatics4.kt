package Windows.UI.Notifications

import Windows.System.User
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

public interface IToastNotificationManagerStatics4 : NativeMapped, IWinRTInterface {
  public val IToastNotificationManagerStatics4_Ptr: Pointer?

  public val IToastNotificationManagerStatics4_VtblPtr: Pointer?
    get() = IToastNotificationManagerStatics4_Ptr?.getPointer(0)

  public fun GetForUser(user: User): ToastNotificationManagerForUser {
    val fnPtr = IToastNotificationManagerStatics4_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.UI.Notifications.ToastNotificationManagerForUser.ByReference()
    val hr = fn.invokeHR(arrayOf(IToastNotificationManagerStatics4_Ptr, user, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun ConfigureNotificationMirroring(`value`: NotificationMirroring): Unit {
    val fnPtr = IToastNotificationManagerStatics4_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(IToastNotificationManagerStatics4_Ptr, value,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIToastNotificationManagerStatics4(pointer.getPointer(0))

    public fun setValue(`value`: IToastNotificationManagerStatics4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IToastNotificationManagerStatics4_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IToastNotificationManagerStatics4 {
    public override val IToastNotificationManagerStatics4_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("8f993fd3e51645fb8130398e93fa52c3")

    public fun makeIToastNotificationManagerStatics4(ptr: Pointer?):
        IToastNotificationManagerStatics4 = IToastNotificationManagerStatics4_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IToastNotificationManagerStatics4):
        Array<IToastNotificationManagerStatics4> = (elements as
        Array<IToastNotificationManagerStatics4>).castToImpl<IToastNotificationManagerStatics4,IToastNotificationManagerStatics4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IToastNotificationManagerStatics4?> =
        arrayOfNulls<IToastNotificationManagerStatics4_Impl>(size) as
        Array<IToastNotificationManagerStatics4?>
  }
}

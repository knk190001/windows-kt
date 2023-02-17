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
import kotlin.String
import kotlin.Unit

public interface IToastNotificationManagerForUser : NativeMapped, IWinRTInterface {
  public val IToastNotificationManagerForUser_Ptr: Pointer?

  public val IToastNotificationManagerForUser_VtblPtr: Pointer?
    get() = IToastNotificationManagerForUser_Ptr?.getPointer(0)

  public fun CreateToastNotifier(): ToastNotifier {
    val fnPtr = IToastNotificationManagerForUser_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.UI.Notifications.ToastNotifier.ByReference()
    val hr = fn.invokeHR(arrayOf(IToastNotificationManagerForUser_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun CreateToastNotifier(applicationId: String): ToastNotifier {
    val fnPtr = IToastNotificationManagerForUser_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val applicationId_Native = applicationId.toHandle()
    val result = Windows.UI.Notifications.ToastNotifier.ByReference()
    val hr = fn.invokeHR(arrayOf(IToastNotificationManagerForUser_Ptr, applicationId_Native,
        result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun get_History(): ToastNotificationHistory {
    val fnPtr = IToastNotificationManagerForUser_VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.UI.Notifications.ToastNotificationHistory.ByReference()
    val hr = fn.invokeHR(arrayOf(IToastNotificationManagerForUser_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun get_User(): User {
    val fnPtr = IToastNotificationManagerForUser_VtblPtr!!.getPointer(9L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.System.User.ByReference()
    val hr = fn.invokeHR(arrayOf(IToastNotificationManagerForUser_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIToastNotificationManagerForUser(pointer.getPointer(0))

    public fun setValue(`value`: IToastNotificationManagerForUser_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IToastNotificationManagerForUser_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IToastNotificationManagerForUser {
    public override val IToastNotificationManagerForUser_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("79ab57f643fe487b8a7f99567200ae94")

    public fun makeIToastNotificationManagerForUser(ptr: Pointer?): IToastNotificationManagerForUser
        = IToastNotificationManagerForUser_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IToastNotificationManagerForUser):
        Array<IToastNotificationManagerForUser> = (elements as
        Array<IToastNotificationManagerForUser>).castToImpl<IToastNotificationManagerForUser,IToastNotificationManagerForUser_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IToastNotificationManagerForUser?> =
        arrayOfNulls<IToastNotificationManagerForUser_Impl>(size) as
        Array<IToastNotificationManagerForUser?>
  }
}

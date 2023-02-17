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
import com.sun.jna.platform.win32.WinDef
import java.lang.RuntimeException
import kotlin.Array
import kotlin.Int
import kotlin.Unit

public interface IUserNotificationChangedEventArgs : NativeMapped, IWinRTInterface {
  public val IUserNotificationChangedEventArgs_Ptr: Pointer?

  public val IUserNotificationChangedEventArgs_VtblPtr: Pointer?
    get() = IUserNotificationChangedEventArgs_Ptr?.getPointer(0)

  public fun get_ChangeKind(): UserNotificationChangedKind {
    val fnPtr = IUserNotificationChangedEventArgs_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.UI.Notifications.UserNotificationChangedKind.ByReference()
    val hr = fn.invokeHR(arrayOf(IUserNotificationChangedEventArgs_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun get_UserNotificationId(): WinDef.UINT {
    val fnPtr = IUserNotificationChangedEventArgs_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinDef.UINTByReference()
    val hr = fn.invokeHR(arrayOf(IUserNotificationChangedEventArgs_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIUserNotificationChangedEventArgs(pointer.getPointer(0))

    public fun setValue(`value`: IUserNotificationChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IUserNotificationChangedEventArgs_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IUserNotificationChangedEventArgs {
    public override val IUserNotificationChangedEventArgs_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("b6bd683979cf4b2582c00ce1eef81f8c")

    public fun makeIUserNotificationChangedEventArgs(ptr: Pointer?):
        IUserNotificationChangedEventArgs = IUserNotificationChangedEventArgs_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IUserNotificationChangedEventArgs):
        Array<IUserNotificationChangedEventArgs> = (elements as
        Array<IUserNotificationChangedEventArgs>).castToImpl<IUserNotificationChangedEventArgs,IUserNotificationChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUserNotificationChangedEventArgs?> =
        arrayOfNulls<IUserNotificationChangedEventArgs_Impl>(size) as
        Array<IUserNotificationChangedEventArgs?>
  }
}

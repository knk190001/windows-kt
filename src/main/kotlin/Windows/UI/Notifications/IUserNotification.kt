package Windows.UI.Notifications

import Windows.ApplicationModel.AppInfo
import Windows.Foundation.DateTime
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

public interface IUserNotification : NativeMapped, IWinRTInterface {
  public val IUserNotification_Ptr: Pointer?

  public val IUserNotification_VtblPtr: Pointer?
    get() = IUserNotification_Ptr?.getPointer(0)

  public fun get_Notification(): Notification {
    val fnPtr = IUserNotification_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.UI.Notifications.Notification.ByReference()
    val hr = fn.invokeHR(arrayOf(IUserNotification_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun get_AppInfo(): AppInfo {
    val fnPtr = IUserNotification_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.ApplicationModel.AppInfo.ByReference()
    val hr = fn.invokeHR(arrayOf(IUserNotification_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun get_Id(): WinDef.UINT {
    val fnPtr = IUserNotification_VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinDef.UINTByReference()
    val hr = fn.invokeHR(arrayOf(IUserNotification_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun get_CreationTime(): DateTime {
    val fnPtr = IUserNotification_VtblPtr!!.getPointer(9L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.DateTime.ByReference()
    val hr = fn.invokeHR(arrayOf(IUserNotification_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIUserNotification(pointer.getPointer(0))

    public fun setValue(`value`: IUserNotification_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IUserNotification_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IUserNotification {
    public override val IUserNotification_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("adf7e52f4e5342d59c33eb5ea515b23e")

    public fun makeIUserNotification(ptr: Pointer?): IUserNotification = IUserNotification_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IUserNotification): Array<IUserNotification> = (elements
        as Array<IUserNotification>).castToImpl<IUserNotification,IUserNotification_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUserNotification?> =
        arrayOfNulls<IUserNotification_Impl>(size) as Array<IUserNotification?>
  }
}

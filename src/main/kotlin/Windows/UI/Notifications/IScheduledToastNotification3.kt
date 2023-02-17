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
import com.sun.jna.platform.win32.WinNT
import java.lang.RuntimeException
import kotlin.Array
import kotlin.Int
import kotlin.String
import kotlin.Unit

public interface IScheduledToastNotification3 : NativeMapped, IWinRTInterface {
  public val IScheduledToastNotification3_Ptr: Pointer?

  public val IScheduledToastNotification3_VtblPtr: Pointer?
    get() = IScheduledToastNotification3_Ptr?.getPointer(0)

  public fun get_NotificationMirroring(): NotificationMirroring {
    val fnPtr = IScheduledToastNotification3_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.UI.Notifications.NotificationMirroring.ByReference()
    val hr = fn.invokeHR(arrayOf(IScheduledToastNotification3_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun put_NotificationMirroring(`value`: NotificationMirroring): Unit {
    val fnPtr = IScheduledToastNotification3_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(IScheduledToastNotification3_Ptr, value,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun get_RemoteId(): String {
    val fnPtr = IScheduledToastNotification3_VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(IScheduledToastNotification3_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public fun put_RemoteId(`value`: String): Unit {
    val fnPtr = IScheduledToastNotification3_VtblPtr!!.getPointer(9L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val value_Native = value.toHandle()
    val hr = fn.invokeHR(arrayOf(IScheduledToastNotification3_Ptr, value_Native,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIScheduledToastNotification3(pointer.getPointer(0))

    public fun setValue(`value`: IScheduledToastNotification3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IScheduledToastNotification3_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IScheduledToastNotification3 {
    public override val IScheduledToastNotification3_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("98429e8bbd324a3b9d1522aea49462a1")

    public fun makeIScheduledToastNotification3(ptr: Pointer?): IScheduledToastNotification3 =
        IScheduledToastNotification3_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IScheduledToastNotification3):
        Array<IScheduledToastNotification3> = (elements as
        Array<IScheduledToastNotification3>).castToImpl<IScheduledToastNotification3,IScheduledToastNotification3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IScheduledToastNotification3?> =
        arrayOfNulls<IScheduledToastNotification3_Impl>(size) as
        Array<IScheduledToastNotification3?>
  }
}

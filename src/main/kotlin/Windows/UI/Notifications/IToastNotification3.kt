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

public interface IToastNotification3 : NativeMapped, IWinRTInterface {
  public val IToastNotification3_Ptr: Pointer?

  public val IToastNotification3_VtblPtr: Pointer?
    get() = IToastNotification3_Ptr?.getPointer(0)

  public fun get_NotificationMirroring(): NotificationMirroring {
    val fnPtr = IToastNotification3_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.UI.Notifications.NotificationMirroring.ByReference()
    val hr = fn.invokeHR(arrayOf(IToastNotification3_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun put_NotificationMirroring(`value`: NotificationMirroring): Unit {
    val fnPtr = IToastNotification3_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(IToastNotification3_Ptr, value,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun get_RemoteId(): String {
    val fnPtr = IToastNotification3_VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(IToastNotification3_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public fun put_RemoteId(`value`: String): Unit {
    val fnPtr = IToastNotification3_VtblPtr!!.getPointer(9L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val value_Native = value.toHandle()
    val hr = fn.invokeHR(arrayOf(IToastNotification3_Ptr, value_Native,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIToastNotification3(pointer.getPointer(0))

    public fun setValue(`value`: IToastNotification3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IToastNotification3_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IToastNotification3 {
    public override val IToastNotification3_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("31e8aed881414f99bc0ac4ed21297d77")

    public fun makeIToastNotification3(ptr: Pointer?): IToastNotification3 =
        IToastNotification3_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IToastNotification3): Array<IToastNotification3> =
        (elements as
        Array<IToastNotification3>).castToImpl<IToastNotification3,IToastNotification3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IToastNotification3?> =
        arrayOfNulls<IToastNotification3_Impl>(size) as Array<IToastNotification3?>
  }
}

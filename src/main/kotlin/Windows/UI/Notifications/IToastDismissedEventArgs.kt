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

public interface IToastDismissedEventArgs : NativeMapped, IWinRTInterface {
  public val IToastDismissedEventArgs_Ptr: Pointer?

  public val IToastDismissedEventArgs_VtblPtr: Pointer?
    get() = IToastDismissedEventArgs_Ptr?.getPointer(0)

  public fun get_Reason(): ToastDismissalReason {
    val fnPtr = IToastDismissedEventArgs_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.UI.Notifications.ToastDismissalReason.ByReference()
    val hr = fn.invokeHR(arrayOf(IToastDismissedEventArgs_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIToastDismissedEventArgs(pointer.getPointer(0))

    public fun setValue(`value`: IToastDismissedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IToastDismissedEventArgs_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IToastDismissedEventArgs {
    public override val IToastDismissedEventArgs_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("3f89d935d9cb4538a0f0ffe7659938f8")

    public fun makeIToastDismissedEventArgs(ptr: Pointer?): IToastDismissedEventArgs =
        IToastDismissedEventArgs_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IToastDismissedEventArgs): Array<IToastDismissedEventArgs>
        = (elements as
        Array<IToastDismissedEventArgs>).castToImpl<IToastDismissedEventArgs,IToastDismissedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IToastDismissedEventArgs?> =
        arrayOfNulls<IToastDismissedEventArgs_Impl>(size) as Array<IToastDismissedEventArgs?>
  }
}

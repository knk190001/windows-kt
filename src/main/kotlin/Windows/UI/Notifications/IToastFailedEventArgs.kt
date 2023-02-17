package Windows.UI.Notifications

import Windows.Foundation.HResult
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

public interface IToastFailedEventArgs : NativeMapped, IWinRTInterface {
  public val IToastFailedEventArgs_Ptr: Pointer?

  public val IToastFailedEventArgs_VtblPtr: Pointer?
    get() = IToastFailedEventArgs_Ptr?.getPointer(0)

  public fun get_ErrorCode(): HResult {
    val fnPtr = IToastFailedEventArgs_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.HResult.ByReference()
    val hr = fn.invokeHR(arrayOf(IToastFailedEventArgs_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIToastFailedEventArgs(pointer.getPointer(0))

    public fun setValue(`value`: IToastFailedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IToastFailedEventArgs_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IToastFailedEventArgs {
    public override val IToastFailedEventArgs_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("35176862cfd444f8ad64f500fd896c3b")

    public fun makeIToastFailedEventArgs(ptr: Pointer?): IToastFailedEventArgs =
        IToastFailedEventArgs_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IToastFailedEventArgs): Array<IToastFailedEventArgs> =
        (elements as
        Array<IToastFailedEventArgs>).castToImpl<IToastFailedEventArgs,IToastFailedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IToastFailedEventArgs?> =
        arrayOfNulls<IToastFailedEventArgs_Impl>(size) as Array<IToastFailedEventArgs?>
  }
}

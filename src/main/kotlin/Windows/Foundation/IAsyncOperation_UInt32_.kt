package Windows.Foundation

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

public interface IAsyncOperation_UInt32_ : NativeMapped, IWinRTInterface {
  public val IAsyncOperation_UInt32__Ptr: Pointer?

  public val IAsyncOperation_UInt32__VtblPtr: Pointer?
    get() = IAsyncOperation_UInt32__Ptr?.getPointer(0)

  public fun put_Completed(handler: AsyncOperationCompletedHandler_UInt32_): Unit {
    val fnPtr = IAsyncOperation_UInt32__VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(IAsyncOperation_UInt32__Ptr, handler,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun get_Completed(): AsyncOperationCompletedHandler_UInt32_ {
    val fnPtr = IAsyncOperation_UInt32__VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.AsyncOperationCompletedHandler_UInt32_.ByReference()
    val hr = fn.invokeHR(arrayOf(IAsyncOperation_UInt32__Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun GetResults(): WinDef.UINT {
    val fnPtr = IAsyncOperation_UInt32__VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinDef.UINTByReference()
    val hr = fn.invokeHR(arrayOf(IAsyncOperation_UInt32__Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIAsyncOperation_UInt32_(pointer.getPointer(0))

    public fun setValue(`value`: IAsyncOperation_UInt32__Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IAsyncOperation_UInt32__Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IAsyncOperation_UInt32_ {
    public override val IAsyncOperation_UInt32__Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val PIID: Guid.IID = Guid.IID("ef60385fbe78584baaef7829ada2b0de")

    public val IID: Guid.IID = Guid.IID("9fc2b0bbe44644e2aa619cab8f636af2")

    public fun makeIAsyncOperation_UInt32_(ptr: Pointer?): IAsyncOperation_UInt32_ =
        IAsyncOperation_UInt32__Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IAsyncOperation_UInt32_): Array<IAsyncOperation_UInt32_> =
        (elements as
        Array<IAsyncOperation_UInt32_>).castToImpl<IAsyncOperation_UInt32_,IAsyncOperation_UInt32__Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAsyncOperation_UInt32_?> =
        arrayOfNulls<IAsyncOperation_UInt32__Impl>(size) as Array<IAsyncOperation_UInt32_?>
  }
}

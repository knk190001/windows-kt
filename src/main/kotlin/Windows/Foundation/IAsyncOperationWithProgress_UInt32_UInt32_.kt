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

public interface IAsyncOperationWithProgress_UInt32_UInt32_ : NativeMapped, IWinRTInterface {
  public val IAsyncOperationWithProgress_UInt32_UInt32__Ptr: Pointer?

  public val IAsyncOperationWithProgress_UInt32_UInt32__VtblPtr: Pointer?
    get() = IAsyncOperationWithProgress_UInt32_UInt32__Ptr?.getPointer(0)

  public fun put_Progress(handler: AsyncOperationProgressHandler_UInt32_UInt32_): Unit {
    val fnPtr = IAsyncOperationWithProgress_UInt32_UInt32__VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(IAsyncOperationWithProgress_UInt32_UInt32__Ptr, handler,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun get_Progress(): AsyncOperationProgressHandler_UInt32_UInt32_ {
    val fnPtr = IAsyncOperationWithProgress_UInt32_UInt32__VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.AsyncOperationProgressHandler_UInt32_UInt32_.ByReference()
    val hr = fn.invokeHR(arrayOf(IAsyncOperationWithProgress_UInt32_UInt32__Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun put_Completed(handler: AsyncOperationWithProgressCompletedHandler_UInt32_UInt32_):
      Unit {
    val fnPtr = IAsyncOperationWithProgress_UInt32_UInt32__VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(IAsyncOperationWithProgress_UInt32_UInt32__Ptr, handler,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun get_Completed(): AsyncOperationWithProgressCompletedHandler_UInt32_UInt32_ {
    val fnPtr = IAsyncOperationWithProgress_UInt32_UInt32__VtblPtr!!.getPointer(9L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result =
        Windows.Foundation.AsyncOperationWithProgressCompletedHandler_UInt32_UInt32_.ByReference()
    val hr = fn.invokeHR(arrayOf(IAsyncOperationWithProgress_UInt32_UInt32__Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun GetResults(): WinDef.UINT {
    val fnPtr = IAsyncOperationWithProgress_UInt32_UInt32__VtblPtr!!.getPointer(10L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinDef.UINTByReference()
    val hr = fn.invokeHR(arrayOf(IAsyncOperationWithProgress_UInt32_UInt32__Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() =
        ABI.makeIAsyncOperationWithProgress_UInt32_UInt32_(pointer.getPointer(0))

    public fun setValue(`value`: IAsyncOperationWithProgress_UInt32_UInt32__Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IAsyncOperationWithProgress_UInt32_UInt32__Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IAsyncOperationWithProgress_UInt32_UInt32_ {
    public override val IAsyncOperationWithProgress_UInt32_UInt32__Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val PIID: Guid.IID = Guid.IID("eccb574ac6845572a6796b0842cfb57f")

    public val IID: Guid.IID = Guid.IID("b5d036d7e297498fba600289e76e23dd")

    public fun makeIAsyncOperationWithProgress_UInt32_UInt32_(ptr: Pointer?):
        IAsyncOperationWithProgress_UInt32_UInt32_ =
        IAsyncOperationWithProgress_UInt32_UInt32__Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IAsyncOperationWithProgress_UInt32_UInt32_):
        Array<IAsyncOperationWithProgress_UInt32_UInt32_> = (elements as
        Array<IAsyncOperationWithProgress_UInt32_UInt32_>).castToImpl<IAsyncOperationWithProgress_UInt32_UInt32_,IAsyncOperationWithProgress_UInt32_UInt32__Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAsyncOperationWithProgress_UInt32_UInt32_?> =
        arrayOfNulls<IAsyncOperationWithProgress_UInt32_UInt32__Impl>(size) as
        Array<IAsyncOperationWithProgress_UInt32_UInt32_?>
  }
}

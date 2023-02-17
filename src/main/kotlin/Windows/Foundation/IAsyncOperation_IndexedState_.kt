package Windows.Foundation

import Windows.Storage.Search.IndexedState
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

public interface IAsyncOperation_IndexedState_ : NativeMapped, IWinRTInterface {
  public val IAsyncOperation_IndexedState__Ptr: Pointer?

  public val IAsyncOperation_IndexedState__VtblPtr: Pointer?
    get() = IAsyncOperation_IndexedState__Ptr?.getPointer(0)

  public fun put_Completed(handler: AsyncOperationCompletedHandler_IndexedState_): Unit {
    val fnPtr = IAsyncOperation_IndexedState__VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(IAsyncOperation_IndexedState__Ptr, handler,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun get_Completed(): AsyncOperationCompletedHandler_IndexedState_ {
    val fnPtr = IAsyncOperation_IndexedState__VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.AsyncOperationCompletedHandler_IndexedState_.ByReference()
    val hr = fn.invokeHR(arrayOf(IAsyncOperation_IndexedState__Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun GetResults(): IndexedState {
    val fnPtr = IAsyncOperation_IndexedState__VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Storage.Search.IndexedState.ByReference()
    val hr = fn.invokeHR(arrayOf(IAsyncOperation_IndexedState__Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIAsyncOperation_IndexedState_(pointer.getPointer(0))

    public fun setValue(`value`: IAsyncOperation_IndexedState__Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IAsyncOperation_IndexedState__Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IAsyncOperation_IndexedState_ {
    public override val IAsyncOperation_IndexedState__Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val PIID: Guid.IID = Guid.IID("88694b1ff380574d8a054f67bd52cd11")

    public val IID: Guid.IID = Guid.IID("9fc2b0bbe44644e2aa619cab8f636af2")

    public fun makeIAsyncOperation_IndexedState_(ptr: Pointer?): IAsyncOperation_IndexedState_ =
        IAsyncOperation_IndexedState__Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IAsyncOperation_IndexedState_):
        Array<IAsyncOperation_IndexedState_> = (elements as
        Array<IAsyncOperation_IndexedState_>).castToImpl<IAsyncOperation_IndexedState_,IAsyncOperation_IndexedState__Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAsyncOperation_IndexedState_?> =
        arrayOfNulls<IAsyncOperation_IndexedState__Impl>(size) as
        Array<IAsyncOperation_IndexedState_?>
  }
}

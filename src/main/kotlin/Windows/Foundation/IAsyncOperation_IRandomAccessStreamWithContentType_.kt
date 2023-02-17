package Windows.Foundation

import Windows.Storage.Streams.IRandomAccessStreamWithContentType
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

public interface IAsyncOperation_IRandomAccessStreamWithContentType_ : NativeMapped, IWinRTInterface
    {
  public val IAsyncOperation_IRandomAccessStreamWithContentType__Ptr: Pointer?

  public val IAsyncOperation_IRandomAccessStreamWithContentType__VtblPtr: Pointer?
    get() = IAsyncOperation_IRandomAccessStreamWithContentType__Ptr?.getPointer(0)

  public
      fun put_Completed(handler: AsyncOperationCompletedHandler_IRandomAccessStreamWithContentType_):
      Unit {
    val fnPtr = IAsyncOperation_IRandomAccessStreamWithContentType__VtblPtr!!.getPointer(6L *
        POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(IAsyncOperation_IRandomAccessStreamWithContentType__Ptr, handler,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun get_Completed(): AsyncOperationCompletedHandler_IRandomAccessStreamWithContentType_ {
    val fnPtr = IAsyncOperation_IRandomAccessStreamWithContentType__VtblPtr!!.getPointer(7L *
        POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result =
        Windows.Foundation.AsyncOperationCompletedHandler_IRandomAccessStreamWithContentType_.ByReference()
    val hr = fn.invokeHR(arrayOf(IAsyncOperation_IRandomAccessStreamWithContentType__Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun GetResults(): IRandomAccessStreamWithContentType {
    val fnPtr = IAsyncOperation_IRandomAccessStreamWithContentType__VtblPtr!!.getPointer(8L *
        POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Storage.Streams.IRandomAccessStreamWithContentType.ByReference()
    val hr = fn.invokeHR(arrayOf(IAsyncOperation_IRandomAccessStreamWithContentType__Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() =
        ABI.makeIAsyncOperation_IRandomAccessStreamWithContentType_(pointer.getPointer(0))

    public fun setValue(`value`: IAsyncOperation_IRandomAccessStreamWithContentType__Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IAsyncOperation_IRandomAccessStreamWithContentType__Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IAsyncOperation_IRandomAccessStreamWithContentType_ {
    public override val IAsyncOperation_IRandomAccessStreamWithContentType__Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val PIID: Guid.IID = Guid.IID("c4a57c5e32b055b3ad13ce1c23041ed6")

    public val IID: Guid.IID = Guid.IID("9fc2b0bbe44644e2aa619cab8f636af2")

    public fun makeIAsyncOperation_IRandomAccessStreamWithContentType_(ptr: Pointer?):
        IAsyncOperation_IRandomAccessStreamWithContentType_ =
        IAsyncOperation_IRandomAccessStreamWithContentType__Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IAsyncOperation_IRandomAccessStreamWithContentType_):
        Array<IAsyncOperation_IRandomAccessStreamWithContentType_> = (elements as
        Array<IAsyncOperation_IRandomAccessStreamWithContentType_>).castToImpl<IAsyncOperation_IRandomAccessStreamWithContentType_,IAsyncOperation_IRandomAccessStreamWithContentType__Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<IAsyncOperation_IRandomAccessStreamWithContentType_?> =
        arrayOfNulls<IAsyncOperation_IRandomAccessStreamWithContentType__Impl>(size) as
        Array<IAsyncOperation_IRandomAccessStreamWithContentType_?>
  }
}

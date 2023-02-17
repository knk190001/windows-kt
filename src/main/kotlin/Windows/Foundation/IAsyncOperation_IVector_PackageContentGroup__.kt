package Windows.Foundation

import Windows.Foundation.Collections.IVector_PackageContentGroup_
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

public interface IAsyncOperation_IVector_PackageContentGroup__ : NativeMapped, IWinRTInterface {
  public val IAsyncOperation_IVector_PackageContentGroup___Ptr: Pointer?

  public val IAsyncOperation_IVector_PackageContentGroup___VtblPtr: Pointer?
    get() = IAsyncOperation_IVector_PackageContentGroup___Ptr?.getPointer(0)

  public fun put_Completed(handler: AsyncOperationCompletedHandler_IVector_PackageContentGroup__):
      Unit {
    val fnPtr = IAsyncOperation_IVector_PackageContentGroup___VtblPtr!!.getPointer(6L *
        POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(IAsyncOperation_IVector_PackageContentGroup___Ptr, handler,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun get_Completed(): AsyncOperationCompletedHandler_IVector_PackageContentGroup__ {
    val fnPtr = IAsyncOperation_IVector_PackageContentGroup___VtblPtr!!.getPointer(7L *
        POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result =
        Windows.Foundation.AsyncOperationCompletedHandler_IVector_PackageContentGroup__.ByReference()
    val hr = fn.invokeHR(arrayOf(IAsyncOperation_IVector_PackageContentGroup___Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun GetResults(): IVector_PackageContentGroup_ {
    val fnPtr = IAsyncOperation_IVector_PackageContentGroup___VtblPtr!!.getPointer(8L *
        POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.Collections.IVector_PackageContentGroup_.ByReference()
    val hr = fn.invokeHR(arrayOf(IAsyncOperation_IVector_PackageContentGroup___Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() =
        ABI.makeIAsyncOperation_IVector_PackageContentGroup__(pointer.getPointer(0))

    public fun setValue(`value`: IAsyncOperation_IVector_PackageContentGroup___Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IAsyncOperation_IVector_PackageContentGroup___Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IAsyncOperation_IVector_PackageContentGroup__ {
    public override val IAsyncOperation_IVector_PackageContentGroup___Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val PIID: Guid.IID = Guid.IID("929e3c29bf295594bc6367db43a539ea")

    public val IID: Guid.IID = Guid.IID("9fc2b0bbe44644e2aa619cab8f636af2")

    public fun makeIAsyncOperation_IVector_PackageContentGroup__(ptr: Pointer?):
        IAsyncOperation_IVector_PackageContentGroup__ =
        IAsyncOperation_IVector_PackageContentGroup___Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IAsyncOperation_IVector_PackageContentGroup__):
        Array<IAsyncOperation_IVector_PackageContentGroup__> = (elements as
        Array<IAsyncOperation_IVector_PackageContentGroup__>).castToImpl<IAsyncOperation_IVector_PackageContentGroup__,IAsyncOperation_IVector_PackageContentGroup___Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAsyncOperation_IVector_PackageContentGroup__?> =
        arrayOfNulls<IAsyncOperation_IVector_PackageContentGroup___Impl>(size) as
        Array<IAsyncOperation_IVector_PackageContentGroup__?>
  }
}

package Windows.Foundation

import Windows.System.UserAgeConsentResult
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

public interface IAsyncOperation_UserAgeConsentResult_ : NativeMapped, IWinRTInterface {
  public val IAsyncOperation_UserAgeConsentResult__Ptr: Pointer?

  public val IAsyncOperation_UserAgeConsentResult__VtblPtr: Pointer?
    get() = IAsyncOperation_UserAgeConsentResult__Ptr?.getPointer(0)

  public fun put_Completed(handler: AsyncOperationCompletedHandler_UserAgeConsentResult_): Unit {
    val fnPtr = IAsyncOperation_UserAgeConsentResult__VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(IAsyncOperation_UserAgeConsentResult__Ptr, handler,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun get_Completed(): AsyncOperationCompletedHandler_UserAgeConsentResult_ {
    val fnPtr = IAsyncOperation_UserAgeConsentResult__VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result =
        Windows.Foundation.AsyncOperationCompletedHandler_UserAgeConsentResult_.ByReference()
    val hr = fn.invokeHR(arrayOf(IAsyncOperation_UserAgeConsentResult__Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun GetResults(): UserAgeConsentResult {
    val fnPtr = IAsyncOperation_UserAgeConsentResult__VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.System.UserAgeConsentResult.ByReference()
    val hr = fn.invokeHR(arrayOf(IAsyncOperation_UserAgeConsentResult__Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIAsyncOperation_UserAgeConsentResult_(pointer.getPointer(0))

    public fun setValue(`value`: IAsyncOperation_UserAgeConsentResult__Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IAsyncOperation_UserAgeConsentResult__Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IAsyncOperation_UserAgeConsentResult_ {
    public override val IAsyncOperation_UserAgeConsentResult__Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val PIID: Guid.IID = Guid.IID("d4df001001725efabd5c6444de94af74")

    public val IID: Guid.IID = Guid.IID("9fc2b0bbe44644e2aa619cab8f636af2")

    public fun makeIAsyncOperation_UserAgeConsentResult_(ptr: Pointer?):
        IAsyncOperation_UserAgeConsentResult_ = IAsyncOperation_UserAgeConsentResult__Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IAsyncOperation_UserAgeConsentResult_):
        Array<IAsyncOperation_UserAgeConsentResult_> = (elements as
        Array<IAsyncOperation_UserAgeConsentResult_>).castToImpl<IAsyncOperation_UserAgeConsentResult_,IAsyncOperation_UserAgeConsentResult__Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAsyncOperation_UserAgeConsentResult_?> =
        arrayOfNulls<IAsyncOperation_UserAgeConsentResult__Impl>(size) as
        Array<IAsyncOperation_UserAgeConsentResult_?>
  }
}

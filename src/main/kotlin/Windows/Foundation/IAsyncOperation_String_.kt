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
import com.sun.jna.platform.win32.WinNT
import java.lang.RuntimeException
import kotlin.Array
import kotlin.Int
import kotlin.String
import kotlin.Unit

public interface IAsyncOperation_String_ : NativeMapped, IWinRTInterface {
  public val IAsyncOperation_String__Ptr: Pointer?

  public val IAsyncOperation_String__VtblPtr: Pointer?
    get() = IAsyncOperation_String__Ptr?.getPointer(0)

  public fun put_Completed(handler: AsyncOperationCompletedHandler_String_): Unit {
    val fnPtr = IAsyncOperation_String__VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(IAsyncOperation_String__Ptr, handler,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun get_Completed(): AsyncOperationCompletedHandler_String_ {
    val fnPtr = IAsyncOperation_String__VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.AsyncOperationCompletedHandler_String_.ByReference()
    val hr = fn.invokeHR(arrayOf(IAsyncOperation_String__Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun GetResults(): String {
    val fnPtr = IAsyncOperation_String__VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(IAsyncOperation_String__Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIAsyncOperation_String_(pointer.getPointer(0))

    public fun setValue(`value`: IAsyncOperation_String__Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IAsyncOperation_String__Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IAsyncOperation_String_ {
    public override val IAsyncOperation_String__Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val PIID: Guid.IID = Guid.IID("3e1fe603f8975263b3280806426b8a79")

    public val IID: Guid.IID = Guid.IID("9fc2b0bbe44644e2aa619cab8f636af2")

    public fun makeIAsyncOperation_String_(ptr: Pointer?): IAsyncOperation_String_ =
        IAsyncOperation_String__Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IAsyncOperation_String_): Array<IAsyncOperation_String_> =
        (elements as
        Array<IAsyncOperation_String_>).castToImpl<IAsyncOperation_String_,IAsyncOperation_String__Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAsyncOperation_String_?> =
        arrayOfNulls<IAsyncOperation_String__Impl>(size) as Array<IAsyncOperation_String_?>
  }
}

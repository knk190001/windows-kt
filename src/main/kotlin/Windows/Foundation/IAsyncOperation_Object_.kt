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
import com.sun.jna.platform.win32.COM.Unknown
import com.sun.jna.platform.win32.Guid
import java.lang.RuntimeException
import kotlin.Array
import kotlin.Int
import kotlin.Unit

public interface IAsyncOperation_Object_ : NativeMapped, IWinRTInterface {
  public val IAsyncOperation_Object__Ptr: Pointer?

  public val IAsyncOperation_Object__VtblPtr: Pointer?
    get() = IAsyncOperation_Object__Ptr?.getPointer(0)

  public fun put_Completed(handler: AsyncOperationCompletedHandler_Object_): Unit {
    val fnPtr = IAsyncOperation_Object__VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(IAsyncOperation_Object__Ptr, handler,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun get_Completed(): AsyncOperationCompletedHandler_Object_ {
    val fnPtr = IAsyncOperation_Object__VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.AsyncOperationCompletedHandler_Object_.ByReference()
    val hr = fn.invokeHR(arrayOf(IAsyncOperation_Object__Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun GetResults(): Unknown {
    val fnPtr = IAsyncOperation_Object__VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = com.sun.jna.platform.win32.COM.Unknown.ByReference()
    val hr = fn.invokeHR(arrayOf(IAsyncOperation_Object__Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIAsyncOperation_Object_(pointer.getPointer(0))

    public fun setValue(`value`: IAsyncOperation_Object__Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IAsyncOperation_Object__Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IAsyncOperation_Object_ {
    public override val IAsyncOperation_Object__Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val PIID: Guid.IID = Guid.IID("abf53c57ee505342b52a26e3b8cc024f")

    public val IID: Guid.IID = Guid.IID("9fc2b0bbe44644e2aa619cab8f636af2")

    public fun makeIAsyncOperation_Object_(ptr: Pointer?): IAsyncOperation_Object_ =
        IAsyncOperation_Object__Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IAsyncOperation_Object_): Array<IAsyncOperation_Object_> =
        (elements as
        Array<IAsyncOperation_Object_>).castToImpl<IAsyncOperation_Object_,IAsyncOperation_Object__Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAsyncOperation_Object_?> =
        arrayOfNulls<IAsyncOperation_Object__Impl>(size) as Array<IAsyncOperation_Object_?>
  }
}

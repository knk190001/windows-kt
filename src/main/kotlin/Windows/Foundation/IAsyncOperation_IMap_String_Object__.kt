package Windows.Foundation

import Windows.Foundation.Collections.IMap_String_Object_
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

public interface IAsyncOperation_IMap_String_Object__ : NativeMapped, IWinRTInterface {
  public val IAsyncOperation_IMap_String_Object___Ptr: Pointer?

  public val IAsyncOperation_IMap_String_Object___VtblPtr: Pointer?
    get() = IAsyncOperation_IMap_String_Object___Ptr?.getPointer(0)

  public fun put_Completed(handler: AsyncOperationCompletedHandler_IMap_String_Object__): Unit {
    val fnPtr = IAsyncOperation_IMap_String_Object___VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(IAsyncOperation_IMap_String_Object___Ptr, handler,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun get_Completed(): AsyncOperationCompletedHandler_IMap_String_Object__ {
    val fnPtr = IAsyncOperation_IMap_String_Object___VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result =
        Windows.Foundation.AsyncOperationCompletedHandler_IMap_String_Object__.ByReference()
    val hr = fn.invokeHR(arrayOf(IAsyncOperation_IMap_String_Object___Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun GetResults(): IMap_String_Object_ {
    val fnPtr = IAsyncOperation_IMap_String_Object___VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.Collections.IMap_String_Object_.ByReference()
    val hr = fn.invokeHR(arrayOf(IAsyncOperation_IMap_String_Object___Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIAsyncOperation_IMap_String_Object__(pointer.getPointer(0))

    public fun setValue(`value`: IAsyncOperation_IMap_String_Object___Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IAsyncOperation_IMap_String_Object___Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IAsyncOperation_IMap_String_Object__ {
    public override val IAsyncOperation_IMap_String_Object___Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val PIID: Guid.IID = Guid.IID("127e39c707c158e5b48e3a4729839fec")

    public val IID: Guid.IID = Guid.IID("9fc2b0bbe44644e2aa619cab8f636af2")

    public fun makeIAsyncOperation_IMap_String_Object__(ptr: Pointer?):
        IAsyncOperation_IMap_String_Object__ = IAsyncOperation_IMap_String_Object___Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IAsyncOperation_IMap_String_Object__):
        Array<IAsyncOperation_IMap_String_Object__> = (elements as
        Array<IAsyncOperation_IMap_String_Object__>).castToImpl<IAsyncOperation_IMap_String_Object__,IAsyncOperation_IMap_String_Object___Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAsyncOperation_IMap_String_Object__?> =
        arrayOfNulls<IAsyncOperation_IMap_String_Object___Impl>(size) as
        Array<IAsyncOperation_IMap_String_Object__?>
  }
}

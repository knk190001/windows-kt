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
import com.sun.jna.ptr.ByteByReference
import java.lang.RuntimeException
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit

public interface IAsyncOperation_Boolean_ : NativeMapped, IWinRTInterface {
  public val IAsyncOperation_Boolean__Ptr: Pointer?

  public val IAsyncOperation_Boolean__VtblPtr: Pointer?
    get() = IAsyncOperation_Boolean__Ptr?.getPointer(0)

  public fun put_Completed(handler: AsyncOperationCompletedHandler_Boolean_): Unit {
    val fnPtr = IAsyncOperation_Boolean__VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(IAsyncOperation_Boolean__Ptr, handler,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun get_Completed(): AsyncOperationCompletedHandler_Boolean_ {
    val fnPtr = IAsyncOperation_Boolean__VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.AsyncOperationCompletedHandler_Boolean_.ByReference()
    val hr = fn.invokeHR(arrayOf(IAsyncOperation_Boolean__Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun GetResults(): Boolean {
    val fnPtr = IAsyncOperation_Boolean__VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = ByteByReference()
    val hr = fn.invokeHR(arrayOf(IAsyncOperation_Boolean__Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue != 0.toByte()
    return resultValue_Managed
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIAsyncOperation_Boolean_(pointer.getPointer(0))

    public fun setValue(`value`: IAsyncOperation_Boolean__Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IAsyncOperation_Boolean__Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IAsyncOperation_Boolean_ {
    public override val IAsyncOperation_Boolean__Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val PIID: Guid.IID = Guid.IID("cdb5efb35788509d9be171ccb8a3362a")

    public val IID: Guid.IID = Guid.IID("9fc2b0bbe44644e2aa619cab8f636af2")

    public fun makeIAsyncOperation_Boolean_(ptr: Pointer?): IAsyncOperation_Boolean_ =
        IAsyncOperation_Boolean__Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IAsyncOperation_Boolean_): Array<IAsyncOperation_Boolean_>
        = (elements as
        Array<IAsyncOperation_Boolean_>).castToImpl<IAsyncOperation_Boolean_,IAsyncOperation_Boolean__Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAsyncOperation_Boolean_?> =
        arrayOfNulls<IAsyncOperation_Boolean__Impl>(size) as Array<IAsyncOperation_Boolean_?>
  }
}

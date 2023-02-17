package Windows.Foundation

import Windows.Storage.StorageStreamTransaction
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

public interface IAsyncOperation_StorageStreamTransaction_ : NativeMapped, IWinRTInterface {
  public val IAsyncOperation_StorageStreamTransaction__Ptr: Pointer?

  public val IAsyncOperation_StorageStreamTransaction__VtblPtr: Pointer?
    get() = IAsyncOperation_StorageStreamTransaction__Ptr?.getPointer(0)

  public fun put_Completed(handler: AsyncOperationCompletedHandler_StorageStreamTransaction_):
      Unit {
    val fnPtr = IAsyncOperation_StorageStreamTransaction__VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(IAsyncOperation_StorageStreamTransaction__Ptr, handler,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun get_Completed(): AsyncOperationCompletedHandler_StorageStreamTransaction_ {
    val fnPtr = IAsyncOperation_StorageStreamTransaction__VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result =
        Windows.Foundation.AsyncOperationCompletedHandler_StorageStreamTransaction_.ByReference()
    val hr = fn.invokeHR(arrayOf(IAsyncOperation_StorageStreamTransaction__Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun GetResults(): StorageStreamTransaction {
    val fnPtr = IAsyncOperation_StorageStreamTransaction__VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Storage.StorageStreamTransaction.ByReference()
    val hr = fn.invokeHR(arrayOf(IAsyncOperation_StorageStreamTransaction__Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIAsyncOperation_StorageStreamTransaction_(pointer.getPointer(0))

    public fun setValue(`value`: IAsyncOperation_StorageStreamTransaction__Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IAsyncOperation_StorageStreamTransaction__Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IAsyncOperation_StorageStreamTransaction_ {
    public override val IAsyncOperation_StorageStreamTransaction__Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val PIID: Guid.IID = Guid.IID("0d81405a9bd35e8782f49b4128a887eb")

    public val IID: Guid.IID = Guid.IID("9fc2b0bbe44644e2aa619cab8f636af2")

    public fun makeIAsyncOperation_StorageStreamTransaction_(ptr: Pointer?):
        IAsyncOperation_StorageStreamTransaction_ =
        IAsyncOperation_StorageStreamTransaction__Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IAsyncOperation_StorageStreamTransaction_):
        Array<IAsyncOperation_StorageStreamTransaction_> = (elements as
        Array<IAsyncOperation_StorageStreamTransaction_>).castToImpl<IAsyncOperation_StorageStreamTransaction_,IAsyncOperation_StorageStreamTransaction__Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAsyncOperation_StorageStreamTransaction_?> =
        arrayOfNulls<IAsyncOperation_StorageStreamTransaction__Impl>(size) as
        Array<IAsyncOperation_StorageStreamTransaction_?>
  }
}

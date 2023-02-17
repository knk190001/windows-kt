package Windows.Foundation

import Windows.Storage.StorageFile
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

public interface IAsyncOperation_StorageFile_ : NativeMapped, IWinRTInterface {
  public val IAsyncOperation_StorageFile__Ptr: Pointer?

  public val IAsyncOperation_StorageFile__VtblPtr: Pointer?
    get() = IAsyncOperation_StorageFile__Ptr?.getPointer(0)

  public fun put_Completed(handler: AsyncOperationCompletedHandler_StorageFile_): Unit {
    val fnPtr = IAsyncOperation_StorageFile__VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(IAsyncOperation_StorageFile__Ptr, handler,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun get_Completed(): AsyncOperationCompletedHandler_StorageFile_ {
    val fnPtr = IAsyncOperation_StorageFile__VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.AsyncOperationCompletedHandler_StorageFile_.ByReference()
    val hr = fn.invokeHR(arrayOf(IAsyncOperation_StorageFile__Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun GetResults(): StorageFile {
    val fnPtr = IAsyncOperation_StorageFile__VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Storage.StorageFile.ByReference()
    val hr = fn.invokeHR(arrayOf(IAsyncOperation_StorageFile__Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIAsyncOperation_StorageFile_(pointer.getPointer(0))

    public fun setValue(`value`: IAsyncOperation_StorageFile__Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IAsyncOperation_StorageFile__Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IAsyncOperation_StorageFile_ {
    public override val IAsyncOperation_StorageFile__Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val PIID: Guid.IID = Guid.IID("5e52f8ceaced5a4295b4f674dd84885e")

    public val IID: Guid.IID = Guid.IID("9fc2b0bbe44644e2aa619cab8f636af2")

    public fun makeIAsyncOperation_StorageFile_(ptr: Pointer?): IAsyncOperation_StorageFile_ =
        IAsyncOperation_StorageFile__Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IAsyncOperation_StorageFile_):
        Array<IAsyncOperation_StorageFile_> = (elements as
        Array<IAsyncOperation_StorageFile_>).castToImpl<IAsyncOperation_StorageFile_,IAsyncOperation_StorageFile__Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAsyncOperation_StorageFile_?> =
        arrayOfNulls<IAsyncOperation_StorageFile__Impl>(size) as
        Array<IAsyncOperation_StorageFile_?>
  }
}

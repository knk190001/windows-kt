package Windows.Storage

import Windows.Foundation.IAsyncAction
import Windows.Foundation.IAsyncOperation_IVectorView_StorageLibraryChange__
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

public interface IStorageLibraryChangeReader : NativeMapped, IWinRTInterface {
  public val IStorageLibraryChangeReader_Ptr: Pointer?

  public val IStorageLibraryChangeReader_VtblPtr: Pointer?
    get() = IStorageLibraryChangeReader_Ptr?.getPointer(0)

  public fun ReadBatchAsync(): IAsyncOperation_IVectorView_StorageLibraryChange__ {
    val fnPtr = IStorageLibraryChangeReader_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.IAsyncOperation_IVectorView_StorageLibraryChange__.ByReference()
    val hr = fn.invokeHR(arrayOf(IStorageLibraryChangeReader_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun AcceptChangesAsync(): IAsyncAction {
    val fnPtr = IStorageLibraryChangeReader_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.IAsyncAction.ByReference()
    val hr = fn.invokeHR(arrayOf(IStorageLibraryChangeReader_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIStorageLibraryChangeReader(pointer.getPointer(0))

    public fun setValue(`value`: IStorageLibraryChangeReader_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IStorageLibraryChangeReader_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IStorageLibraryChangeReader {
    public override val IStorageLibraryChangeReader_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("f205bc83fca241f98954ee2e991eb96f")

    public fun makeIStorageLibraryChangeReader(ptr: Pointer?): IStorageLibraryChangeReader =
        IStorageLibraryChangeReader_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IStorageLibraryChangeReader):
        Array<IStorageLibraryChangeReader> = (elements as
        Array<IStorageLibraryChangeReader>).castToImpl<IStorageLibraryChangeReader,IStorageLibraryChangeReader_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStorageLibraryChangeReader?> =
        arrayOfNulls<IStorageLibraryChangeReader_Impl>(size) as Array<IStorageLibraryChangeReader?>
  }
}

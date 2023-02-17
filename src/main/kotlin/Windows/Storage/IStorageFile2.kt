package Windows.Storage

import Windows.Foundation.IAsyncOperation_IRandomAccessStream_
import Windows.Foundation.IAsyncOperation_StorageStreamTransaction_
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

public interface IStorageFile2 : NativeMapped, IWinRTInterface {
  public val IStorageFile2_Ptr: Pointer?

  public val IStorageFile2_VtblPtr: Pointer?
    get() = IStorageFile2_Ptr?.getPointer(0)

  public fun OpenAsync(accessMode: FileAccessMode, options: StorageOpenOptions):
      IAsyncOperation_IRandomAccessStream_ {
    val fnPtr = IStorageFile2_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.IAsyncOperation_IRandomAccessStream_.ByReference()
    val hr = fn.invokeHR(arrayOf(IStorageFile2_Ptr, accessMode, options, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun OpenTransactedWriteAsync(options: StorageOpenOptions):
      IAsyncOperation_StorageStreamTransaction_ {
    val fnPtr = IStorageFile2_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.IAsyncOperation_StorageStreamTransaction_.ByReference()
    val hr = fn.invokeHR(arrayOf(IStorageFile2_Ptr, options, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIStorageFile2(pointer.getPointer(0))

    public fun setValue(`value`: IStorageFile2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IStorageFile2_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IStorageFile2 {
    public override val IStorageFile2_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("954e4bcf0a7742fbb777c2ed58a52e44")

    public fun makeIStorageFile2(ptr: Pointer?): IStorageFile2 = IStorageFile2_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IStorageFile2): Array<IStorageFile2> = (elements as
        Array<IStorageFile2>).castToImpl<IStorageFile2,IStorageFile2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStorageFile2?> =
        arrayOfNulls<IStorageFile2_Impl>(size) as Array<IStorageFile2?>
  }
}

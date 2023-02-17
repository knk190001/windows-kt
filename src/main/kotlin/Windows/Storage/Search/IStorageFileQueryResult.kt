package Windows.Storage.Search

import Windows.Foundation.IAsyncOperation_IVectorView_StorageFile__
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
import com.sun.jna.platform.win32.WinDef
import java.lang.RuntimeException
import kotlin.Array
import kotlin.Int
import kotlin.Unit

public interface IStorageFileQueryResult : NativeMapped, IWinRTInterface {
  public val IStorageFileQueryResult_Ptr: Pointer?

  public val IStorageFileQueryResult_VtblPtr: Pointer?
    get() = IStorageFileQueryResult_Ptr?.getPointer(0)

  public fun GetFilesAsync(startIndex: WinDef.UINT, maxNumberOfItems: WinDef.UINT):
      IAsyncOperation_IVectorView_StorageFile__ {
    val fnPtr = IStorageFileQueryResult_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.IAsyncOperation_IVectorView_StorageFile__.ByReference()
    val hr = fn.invokeHR(arrayOf(IStorageFileQueryResult_Ptr, startIndex, maxNumberOfItems, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun GetFilesAsync(): IAsyncOperation_IVectorView_StorageFile__ {
    val fnPtr = IStorageFileQueryResult_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.IAsyncOperation_IVectorView_StorageFile__.ByReference()
    val hr = fn.invokeHR(arrayOf(IStorageFileQueryResult_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIStorageFileQueryResult(pointer.getPointer(0))

    public fun setValue(`value`: IStorageFileQueryResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IStorageFileQueryResult_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IStorageFileQueryResult {
    public override val IStorageFileQueryResult_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("52fda4472baa412cb29fd4b1778efa1e")

    public fun makeIStorageFileQueryResult(ptr: Pointer?): IStorageFileQueryResult =
        IStorageFileQueryResult_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IStorageFileQueryResult): Array<IStorageFileQueryResult> =
        (elements as
        Array<IStorageFileQueryResult>).castToImpl<IStorageFileQueryResult,IStorageFileQueryResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStorageFileQueryResult?> =
        arrayOfNulls<IStorageFileQueryResult_Impl>(size) as Array<IStorageFileQueryResult?>
  }
}

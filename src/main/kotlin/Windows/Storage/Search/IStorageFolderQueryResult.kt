package Windows.Storage.Search

import Windows.Foundation.IAsyncOperation_IVectorView_StorageFolder__
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

public interface IStorageFolderQueryResult : NativeMapped, IWinRTInterface {
  public val IStorageFolderQueryResult_Ptr: Pointer?

  public val IStorageFolderQueryResult_VtblPtr: Pointer?
    get() = IStorageFolderQueryResult_Ptr?.getPointer(0)

  public fun GetFoldersAsync(startIndex: WinDef.UINT, maxNumberOfItems: WinDef.UINT):
      IAsyncOperation_IVectorView_StorageFolder__ {
    val fnPtr = IStorageFolderQueryResult_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.IAsyncOperation_IVectorView_StorageFolder__.ByReference()
    val hr = fn.invokeHR(arrayOf(IStorageFolderQueryResult_Ptr, startIndex, maxNumberOfItems,
        result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun GetFoldersAsync(): IAsyncOperation_IVectorView_StorageFolder__ {
    val fnPtr = IStorageFolderQueryResult_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.IAsyncOperation_IVectorView_StorageFolder__.ByReference()
    val hr = fn.invokeHR(arrayOf(IStorageFolderQueryResult_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIStorageFolderQueryResult(pointer.getPointer(0))

    public fun setValue(`value`: IStorageFolderQueryResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IStorageFolderQueryResult_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IStorageFolderQueryResult {
    public override val IStorageFolderQueryResult_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("6654c9117d6646faaecfe4a4baa93ab8")

    public fun makeIStorageFolderQueryResult(ptr: Pointer?): IStorageFolderQueryResult =
        IStorageFolderQueryResult_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IStorageFolderQueryResult):
        Array<IStorageFolderQueryResult> = (elements as
        Array<IStorageFolderQueryResult>).castToImpl<IStorageFolderQueryResult,IStorageFolderQueryResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStorageFolderQueryResult?> =
        arrayOfNulls<IStorageFolderQueryResult_Impl>(size) as Array<IStorageFolderQueryResult?>
  }
}

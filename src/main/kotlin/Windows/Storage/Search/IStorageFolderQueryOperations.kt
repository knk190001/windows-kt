package Windows.Storage.Search

import Windows.Foundation.IAsyncOperation_IVectorView_IStorageItem__
import Windows.Foundation.IAsyncOperation_IVectorView_StorageFile__
import Windows.Foundation.IAsyncOperation_IVectorView_StorageFolder__
import Windows.Foundation.IAsyncOperation_IndexedState_
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
import com.sun.jna.ptr.ByteByReference
import java.lang.RuntimeException
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit

public interface IStorageFolderQueryOperations : NativeMapped, IWinRTInterface {
  public val IStorageFolderQueryOperations_Ptr: Pointer?

  public val IStorageFolderQueryOperations_VtblPtr: Pointer?
    get() = IStorageFolderQueryOperations_Ptr?.getPointer(0)

  public fun GetIndexedStateAsync(): IAsyncOperation_IndexedState_ {
    val fnPtr = IStorageFolderQueryOperations_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.IAsyncOperation_IndexedState_.ByReference()
    val hr = fn.invokeHR(arrayOf(IStorageFolderQueryOperations_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun CreateFileQuery(): StorageFileQueryResult {
    val fnPtr = IStorageFolderQueryOperations_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Storage.Search.StorageFileQueryResult.ByReference()
    val hr = fn.invokeHR(arrayOf(IStorageFolderQueryOperations_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun CreateFileQuery(query: CommonFileQuery): StorageFileQueryResult {
    val fnPtr = IStorageFolderQueryOperations_VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Storage.Search.StorageFileQueryResult.ByReference()
    val hr = fn.invokeHR(arrayOf(IStorageFolderQueryOperations_Ptr, query, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun CreateFileQueryWithOptions(queryOptions: QueryOptions): StorageFileQueryResult {
    val fnPtr = IStorageFolderQueryOperations_VtblPtr!!.getPointer(9L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Storage.Search.StorageFileQueryResult.ByReference()
    val hr = fn.invokeHR(arrayOf(IStorageFolderQueryOperations_Ptr, queryOptions, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun CreateFolderQuery(): StorageFolderQueryResult {
    val fnPtr = IStorageFolderQueryOperations_VtblPtr!!.getPointer(10L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Storage.Search.StorageFolderQueryResult.ByReference()
    val hr = fn.invokeHR(arrayOf(IStorageFolderQueryOperations_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun CreateFolderQuery(query: CommonFolderQuery): StorageFolderQueryResult {
    val fnPtr = IStorageFolderQueryOperations_VtblPtr!!.getPointer(11L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Storage.Search.StorageFolderQueryResult.ByReference()
    val hr = fn.invokeHR(arrayOf(IStorageFolderQueryOperations_Ptr, query, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun CreateFolderQueryWithOptions(queryOptions: QueryOptions): StorageFolderQueryResult {
    val fnPtr = IStorageFolderQueryOperations_VtblPtr!!.getPointer(12L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Storage.Search.StorageFolderQueryResult.ByReference()
    val hr = fn.invokeHR(arrayOf(IStorageFolderQueryOperations_Ptr, queryOptions, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun CreateItemQuery(): StorageItemQueryResult {
    val fnPtr = IStorageFolderQueryOperations_VtblPtr!!.getPointer(13L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Storage.Search.StorageItemQueryResult.ByReference()
    val hr = fn.invokeHR(arrayOf(IStorageFolderQueryOperations_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun CreateItemQueryWithOptions(queryOptions: QueryOptions): StorageItemQueryResult {
    val fnPtr = IStorageFolderQueryOperations_VtblPtr!!.getPointer(14L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Storage.Search.StorageItemQueryResult.ByReference()
    val hr = fn.invokeHR(arrayOf(IStorageFolderQueryOperations_Ptr, queryOptions, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun GetFilesAsync(
    query: CommonFileQuery,
    startIndex: WinDef.UINT,
    maxItemsToRetrieve: WinDef.UINT,
  ): IAsyncOperation_IVectorView_StorageFile__ {
    val fnPtr = IStorageFolderQueryOperations_VtblPtr!!.getPointer(15L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.IAsyncOperation_IVectorView_StorageFile__.ByReference()
    val hr = fn.invokeHR(arrayOf(IStorageFolderQueryOperations_Ptr, query, startIndex,
        maxItemsToRetrieve, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun GetFilesAsync(query: CommonFileQuery): IAsyncOperation_IVectorView_StorageFile__ {
    val fnPtr = IStorageFolderQueryOperations_VtblPtr!!.getPointer(16L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.IAsyncOperation_IVectorView_StorageFile__.ByReference()
    val hr = fn.invokeHR(arrayOf(IStorageFolderQueryOperations_Ptr, query, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun GetFoldersAsync(
    query: CommonFolderQuery,
    startIndex: WinDef.UINT,
    maxItemsToRetrieve: WinDef.UINT,
  ): IAsyncOperation_IVectorView_StorageFolder__ {
    val fnPtr = IStorageFolderQueryOperations_VtblPtr!!.getPointer(17L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.IAsyncOperation_IVectorView_StorageFolder__.ByReference()
    val hr = fn.invokeHR(arrayOf(IStorageFolderQueryOperations_Ptr, query, startIndex,
        maxItemsToRetrieve, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun GetFoldersAsync(query: CommonFolderQuery):
      IAsyncOperation_IVectorView_StorageFolder__ {
    val fnPtr = IStorageFolderQueryOperations_VtblPtr!!.getPointer(18L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.IAsyncOperation_IVectorView_StorageFolder__.ByReference()
    val hr = fn.invokeHR(arrayOf(IStorageFolderQueryOperations_Ptr, query, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun GetItemsAsync(startIndex: WinDef.UINT, maxItemsToRetrieve: WinDef.UINT):
      IAsyncOperation_IVectorView_IStorageItem__ {
    val fnPtr = IStorageFolderQueryOperations_VtblPtr!!.getPointer(19L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.IAsyncOperation_IVectorView_IStorageItem__.ByReference()
    val hr = fn.invokeHR(arrayOf(IStorageFolderQueryOperations_Ptr, startIndex, maxItemsToRetrieve,
        result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun AreQueryOptionsSupported(queryOptions: QueryOptions): Boolean {
    val fnPtr = IStorageFolderQueryOperations_VtblPtr!!.getPointer(20L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = ByteByReference()
    val hr = fn.invokeHR(arrayOf(IStorageFolderQueryOperations_Ptr, queryOptions, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue != 0.toByte()
    return resultValue_Managed
  }

  public fun IsCommonFolderQuerySupported(query: CommonFolderQuery): Boolean {
    val fnPtr = IStorageFolderQueryOperations_VtblPtr!!.getPointer(21L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = ByteByReference()
    val hr = fn.invokeHR(arrayOf(IStorageFolderQueryOperations_Ptr, query, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue != 0.toByte()
    return resultValue_Managed
  }

  public fun IsCommonFileQuerySupported(query: CommonFileQuery): Boolean {
    val fnPtr = IStorageFolderQueryOperations_VtblPtr!!.getPointer(22L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = ByteByReference()
    val hr = fn.invokeHR(arrayOf(IStorageFolderQueryOperations_Ptr, query, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue != 0.toByte()
    return resultValue_Managed
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIStorageFolderQueryOperations(pointer.getPointer(0))

    public fun setValue(`value`: IStorageFolderQueryOperations_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IStorageFolderQueryOperations_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IStorageFolderQueryOperations {
    public override val IStorageFolderQueryOperations_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("cb43ccc9446b4a4fbe97757771be5203")

    public fun makeIStorageFolderQueryOperations(ptr: Pointer?): IStorageFolderQueryOperations =
        IStorageFolderQueryOperations_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IStorageFolderQueryOperations):
        Array<IStorageFolderQueryOperations> = (elements as
        Array<IStorageFolderQueryOperations>).castToImpl<IStorageFolderQueryOperations,IStorageFolderQueryOperations_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStorageFolderQueryOperations?> =
        arrayOfNulls<IStorageFolderQueryOperations_Impl>(size) as
        Array<IStorageFolderQueryOperations?>
  }
}

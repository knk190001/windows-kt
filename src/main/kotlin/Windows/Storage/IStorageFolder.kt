package Windows.Storage

import Windows.Foundation.IAsyncOperation_IStorageItem_
import Windows.Foundation.IAsyncOperation_IVectorView_IStorageItem__
import Windows.Foundation.IAsyncOperation_IVectorView_StorageFile__
import Windows.Foundation.IAsyncOperation_IVectorView_StorageFolder__
import Windows.Foundation.IAsyncOperation_StorageFile_
import Windows.Foundation.IAsyncOperation_StorageFolder_
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
import kotlin.String
import kotlin.Unit

public interface IStorageFolder : NativeMapped, IWinRTInterface {
  public val IStorageFolder_Ptr: Pointer?

  public val IStorageFolder_VtblPtr: Pointer?
    get() = IStorageFolder_Ptr?.getPointer(0)

  public fun CreateFileAsync(desiredName: String): IAsyncOperation_StorageFile_ {
    val fnPtr = IStorageFolder_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val desiredName_Native = desiredName.toHandle()
    val result = Windows.Foundation.IAsyncOperation_StorageFile_.ByReference()
    val hr = fn.invokeHR(arrayOf(IStorageFolder_Ptr, desiredName_Native, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun CreateFileAsync(desiredName: String, options: CreationCollisionOption):
      IAsyncOperation_StorageFile_ {
    val fnPtr = IStorageFolder_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val desiredName_Native = desiredName.toHandle()
    val result = Windows.Foundation.IAsyncOperation_StorageFile_.ByReference()
    val hr = fn.invokeHR(arrayOf(IStorageFolder_Ptr, desiredName_Native, options, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun CreateFolderAsync(desiredName: String): IAsyncOperation_StorageFolder_ {
    val fnPtr = IStorageFolder_VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val desiredName_Native = desiredName.toHandle()
    val result = Windows.Foundation.IAsyncOperation_StorageFolder_.ByReference()
    val hr = fn.invokeHR(arrayOf(IStorageFolder_Ptr, desiredName_Native, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun CreateFolderAsync(desiredName: String, options: CreationCollisionOption):
      IAsyncOperation_StorageFolder_ {
    val fnPtr = IStorageFolder_VtblPtr!!.getPointer(9L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val desiredName_Native = desiredName.toHandle()
    val result = Windows.Foundation.IAsyncOperation_StorageFolder_.ByReference()
    val hr = fn.invokeHR(arrayOf(IStorageFolder_Ptr, desiredName_Native, options, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun GetFileAsync(name: String): IAsyncOperation_StorageFile_ {
    val fnPtr = IStorageFolder_VtblPtr!!.getPointer(10L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val name_Native = name.toHandle()
    val result = Windows.Foundation.IAsyncOperation_StorageFile_.ByReference()
    val hr = fn.invokeHR(arrayOf(IStorageFolder_Ptr, name_Native, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun GetFolderAsync(name: String): IAsyncOperation_StorageFolder_ {
    val fnPtr = IStorageFolder_VtblPtr!!.getPointer(11L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val name_Native = name.toHandle()
    val result = Windows.Foundation.IAsyncOperation_StorageFolder_.ByReference()
    val hr = fn.invokeHR(arrayOf(IStorageFolder_Ptr, name_Native, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun GetItemAsync(name: String): IAsyncOperation_IStorageItem_ {
    val fnPtr = IStorageFolder_VtblPtr!!.getPointer(12L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val name_Native = name.toHandle()
    val result = Windows.Foundation.IAsyncOperation_IStorageItem_.ByReference()
    val hr = fn.invokeHR(arrayOf(IStorageFolder_Ptr, name_Native, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun GetFilesAsync(): IAsyncOperation_IVectorView_StorageFile__ {
    val fnPtr = IStorageFolder_VtblPtr!!.getPointer(13L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.IAsyncOperation_IVectorView_StorageFile__.ByReference()
    val hr = fn.invokeHR(arrayOf(IStorageFolder_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun GetFoldersAsync(): IAsyncOperation_IVectorView_StorageFolder__ {
    val fnPtr = IStorageFolder_VtblPtr!!.getPointer(14L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.IAsyncOperation_IVectorView_StorageFolder__.ByReference()
    val hr = fn.invokeHR(arrayOf(IStorageFolder_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun GetItemsAsync(): IAsyncOperation_IVectorView_IStorageItem__ {
    val fnPtr = IStorageFolder_VtblPtr!!.getPointer(15L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.IAsyncOperation_IVectorView_IStorageItem__.ByReference()
    val hr = fn.invokeHR(arrayOf(IStorageFolder_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIStorageFolder(pointer.getPointer(0))

    public fun setValue(`value`: IStorageFolder_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IStorageFolder_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IStorageFolder {
    public override val IStorageFolder_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("72d1cb78b3ef4f75a80b6fd9dae2944b")

    public fun makeIStorageFolder(ptr: Pointer?): IStorageFolder = IStorageFolder_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IStorageFolder): Array<IStorageFolder> = (elements as
        Array<IStorageFolder>).castToImpl<IStorageFolder,IStorageFolder_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStorageFolder?> =
        arrayOfNulls<IStorageFolder_Impl>(size) as Array<IStorageFolder?>
  }
}

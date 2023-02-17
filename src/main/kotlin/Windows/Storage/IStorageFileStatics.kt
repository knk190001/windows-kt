package Windows.Storage

import Windows.Foundation.IAsyncOperation_StorageFile_
import Windows.Foundation.Uri
import Windows.Storage.Streams.IRandomAccessStreamReference
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

public interface IStorageFileStatics : NativeMapped, IWinRTInterface {
  public val IStorageFileStatics_Ptr: Pointer?

  public val IStorageFileStatics_VtblPtr: Pointer?
    get() = IStorageFileStatics_Ptr?.getPointer(0)

  public fun GetFileFromPathAsync(path: String): IAsyncOperation_StorageFile_ {
    val fnPtr = IStorageFileStatics_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val path_Native = path.toHandle()
    val result = Windows.Foundation.IAsyncOperation_StorageFile_.ByReference()
    val hr = fn.invokeHR(arrayOf(IStorageFileStatics_Ptr, path_Native, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun GetFileFromApplicationUriAsync(uri: Uri): IAsyncOperation_StorageFile_ {
    val fnPtr = IStorageFileStatics_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.IAsyncOperation_StorageFile_.ByReference()
    val hr = fn.invokeHR(arrayOf(IStorageFileStatics_Ptr, uri, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun CreateStreamedFileAsync(
    displayNameWithExtension: String,
    dataRequested: StreamedFileDataRequestedHandler,
    thumbnail: IRandomAccessStreamReference,
  ): IAsyncOperation_StorageFile_ {
    val fnPtr = IStorageFileStatics_VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val displayNameWithExtension_Native = displayNameWithExtension.toHandle()
    val result = Windows.Foundation.IAsyncOperation_StorageFile_.ByReference()
    val hr = fn.invokeHR(arrayOf(IStorageFileStatics_Ptr, displayNameWithExtension_Native,
        dataRequested, thumbnail, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun ReplaceWithStreamedFileAsync(
    fileToReplace: IStorageFile,
    dataRequested: StreamedFileDataRequestedHandler,
    thumbnail: IRandomAccessStreamReference,
  ): IAsyncOperation_StorageFile_ {
    val fnPtr = IStorageFileStatics_VtblPtr!!.getPointer(9L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.IAsyncOperation_StorageFile_.ByReference()
    val hr = fn.invokeHR(arrayOf(IStorageFileStatics_Ptr, fileToReplace, dataRequested, thumbnail,
        result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun CreateStreamedFileFromUriAsync(
    displayNameWithExtension: String,
    uri: Uri,
    thumbnail: IRandomAccessStreamReference,
  ): IAsyncOperation_StorageFile_ {
    val fnPtr = IStorageFileStatics_VtblPtr!!.getPointer(10L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val displayNameWithExtension_Native = displayNameWithExtension.toHandle()
    val result = Windows.Foundation.IAsyncOperation_StorageFile_.ByReference()
    val hr = fn.invokeHR(arrayOf(IStorageFileStatics_Ptr, displayNameWithExtension_Native, uri,
        thumbnail, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun ReplaceWithStreamedFileFromUriAsync(
    fileToReplace: IStorageFile,
    uri: Uri,
    thumbnail: IRandomAccessStreamReference,
  ): IAsyncOperation_StorageFile_ {
    val fnPtr = IStorageFileStatics_VtblPtr!!.getPointer(11L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.IAsyncOperation_StorageFile_.ByReference()
    val hr = fn.invokeHR(arrayOf(IStorageFileStatics_Ptr, fileToReplace, uri, thumbnail, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIStorageFileStatics(pointer.getPointer(0))

    public fun setValue(`value`: IStorageFileStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IStorageFileStatics_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IStorageFileStatics {
    public override val IStorageFileStatics_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("5984c710daf243c88bb4a4d3eacfd03f")

    public fun makeIStorageFileStatics(ptr: Pointer?): IStorageFileStatics =
        IStorageFileStatics_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IStorageFileStatics): Array<IStorageFileStatics> =
        (elements as
        Array<IStorageFileStatics>).castToImpl<IStorageFileStatics,IStorageFileStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStorageFileStatics?> =
        arrayOfNulls<IStorageFileStatics_Impl>(size) as Array<IStorageFileStatics?>
  }
}

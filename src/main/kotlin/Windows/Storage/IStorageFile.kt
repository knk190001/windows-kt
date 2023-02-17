package Windows.Storage

import Windows.Foundation.IAsyncAction
import Windows.Foundation.IAsyncOperation_IRandomAccessStream_
import Windows.Foundation.IAsyncOperation_StorageFile_
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
import com.sun.jna.platform.win32.WinNT
import java.lang.RuntimeException
import kotlin.Array
import kotlin.Int
import kotlin.String
import kotlin.Unit

public interface IStorageFile : NativeMapped, IWinRTInterface {
  public val IStorageFile_Ptr: Pointer?

  public val IStorageFile_VtblPtr: Pointer?
    get() = IStorageFile_Ptr?.getPointer(0)

  public fun get_FileType(): String {
    val fnPtr = IStorageFile_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(IStorageFile_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public fun get_ContentType(): String {
    val fnPtr = IStorageFile_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(IStorageFile_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public fun OpenAsync(accessMode: FileAccessMode): IAsyncOperation_IRandomAccessStream_ {
    val fnPtr = IStorageFile_VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.IAsyncOperation_IRandomAccessStream_.ByReference()
    val hr = fn.invokeHR(arrayOf(IStorageFile_Ptr, accessMode, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun OpenTransactedWriteAsync(): IAsyncOperation_StorageStreamTransaction_ {
    val fnPtr = IStorageFile_VtblPtr!!.getPointer(9L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.IAsyncOperation_StorageStreamTransaction_.ByReference()
    val hr = fn.invokeHR(arrayOf(IStorageFile_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun CopyAsync(destinationFolder: IStorageFolder): IAsyncOperation_StorageFile_ {
    val fnPtr = IStorageFile_VtblPtr!!.getPointer(10L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.IAsyncOperation_StorageFile_.ByReference()
    val hr = fn.invokeHR(arrayOf(IStorageFile_Ptr, destinationFolder, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun CopyAsync(destinationFolder: IStorageFolder, desiredNewName: String):
      IAsyncOperation_StorageFile_ {
    val fnPtr = IStorageFile_VtblPtr!!.getPointer(11L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val desiredNewName_Native = desiredNewName.toHandle()
    val result = Windows.Foundation.IAsyncOperation_StorageFile_.ByReference()
    val hr = fn.invokeHR(arrayOf(IStorageFile_Ptr, destinationFolder, desiredNewName_Native,
        result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun CopyAsync(
    destinationFolder: IStorageFolder,
    desiredNewName: String,
    option: NameCollisionOption,
  ): IAsyncOperation_StorageFile_ {
    val fnPtr = IStorageFile_VtblPtr!!.getPointer(12L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val desiredNewName_Native = desiredNewName.toHandle()
    val result = Windows.Foundation.IAsyncOperation_StorageFile_.ByReference()
    val hr = fn.invokeHR(arrayOf(IStorageFile_Ptr, destinationFolder, desiredNewName_Native, option,
        result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun CopyAndReplaceAsync(fileToReplace: IStorageFile): IAsyncAction {
    val fnPtr = IStorageFile_VtblPtr!!.getPointer(13L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.IAsyncAction.ByReference()
    val hr = fn.invokeHR(arrayOf(IStorageFile_Ptr, fileToReplace, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun MoveAsync(destinationFolder: IStorageFolder): IAsyncAction {
    val fnPtr = IStorageFile_VtblPtr!!.getPointer(14L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.IAsyncAction.ByReference()
    val hr = fn.invokeHR(arrayOf(IStorageFile_Ptr, destinationFolder, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun MoveAsync(destinationFolder: IStorageFolder, desiredNewName: String): IAsyncAction {
    val fnPtr = IStorageFile_VtblPtr!!.getPointer(15L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val desiredNewName_Native = desiredNewName.toHandle()
    val result = Windows.Foundation.IAsyncAction.ByReference()
    val hr = fn.invokeHR(arrayOf(IStorageFile_Ptr, destinationFolder, desiredNewName_Native,
        result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun MoveAsync(
    destinationFolder: IStorageFolder,
    desiredNewName: String,
    option: NameCollisionOption,
  ): IAsyncAction {
    val fnPtr = IStorageFile_VtblPtr!!.getPointer(16L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val desiredNewName_Native = desiredNewName.toHandle()
    val result = Windows.Foundation.IAsyncAction.ByReference()
    val hr = fn.invokeHR(arrayOf(IStorageFile_Ptr, destinationFolder, desiredNewName_Native, option,
        result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun MoveAndReplaceAsync(fileToReplace: IStorageFile): IAsyncAction {
    val fnPtr = IStorageFile_VtblPtr!!.getPointer(17L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.IAsyncAction.ByReference()
    val hr = fn.invokeHR(arrayOf(IStorageFile_Ptr, fileToReplace, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIStorageFile(pointer.getPointer(0))

    public fun setValue(`value`: IStorageFile_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IStorageFile_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IStorageFile {
    public override val IStorageFile_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("fa3f61864214428ca64c14c9ac7315ea")

    public fun makeIStorageFile(ptr: Pointer?): IStorageFile = IStorageFile_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IStorageFile): Array<IStorageFile> = (elements as
        Array<IStorageFile>).castToImpl<IStorageFile,IStorageFile_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStorageFile?> =
        arrayOfNulls<IStorageFile_Impl>(size) as Array<IStorageFile?>
  }
}

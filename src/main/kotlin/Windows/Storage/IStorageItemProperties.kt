package Windows.Storage

import Windows.Foundation.IAsyncOperation_StorageItemThumbnail_
import Windows.Storage.FileProperties.StorageItemContentProperties
import Windows.Storage.FileProperties.ThumbnailMode
import Windows.Storage.FileProperties.ThumbnailOptions
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
import com.sun.jna.platform.win32.WinNT
import java.lang.RuntimeException
import kotlin.Array
import kotlin.Int
import kotlin.String
import kotlin.Unit

public interface IStorageItemProperties : NativeMapped, IWinRTInterface {
  public val IStorageItemProperties_Ptr: Pointer?

  public val IStorageItemProperties_VtblPtr: Pointer?
    get() = IStorageItemProperties_Ptr?.getPointer(0)

  public fun GetThumbnailAsync(mode: ThumbnailMode): IAsyncOperation_StorageItemThumbnail_ {
    val fnPtr = IStorageItemProperties_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.IAsyncOperation_StorageItemThumbnail_.ByReference()
    val hr = fn.invokeHR(arrayOf(IStorageItemProperties_Ptr, mode, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun GetThumbnailAsync(mode: ThumbnailMode, requestedSize: WinDef.UINT):
      IAsyncOperation_StorageItemThumbnail_ {
    val fnPtr = IStorageItemProperties_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.IAsyncOperation_StorageItemThumbnail_.ByReference()
    val hr = fn.invokeHR(arrayOf(IStorageItemProperties_Ptr, mode, requestedSize, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun GetThumbnailAsync(
    mode: ThumbnailMode,
    requestedSize: WinDef.UINT,
    options: ThumbnailOptions,
  ): IAsyncOperation_StorageItemThumbnail_ {
    val fnPtr = IStorageItemProperties_VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.IAsyncOperation_StorageItemThumbnail_.ByReference()
    val hr = fn.invokeHR(arrayOf(IStorageItemProperties_Ptr, mode, requestedSize, options, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun get_DisplayName(): String {
    val fnPtr = IStorageItemProperties_VtblPtr!!.getPointer(9L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(IStorageItemProperties_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public fun get_DisplayType(): String {
    val fnPtr = IStorageItemProperties_VtblPtr!!.getPointer(10L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(IStorageItemProperties_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public fun get_FolderRelativeId(): String {
    val fnPtr = IStorageItemProperties_VtblPtr!!.getPointer(11L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(IStorageItemProperties_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public fun get_Properties(): StorageItemContentProperties {
    val fnPtr = IStorageItemProperties_VtblPtr!!.getPointer(12L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Storage.FileProperties.StorageItemContentProperties.ByReference()
    val hr = fn.invokeHR(arrayOf(IStorageItemProperties_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIStorageItemProperties(pointer.getPointer(0))

    public fun setValue(`value`: IStorageItemProperties_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IStorageItemProperties_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IStorageItemProperties {
    public override val IStorageItemProperties_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("86664478802946fea7891c2f3e2ffb5c")

    public fun makeIStorageItemProperties(ptr: Pointer?): IStorageItemProperties =
        IStorageItemProperties_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IStorageItemProperties): Array<IStorageItemProperties> =
        (elements as
        Array<IStorageItemProperties>).castToImpl<IStorageItemProperties,IStorageItemProperties_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStorageItemProperties?> =
        arrayOfNulls<IStorageItemProperties_Impl>(size) as Array<IStorageItemProperties?>
  }
}

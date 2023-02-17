package Windows.Storage

import Windows.Foundation.IAsyncOperation_StorageItemThumbnail_
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
import java.lang.RuntimeException
import kotlin.Array
import kotlin.Int
import kotlin.Unit

public interface IStorageItemProperties2 : NativeMapped, IWinRTInterface {
  public val IStorageItemProperties2_Ptr: Pointer?

  public val IStorageItemProperties2_VtblPtr: Pointer?
    get() = IStorageItemProperties2_Ptr?.getPointer(0)

  public fun GetScaledImageAsThumbnailAsync(mode: ThumbnailMode):
      IAsyncOperation_StorageItemThumbnail_ {
    val fnPtr = IStorageItemProperties2_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.IAsyncOperation_StorageItemThumbnail_.ByReference()
    val hr = fn.invokeHR(arrayOf(IStorageItemProperties2_Ptr, mode, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun GetScaledImageAsThumbnailAsync(mode: ThumbnailMode, requestedSize: WinDef.UINT):
      IAsyncOperation_StorageItemThumbnail_ {
    val fnPtr = IStorageItemProperties2_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.IAsyncOperation_StorageItemThumbnail_.ByReference()
    val hr = fn.invokeHR(arrayOf(IStorageItemProperties2_Ptr, mode, requestedSize, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun GetScaledImageAsThumbnailAsync(
    mode: ThumbnailMode,
    requestedSize: WinDef.UINT,
    options: ThumbnailOptions,
  ): IAsyncOperation_StorageItemThumbnail_ {
    val fnPtr = IStorageItemProperties2_VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.IAsyncOperation_StorageItemThumbnail_.ByReference()
    val hr = fn.invokeHR(arrayOf(IStorageItemProperties2_Ptr, mode, requestedSize, options, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIStorageItemProperties2(pointer.getPointer(0))

    public fun setValue(`value`: IStorageItemProperties2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IStorageItemProperties2_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IStorageItemProperties2 {
    public override val IStorageItemProperties2_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("8e86a95104b94bd2929dfef3f71621d0")

    public fun makeIStorageItemProperties2(ptr: Pointer?): IStorageItemProperties2 =
        IStorageItemProperties2_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IStorageItemProperties2): Array<IStorageItemProperties2> =
        (elements as
        Array<IStorageItemProperties2>).castToImpl<IStorageItemProperties2,IStorageItemProperties2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStorageItemProperties2?> =
        arrayOfNulls<IStorageItemProperties2_Impl>(size) as Array<IStorageItemProperties2?>
  }
}

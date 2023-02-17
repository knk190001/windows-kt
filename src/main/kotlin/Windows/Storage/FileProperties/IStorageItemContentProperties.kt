package Windows.Storage.FileProperties

import Windows.Foundation.IAsyncOperation_DocumentProperties_
import Windows.Foundation.IAsyncOperation_ImageProperties_
import Windows.Foundation.IAsyncOperation_MusicProperties_
import Windows.Foundation.IAsyncOperation_VideoProperties_
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

public interface IStorageItemContentProperties : NativeMapped, IWinRTInterface {
  public val IStorageItemContentProperties_Ptr: Pointer?

  public val IStorageItemContentProperties_VtblPtr: Pointer?
    get() = IStorageItemContentProperties_Ptr?.getPointer(0)

  public fun GetMusicPropertiesAsync(): IAsyncOperation_MusicProperties_ {
    val fnPtr = IStorageItemContentProperties_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.IAsyncOperation_MusicProperties_.ByReference()
    val hr = fn.invokeHR(arrayOf(IStorageItemContentProperties_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun GetVideoPropertiesAsync(): IAsyncOperation_VideoProperties_ {
    val fnPtr = IStorageItemContentProperties_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.IAsyncOperation_VideoProperties_.ByReference()
    val hr = fn.invokeHR(arrayOf(IStorageItemContentProperties_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun GetImagePropertiesAsync(): IAsyncOperation_ImageProperties_ {
    val fnPtr = IStorageItemContentProperties_VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.IAsyncOperation_ImageProperties_.ByReference()
    val hr = fn.invokeHR(arrayOf(IStorageItemContentProperties_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun GetDocumentPropertiesAsync(): IAsyncOperation_DocumentProperties_ {
    val fnPtr = IStorageItemContentProperties_VtblPtr!!.getPointer(9L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.IAsyncOperation_DocumentProperties_.ByReference()
    val hr = fn.invokeHR(arrayOf(IStorageItemContentProperties_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIStorageItemContentProperties(pointer.getPointer(0))

    public fun setValue(`value`: IStorageItemContentProperties_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IStorageItemContentProperties_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IStorageItemContentProperties {
    public override val IStorageItemContentProperties_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("05294badbc3848bf85d7770e0e2ae0ba")

    public fun makeIStorageItemContentProperties(ptr: Pointer?): IStorageItemContentProperties =
        IStorageItemContentProperties_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IStorageItemContentProperties):
        Array<IStorageItemContentProperties> = (elements as
        Array<IStorageItemContentProperties>).castToImpl<IStorageItemContentProperties,IStorageItemContentProperties_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStorageItemContentProperties?> =
        arrayOfNulls<IStorageItemContentProperties_Impl>(size) as
        Array<IStorageItemContentProperties?>
  }
}

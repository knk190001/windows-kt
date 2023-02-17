package Windows.Foundation

import Windows.Storage.FileProperties.StorageItemThumbnail
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

public interface IAsyncOperation_StorageItemThumbnail_ : NativeMapped, IWinRTInterface {
  public val IAsyncOperation_StorageItemThumbnail__Ptr: Pointer?

  public val IAsyncOperation_StorageItemThumbnail__VtblPtr: Pointer?
    get() = IAsyncOperation_StorageItemThumbnail__Ptr?.getPointer(0)

  public fun put_Completed(handler: AsyncOperationCompletedHandler_StorageItemThumbnail_): Unit {
    val fnPtr = IAsyncOperation_StorageItemThumbnail__VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(IAsyncOperation_StorageItemThumbnail__Ptr, handler,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun get_Completed(): AsyncOperationCompletedHandler_StorageItemThumbnail_ {
    val fnPtr = IAsyncOperation_StorageItemThumbnail__VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result =
        Windows.Foundation.AsyncOperationCompletedHandler_StorageItemThumbnail_.ByReference()
    val hr = fn.invokeHR(arrayOf(IAsyncOperation_StorageItemThumbnail__Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun GetResults(): StorageItemThumbnail {
    val fnPtr = IAsyncOperation_StorageItemThumbnail__VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Storage.FileProperties.StorageItemThumbnail.ByReference()
    val hr = fn.invokeHR(arrayOf(IAsyncOperation_StorageItemThumbnail__Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIAsyncOperation_StorageItemThumbnail_(pointer.getPointer(0))

    public fun setValue(`value`: IAsyncOperation_StorageItemThumbnail__Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IAsyncOperation_StorageItemThumbnail__Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IAsyncOperation_StorageItemThumbnail_ {
    public override val IAsyncOperation_StorageItemThumbnail__Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val PIID: Guid.IID = Guid.IID("11c7cc5ec04e50e7a65e6f6903690c16")

    public val IID: Guid.IID = Guid.IID("9fc2b0bbe44644e2aa619cab8f636af2")

    public fun makeIAsyncOperation_StorageItemThumbnail_(ptr: Pointer?):
        IAsyncOperation_StorageItemThumbnail_ = IAsyncOperation_StorageItemThumbnail__Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IAsyncOperation_StorageItemThumbnail_):
        Array<IAsyncOperation_StorageItemThumbnail_> = (elements as
        Array<IAsyncOperation_StorageItemThumbnail_>).castToImpl<IAsyncOperation_StorageItemThumbnail_,IAsyncOperation_StorageItemThumbnail__Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAsyncOperation_StorageItemThumbnail_?> =
        arrayOfNulls<IAsyncOperation_StorageItemThumbnail__Impl>(size) as
        Array<IAsyncOperation_StorageItemThumbnail_?>
  }
}

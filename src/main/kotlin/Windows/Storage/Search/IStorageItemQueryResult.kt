package Windows.Storage.Search

import Windows.Foundation.IAsyncOperation_IVectorView_IStorageItem__
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

public interface IStorageItemQueryResult : NativeMapped, IWinRTInterface {
  public val IStorageItemQueryResult_Ptr: Pointer?

  public val IStorageItemQueryResult_VtblPtr: Pointer?
    get() = IStorageItemQueryResult_Ptr?.getPointer(0)

  public fun GetItemsAsync(startIndex: WinDef.UINT, maxNumberOfItems: WinDef.UINT):
      IAsyncOperation_IVectorView_IStorageItem__ {
    val fnPtr = IStorageItemQueryResult_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.IAsyncOperation_IVectorView_IStorageItem__.ByReference()
    val hr = fn.invokeHR(arrayOf(IStorageItemQueryResult_Ptr, startIndex, maxNumberOfItems, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun GetItemsAsync(): IAsyncOperation_IVectorView_IStorageItem__ {
    val fnPtr = IStorageItemQueryResult_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.IAsyncOperation_IVectorView_IStorageItem__.ByReference()
    val hr = fn.invokeHR(arrayOf(IStorageItemQueryResult_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIStorageItemQueryResult(pointer.getPointer(0))

    public fun setValue(`value`: IStorageItemQueryResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IStorageItemQueryResult_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IStorageItemQueryResult {
    public override val IStorageItemQueryResult_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("e89480799d5847b8b2b241b07f4795f9")

    public fun makeIStorageItemQueryResult(ptr: Pointer?): IStorageItemQueryResult =
        IStorageItemQueryResult_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IStorageItemQueryResult): Array<IStorageItemQueryResult> =
        (elements as
        Array<IStorageItemQueryResult>).castToImpl<IStorageItemQueryResult,IStorageItemQueryResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStorageItemQueryResult?> =
        arrayOfNulls<IStorageItemQueryResult_Impl>(size) as Array<IStorageItemQueryResult?>
  }
}

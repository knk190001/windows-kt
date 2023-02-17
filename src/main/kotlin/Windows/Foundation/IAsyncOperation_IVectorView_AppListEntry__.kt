package Windows.Foundation

import Windows.Foundation.Collections.IVectorView_AppListEntry_
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

public interface IAsyncOperation_IVectorView_AppListEntry__ : NativeMapped, IWinRTInterface {
  public val IAsyncOperation_IVectorView_AppListEntry___Ptr: Pointer?

  public val IAsyncOperation_IVectorView_AppListEntry___VtblPtr: Pointer?
    get() = IAsyncOperation_IVectorView_AppListEntry___Ptr?.getPointer(0)

  public fun put_Completed(handler: AsyncOperationCompletedHandler_IVectorView_AppListEntry__):
      Unit {
    val fnPtr = IAsyncOperation_IVectorView_AppListEntry___VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(IAsyncOperation_IVectorView_AppListEntry___Ptr, handler,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun get_Completed(): AsyncOperationCompletedHandler_IVectorView_AppListEntry__ {
    val fnPtr = IAsyncOperation_IVectorView_AppListEntry___VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result =
        Windows.Foundation.AsyncOperationCompletedHandler_IVectorView_AppListEntry__.ByReference()
    val hr = fn.invokeHR(arrayOf(IAsyncOperation_IVectorView_AppListEntry___Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun GetResults(): IVectorView_AppListEntry_ {
    val fnPtr = IAsyncOperation_IVectorView_AppListEntry___VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.Collections.IVectorView_AppListEntry_.ByReference()
    val hr = fn.invokeHR(arrayOf(IAsyncOperation_IVectorView_AppListEntry___Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() =
        ABI.makeIAsyncOperation_IVectorView_AppListEntry__(pointer.getPointer(0))

    public fun setValue(`value`: IAsyncOperation_IVectorView_AppListEntry___Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IAsyncOperation_IVectorView_AppListEntry___Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IAsyncOperation_IVectorView_AppListEntry__ {
    public override val IAsyncOperation_IVectorView_AppListEntry___Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val PIID: Guid.IID = Guid.IID("d3bcf8a035385dae98d71f2ab88c3f01")

    public val IID: Guid.IID = Guid.IID("9fc2b0bbe44644e2aa619cab8f636af2")

    public fun makeIAsyncOperation_IVectorView_AppListEntry__(ptr: Pointer?):
        IAsyncOperation_IVectorView_AppListEntry__ =
        IAsyncOperation_IVectorView_AppListEntry___Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IAsyncOperation_IVectorView_AppListEntry__):
        Array<IAsyncOperation_IVectorView_AppListEntry__> = (elements as
        Array<IAsyncOperation_IVectorView_AppListEntry__>).castToImpl<IAsyncOperation_IVectorView_AppListEntry__,IAsyncOperation_IVectorView_AppListEntry___Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAsyncOperation_IVectorView_AppListEntry__?> =
        arrayOfNulls<IAsyncOperation_IVectorView_AppListEntry___Impl>(size) as
        Array<IAsyncOperation_IVectorView_AppListEntry__?>
  }
}
package Windows.Foundation

import Windows.UI.Notifications.ToastCollection
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

public interface IAsyncOperation_ToastCollection_ : NativeMapped, IWinRTInterface {
  public val IAsyncOperation_ToastCollection__Ptr: Pointer?

  public val IAsyncOperation_ToastCollection__VtblPtr: Pointer?
    get() = IAsyncOperation_ToastCollection__Ptr?.getPointer(0)

  public fun put_Completed(handler: AsyncOperationCompletedHandler_ToastCollection_): Unit {
    val fnPtr = IAsyncOperation_ToastCollection__VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(IAsyncOperation_ToastCollection__Ptr, handler,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun get_Completed(): AsyncOperationCompletedHandler_ToastCollection_ {
    val fnPtr = IAsyncOperation_ToastCollection__VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.AsyncOperationCompletedHandler_ToastCollection_.ByReference()
    val hr = fn.invokeHR(arrayOf(IAsyncOperation_ToastCollection__Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun GetResults(): ToastCollection {
    val fnPtr = IAsyncOperation_ToastCollection__VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.UI.Notifications.ToastCollection.ByReference()
    val hr = fn.invokeHR(arrayOf(IAsyncOperation_ToastCollection__Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIAsyncOperation_ToastCollection_(pointer.getPointer(0))

    public fun setValue(`value`: IAsyncOperation_ToastCollection__Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IAsyncOperation_ToastCollection__Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IAsyncOperation_ToastCollection_ {
    public override val IAsyncOperation_ToastCollection__Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val PIID: Guid.IID = Guid.IID("9310ec479f0a599980c24b31e9f77e8e")

    public val IID: Guid.IID = Guid.IID("9fc2b0bbe44644e2aa619cab8f636af2")

    public fun makeIAsyncOperation_ToastCollection_(ptr: Pointer?): IAsyncOperation_ToastCollection_
        = IAsyncOperation_ToastCollection__Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IAsyncOperation_ToastCollection_):
        Array<IAsyncOperation_ToastCollection_> = (elements as
        Array<IAsyncOperation_ToastCollection_>).castToImpl<IAsyncOperation_ToastCollection_,IAsyncOperation_ToastCollection__Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAsyncOperation_ToastCollection_?> =
        arrayOfNulls<IAsyncOperation_ToastCollection__Impl>(size) as
        Array<IAsyncOperation_ToastCollection_?>
  }
}

package Windows.Foundation

import Windows.UI.Notifications.ToastNotifier
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

public interface IAsyncOperation_ToastNotifier_ : NativeMapped, IWinRTInterface {
  public val IAsyncOperation_ToastNotifier__Ptr: Pointer?

  public val IAsyncOperation_ToastNotifier__VtblPtr: Pointer?
    get() = IAsyncOperation_ToastNotifier__Ptr?.getPointer(0)

  public fun put_Completed(handler: AsyncOperationCompletedHandler_ToastNotifier_): Unit {
    val fnPtr = IAsyncOperation_ToastNotifier__VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(IAsyncOperation_ToastNotifier__Ptr, handler,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun get_Completed(): AsyncOperationCompletedHandler_ToastNotifier_ {
    val fnPtr = IAsyncOperation_ToastNotifier__VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.AsyncOperationCompletedHandler_ToastNotifier_.ByReference()
    val hr = fn.invokeHR(arrayOf(IAsyncOperation_ToastNotifier__Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun GetResults(): ToastNotifier {
    val fnPtr = IAsyncOperation_ToastNotifier__VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.UI.Notifications.ToastNotifier.ByReference()
    val hr = fn.invokeHR(arrayOf(IAsyncOperation_ToastNotifier__Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIAsyncOperation_ToastNotifier_(pointer.getPointer(0))

    public fun setValue(`value`: IAsyncOperation_ToastNotifier__Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IAsyncOperation_ToastNotifier__Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IAsyncOperation_ToastNotifier_ {
    public override val IAsyncOperation_ToastNotifier__Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val PIID: Guid.IID = Guid.IID("2dddc10e38e65655adf3820e8fb14dcc")

    public val IID: Guid.IID = Guid.IID("9fc2b0bbe44644e2aa619cab8f636af2")

    public fun makeIAsyncOperation_ToastNotifier_(ptr: Pointer?): IAsyncOperation_ToastNotifier_ =
        IAsyncOperation_ToastNotifier__Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IAsyncOperation_ToastNotifier_):
        Array<IAsyncOperation_ToastNotifier_> = (elements as
        Array<IAsyncOperation_ToastNotifier_>).castToImpl<IAsyncOperation_ToastNotifier_,IAsyncOperation_ToastNotifier__Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAsyncOperation_ToastNotifier_?> =
        arrayOfNulls<IAsyncOperation_ToastNotifier__Impl>(size) as
        Array<IAsyncOperation_ToastNotifier_?>
  }
}

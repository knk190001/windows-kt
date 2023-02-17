package Windows.Foundation

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

public interface IAsyncAction : NativeMapped, IWinRTInterface {
  public val IAsyncAction_Ptr: Pointer?

  public val IAsyncAction_VtblPtr: Pointer?
    get() = IAsyncAction_Ptr?.getPointer(0)

  public fun put_Completed(handler: AsyncActionCompletedHandler): Unit {
    val fnPtr = IAsyncAction_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(IAsyncAction_Ptr, handler,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun get_Completed(): AsyncActionCompletedHandler {
    val fnPtr = IAsyncAction_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.AsyncActionCompletedHandler.ByReference()
    val hr = fn.invokeHR(arrayOf(IAsyncAction_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun GetResults(): Unit {
    val fnPtr = IAsyncAction_VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(IAsyncAction_Ptr, ))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIAsyncAction(pointer.getPointer(0))

    public fun setValue(`value`: IAsyncAction_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IAsyncAction_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IAsyncAction {
    public override val IAsyncAction_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("5a648006843a4da9865b9d26e5dfad7b")

    public fun makeIAsyncAction(ptr: Pointer?): IAsyncAction = IAsyncAction_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IAsyncAction): Array<IAsyncAction> = (elements as
        Array<IAsyncAction>).castToImpl<IAsyncAction,IAsyncAction_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAsyncAction?> =
        arrayOfNulls<IAsyncAction_Impl>(size) as Array<IAsyncAction?>
  }
}

package Windows.Foundation

import Windows.Storage.FileProperties.VideoProperties
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

public interface IAsyncOperation_VideoProperties_ : NativeMapped, IWinRTInterface {
  public val IAsyncOperation_VideoProperties__Ptr: Pointer?

  public val IAsyncOperation_VideoProperties__VtblPtr: Pointer?
    get() = IAsyncOperation_VideoProperties__Ptr?.getPointer(0)

  public fun put_Completed(handler: AsyncOperationCompletedHandler_VideoProperties_): Unit {
    val fnPtr = IAsyncOperation_VideoProperties__VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(IAsyncOperation_VideoProperties__Ptr, handler,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun get_Completed(): AsyncOperationCompletedHandler_VideoProperties_ {
    val fnPtr = IAsyncOperation_VideoProperties__VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.AsyncOperationCompletedHandler_VideoProperties_.ByReference()
    val hr = fn.invokeHR(arrayOf(IAsyncOperation_VideoProperties__Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun GetResults(): VideoProperties {
    val fnPtr = IAsyncOperation_VideoProperties__VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Storage.FileProperties.VideoProperties.ByReference()
    val hr = fn.invokeHR(arrayOf(IAsyncOperation_VideoProperties__Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIAsyncOperation_VideoProperties_(pointer.getPointer(0))

    public fun setValue(`value`: IAsyncOperation_VideoProperties__Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IAsyncOperation_VideoProperties__Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IAsyncOperation_VideoProperties_ {
    public override val IAsyncOperation_VideoProperties__Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val PIID: Guid.IID = Guid.IID("447d4590d3f958bfac586f9a50839efe")

    public val IID: Guid.IID = Guid.IID("9fc2b0bbe44644e2aa619cab8f636af2")

    public fun makeIAsyncOperation_VideoProperties_(ptr: Pointer?): IAsyncOperation_VideoProperties_
        = IAsyncOperation_VideoProperties__Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IAsyncOperation_VideoProperties_):
        Array<IAsyncOperation_VideoProperties_> = (elements as
        Array<IAsyncOperation_VideoProperties_>).castToImpl<IAsyncOperation_VideoProperties_,IAsyncOperation_VideoProperties__Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAsyncOperation_VideoProperties_?> =
        arrayOfNulls<IAsyncOperation_VideoProperties__Impl>(size) as
        Array<IAsyncOperation_VideoProperties_?>
  }
}

package Windows.Foundation

import Windows.Storage.FileProperties.MusicProperties
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

public interface IAsyncOperation_MusicProperties_ : NativeMapped, IWinRTInterface {
  public val IAsyncOperation_MusicProperties__Ptr: Pointer?

  public val IAsyncOperation_MusicProperties__VtblPtr: Pointer?
    get() = IAsyncOperation_MusicProperties__Ptr?.getPointer(0)

  public fun put_Completed(handler: AsyncOperationCompletedHandler_MusicProperties_): Unit {
    val fnPtr = IAsyncOperation_MusicProperties__VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(IAsyncOperation_MusicProperties__Ptr, handler,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun get_Completed(): AsyncOperationCompletedHandler_MusicProperties_ {
    val fnPtr = IAsyncOperation_MusicProperties__VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.AsyncOperationCompletedHandler_MusicProperties_.ByReference()
    val hr = fn.invokeHR(arrayOf(IAsyncOperation_MusicProperties__Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun GetResults(): MusicProperties {
    val fnPtr = IAsyncOperation_MusicProperties__VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Storage.FileProperties.MusicProperties.ByReference()
    val hr = fn.invokeHR(arrayOf(IAsyncOperation_MusicProperties__Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIAsyncOperation_MusicProperties_(pointer.getPointer(0))

    public fun setValue(`value`: IAsyncOperation_MusicProperties__Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IAsyncOperation_MusicProperties__Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IAsyncOperation_MusicProperties_ {
    public override val IAsyncOperation_MusicProperties__Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val PIID: Guid.IID = Guid.IID("0d023b7620a756f384abce31e6544b71")

    public val IID: Guid.IID = Guid.IID("9fc2b0bbe44644e2aa619cab8f636af2")

    public fun makeIAsyncOperation_MusicProperties_(ptr: Pointer?): IAsyncOperation_MusicProperties_
        = IAsyncOperation_MusicProperties__Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IAsyncOperation_MusicProperties_):
        Array<IAsyncOperation_MusicProperties_> = (elements as
        Array<IAsyncOperation_MusicProperties_>).castToImpl<IAsyncOperation_MusicProperties_,IAsyncOperation_MusicProperties__Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAsyncOperation_MusicProperties_?> =
        arrayOfNulls<IAsyncOperation_MusicProperties__Impl>(size) as
        Array<IAsyncOperation_MusicProperties_?>
  }
}

package Windows.Storage.Streams

import Windows.Foundation.IAsyncOperation_IRandomAccessStreamWithContentType_
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

public interface IRandomAccessStreamReference : NativeMapped, IWinRTInterface {
  public val IRandomAccessStreamReference_Ptr: Pointer?

  public val IRandomAccessStreamReference_VtblPtr: Pointer?
    get() = IRandomAccessStreamReference_Ptr?.getPointer(0)

  public fun OpenReadAsync(): IAsyncOperation_IRandomAccessStreamWithContentType_ {
    val fnPtr = IRandomAccessStreamReference_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result =
        Windows.Foundation.IAsyncOperation_IRandomAccessStreamWithContentType_.ByReference()
    val hr = fn.invokeHR(arrayOf(IRandomAccessStreamReference_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIRandomAccessStreamReference(pointer.getPointer(0))

    public fun setValue(`value`: IRandomAccessStreamReference_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IRandomAccessStreamReference_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IRandomAccessStreamReference {
    public override val IRandomAccessStreamReference_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("33ee31341dd64e3a8067d1c162e8642b")

    public fun makeIRandomAccessStreamReference(ptr: Pointer?): IRandomAccessStreamReference =
        IRandomAccessStreamReference_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IRandomAccessStreamReference):
        Array<IRandomAccessStreamReference> = (elements as
        Array<IRandomAccessStreamReference>).castToImpl<IRandomAccessStreamReference,IRandomAccessStreamReference_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRandomAccessStreamReference?> =
        arrayOfNulls<IRandomAccessStreamReference_Impl>(size) as
        Array<IRandomAccessStreamReference?>
  }
}

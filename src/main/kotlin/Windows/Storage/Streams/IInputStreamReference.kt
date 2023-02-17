package Windows.Storage.Streams

import Windows.Foundation.IAsyncOperation_IInputStream_
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

public interface IInputStreamReference : NativeMapped, IWinRTInterface {
  public val IInputStreamReference_Ptr: Pointer?

  public val IInputStreamReference_VtblPtr: Pointer?
    get() = IInputStreamReference_Ptr?.getPointer(0)

  public fun OpenSequentialReadAsync(): IAsyncOperation_IInputStream_ {
    val fnPtr = IInputStreamReference_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.IAsyncOperation_IInputStream_.ByReference()
    val hr = fn.invokeHR(arrayOf(IInputStreamReference_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIInputStreamReference(pointer.getPointer(0))

    public fun setValue(`value`: IInputStreamReference_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IInputStreamReference_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IInputStreamReference {
    public override val IInputStreamReference_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("43929d185ec94b5a919c4205b0c804b6")

    public fun makeIInputStreamReference(ptr: Pointer?): IInputStreamReference =
        IInputStreamReference_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IInputStreamReference): Array<IInputStreamReference> =
        (elements as
        Array<IInputStreamReference>).castToImpl<IInputStreamReference,IInputStreamReference_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInputStreamReference?> =
        arrayOfNulls<IInputStreamReference_Impl>(size) as Array<IInputStreamReference?>
  }
}

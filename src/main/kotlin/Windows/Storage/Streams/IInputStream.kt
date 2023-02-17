package Windows.Storage.Streams

import Windows.Foundation.IAsyncOperationWithProgress_IBuffer_UInt32_
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

public interface IInputStream : NativeMapped, IWinRTInterface {
  public val IInputStream_Ptr: Pointer?

  public val IInputStream_VtblPtr: Pointer?
    get() = IInputStream_Ptr?.getPointer(0)

  public fun ReadAsync(
    buffer: IBuffer,
    count: WinDef.UINT,
    options: InputStreamOptions,
  ): IAsyncOperationWithProgress_IBuffer_UInt32_ {
    val fnPtr = IInputStream_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.IAsyncOperationWithProgress_IBuffer_UInt32_.ByReference()
    val hr = fn.invokeHR(arrayOf(IInputStream_Ptr, buffer, count, options, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIInputStream(pointer.getPointer(0))

    public fun setValue(`value`: IInputStream_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IInputStream_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IInputStream {
    public override val IInputStream_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("905a0fe2bc5311df8c49001e4fc686da")

    public fun makeIInputStream(ptr: Pointer?): IInputStream = IInputStream_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IInputStream): Array<IInputStream> = (elements as
        Array<IInputStream>).castToImpl<IInputStream,IInputStream_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInputStream?> =
        arrayOfNulls<IInputStream_Impl>(size) as Array<IInputStream?>
  }
}

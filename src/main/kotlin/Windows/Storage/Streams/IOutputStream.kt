package Windows.Storage.Streams

import Windows.Foundation.IAsyncOperationWithProgress_UInt32_UInt32_
import Windows.Foundation.IAsyncOperation_Boolean_
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

public interface IOutputStream : NativeMapped, IWinRTInterface {
  public val IOutputStream_Ptr: Pointer?

  public val IOutputStream_VtblPtr: Pointer?
    get() = IOutputStream_Ptr?.getPointer(0)

  public fun WriteAsync(buffer: IBuffer): IAsyncOperationWithProgress_UInt32_UInt32_ {
    val fnPtr = IOutputStream_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.IAsyncOperationWithProgress_UInt32_UInt32_.ByReference()
    val hr = fn.invokeHR(arrayOf(IOutputStream_Ptr, buffer, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun FlushAsync(): IAsyncOperation_Boolean_ {
    val fnPtr = IOutputStream_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.IAsyncOperation_Boolean_.ByReference()
    val hr = fn.invokeHR(arrayOf(IOutputStream_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIOutputStream(pointer.getPointer(0))

    public fun setValue(`value`: IOutputStream_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IOutputStream_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IOutputStream {
    public override val IOutputStream_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("905a0fe6bc5311df8c49001e4fc686da")

    public fun makeIOutputStream(ptr: Pointer?): IOutputStream = IOutputStream_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IOutputStream): Array<IOutputStream> = (elements as
        Array<IOutputStream>).castToImpl<IOutputStream,IOutputStream_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IOutputStream?> =
        arrayOfNulls<IOutputStream_Impl>(size) as Array<IOutputStream?>
  }
}

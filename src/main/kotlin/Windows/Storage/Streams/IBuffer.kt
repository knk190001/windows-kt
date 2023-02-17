package Windows.Storage.Streams

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

public interface IBuffer : NativeMapped, IWinRTInterface {
  public val IBuffer_Ptr: Pointer?

  public val IBuffer_VtblPtr: Pointer?
    get() = IBuffer_Ptr?.getPointer(0)

  public fun get_Capacity(): WinDef.UINT {
    val fnPtr = IBuffer_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinDef.UINTByReference()
    val hr = fn.invokeHR(arrayOf(IBuffer_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun get_Length(): WinDef.UINT {
    val fnPtr = IBuffer_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinDef.UINTByReference()
    val hr = fn.invokeHR(arrayOf(IBuffer_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun put_Length(`value`: WinDef.UINT): Unit {
    val fnPtr = IBuffer_VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(IBuffer_Ptr, value,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIBuffer(pointer.getPointer(0))

    public fun setValue(`value`: IBuffer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IBuffer_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IBuffer {
    public override val IBuffer_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("905a0fe0bc5311df8c49001e4fc686da")

    public fun makeIBuffer(ptr: Pointer?): IBuffer = IBuffer_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IBuffer): Array<IBuffer> = (elements as
        Array<IBuffer>).castToImpl<IBuffer,IBuffer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBuffer?> = arrayOfNulls<IBuffer_Impl>(size) as
        Array<IBuffer?>
  }
}

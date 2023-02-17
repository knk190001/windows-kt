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
import com.sun.jna.ptr.ByteByReference
import java.lang.RuntimeException
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit

public interface IRandomAccessStream : NativeMapped, IWinRTInterface {
  public val IRandomAccessStream_Ptr: Pointer?

  public val IRandomAccessStream_VtblPtr: Pointer?
    get() = IRandomAccessStream_Ptr?.getPointer(0)

  public fun get_Size(): WinDef.ULONG {
    val fnPtr = IRandomAccessStream_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinDef.ULONGByReference()
    val hr = fn.invokeHR(arrayOf(IRandomAccessStream_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun put_Size(`value`: WinDef.ULONG): Unit {
    val fnPtr = IRandomAccessStream_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(IRandomAccessStream_Ptr, value,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun GetInputStreamAt(position: WinDef.ULONG): IInputStream {
    val fnPtr = IRandomAccessStream_VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Storage.Streams.IInputStream.ByReference()
    val hr = fn.invokeHR(arrayOf(IRandomAccessStream_Ptr, position, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun GetOutputStreamAt(position: WinDef.ULONG): IOutputStream {
    val fnPtr = IRandomAccessStream_VtblPtr!!.getPointer(9L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Storage.Streams.IOutputStream.ByReference()
    val hr = fn.invokeHR(arrayOf(IRandomAccessStream_Ptr, position, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun get_Position(): WinDef.ULONG {
    val fnPtr = IRandomAccessStream_VtblPtr!!.getPointer(10L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinDef.ULONGByReference()
    val hr = fn.invokeHR(arrayOf(IRandomAccessStream_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun Seek(position: WinDef.ULONG): Unit {
    val fnPtr = IRandomAccessStream_VtblPtr!!.getPointer(11L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(IRandomAccessStream_Ptr, position,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun CloneStream(): IRandomAccessStream {
    val fnPtr = IRandomAccessStream_VtblPtr!!.getPointer(12L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = ByReference()
    val hr = fn.invokeHR(arrayOf(IRandomAccessStream_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun get_CanRead(): Boolean {
    val fnPtr = IRandomAccessStream_VtblPtr!!.getPointer(13L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = ByteByReference()
    val hr = fn.invokeHR(arrayOf(IRandomAccessStream_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue != 0.toByte()
    return resultValue_Managed
  }

  public fun get_CanWrite(): Boolean {
    val fnPtr = IRandomAccessStream_VtblPtr!!.getPointer(14L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = ByteByReference()
    val hr = fn.invokeHR(arrayOf(IRandomAccessStream_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue != 0.toByte()
    return resultValue_Managed
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIRandomAccessStream(pointer.getPointer(0))

    public fun setValue(`value`: IRandomAccessStream_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IRandomAccessStream_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IRandomAccessStream {
    public override val IRandomAccessStream_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("905a0fe1bc5311df8c49001e4fc686da")

    public fun makeIRandomAccessStream(ptr: Pointer?): IRandomAccessStream =
        IRandomAccessStream_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IRandomAccessStream): Array<IRandomAccessStream> =
        (elements as
        Array<IRandomAccessStream>).castToImpl<IRandomAccessStream,IRandomAccessStream_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRandomAccessStream?> =
        arrayOfNulls<IRandomAccessStream_Impl>(size) as Array<IRandomAccessStream?>
  }
}

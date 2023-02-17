package Windows.Storage.Streams

import Windows.Foundation.Uri
import Windows.Storage.IStorageFile
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

public interface IRandomAccessStreamReferenceStatics : NativeMapped, IWinRTInterface {
  public val IRandomAccessStreamReferenceStatics_Ptr: Pointer?

  public val IRandomAccessStreamReferenceStatics_VtblPtr: Pointer?
    get() = IRandomAccessStreamReferenceStatics_Ptr?.getPointer(0)

  public fun CreateFromFile(`file`: IStorageFile): RandomAccessStreamReference {
    val fnPtr = IRandomAccessStreamReferenceStatics_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Storage.Streams.RandomAccessStreamReference.ByReference()
    val hr = fn.invokeHR(arrayOf(IRandomAccessStreamReferenceStatics_Ptr, file, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun CreateFromUri(uri: Uri): RandomAccessStreamReference {
    val fnPtr = IRandomAccessStreamReferenceStatics_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Storage.Streams.RandomAccessStreamReference.ByReference()
    val hr = fn.invokeHR(arrayOf(IRandomAccessStreamReferenceStatics_Ptr, uri, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun CreateFromStream(stream: IRandomAccessStream): RandomAccessStreamReference {
    val fnPtr = IRandomAccessStreamReferenceStatics_VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Storage.Streams.RandomAccessStreamReference.ByReference()
    val hr = fn.invokeHR(arrayOf(IRandomAccessStreamReferenceStatics_Ptr, stream, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIRandomAccessStreamReferenceStatics(pointer.getPointer(0))

    public fun setValue(`value`: IRandomAccessStreamReferenceStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IRandomAccessStreamReferenceStatics_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IRandomAccessStreamReferenceStatics {
    public override val IRandomAccessStreamReferenceStatics_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("857309dc3fbf4e7d986fef3b1a07a964")

    public fun makeIRandomAccessStreamReferenceStatics(ptr: Pointer?):
        IRandomAccessStreamReferenceStatics = IRandomAccessStreamReferenceStatics_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IRandomAccessStreamReferenceStatics):
        Array<IRandomAccessStreamReferenceStatics> = (elements as
        Array<IRandomAccessStreamReferenceStatics>).castToImpl<IRandomAccessStreamReferenceStatics,IRandomAccessStreamReferenceStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRandomAccessStreamReferenceStatics?> =
        arrayOfNulls<IRandomAccessStreamReferenceStatics_Impl>(size) as
        Array<IRandomAccessStreamReferenceStatics?>
  }
}

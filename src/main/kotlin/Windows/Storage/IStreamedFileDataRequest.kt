package Windows.Storage

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

public interface IStreamedFileDataRequest : NativeMapped, IWinRTInterface {
  public val IStreamedFileDataRequest_Ptr: Pointer?

  public val IStreamedFileDataRequest_VtblPtr: Pointer?
    get() = IStreamedFileDataRequest_Ptr?.getPointer(0)

  public fun FailAndClose(failureMode: StreamedFileFailureMode): Unit {
    val fnPtr = IStreamedFileDataRequest_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(IStreamedFileDataRequest_Ptr, failureMode,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIStreamedFileDataRequest(pointer.getPointer(0))

    public fun setValue(`value`: IStreamedFileDataRequest_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IStreamedFileDataRequest_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IStreamedFileDataRequest {
    public override val IStreamedFileDataRequest_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("1673fccedabd4d50beee180b8a8191b6")

    public fun makeIStreamedFileDataRequest(ptr: Pointer?): IStreamedFileDataRequest =
        IStreamedFileDataRequest_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IStreamedFileDataRequest): Array<IStreamedFileDataRequest>
        = (elements as
        Array<IStreamedFileDataRequest>).castToImpl<IStreamedFileDataRequest,IStreamedFileDataRequest_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStreamedFileDataRequest?> =
        arrayOfNulls<IStreamedFileDataRequest_Impl>(size) as Array<IStreamedFileDataRequest?>
  }
}

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
import com.sun.jna.platform.win32.WinNT
import java.lang.RuntimeException
import kotlin.Array
import kotlin.Int
import kotlin.String
import kotlin.Unit

public interface IContentTypeProvider : NativeMapped, IWinRTInterface {
  public val IContentTypeProvider_Ptr: Pointer?

  public val IContentTypeProvider_VtblPtr: Pointer?
    get() = IContentTypeProvider_Ptr?.getPointer(0)

  public fun get_ContentType(): String {
    val fnPtr = IContentTypeProvider_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(IContentTypeProvider_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIContentTypeProvider(pointer.getPointer(0))

    public fun setValue(`value`: IContentTypeProvider_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IContentTypeProvider_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IContentTypeProvider {
    public override val IContentTypeProvider_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("97d098a53b994de988a5e11d2f50c795")

    public fun makeIContentTypeProvider(ptr: Pointer?): IContentTypeProvider =
        IContentTypeProvider_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IContentTypeProvider): Array<IContentTypeProvider> =
        (elements as
        Array<IContentTypeProvider>).castToImpl<IContentTypeProvider,IContentTypeProvider_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContentTypeProvider?> =
        arrayOfNulls<IContentTypeProvider_Impl>(size) as Array<IContentTypeProvider?>
  }
}

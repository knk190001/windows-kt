package Windows.Foundation

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
import kotlin.String
import kotlin.Unit

public interface IWwwFormUrlDecoderRuntimeClassFactory : NativeMapped, IWinRTInterface {
  public val IWwwFormUrlDecoderRuntimeClassFactory_Ptr: Pointer?

  public val IWwwFormUrlDecoderRuntimeClassFactory_VtblPtr: Pointer?
    get() = IWwwFormUrlDecoderRuntimeClassFactory_Ptr?.getPointer(0)

  public fun CreateWwwFormUrlDecoder(query: String): WwwFormUrlDecoder {
    val fnPtr = IWwwFormUrlDecoderRuntimeClassFactory_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val query_Native = query.toHandle()
    val result = Windows.Foundation.WwwFormUrlDecoder.ByReference()
    val hr = fn.invokeHR(arrayOf(IWwwFormUrlDecoderRuntimeClassFactory_Ptr, query_Native, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIWwwFormUrlDecoderRuntimeClassFactory(pointer.getPointer(0))

    public fun setValue(`value`: IWwwFormUrlDecoderRuntimeClassFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IWwwFormUrlDecoderRuntimeClassFactory_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IWwwFormUrlDecoderRuntimeClassFactory {
    public override val IWwwFormUrlDecoderRuntimeClassFactory_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("5b8c6b3d24ae41b5a1bff0c3d544845b")

    public fun makeIWwwFormUrlDecoderRuntimeClassFactory(ptr: Pointer?):
        IWwwFormUrlDecoderRuntimeClassFactory = IWwwFormUrlDecoderRuntimeClassFactory_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IWwwFormUrlDecoderRuntimeClassFactory):
        Array<IWwwFormUrlDecoderRuntimeClassFactory> = (elements as
        Array<IWwwFormUrlDecoderRuntimeClassFactory>).castToImpl<IWwwFormUrlDecoderRuntimeClassFactory,IWwwFormUrlDecoderRuntimeClassFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWwwFormUrlDecoderRuntimeClassFactory?> =
        arrayOfNulls<IWwwFormUrlDecoderRuntimeClassFactory_Impl>(size) as
        Array<IWwwFormUrlDecoderRuntimeClassFactory?>
  }
}

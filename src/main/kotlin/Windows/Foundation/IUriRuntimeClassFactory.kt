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

public interface IUriRuntimeClassFactory : NativeMapped, IWinRTInterface {
  public val IUriRuntimeClassFactory_Ptr: Pointer?

  public val IUriRuntimeClassFactory_VtblPtr: Pointer?
    get() = IUriRuntimeClassFactory_Ptr?.getPointer(0)

  public fun CreateUri(uri: String): Uri {
    val fnPtr = IUriRuntimeClassFactory_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val uri_Native = uri.toHandle()
    val result = Windows.Foundation.Uri.ByReference()
    val hr = fn.invokeHR(arrayOf(IUriRuntimeClassFactory_Ptr, uri_Native, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun CreateWithRelativeUri(baseUri: String, relativeUri: String): Uri {
    val fnPtr = IUriRuntimeClassFactory_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val baseUri_Native = baseUri.toHandle()
    val relativeUri_Native = relativeUri.toHandle()
    val result = Windows.Foundation.Uri.ByReference()
    val hr = fn.invokeHR(arrayOf(IUriRuntimeClassFactory_Ptr, baseUri_Native, relativeUri_Native,
        result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIUriRuntimeClassFactory(pointer.getPointer(0))

    public fun setValue(`value`: IUriRuntimeClassFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IUriRuntimeClassFactory_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IUriRuntimeClassFactory {
    public override val IUriRuntimeClassFactory_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("44a9796f723e4fdfa218033e75b0c084")

    public fun makeIUriRuntimeClassFactory(ptr: Pointer?): IUriRuntimeClassFactory =
        IUriRuntimeClassFactory_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IUriRuntimeClassFactory): Array<IUriRuntimeClassFactory> =
        (elements as
        Array<IUriRuntimeClassFactory>).castToImpl<IUriRuntimeClassFactory,IUriRuntimeClassFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUriRuntimeClassFactory?> =
        arrayOfNulls<IUriRuntimeClassFactory_Impl>(size) as Array<IUriRuntimeClassFactory?>
  }
}

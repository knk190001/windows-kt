package Windows.Data.Xml.Dom

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
import com.sun.jna.platform.win32.COM.Unknown
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.ByteByReference
import java.lang.RuntimeException
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit

public interface IXmlDomImplementation : NativeMapped, IWinRTInterface {
  public val IXmlDomImplementation_Ptr: Pointer?

  public val IXmlDomImplementation_VtblPtr: Pointer?
    get() = IXmlDomImplementation_Ptr?.getPointer(0)

  public fun HasFeature(feature: String, version: Unknown): Boolean {
    val fnPtr = IXmlDomImplementation_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val feature_Native = feature.toHandle()
    val result = ByteByReference()
    val hr = fn.invokeHR(arrayOf(IXmlDomImplementation_Ptr, feature_Native, version, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue != 0.toByte()
    return resultValue_Managed
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIXmlDomImplementation(pointer.getPointer(0))

    public fun setValue(`value`: IXmlDomImplementation_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IXmlDomImplementation_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IXmlDomImplementation {
    public override val IXmlDomImplementation_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("6de58132f11d4fbb8cc6583cba93112f")

    public fun makeIXmlDomImplementation(ptr: Pointer?): IXmlDomImplementation =
        IXmlDomImplementation_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IXmlDomImplementation): Array<IXmlDomImplementation> =
        (elements as
        Array<IXmlDomImplementation>).castToImpl<IXmlDomImplementation,IXmlDomImplementation_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IXmlDomImplementation?> =
        arrayOfNulls<IXmlDomImplementation_Impl>(size) as Array<IXmlDomImplementation?>
  }
}

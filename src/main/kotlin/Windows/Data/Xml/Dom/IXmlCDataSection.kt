package Windows.Data.Xml.Dom

import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.handleToString
import com.github.knk190001.winrtbinding.runtime.interfaces.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.interfaces.getValue
import com.github.knk190001.winrtbinding.runtime.invokeHR
import com.github.knk190001.winrtbinding.runtime.makeOutArray
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import kotlin.Array
import kotlin.Int
import kotlin.Unit

public interface IXmlCDataSection : NativeMapped, IWinRTInterface {
  public val IXmlCDataSection_Ptr: Pointer?

  public val IXmlCDataSection_VtblPtr: Pointer?
    get() = IXmlCDataSection_Ptr?.getPointer(0)

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIXmlCDataSection(pointer.getPointer(0))

    public fun setValue(`value`: IXmlCDataSection_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IXmlCDataSection_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IXmlCDataSection {
    public override val IXmlCDataSection_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("4d04b46fc8bd45b488990400d7c2c60f")

    public fun makeIXmlCDataSection(ptr: Pointer?): IXmlCDataSection = IXmlCDataSection_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IXmlCDataSection): Array<IXmlCDataSection> = (elements as
        Array<IXmlCDataSection>).castToImpl<IXmlCDataSection,IXmlCDataSection_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IXmlCDataSection?> =
        arrayOfNulls<IXmlCDataSection_Impl>(size) as Array<IXmlCDataSection?>
  }
}

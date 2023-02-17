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

public interface IXmlDocumentFragment : NativeMapped, IWinRTInterface {
  public val IXmlDocumentFragment_Ptr: Pointer?

  public val IXmlDocumentFragment_VtblPtr: Pointer?
    get() = IXmlDocumentFragment_Ptr?.getPointer(0)

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIXmlDocumentFragment(pointer.getPointer(0))

    public fun setValue(`value`: IXmlDocumentFragment_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IXmlDocumentFragment_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IXmlDocumentFragment {
    public override val IXmlDocumentFragment_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("e2ea6a960c2144a58bc99e4a262708ec")

    public fun makeIXmlDocumentFragment(ptr: Pointer?): IXmlDocumentFragment =
        IXmlDocumentFragment_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IXmlDocumentFragment): Array<IXmlDocumentFragment> =
        (elements as
        Array<IXmlDocumentFragment>).castToImpl<IXmlDocumentFragment,IXmlDocumentFragment_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IXmlDocumentFragment?> =
        arrayOfNulls<IXmlDocumentFragment_Impl>(size) as Array<IXmlDocumentFragment?>
  }
}

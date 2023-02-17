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

public interface IXmlEntityReference : NativeMapped, IWinRTInterface {
  public val IXmlEntityReference_Ptr: Pointer?

  public val IXmlEntityReference_VtblPtr: Pointer?
    get() = IXmlEntityReference_Ptr?.getPointer(0)

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIXmlEntityReference(pointer.getPointer(0))

    public fun setValue(`value`: IXmlEntityReference_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IXmlEntityReference_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IXmlEntityReference {
    public override val IXmlEntityReference_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("2e2f47bcc3d04ccfbb860ab8c36a61cf")

    public fun makeIXmlEntityReference(ptr: Pointer?): IXmlEntityReference =
        IXmlEntityReference_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IXmlEntityReference): Array<IXmlEntityReference> =
        (elements as
        Array<IXmlEntityReference>).castToImpl<IXmlEntityReference,IXmlEntityReference_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IXmlEntityReference?> =
        arrayOfNulls<IXmlEntityReference_Impl>(size) as Array<IXmlEntityReference?>
  }
}

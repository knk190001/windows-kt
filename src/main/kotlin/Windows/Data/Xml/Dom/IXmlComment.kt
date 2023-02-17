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

public interface IXmlComment : NativeMapped, IWinRTInterface {
  public val IXmlComment_Ptr: Pointer?

  public val IXmlComment_VtblPtr: Pointer?
    get() = IXmlComment_Ptr?.getPointer(0)

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIXmlComment(pointer.getPointer(0))

    public fun setValue(`value`: IXmlComment_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IXmlComment_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IXmlComment {
    public override val IXmlComment_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("bca474d5b61f46119cac2e92e3476d47")

    public fun makeIXmlComment(ptr: Pointer?): IXmlComment = IXmlComment_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IXmlComment): Array<IXmlComment> = (elements as
        Array<IXmlComment>).castToImpl<IXmlComment,IXmlComment_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IXmlComment?> =
        arrayOfNulls<IXmlComment_Impl>(size) as Array<IXmlComment?>
  }
}

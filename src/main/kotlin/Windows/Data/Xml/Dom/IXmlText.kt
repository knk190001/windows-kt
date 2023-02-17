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
import com.sun.jna.platform.win32.Guid
import com.sun.jna.platform.win32.WinDef
import java.lang.RuntimeException
import kotlin.Array
import kotlin.Int
import kotlin.Unit

public interface IXmlText : NativeMapped, IWinRTInterface {
  public val IXmlText_Ptr: Pointer?

  public val IXmlText_VtblPtr: Pointer?
    get() = IXmlText_Ptr?.getPointer(0)

  public fun SplitText(offset: WinDef.UINT): IXmlText {
    val fnPtr = IXmlText_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = ByReference()
    val hr = fn.invokeHR(arrayOf(IXmlText_Ptr, offset, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIXmlText(pointer.getPointer(0))

    public fun setValue(`value`: IXmlText_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IXmlText_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IXmlText {
    public override val IXmlText_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("f931a4cb308d4760a1d543b67450ac7e")

    public fun makeIXmlText(ptr: Pointer?): IXmlText = IXmlText_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IXmlText): Array<IXmlText> = (elements as
        Array<IXmlText>).castToImpl<IXmlText,IXmlText_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IXmlText?> = arrayOfNulls<IXmlText_Impl>(size) as
        Array<IXmlText?>
  }
}

package Windows.Data.Xml.Dom

import Windows.Storage.Streams.IBuffer
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

public interface IXmlDocumentIO2 : NativeMapped, IWinRTInterface {
  public val IXmlDocumentIO2_Ptr: Pointer?

  public val IXmlDocumentIO2_VtblPtr: Pointer?
    get() = IXmlDocumentIO2_Ptr?.getPointer(0)

  public fun LoadXmlFromBuffer(buffer: IBuffer): Unit {
    val fnPtr = IXmlDocumentIO2_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(IXmlDocumentIO2_Ptr, buffer,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun LoadXmlFromBuffer(buffer: IBuffer, loadSettings: XmlLoadSettings): Unit {
    val fnPtr = IXmlDocumentIO2_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(IXmlDocumentIO2_Ptr, buffer, loadSettings,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIXmlDocumentIO2(pointer.getPointer(0))

    public fun setValue(`value`: IXmlDocumentIO2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IXmlDocumentIO2_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IXmlDocumentIO2 {
    public override val IXmlDocumentIO2_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("5d0346617bd84ad59ebf81e6347263b1")

    public fun makeIXmlDocumentIO2(ptr: Pointer?): IXmlDocumentIO2 = IXmlDocumentIO2_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IXmlDocumentIO2): Array<IXmlDocumentIO2> = (elements as
        Array<IXmlDocumentIO2>).castToImpl<IXmlDocumentIO2,IXmlDocumentIO2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IXmlDocumentIO2?> =
        arrayOfNulls<IXmlDocumentIO2_Impl>(size) as Array<IXmlDocumentIO2?>
  }
}

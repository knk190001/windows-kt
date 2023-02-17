package Windows.Data.Xml.Dom

import Windows.Foundation.IAsyncAction
import Windows.Storage.IStorageFile
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

public interface IXmlDocumentIO : NativeMapped, IWinRTInterface {
  public val IXmlDocumentIO_Ptr: Pointer?

  public val IXmlDocumentIO_VtblPtr: Pointer?
    get() = IXmlDocumentIO_Ptr?.getPointer(0)

  public fun LoadXml(xml: String): Unit {
    val fnPtr = IXmlDocumentIO_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val xml_Native = xml.toHandle()
    val hr = fn.invokeHR(arrayOf(IXmlDocumentIO_Ptr, xml_Native,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun LoadXml(xml: String, loadSettings: XmlLoadSettings): Unit {
    val fnPtr = IXmlDocumentIO_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val xml_Native = xml.toHandle()
    val hr = fn.invokeHR(arrayOf(IXmlDocumentIO_Ptr, xml_Native, loadSettings,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun SaveToFileAsync(`file`: IStorageFile): IAsyncAction {
    val fnPtr = IXmlDocumentIO_VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.IAsyncAction.ByReference()
    val hr = fn.invokeHR(arrayOf(IXmlDocumentIO_Ptr, file, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIXmlDocumentIO(pointer.getPointer(0))

    public fun setValue(`value`: IXmlDocumentIO_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IXmlDocumentIO_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IXmlDocumentIO {
    public override val IXmlDocumentIO_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("6cd0e74eee6544899ebfca43e87ba637")

    public fun makeIXmlDocumentIO(ptr: Pointer?): IXmlDocumentIO = IXmlDocumentIO_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IXmlDocumentIO): Array<IXmlDocumentIO> = (elements as
        Array<IXmlDocumentIO>).castToImpl<IXmlDocumentIO,IXmlDocumentIO_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IXmlDocumentIO?> =
        arrayOfNulls<IXmlDocumentIO_Impl>(size) as Array<IXmlDocumentIO?>
  }
}

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
import com.sun.jna.platform.win32.WinNT
import java.lang.RuntimeException
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit

public interface IXmlDocument : NativeMapped, IWinRTInterface {
  public val IXmlDocument_Ptr: Pointer?

  public val IXmlDocument_VtblPtr: Pointer?
    get() = IXmlDocument_Ptr?.getPointer(0)

  public fun get_Doctype(): XmlDocumentType {
    val fnPtr = IXmlDocument_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Data.Xml.Dom.XmlDocumentType.ByReference()
    val hr = fn.invokeHR(arrayOf(IXmlDocument_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun get_Implementation(): XmlDomImplementation {
    val fnPtr = IXmlDocument_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Data.Xml.Dom.XmlDomImplementation.ByReference()
    val hr = fn.invokeHR(arrayOf(IXmlDocument_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun get_DocumentElement(): XmlElement {
    val fnPtr = IXmlDocument_VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Data.Xml.Dom.XmlElement.ByReference()
    val hr = fn.invokeHR(arrayOf(IXmlDocument_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun CreateElement(tagName: String): XmlElement {
    val fnPtr = IXmlDocument_VtblPtr!!.getPointer(9L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val tagName_Native = tagName.toHandle()
    val result = Windows.Data.Xml.Dom.XmlElement.ByReference()
    val hr = fn.invokeHR(arrayOf(IXmlDocument_Ptr, tagName_Native, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun CreateDocumentFragment(): XmlDocumentFragment {
    val fnPtr = IXmlDocument_VtblPtr!!.getPointer(10L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Data.Xml.Dom.XmlDocumentFragment.ByReference()
    val hr = fn.invokeHR(arrayOf(IXmlDocument_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun CreateTextNode(`data`: String): XmlText {
    val fnPtr = IXmlDocument_VtblPtr!!.getPointer(11L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val data_Native = data.toHandle()
    val result = Windows.Data.Xml.Dom.XmlText.ByReference()
    val hr = fn.invokeHR(arrayOf(IXmlDocument_Ptr, data_Native, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun CreateComment(`data`: String): XmlComment {
    val fnPtr = IXmlDocument_VtblPtr!!.getPointer(12L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val data_Native = data.toHandle()
    val result = Windows.Data.Xml.Dom.XmlComment.ByReference()
    val hr = fn.invokeHR(arrayOf(IXmlDocument_Ptr, data_Native, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun CreateProcessingInstruction(target: String, `data`: String): XmlProcessingInstruction {
    val fnPtr = IXmlDocument_VtblPtr!!.getPointer(13L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val target_Native = target.toHandle()
    val data_Native = data.toHandle()
    val result = Windows.Data.Xml.Dom.XmlProcessingInstruction.ByReference()
    val hr = fn.invokeHR(arrayOf(IXmlDocument_Ptr, target_Native, data_Native, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun CreateAttribute(name: String): XmlAttribute {
    val fnPtr = IXmlDocument_VtblPtr!!.getPointer(14L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val name_Native = name.toHandle()
    val result = Windows.Data.Xml.Dom.XmlAttribute.ByReference()
    val hr = fn.invokeHR(arrayOf(IXmlDocument_Ptr, name_Native, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun CreateEntityReference(name: String): XmlEntityReference {
    val fnPtr = IXmlDocument_VtblPtr!!.getPointer(15L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val name_Native = name.toHandle()
    val result = Windows.Data.Xml.Dom.XmlEntityReference.ByReference()
    val hr = fn.invokeHR(arrayOf(IXmlDocument_Ptr, name_Native, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun GetElementsByTagName(tagName: String): XmlNodeList {
    val fnPtr = IXmlDocument_VtblPtr!!.getPointer(16L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val tagName_Native = tagName.toHandle()
    val result = Windows.Data.Xml.Dom.XmlNodeList.ByReference()
    val hr = fn.invokeHR(arrayOf(IXmlDocument_Ptr, tagName_Native, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun CreateCDataSection(`data`: String): XmlCDataSection {
    val fnPtr = IXmlDocument_VtblPtr!!.getPointer(17L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val data_Native = data.toHandle()
    val result = Windows.Data.Xml.Dom.XmlCDataSection.ByReference()
    val hr = fn.invokeHR(arrayOf(IXmlDocument_Ptr, data_Native, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun get_DocumentUri(): String {
    val fnPtr = IXmlDocument_VtblPtr!!.getPointer(18L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(IXmlDocument_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public fun CreateAttributeNS(namespaceUri: Unknown, qualifiedName: String): XmlAttribute {
    val fnPtr = IXmlDocument_VtblPtr!!.getPointer(19L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val qualifiedName_Native = qualifiedName.toHandle()
    val result = Windows.Data.Xml.Dom.XmlAttribute.ByReference()
    val hr = fn.invokeHR(arrayOf(IXmlDocument_Ptr, namespaceUri, qualifiedName_Native, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun CreateElementNS(namespaceUri: Unknown, qualifiedName: String): XmlElement {
    val fnPtr = IXmlDocument_VtblPtr!!.getPointer(20L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val qualifiedName_Native = qualifiedName.toHandle()
    val result = Windows.Data.Xml.Dom.XmlElement.ByReference()
    val hr = fn.invokeHR(arrayOf(IXmlDocument_Ptr, namespaceUri, qualifiedName_Native, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun GetElementById(elementId: String): XmlElement {
    val fnPtr = IXmlDocument_VtblPtr!!.getPointer(21L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val elementId_Native = elementId.toHandle()
    val result = Windows.Data.Xml.Dom.XmlElement.ByReference()
    val hr = fn.invokeHR(arrayOf(IXmlDocument_Ptr, elementId_Native, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun ImportNode(node: IXmlNode, deep: Boolean): IXmlNode {
    val fnPtr = IXmlDocument_VtblPtr!!.getPointer(22L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val deep_Native: Byte = if(deep) 1 else 0 
    val result = Windows.Data.Xml.Dom.IXmlNode.ByReference()
    val hr = fn.invokeHR(arrayOf(IXmlDocument_Ptr, node, deep_Native, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIXmlDocument(pointer.getPointer(0))

    public fun setValue(`value`: IXmlDocument_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IXmlDocument_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IXmlDocument {
    public override val IXmlDocument_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("f7f3a5061e8742d6bcfbb8c809fa5494")

    public fun makeIXmlDocument(ptr: Pointer?): IXmlDocument = IXmlDocument_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IXmlDocument): Array<IXmlDocument> = (elements as
        Array<IXmlDocument>).castToImpl<IXmlDocument,IXmlDocument_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IXmlDocument?> =
        arrayOfNulls<IXmlDocument_Impl>(size) as Array<IXmlDocument?>
  }
}

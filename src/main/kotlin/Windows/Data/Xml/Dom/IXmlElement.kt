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
import kotlin.Int
import kotlin.String
import kotlin.Unit

public interface IXmlElement : NativeMapped, IWinRTInterface {
  public val IXmlElement_Ptr: Pointer?

  public val IXmlElement_VtblPtr: Pointer?
    get() = IXmlElement_Ptr?.getPointer(0)

  public fun get_TagName(): String {
    val fnPtr = IXmlElement_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(IXmlElement_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public fun GetAttribute(attributeName: String): String {
    val fnPtr = IXmlElement_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val attributeName_Native = attributeName.toHandle()
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(IXmlElement_Ptr, attributeName_Native, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public fun SetAttribute(attributeName: String, attributeValue: String): Unit {
    val fnPtr = IXmlElement_VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val attributeName_Native = attributeName.toHandle()
    val attributeValue_Native = attributeValue.toHandle()
    val hr = fn.invokeHR(arrayOf(IXmlElement_Ptr, attributeName_Native, attributeValue_Native,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun RemoveAttribute(attributeName: String): Unit {
    val fnPtr = IXmlElement_VtblPtr!!.getPointer(9L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val attributeName_Native = attributeName.toHandle()
    val hr = fn.invokeHR(arrayOf(IXmlElement_Ptr, attributeName_Native,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun GetAttributeNode(attributeName: String): XmlAttribute {
    val fnPtr = IXmlElement_VtblPtr!!.getPointer(10L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val attributeName_Native = attributeName.toHandle()
    val result = Windows.Data.Xml.Dom.XmlAttribute.ByReference()
    val hr = fn.invokeHR(arrayOf(IXmlElement_Ptr, attributeName_Native, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun SetAttributeNode(newAttribute: XmlAttribute): XmlAttribute {
    val fnPtr = IXmlElement_VtblPtr!!.getPointer(11L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Data.Xml.Dom.XmlAttribute.ByReference()
    val hr = fn.invokeHR(arrayOf(IXmlElement_Ptr, newAttribute, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun RemoveAttributeNode(attributeNode: XmlAttribute): XmlAttribute {
    val fnPtr = IXmlElement_VtblPtr!!.getPointer(12L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Data.Xml.Dom.XmlAttribute.ByReference()
    val hr = fn.invokeHR(arrayOf(IXmlElement_Ptr, attributeNode, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun GetElementsByTagName(tagName: String): XmlNodeList {
    val fnPtr = IXmlElement_VtblPtr!!.getPointer(13L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val tagName_Native = tagName.toHandle()
    val result = Windows.Data.Xml.Dom.XmlNodeList.ByReference()
    val hr = fn.invokeHR(arrayOf(IXmlElement_Ptr, tagName_Native, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun SetAttributeNS(
    namespaceUri: Unknown,
    qualifiedName: String,
    `value`: String,
  ): Unit {
    val fnPtr = IXmlElement_VtblPtr!!.getPointer(14L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val qualifiedName_Native = qualifiedName.toHandle()
    val value_Native = value.toHandle()
    val hr = fn.invokeHR(arrayOf(IXmlElement_Ptr, namespaceUri, qualifiedName_Native,
        value_Native,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun GetAttributeNS(namespaceUri: Unknown, localName: String): String {
    val fnPtr = IXmlElement_VtblPtr!!.getPointer(15L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val localName_Native = localName.toHandle()
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(IXmlElement_Ptr, namespaceUri, localName_Native, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public fun RemoveAttributeNS(namespaceUri: Unknown, localName: String): Unit {
    val fnPtr = IXmlElement_VtblPtr!!.getPointer(16L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val localName_Native = localName.toHandle()
    val hr = fn.invokeHR(arrayOf(IXmlElement_Ptr, namespaceUri, localName_Native,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun SetAttributeNodeNS(newAttribute: XmlAttribute): XmlAttribute {
    val fnPtr = IXmlElement_VtblPtr!!.getPointer(17L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Data.Xml.Dom.XmlAttribute.ByReference()
    val hr = fn.invokeHR(arrayOf(IXmlElement_Ptr, newAttribute, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun GetAttributeNodeNS(namespaceUri: Unknown, localName: String): XmlAttribute {
    val fnPtr = IXmlElement_VtblPtr!!.getPointer(18L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val localName_Native = localName.toHandle()
    val result = Windows.Data.Xml.Dom.XmlAttribute.ByReference()
    val hr = fn.invokeHR(arrayOf(IXmlElement_Ptr, namespaceUri, localName_Native, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIXmlElement(pointer.getPointer(0))

    public fun setValue(`value`: IXmlElement_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IXmlElement_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IXmlElement {
    public override val IXmlElement_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("2dfb8a1f6b104ef89f83efcce8faec37")

    public fun makeIXmlElement(ptr: Pointer?): IXmlElement = IXmlElement_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IXmlElement): Array<IXmlElement> = (elements as
        Array<IXmlElement>).castToImpl<IXmlElement,IXmlElement_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IXmlElement?> =
        arrayOfNulls<IXmlElement_Impl>(size) as Array<IXmlElement?>
  }
}

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
import com.sun.jna.ptr.ByteByReference
import java.lang.RuntimeException
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit

public interface IXmlNode : NativeMapped, IWinRTInterface {
  public val IXmlNode_Ptr: Pointer?

  public val IXmlNode_VtblPtr: Pointer?
    get() = IXmlNode_Ptr?.getPointer(0)

  public fun get_NodeValue(): Unknown {
    val fnPtr = IXmlNode_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = com.sun.jna.platform.win32.COM.Unknown.ByReference()
    val hr = fn.invokeHR(arrayOf(IXmlNode_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun put_NodeValue(`value`: Unknown): Unit {
    val fnPtr = IXmlNode_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(IXmlNode_Ptr, value,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun get_NodeType(): NodeType {
    val fnPtr = IXmlNode_VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Data.Xml.Dom.NodeType.ByReference()
    val hr = fn.invokeHR(arrayOf(IXmlNode_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun get_NodeName(): String {
    val fnPtr = IXmlNode_VtblPtr!!.getPointer(9L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(IXmlNode_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public fun get_ParentNode(): IXmlNode {
    val fnPtr = IXmlNode_VtblPtr!!.getPointer(10L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = ByReference()
    val hr = fn.invokeHR(arrayOf(IXmlNode_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun get_ChildNodes(): XmlNodeList {
    val fnPtr = IXmlNode_VtblPtr!!.getPointer(11L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Data.Xml.Dom.XmlNodeList.ByReference()
    val hr = fn.invokeHR(arrayOf(IXmlNode_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun get_FirstChild(): IXmlNode {
    val fnPtr = IXmlNode_VtblPtr!!.getPointer(12L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = ByReference()
    val hr = fn.invokeHR(arrayOf(IXmlNode_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun get_LastChild(): IXmlNode {
    val fnPtr = IXmlNode_VtblPtr!!.getPointer(13L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = ByReference()
    val hr = fn.invokeHR(arrayOf(IXmlNode_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun get_PreviousSibling(): IXmlNode {
    val fnPtr = IXmlNode_VtblPtr!!.getPointer(14L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = ByReference()
    val hr = fn.invokeHR(arrayOf(IXmlNode_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun get_NextSibling(): IXmlNode {
    val fnPtr = IXmlNode_VtblPtr!!.getPointer(15L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = ByReference()
    val hr = fn.invokeHR(arrayOf(IXmlNode_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun get_Attributes(): XmlNamedNodeMap {
    val fnPtr = IXmlNode_VtblPtr!!.getPointer(16L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Data.Xml.Dom.XmlNamedNodeMap.ByReference()
    val hr = fn.invokeHR(arrayOf(IXmlNode_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun HasChildNodes(): Boolean {
    val fnPtr = IXmlNode_VtblPtr!!.getPointer(17L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = ByteByReference()
    val hr = fn.invokeHR(arrayOf(IXmlNode_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue != 0.toByte()
    return resultValue_Managed
  }

  public fun get_OwnerDocument(): XmlDocument {
    val fnPtr = IXmlNode_VtblPtr!!.getPointer(18L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Data.Xml.Dom.XmlDocument.ByReference()
    val hr = fn.invokeHR(arrayOf(IXmlNode_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun InsertBefore(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode {
    val fnPtr = IXmlNode_VtblPtr!!.getPointer(19L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = ByReference()
    val hr = fn.invokeHR(arrayOf(IXmlNode_Ptr, newChild, referenceChild, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun ReplaceChild(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode {
    val fnPtr = IXmlNode_VtblPtr!!.getPointer(20L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = ByReference()
    val hr = fn.invokeHR(arrayOf(IXmlNode_Ptr, newChild, referenceChild, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun RemoveChild(childNode: IXmlNode): IXmlNode {
    val fnPtr = IXmlNode_VtblPtr!!.getPointer(21L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = ByReference()
    val hr = fn.invokeHR(arrayOf(IXmlNode_Ptr, childNode, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun AppendChild(newChild: IXmlNode): IXmlNode {
    val fnPtr = IXmlNode_VtblPtr!!.getPointer(22L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = ByReference()
    val hr = fn.invokeHR(arrayOf(IXmlNode_Ptr, newChild, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun CloneNode(deep: Boolean): IXmlNode {
    val fnPtr = IXmlNode_VtblPtr!!.getPointer(23L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val deep_Native: Byte = if(deep) 1 else 0 
    val result = ByReference()
    val hr = fn.invokeHR(arrayOf(IXmlNode_Ptr, deep_Native, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun get_NamespaceUri(): Unknown {
    val fnPtr = IXmlNode_VtblPtr!!.getPointer(24L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = com.sun.jna.platform.win32.COM.Unknown.ByReference()
    val hr = fn.invokeHR(arrayOf(IXmlNode_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun get_LocalName(): Unknown {
    val fnPtr = IXmlNode_VtblPtr!!.getPointer(25L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = com.sun.jna.platform.win32.COM.Unknown.ByReference()
    val hr = fn.invokeHR(arrayOf(IXmlNode_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun get_Prefix(): Unknown {
    val fnPtr = IXmlNode_VtblPtr!!.getPointer(26L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = com.sun.jna.platform.win32.COM.Unknown.ByReference()
    val hr = fn.invokeHR(arrayOf(IXmlNode_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun Normalize(): Unit {
    val fnPtr = IXmlNode_VtblPtr!!.getPointer(27L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(IXmlNode_Ptr, ))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun put_Prefix(`value`: Unknown): Unit {
    val fnPtr = IXmlNode_VtblPtr!!.getPointer(28L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(IXmlNode_Ptr, value,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIXmlNode(pointer.getPointer(0))

    public fun setValue(`value`: IXmlNode_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IXmlNode_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IXmlNode {
    public override val IXmlNode_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("1c741d59212247d5a85683f3d4214875")

    public fun makeIXmlNode(ptr: Pointer?): IXmlNode = IXmlNode_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IXmlNode): Array<IXmlNode> = (elements as
        Array<IXmlNode>).castToImpl<IXmlNode,IXmlNode_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IXmlNode?> = arrayOfNulls<IXmlNode_Impl>(size) as
        Array<IXmlNode?>
  }
}

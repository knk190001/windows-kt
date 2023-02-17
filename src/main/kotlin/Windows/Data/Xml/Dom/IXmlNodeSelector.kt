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
import java.lang.RuntimeException
import kotlin.Array
import kotlin.Int
import kotlin.String
import kotlin.Unit

public interface IXmlNodeSelector : NativeMapped, IWinRTInterface {
  public val IXmlNodeSelector_Ptr: Pointer?

  public val IXmlNodeSelector_VtblPtr: Pointer?
    get() = IXmlNodeSelector_Ptr?.getPointer(0)

  public fun SelectSingleNode(xpath: String): IXmlNode {
    val fnPtr = IXmlNodeSelector_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val xpath_Native = xpath.toHandle()
    val result = Windows.Data.Xml.Dom.IXmlNode.ByReference()
    val hr = fn.invokeHR(arrayOf(IXmlNodeSelector_Ptr, xpath_Native, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun SelectNodes(xpath: String): XmlNodeList {
    val fnPtr = IXmlNodeSelector_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val xpath_Native = xpath.toHandle()
    val result = Windows.Data.Xml.Dom.XmlNodeList.ByReference()
    val hr = fn.invokeHR(arrayOf(IXmlNodeSelector_Ptr, xpath_Native, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun SelectSingleNodeNS(xpath: String, namespaces: Unknown): IXmlNode {
    val fnPtr = IXmlNodeSelector_VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val xpath_Native = xpath.toHandle()
    val result = Windows.Data.Xml.Dom.IXmlNode.ByReference()
    val hr = fn.invokeHR(arrayOf(IXmlNodeSelector_Ptr, xpath_Native, namespaces, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun SelectNodesNS(xpath: String, namespaces: Unknown): XmlNodeList {
    val fnPtr = IXmlNodeSelector_VtblPtr!!.getPointer(9L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val xpath_Native = xpath.toHandle()
    val result = Windows.Data.Xml.Dom.XmlNodeList.ByReference()
    val hr = fn.invokeHR(arrayOf(IXmlNodeSelector_Ptr, xpath_Native, namespaces, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIXmlNodeSelector(pointer.getPointer(0))

    public fun setValue(`value`: IXmlNodeSelector_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IXmlNodeSelector_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IXmlNodeSelector {
    public override val IXmlNodeSelector_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("63dbba8bd0db4fe1b745f9433afdc25b")

    public fun makeIXmlNodeSelector(ptr: Pointer?): IXmlNodeSelector = IXmlNodeSelector_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IXmlNodeSelector): Array<IXmlNodeSelector> = (elements as
        Array<IXmlNodeSelector>).castToImpl<IXmlNodeSelector,IXmlNodeSelector_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IXmlNodeSelector?> =
        arrayOfNulls<IXmlNodeSelector_Impl>(size) as Array<IXmlNodeSelector?>
  }
}

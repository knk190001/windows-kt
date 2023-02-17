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
import com.sun.jna.platform.win32.WinDef
import java.lang.RuntimeException
import kotlin.Array
import kotlin.Int
import kotlin.String
import kotlin.Unit

public interface IXmlNamedNodeMap : NativeMapped, IWinRTInterface {
  public val IXmlNamedNodeMap_Ptr: Pointer?

  public val IXmlNamedNodeMap_VtblPtr: Pointer?
    get() = IXmlNamedNodeMap_Ptr?.getPointer(0)

  public fun get_Length(): WinDef.UINT {
    val fnPtr = IXmlNamedNodeMap_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinDef.UINTByReference()
    val hr = fn.invokeHR(arrayOf(IXmlNamedNodeMap_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun Item(index: WinDef.UINT): IXmlNode {
    val fnPtr = IXmlNamedNodeMap_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Data.Xml.Dom.IXmlNode.ByReference()
    val hr = fn.invokeHR(arrayOf(IXmlNamedNodeMap_Ptr, index, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun GetNamedItem(name: String): IXmlNode {
    val fnPtr = IXmlNamedNodeMap_VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val name_Native = name.toHandle()
    val result = Windows.Data.Xml.Dom.IXmlNode.ByReference()
    val hr = fn.invokeHR(arrayOf(IXmlNamedNodeMap_Ptr, name_Native, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun SetNamedItem(node: IXmlNode): IXmlNode {
    val fnPtr = IXmlNamedNodeMap_VtblPtr!!.getPointer(9L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Data.Xml.Dom.IXmlNode.ByReference()
    val hr = fn.invokeHR(arrayOf(IXmlNamedNodeMap_Ptr, node, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun RemoveNamedItem(name: String): IXmlNode {
    val fnPtr = IXmlNamedNodeMap_VtblPtr!!.getPointer(10L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val name_Native = name.toHandle()
    val result = Windows.Data.Xml.Dom.IXmlNode.ByReference()
    val hr = fn.invokeHR(arrayOf(IXmlNamedNodeMap_Ptr, name_Native, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun GetNamedItemNS(namespaceUri: Unknown, name: String): IXmlNode {
    val fnPtr = IXmlNamedNodeMap_VtblPtr!!.getPointer(11L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val name_Native = name.toHandle()
    val result = Windows.Data.Xml.Dom.IXmlNode.ByReference()
    val hr = fn.invokeHR(arrayOf(IXmlNamedNodeMap_Ptr, namespaceUri, name_Native, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun RemoveNamedItemNS(namespaceUri: Unknown, name: String): IXmlNode {
    val fnPtr = IXmlNamedNodeMap_VtblPtr!!.getPointer(12L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val name_Native = name.toHandle()
    val result = Windows.Data.Xml.Dom.IXmlNode.ByReference()
    val hr = fn.invokeHR(arrayOf(IXmlNamedNodeMap_Ptr, namespaceUri, name_Native, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun SetNamedItemNS(node: IXmlNode): IXmlNode {
    val fnPtr = IXmlNamedNodeMap_VtblPtr!!.getPointer(13L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Data.Xml.Dom.IXmlNode.ByReference()
    val hr = fn.invokeHR(arrayOf(IXmlNamedNodeMap_Ptr, node, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIXmlNamedNodeMap(pointer.getPointer(0))

    public fun setValue(`value`: IXmlNamedNodeMap_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IXmlNamedNodeMap_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IXmlNamedNodeMap {
    public override val IXmlNamedNodeMap_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("b3a69eb0aab04b82a6fab1453f7c021b")

    public fun makeIXmlNamedNodeMap(ptr: Pointer?): IXmlNamedNodeMap = IXmlNamedNodeMap_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IXmlNamedNodeMap): Array<IXmlNamedNodeMap> = (elements as
        Array<IXmlNamedNodeMap>).castToImpl<IXmlNamedNodeMap,IXmlNamedNodeMap_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IXmlNamedNodeMap?> =
        arrayOfNulls<IXmlNamedNodeMap_Impl>(size) as Array<IXmlNamedNodeMap?>
  }
}

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

public interface IXmlNodeList : NativeMapped, IWinRTInterface {
  public val IXmlNodeList_Ptr: Pointer?

  public val IXmlNodeList_VtblPtr: Pointer?
    get() = IXmlNodeList_Ptr?.getPointer(0)

  public fun get_Length(): WinDef.UINT {
    val fnPtr = IXmlNodeList_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinDef.UINTByReference()
    val hr = fn.invokeHR(arrayOf(IXmlNodeList_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun Item(index: WinDef.UINT): IXmlNode {
    val fnPtr = IXmlNodeList_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Data.Xml.Dom.IXmlNode.ByReference()
    val hr = fn.invokeHR(arrayOf(IXmlNodeList_Ptr, index, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIXmlNodeList(pointer.getPointer(0))

    public fun setValue(`value`: IXmlNodeList_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IXmlNodeList_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IXmlNodeList {
    public override val IXmlNodeList_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("8c60ad7783a44ec19c547ba429e13da6")

    public fun makeIXmlNodeList(ptr: Pointer?): IXmlNodeList = IXmlNodeList_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IXmlNodeList): Array<IXmlNodeList> = (elements as
        Array<IXmlNodeList>).castToImpl<IXmlNodeList,IXmlNodeList_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IXmlNodeList?> =
        arrayOfNulls<IXmlNodeList_Impl>(size) as Array<IXmlNodeList?>
  }
}

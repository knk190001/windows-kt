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
import com.sun.jna.platform.win32.WinNT
import com.sun.jna.ptr.ByteByReference
import java.lang.RuntimeException
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit

public interface IXmlAttribute : NativeMapped, IWinRTInterface {
  public val IXmlAttribute_Ptr: Pointer?

  public val IXmlAttribute_VtblPtr: Pointer?
    get() = IXmlAttribute_Ptr?.getPointer(0)

  public fun get_Name(): String {
    val fnPtr = IXmlAttribute_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(IXmlAttribute_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public fun get_Specified(): Boolean {
    val fnPtr = IXmlAttribute_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = ByteByReference()
    val hr = fn.invokeHR(arrayOf(IXmlAttribute_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue != 0.toByte()
    return resultValue_Managed
  }

  public fun get_Value(): String {
    val fnPtr = IXmlAttribute_VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(IXmlAttribute_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public fun put_Value(`value`: String): Unit {
    val fnPtr = IXmlAttribute_VtblPtr!!.getPointer(9L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val value_Native = value.toHandle()
    val hr = fn.invokeHR(arrayOf(IXmlAttribute_Ptr, value_Native,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIXmlAttribute(pointer.getPointer(0))

    public fun setValue(`value`: IXmlAttribute_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IXmlAttribute_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IXmlAttribute {
    public override val IXmlAttribute_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("ac144aa4b4f14db6b2068a22c308db0a")

    public fun makeIXmlAttribute(ptr: Pointer?): IXmlAttribute = IXmlAttribute_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IXmlAttribute): Array<IXmlAttribute> = (elements as
        Array<IXmlAttribute>).castToImpl<IXmlAttribute,IXmlAttribute_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IXmlAttribute?> =
        arrayOfNulls<IXmlAttribute_Impl>(size) as Array<IXmlAttribute?>
  }
}

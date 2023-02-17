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
import java.lang.RuntimeException
import kotlin.Array
import kotlin.Int
import kotlin.String
import kotlin.Unit

public interface IXmlNodeSerializer : NativeMapped, IWinRTInterface {
  public val IXmlNodeSerializer_Ptr: Pointer?

  public val IXmlNodeSerializer_VtblPtr: Pointer?
    get() = IXmlNodeSerializer_Ptr?.getPointer(0)

  public fun GetXml(): String {
    val fnPtr = IXmlNodeSerializer_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(IXmlNodeSerializer_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public fun get_InnerText(): String {
    val fnPtr = IXmlNodeSerializer_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(IXmlNodeSerializer_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public fun put_InnerText(`value`: String): Unit {
    val fnPtr = IXmlNodeSerializer_VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val value_Native = value.toHandle()
    val hr = fn.invokeHR(arrayOf(IXmlNodeSerializer_Ptr, value_Native,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIXmlNodeSerializer(pointer.getPointer(0))

    public fun setValue(`value`: IXmlNodeSerializer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IXmlNodeSerializer_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IXmlNodeSerializer {
    public override val IXmlNodeSerializer_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("5cc5b382e6dd4991abef06d8d2e7bd0c")

    public fun makeIXmlNodeSerializer(ptr: Pointer?): IXmlNodeSerializer =
        IXmlNodeSerializer_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IXmlNodeSerializer): Array<IXmlNodeSerializer> = (elements
        as Array<IXmlNodeSerializer>).castToImpl<IXmlNodeSerializer,IXmlNodeSerializer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IXmlNodeSerializer?> =
        arrayOfNulls<IXmlNodeSerializer_Impl>(size) as Array<IXmlNodeSerializer?>
  }
}

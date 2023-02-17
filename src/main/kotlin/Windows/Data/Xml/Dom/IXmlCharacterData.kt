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
import com.sun.jna.platform.win32.WinNT
import java.lang.RuntimeException
import kotlin.Array
import kotlin.Int
import kotlin.String
import kotlin.Unit

public interface IXmlCharacterData : NativeMapped, IWinRTInterface {
  public val IXmlCharacterData_Ptr: Pointer?

  public val IXmlCharacterData_VtblPtr: Pointer?
    get() = IXmlCharacterData_Ptr?.getPointer(0)

  public fun get_Data(): String {
    val fnPtr = IXmlCharacterData_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(IXmlCharacterData_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public fun put_Data(`value`: String): Unit {
    val fnPtr = IXmlCharacterData_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val value_Native = value.toHandle()
    val hr = fn.invokeHR(arrayOf(IXmlCharacterData_Ptr, value_Native,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun get_Length(): WinDef.UINT {
    val fnPtr = IXmlCharacterData_VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinDef.UINTByReference()
    val hr = fn.invokeHR(arrayOf(IXmlCharacterData_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun SubstringData(offset: WinDef.UINT, count: WinDef.UINT): String {
    val fnPtr = IXmlCharacterData_VtblPtr!!.getPointer(9L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(IXmlCharacterData_Ptr, offset, count, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public fun AppendData(`data`: String): Unit {
    val fnPtr = IXmlCharacterData_VtblPtr!!.getPointer(10L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val data_Native = data.toHandle()
    val hr = fn.invokeHR(arrayOf(IXmlCharacterData_Ptr, data_Native,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun InsertData(offset: WinDef.UINT, `data`: String): Unit {
    val fnPtr = IXmlCharacterData_VtblPtr!!.getPointer(11L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val data_Native = data.toHandle()
    val hr = fn.invokeHR(arrayOf(IXmlCharacterData_Ptr, offset, data_Native,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun DeleteData(offset: WinDef.UINT, count: WinDef.UINT): Unit {
    val fnPtr = IXmlCharacterData_VtblPtr!!.getPointer(12L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(IXmlCharacterData_Ptr, offset, count,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun ReplaceData(
    offset: WinDef.UINT,
    count: WinDef.UINT,
    `data`: String,
  ): Unit {
    val fnPtr = IXmlCharacterData_VtblPtr!!.getPointer(13L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val data_Native = data.toHandle()
    val hr = fn.invokeHR(arrayOf(IXmlCharacterData_Ptr, offset, count, data_Native,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIXmlCharacterData(pointer.getPointer(0))

    public fun setValue(`value`: IXmlCharacterData_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IXmlCharacterData_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IXmlCharacterData {
    public override val IXmlCharacterData_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("132e42ab4e364df6b1c80ce62fd88b26")

    public fun makeIXmlCharacterData(ptr: Pointer?): IXmlCharacterData = IXmlCharacterData_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IXmlCharacterData): Array<IXmlCharacterData> = (elements
        as Array<IXmlCharacterData>).castToImpl<IXmlCharacterData,IXmlCharacterData_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IXmlCharacterData?> =
        arrayOfNulls<IXmlCharacterData_Impl>(size) as Array<IXmlCharacterData?>
  }
}

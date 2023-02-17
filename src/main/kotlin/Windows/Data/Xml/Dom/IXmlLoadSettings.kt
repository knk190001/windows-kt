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
import com.sun.jna.ptr.ByteByReference
import java.lang.RuntimeException
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit

public interface IXmlLoadSettings : NativeMapped, IWinRTInterface {
  public val IXmlLoadSettings_Ptr: Pointer?

  public val IXmlLoadSettings_VtblPtr: Pointer?
    get() = IXmlLoadSettings_Ptr?.getPointer(0)

  public fun get_MaxElementDepth(): WinDef.UINT {
    val fnPtr = IXmlLoadSettings_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinDef.UINTByReference()
    val hr = fn.invokeHR(arrayOf(IXmlLoadSettings_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun put_MaxElementDepth(`value`: WinDef.UINT): Unit {
    val fnPtr = IXmlLoadSettings_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(IXmlLoadSettings_Ptr, value,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun get_ProhibitDtd(): Boolean {
    val fnPtr = IXmlLoadSettings_VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = ByteByReference()
    val hr = fn.invokeHR(arrayOf(IXmlLoadSettings_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue != 0.toByte()
    return resultValue_Managed
  }

  public fun put_ProhibitDtd(`value`: Boolean): Unit {
    val fnPtr = IXmlLoadSettings_VtblPtr!!.getPointer(9L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val value_Native: Byte = if(value) 1 else 0 
    val hr = fn.invokeHR(arrayOf(IXmlLoadSettings_Ptr, value_Native,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun get_ResolveExternals(): Boolean {
    val fnPtr = IXmlLoadSettings_VtblPtr!!.getPointer(10L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = ByteByReference()
    val hr = fn.invokeHR(arrayOf(IXmlLoadSettings_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue != 0.toByte()
    return resultValue_Managed
  }

  public fun put_ResolveExternals(`value`: Boolean): Unit {
    val fnPtr = IXmlLoadSettings_VtblPtr!!.getPointer(11L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val value_Native: Byte = if(value) 1 else 0 
    val hr = fn.invokeHR(arrayOf(IXmlLoadSettings_Ptr, value_Native,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun get_ValidateOnParse(): Boolean {
    val fnPtr = IXmlLoadSettings_VtblPtr!!.getPointer(12L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = ByteByReference()
    val hr = fn.invokeHR(arrayOf(IXmlLoadSettings_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue != 0.toByte()
    return resultValue_Managed
  }

  public fun put_ValidateOnParse(`value`: Boolean): Unit {
    val fnPtr = IXmlLoadSettings_VtblPtr!!.getPointer(13L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val value_Native: Byte = if(value) 1 else 0 
    val hr = fn.invokeHR(arrayOf(IXmlLoadSettings_Ptr, value_Native,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun get_ElementContentWhiteSpace(): Boolean {
    val fnPtr = IXmlLoadSettings_VtblPtr!!.getPointer(14L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = ByteByReference()
    val hr = fn.invokeHR(arrayOf(IXmlLoadSettings_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue != 0.toByte()
    return resultValue_Managed
  }

  public fun put_ElementContentWhiteSpace(`value`: Boolean): Unit {
    val fnPtr = IXmlLoadSettings_VtblPtr!!.getPointer(15L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val value_Native: Byte = if(value) 1 else 0 
    val hr = fn.invokeHR(arrayOf(IXmlLoadSettings_Ptr, value_Native,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIXmlLoadSettings(pointer.getPointer(0))

    public fun setValue(`value`: IXmlLoadSettings_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IXmlLoadSettings_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IXmlLoadSettings {
    public override val IXmlLoadSettings_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("58aa07a8fed646f7b4c5fb1ba72108d6")

    public fun makeIXmlLoadSettings(ptr: Pointer?): IXmlLoadSettings = IXmlLoadSettings_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IXmlLoadSettings): Array<IXmlLoadSettings> = (elements as
        Array<IXmlLoadSettings>).castToImpl<IXmlLoadSettings,IXmlLoadSettings_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IXmlLoadSettings?> =
        arrayOfNulls<IXmlLoadSettings_Impl>(size) as Array<IXmlLoadSettings?>
  }
}

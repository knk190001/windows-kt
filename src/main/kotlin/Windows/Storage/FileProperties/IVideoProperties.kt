package Windows.Storage.FileProperties

import Windows.Foundation.Collections.IVector_String_
import Windows.Foundation.IReference_Double_
import Windows.Foundation.TimeSpan
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

public interface IVideoProperties : NativeMapped, IWinRTInterface {
  public val IVideoProperties_Ptr: Pointer?

  public val IVideoProperties_VtblPtr: Pointer?
    get() = IVideoProperties_Ptr?.getPointer(0)

  public fun get_Rating(): WinDef.UINT {
    val fnPtr = IVideoProperties_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinDef.UINTByReference()
    val hr = fn.invokeHR(arrayOf(IVideoProperties_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun put_Rating(`value`: WinDef.UINT): Unit {
    val fnPtr = IVideoProperties_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(IVideoProperties_Ptr, value,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun get_Keywords(): IVector_String_ {
    val fnPtr = IVideoProperties_VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.Collections.IVector_String_.ByReference()
    val hr = fn.invokeHR(arrayOf(IVideoProperties_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun get_Width(): WinDef.UINT {
    val fnPtr = IVideoProperties_VtblPtr!!.getPointer(9L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinDef.UINTByReference()
    val hr = fn.invokeHR(arrayOf(IVideoProperties_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun get_Height(): WinDef.UINT {
    val fnPtr = IVideoProperties_VtblPtr!!.getPointer(10L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinDef.UINTByReference()
    val hr = fn.invokeHR(arrayOf(IVideoProperties_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun get_Duration(): TimeSpan {
    val fnPtr = IVideoProperties_VtblPtr!!.getPointer(11L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.TimeSpan.ByReference()
    val hr = fn.invokeHR(arrayOf(IVideoProperties_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun get_Latitude(): IReference_Double_ {
    val fnPtr = IVideoProperties_VtblPtr!!.getPointer(12L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.IReference_Double_.ByReference()
    val hr = fn.invokeHR(arrayOf(IVideoProperties_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun get_Longitude(): IReference_Double_ {
    val fnPtr = IVideoProperties_VtblPtr!!.getPointer(13L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.IReference_Double_.ByReference()
    val hr = fn.invokeHR(arrayOf(IVideoProperties_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun get_Title(): String {
    val fnPtr = IVideoProperties_VtblPtr!!.getPointer(14L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(IVideoProperties_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public fun put_Title(`value`: String): Unit {
    val fnPtr = IVideoProperties_VtblPtr!!.getPointer(15L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val value_Native = value.toHandle()
    val hr = fn.invokeHR(arrayOf(IVideoProperties_Ptr, value_Native,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun get_Subtitle(): String {
    val fnPtr = IVideoProperties_VtblPtr!!.getPointer(16L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(IVideoProperties_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public fun put_Subtitle(`value`: String): Unit {
    val fnPtr = IVideoProperties_VtblPtr!!.getPointer(17L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val value_Native = value.toHandle()
    val hr = fn.invokeHR(arrayOf(IVideoProperties_Ptr, value_Native,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun get_Producers(): IVector_String_ {
    val fnPtr = IVideoProperties_VtblPtr!!.getPointer(18L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.Collections.IVector_String_.ByReference()
    val hr = fn.invokeHR(arrayOf(IVideoProperties_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun get_Publisher(): String {
    val fnPtr = IVideoProperties_VtblPtr!!.getPointer(19L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(IVideoProperties_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public fun put_Publisher(`value`: String): Unit {
    val fnPtr = IVideoProperties_VtblPtr!!.getPointer(20L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val value_Native = value.toHandle()
    val hr = fn.invokeHR(arrayOf(IVideoProperties_Ptr, value_Native,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun get_Writers(): IVector_String_ {
    val fnPtr = IVideoProperties_VtblPtr!!.getPointer(21L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.Collections.IVector_String_.ByReference()
    val hr = fn.invokeHR(arrayOf(IVideoProperties_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun get_Year(): WinDef.UINT {
    val fnPtr = IVideoProperties_VtblPtr!!.getPointer(22L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinDef.UINTByReference()
    val hr = fn.invokeHR(arrayOf(IVideoProperties_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun put_Year(`value`: WinDef.UINT): Unit {
    val fnPtr = IVideoProperties_VtblPtr!!.getPointer(23L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(IVideoProperties_Ptr, value,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun get_Bitrate(): WinDef.UINT {
    val fnPtr = IVideoProperties_VtblPtr!!.getPointer(24L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinDef.UINTByReference()
    val hr = fn.invokeHR(arrayOf(IVideoProperties_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun get_Directors(): IVector_String_ {
    val fnPtr = IVideoProperties_VtblPtr!!.getPointer(25L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.Collections.IVector_String_.ByReference()
    val hr = fn.invokeHR(arrayOf(IVideoProperties_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun get_Orientation(): VideoOrientation {
    val fnPtr = IVideoProperties_VtblPtr!!.getPointer(26L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Storage.FileProperties.VideoOrientation.ByReference()
    val hr = fn.invokeHR(arrayOf(IVideoProperties_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIVideoProperties(pointer.getPointer(0))

    public fun setValue(`value`: IVideoProperties_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IVideoProperties_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IVideoProperties {
    public override val IVideoProperties_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("719ae50768de4db897de49998c059f2f")

    public fun makeIVideoProperties(ptr: Pointer?): IVideoProperties = IVideoProperties_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IVideoProperties): Array<IVideoProperties> = (elements as
        Array<IVideoProperties>).castToImpl<IVideoProperties,IVideoProperties_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVideoProperties?> =
        arrayOfNulls<IVideoProperties_Impl>(size) as Array<IVideoProperties?>
  }
}

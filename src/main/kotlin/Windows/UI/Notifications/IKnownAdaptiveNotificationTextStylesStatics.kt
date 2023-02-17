package Windows.UI.Notifications

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

public interface IKnownAdaptiveNotificationTextStylesStatics : NativeMapped, IWinRTInterface {
  public val IKnownAdaptiveNotificationTextStylesStatics_Ptr: Pointer?

  public val IKnownAdaptiveNotificationTextStylesStatics_VtblPtr: Pointer?
    get() = IKnownAdaptiveNotificationTextStylesStatics_Ptr?.getPointer(0)

  public fun get_Caption(): String {
    val fnPtr = IKnownAdaptiveNotificationTextStylesStatics_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(IKnownAdaptiveNotificationTextStylesStatics_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public fun get_Body(): String {
    val fnPtr = IKnownAdaptiveNotificationTextStylesStatics_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(IKnownAdaptiveNotificationTextStylesStatics_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public fun get_Base(): String {
    val fnPtr = IKnownAdaptiveNotificationTextStylesStatics_VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(IKnownAdaptiveNotificationTextStylesStatics_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public fun get_Subtitle(): String {
    val fnPtr = IKnownAdaptiveNotificationTextStylesStatics_VtblPtr!!.getPointer(9L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(IKnownAdaptiveNotificationTextStylesStatics_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public fun get_Title(): String {
    val fnPtr = IKnownAdaptiveNotificationTextStylesStatics_VtblPtr!!.getPointer(10L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(IKnownAdaptiveNotificationTextStylesStatics_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public fun get_Subheader(): String {
    val fnPtr = IKnownAdaptiveNotificationTextStylesStatics_VtblPtr!!.getPointer(11L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(IKnownAdaptiveNotificationTextStylesStatics_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public fun get_Header(): String {
    val fnPtr = IKnownAdaptiveNotificationTextStylesStatics_VtblPtr!!.getPointer(12L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(IKnownAdaptiveNotificationTextStylesStatics_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public fun get_TitleNumeral(): String {
    val fnPtr = IKnownAdaptiveNotificationTextStylesStatics_VtblPtr!!.getPointer(13L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(IKnownAdaptiveNotificationTextStylesStatics_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public fun get_SubheaderNumeral(): String {
    val fnPtr = IKnownAdaptiveNotificationTextStylesStatics_VtblPtr!!.getPointer(14L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(IKnownAdaptiveNotificationTextStylesStatics_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public fun get_HeaderNumeral(): String {
    val fnPtr = IKnownAdaptiveNotificationTextStylesStatics_VtblPtr!!.getPointer(15L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(IKnownAdaptiveNotificationTextStylesStatics_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public fun get_CaptionSubtle(): String {
    val fnPtr = IKnownAdaptiveNotificationTextStylesStatics_VtblPtr!!.getPointer(16L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(IKnownAdaptiveNotificationTextStylesStatics_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public fun get_BodySubtle(): String {
    val fnPtr = IKnownAdaptiveNotificationTextStylesStatics_VtblPtr!!.getPointer(17L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(IKnownAdaptiveNotificationTextStylesStatics_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public fun get_BaseSubtle(): String {
    val fnPtr = IKnownAdaptiveNotificationTextStylesStatics_VtblPtr!!.getPointer(18L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(IKnownAdaptiveNotificationTextStylesStatics_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public fun get_SubtitleSubtle(): String {
    val fnPtr = IKnownAdaptiveNotificationTextStylesStatics_VtblPtr!!.getPointer(19L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(IKnownAdaptiveNotificationTextStylesStatics_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public fun get_TitleSubtle(): String {
    val fnPtr = IKnownAdaptiveNotificationTextStylesStatics_VtblPtr!!.getPointer(20L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(IKnownAdaptiveNotificationTextStylesStatics_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public fun get_SubheaderSubtle(): String {
    val fnPtr = IKnownAdaptiveNotificationTextStylesStatics_VtblPtr!!.getPointer(21L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(IKnownAdaptiveNotificationTextStylesStatics_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public fun get_SubheaderNumeralSubtle(): String {
    val fnPtr = IKnownAdaptiveNotificationTextStylesStatics_VtblPtr!!.getPointer(22L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(IKnownAdaptiveNotificationTextStylesStatics_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public fun get_HeaderSubtle(): String {
    val fnPtr = IKnownAdaptiveNotificationTextStylesStatics_VtblPtr!!.getPointer(23L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(IKnownAdaptiveNotificationTextStylesStatics_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public fun get_HeaderNumeralSubtle(): String {
    val fnPtr = IKnownAdaptiveNotificationTextStylesStatics_VtblPtr!!.getPointer(24L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(IKnownAdaptiveNotificationTextStylesStatics_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() =
        ABI.makeIKnownAdaptiveNotificationTextStylesStatics(pointer.getPointer(0))

    public fun setValue(`value`: IKnownAdaptiveNotificationTextStylesStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IKnownAdaptiveNotificationTextStylesStatics_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IKnownAdaptiveNotificationTextStylesStatics {
    public override val IKnownAdaptiveNotificationTextStylesStatics_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("202192d7899645aa8ba1d461d72c2a1b")

    public fun makeIKnownAdaptiveNotificationTextStylesStatics(ptr: Pointer?):
        IKnownAdaptiveNotificationTextStylesStatics =
        IKnownAdaptiveNotificationTextStylesStatics_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IKnownAdaptiveNotificationTextStylesStatics):
        Array<IKnownAdaptiveNotificationTextStylesStatics> = (elements as
        Array<IKnownAdaptiveNotificationTextStylesStatics>).castToImpl<IKnownAdaptiveNotificationTextStylesStatics,IKnownAdaptiveNotificationTextStylesStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IKnownAdaptiveNotificationTextStylesStatics?> =
        arrayOfNulls<IKnownAdaptiveNotificationTextStylesStatics_Impl>(size) as
        Array<IKnownAdaptiveNotificationTextStylesStatics?>
  }
}

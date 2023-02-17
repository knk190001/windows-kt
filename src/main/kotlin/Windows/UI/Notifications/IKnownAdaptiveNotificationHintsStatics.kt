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

public interface IKnownAdaptiveNotificationHintsStatics : NativeMapped, IWinRTInterface {
  public val IKnownAdaptiveNotificationHintsStatics_Ptr: Pointer?

  public val IKnownAdaptiveNotificationHintsStatics_VtblPtr: Pointer?
    get() = IKnownAdaptiveNotificationHintsStatics_Ptr?.getPointer(0)

  public fun get_Style(): String {
    val fnPtr = IKnownAdaptiveNotificationHintsStatics_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(IKnownAdaptiveNotificationHintsStatics_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public fun get_Wrap(): String {
    val fnPtr = IKnownAdaptiveNotificationHintsStatics_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(IKnownAdaptiveNotificationHintsStatics_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public fun get_MaxLines(): String {
    val fnPtr = IKnownAdaptiveNotificationHintsStatics_VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(IKnownAdaptiveNotificationHintsStatics_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public fun get_MinLines(): String {
    val fnPtr = IKnownAdaptiveNotificationHintsStatics_VtblPtr!!.getPointer(9L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(IKnownAdaptiveNotificationHintsStatics_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public fun get_TextStacking(): String {
    val fnPtr = IKnownAdaptiveNotificationHintsStatics_VtblPtr!!.getPointer(10L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(IKnownAdaptiveNotificationHintsStatics_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public fun get_Align(): String {
    val fnPtr = IKnownAdaptiveNotificationHintsStatics_VtblPtr!!.getPointer(11L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(IKnownAdaptiveNotificationHintsStatics_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIKnownAdaptiveNotificationHintsStatics(pointer.getPointer(0))

    public fun setValue(`value`: IKnownAdaptiveNotificationHintsStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IKnownAdaptiveNotificationHintsStatics_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IKnownAdaptiveNotificationHintsStatics {
    public override val IKnownAdaptiveNotificationHintsStatics_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("06206598d496497d86924f7d7c2770df")

    public fun makeIKnownAdaptiveNotificationHintsStatics(ptr: Pointer?):
        IKnownAdaptiveNotificationHintsStatics = IKnownAdaptiveNotificationHintsStatics_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IKnownAdaptiveNotificationHintsStatics):
        Array<IKnownAdaptiveNotificationHintsStatics> = (elements as
        Array<IKnownAdaptiveNotificationHintsStatics>).castToImpl<IKnownAdaptiveNotificationHintsStatics,IKnownAdaptiveNotificationHintsStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IKnownAdaptiveNotificationHintsStatics?> =
        arrayOfNulls<IKnownAdaptiveNotificationHintsStatics_Impl>(size) as
        Array<IKnownAdaptiveNotificationHintsStatics?>
  }
}

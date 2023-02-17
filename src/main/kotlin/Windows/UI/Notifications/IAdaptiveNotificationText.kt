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

public interface IAdaptiveNotificationText : NativeMapped, IWinRTInterface {
  public val IAdaptiveNotificationText_Ptr: Pointer?

  public val IAdaptiveNotificationText_VtblPtr: Pointer?
    get() = IAdaptiveNotificationText_Ptr?.getPointer(0)

  public fun get_Text(): String {
    val fnPtr = IAdaptiveNotificationText_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(IAdaptiveNotificationText_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public fun put_Text(`value`: String): Unit {
    val fnPtr = IAdaptiveNotificationText_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val value_Native = value.toHandle()
    val hr = fn.invokeHR(arrayOf(IAdaptiveNotificationText_Ptr, value_Native,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun get_Language(): String {
    val fnPtr = IAdaptiveNotificationText_VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(IAdaptiveNotificationText_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public fun put_Language(`value`: String): Unit {
    val fnPtr = IAdaptiveNotificationText_VtblPtr!!.getPointer(9L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val value_Native = value.toHandle()
    val hr = fn.invokeHR(arrayOf(IAdaptiveNotificationText_Ptr, value_Native,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIAdaptiveNotificationText(pointer.getPointer(0))

    public fun setValue(`value`: IAdaptiveNotificationText_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IAdaptiveNotificationText_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IAdaptiveNotificationText {
    public override val IAdaptiveNotificationText_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("46d4a3be609a4326a40bbfde872034a3")

    public fun makeIAdaptiveNotificationText(ptr: Pointer?): IAdaptiveNotificationText =
        IAdaptiveNotificationText_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IAdaptiveNotificationText):
        Array<IAdaptiveNotificationText> = (elements as
        Array<IAdaptiveNotificationText>).castToImpl<IAdaptiveNotificationText,IAdaptiveNotificationText_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAdaptiveNotificationText?> =
        arrayOfNulls<IAdaptiveNotificationText_Impl>(size) as Array<IAdaptiveNotificationText?>
  }
}

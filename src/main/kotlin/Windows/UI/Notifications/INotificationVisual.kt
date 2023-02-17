package Windows.UI.Notifications

import Windows.Foundation.Collections.IVector_NotificationBinding_
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

public interface INotificationVisual : NativeMapped, IWinRTInterface {
  public val INotificationVisual_Ptr: Pointer?

  public val INotificationVisual_VtblPtr: Pointer?
    get() = INotificationVisual_Ptr?.getPointer(0)

  public fun get_Language(): String {
    val fnPtr = INotificationVisual_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(INotificationVisual_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public fun put_Language(`value`: String): Unit {
    val fnPtr = INotificationVisual_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val value_Native = value.toHandle()
    val hr = fn.invokeHR(arrayOf(INotificationVisual_Ptr, value_Native,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun get_Bindings(): IVector_NotificationBinding_ {
    val fnPtr = INotificationVisual_VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.Collections.IVector_NotificationBinding_.ByReference()
    val hr = fn.invokeHR(arrayOf(INotificationVisual_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun GetBinding(templateName: String): NotificationBinding {
    val fnPtr = INotificationVisual_VtblPtr!!.getPointer(9L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val templateName_Native = templateName.toHandle()
    val result = Windows.UI.Notifications.NotificationBinding.ByReference()
    val hr = fn.invokeHR(arrayOf(INotificationVisual_Ptr, templateName_Native, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeINotificationVisual(pointer.getPointer(0))

    public fun setValue(`value`: INotificationVisual_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class INotificationVisual_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), INotificationVisual {
    public override val INotificationVisual_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("68835b8eaa564e1186d35f9a6957bc5b")

    public fun makeINotificationVisual(ptr: Pointer?): INotificationVisual =
        INotificationVisual_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: INotificationVisual): Array<INotificationVisual> =
        (elements as
        Array<INotificationVisual>).castToImpl<INotificationVisual,INotificationVisual_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INotificationVisual?> =
        arrayOfNulls<INotificationVisual_Impl>(size) as Array<INotificationVisual?>
  }
}

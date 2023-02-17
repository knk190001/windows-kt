package Windows.UI.Notifications

import Windows.Foundation.Collections.IMap_String_String_
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
import java.lang.RuntimeException
import kotlin.Array
import kotlin.Int
import kotlin.Unit

public interface IAdaptiveNotificationContent : NativeMapped, IWinRTInterface {
  public val IAdaptiveNotificationContent_Ptr: Pointer?

  public val IAdaptiveNotificationContent_VtblPtr: Pointer?
    get() = IAdaptiveNotificationContent_Ptr?.getPointer(0)

  public fun get_Kind(): AdaptiveNotificationContentKind {
    val fnPtr = IAdaptiveNotificationContent_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.UI.Notifications.AdaptiveNotificationContentKind.ByReference()
    val hr = fn.invokeHR(arrayOf(IAdaptiveNotificationContent_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun get_Hints(): IMap_String_String_ {
    val fnPtr = IAdaptiveNotificationContent_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.Collections.IMap_String_String_.ByReference()
    val hr = fn.invokeHR(arrayOf(IAdaptiveNotificationContent_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIAdaptiveNotificationContent(pointer.getPointer(0))

    public fun setValue(`value`: IAdaptiveNotificationContent_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IAdaptiveNotificationContent_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IAdaptiveNotificationContent {
    public override val IAdaptiveNotificationContent_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("eb0dbe667448448d9db8d78acd2abba9")

    public fun makeIAdaptiveNotificationContent(ptr: Pointer?): IAdaptiveNotificationContent =
        IAdaptiveNotificationContent_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IAdaptiveNotificationContent):
        Array<IAdaptiveNotificationContent> = (elements as
        Array<IAdaptiveNotificationContent>).castToImpl<IAdaptiveNotificationContent,IAdaptiveNotificationContent_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAdaptiveNotificationContent?> =
        arrayOfNulls<IAdaptiveNotificationContent_Impl>(size) as
        Array<IAdaptiveNotificationContent?>
  }
}

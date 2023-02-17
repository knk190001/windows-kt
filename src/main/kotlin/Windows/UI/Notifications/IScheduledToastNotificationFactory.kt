package Windows.UI.Notifications

import Windows.Data.Xml.Dom.XmlDocument
import Windows.Foundation.DateTime
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
import java.lang.RuntimeException
import kotlin.Array
import kotlin.Int
import kotlin.Unit

public interface IScheduledToastNotificationFactory : NativeMapped, IWinRTInterface {
  public val IScheduledToastNotificationFactory_Ptr: Pointer?

  public val IScheduledToastNotificationFactory_VtblPtr: Pointer?
    get() = IScheduledToastNotificationFactory_Ptr?.getPointer(0)

  public fun CreateScheduledToastNotification(content: XmlDocument, deliveryTime: DateTime.ByValue):
      ScheduledToastNotification {
    val fnPtr = IScheduledToastNotificationFactory_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.UI.Notifications.ScheduledToastNotification.ByReference()
    val hr = fn.invokeHR(arrayOf(IScheduledToastNotificationFactory_Ptr, content, deliveryTime,
        result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun CreateScheduledToastNotificationRecurring(
    content: XmlDocument,
    deliveryTime: DateTime.ByValue,
    snoozeInterval: TimeSpan.ByValue,
    maximumSnoozeCount: WinDef.UINT,
  ): ScheduledToastNotification {
    val fnPtr = IScheduledToastNotificationFactory_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.UI.Notifications.ScheduledToastNotification.ByReference()
    val hr = fn.invokeHR(arrayOf(IScheduledToastNotificationFactory_Ptr, content, deliveryTime,
        snoozeInterval, maximumSnoozeCount, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIScheduledToastNotificationFactory(pointer.getPointer(0))

    public fun setValue(`value`: IScheduledToastNotificationFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IScheduledToastNotificationFactory_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IScheduledToastNotificationFactory {
    public override val IScheduledToastNotificationFactory_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("e7bed1910bb94189839431761b476fd7")

    public fun makeIScheduledToastNotificationFactory(ptr: Pointer?):
        IScheduledToastNotificationFactory = IScheduledToastNotificationFactory_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IScheduledToastNotificationFactory):
        Array<IScheduledToastNotificationFactory> = (elements as
        Array<IScheduledToastNotificationFactory>).castToImpl<IScheduledToastNotificationFactory,IScheduledToastNotificationFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IScheduledToastNotificationFactory?> =
        arrayOfNulls<IScheduledToastNotificationFactory_Impl>(size) as
        Array<IScheduledToastNotificationFactory?>
  }
}

package Windows.UI.Notifications

import Windows.Data.Xml.Dom.XmlDocument
import Windows.Foundation.DateTime
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

public interface IScheduledTileNotificationFactory : NativeMapped, IWinRTInterface {
  public val IScheduledTileNotificationFactory_Ptr: Pointer?

  public val IScheduledTileNotificationFactory_VtblPtr: Pointer?
    get() = IScheduledTileNotificationFactory_Ptr?.getPointer(0)

  public fun CreateScheduledTileNotification(content: XmlDocument, deliveryTime: DateTime.ByValue):
      ScheduledTileNotification {
    val fnPtr = IScheduledTileNotificationFactory_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.UI.Notifications.ScheduledTileNotification.ByReference()
    val hr = fn.invokeHR(arrayOf(IScheduledTileNotificationFactory_Ptr, content, deliveryTime,
        result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIScheduledTileNotificationFactory(pointer.getPointer(0))

    public fun setValue(`value`: IScheduledTileNotificationFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IScheduledTileNotificationFactory_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IScheduledTileNotificationFactory {
    public override val IScheduledTileNotificationFactory_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("3383138a98c04c3bbbd64a633c7cfc29")

    public fun makeIScheduledTileNotificationFactory(ptr: Pointer?):
        IScheduledTileNotificationFactory = IScheduledTileNotificationFactory_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IScheduledTileNotificationFactory):
        Array<IScheduledTileNotificationFactory> = (elements as
        Array<IScheduledTileNotificationFactory>).castToImpl<IScheduledTileNotificationFactory,IScheduledTileNotificationFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IScheduledTileNotificationFactory?> =
        arrayOfNulls<IScheduledTileNotificationFactory_Impl>(size) as
        Array<IScheduledTileNotificationFactory?>
  }
}

package Windows.UI.Notifications

import Windows.Data.Xml.Dom.XmlDocument
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

public interface IBadgeNotificationFactory : NativeMapped, IWinRTInterface {
  public val IBadgeNotificationFactory_Ptr: Pointer?

  public val IBadgeNotificationFactory_VtblPtr: Pointer?
    get() = IBadgeNotificationFactory_Ptr?.getPointer(0)

  public fun CreateBadgeNotification(content: XmlDocument): BadgeNotification {
    val fnPtr = IBadgeNotificationFactory_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.UI.Notifications.BadgeNotification.ByReference()
    val hr = fn.invokeHR(arrayOf(IBadgeNotificationFactory_Ptr, content, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIBadgeNotificationFactory(pointer.getPointer(0))

    public fun setValue(`value`: IBadgeNotificationFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IBadgeNotificationFactory_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IBadgeNotificationFactory {
    public override val IBadgeNotificationFactory_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("edf255ce06184d59948a5a61040c52f9")

    public fun makeIBadgeNotificationFactory(ptr: Pointer?): IBadgeNotificationFactory =
        IBadgeNotificationFactory_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IBadgeNotificationFactory):
        Array<IBadgeNotificationFactory> = (elements as
        Array<IBadgeNotificationFactory>).castToImpl<IBadgeNotificationFactory,IBadgeNotificationFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBadgeNotificationFactory?> =
        arrayOfNulls<IBadgeNotificationFactory_Impl>(size) as Array<IBadgeNotificationFactory?>
  }
}

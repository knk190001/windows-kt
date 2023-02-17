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

public interface IToastNotificationFactory : NativeMapped, IWinRTInterface {
  public val IToastNotificationFactory_Ptr: Pointer?

  public val IToastNotificationFactory_VtblPtr: Pointer?
    get() = IToastNotificationFactory_Ptr?.getPointer(0)

  public fun CreateToastNotification(content: XmlDocument): ToastNotification {
    val fnPtr = IToastNotificationFactory_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.UI.Notifications.ToastNotification.ByReference()
    val hr = fn.invokeHR(arrayOf(IToastNotificationFactory_Ptr, content, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIToastNotificationFactory(pointer.getPointer(0))

    public fun setValue(`value`: IToastNotificationFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IToastNotificationFactory_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IToastNotificationFactory {
    public override val IToastNotificationFactory_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("04124b2082c64229b109fd9ed4662b53")

    public fun makeIToastNotificationFactory(ptr: Pointer?): IToastNotificationFactory =
        IToastNotificationFactory_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IToastNotificationFactory):
        Array<IToastNotificationFactory> = (elements as
        Array<IToastNotificationFactory>).castToImpl<IToastNotificationFactory,IToastNotificationFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IToastNotificationFactory?> =
        arrayOfNulls<IToastNotificationFactory_Impl>(size) as Array<IToastNotificationFactory?>
  }
}

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

public interface ITileFlyoutNotificationFactory : NativeMapped, IWinRTInterface {
  public val ITileFlyoutNotificationFactory_Ptr: Pointer?

  public val ITileFlyoutNotificationFactory_VtblPtr: Pointer?
    get() = ITileFlyoutNotificationFactory_Ptr?.getPointer(0)

  public fun CreateTileFlyoutNotification(content: XmlDocument): TileFlyoutNotification {
    val fnPtr = ITileFlyoutNotificationFactory_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.UI.Notifications.TileFlyoutNotification.ByReference()
    val hr = fn.invokeHR(arrayOf(ITileFlyoutNotificationFactory_Ptr, content, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeITileFlyoutNotificationFactory(pointer.getPointer(0))

    public fun setValue(`value`: ITileFlyoutNotificationFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class ITileFlyoutNotificationFactory_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), ITileFlyoutNotificationFactory {
    public override val ITileFlyoutNotificationFactory_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("ef556ff552264f2bb27888a35dfe569f")

    public fun makeITileFlyoutNotificationFactory(ptr: Pointer?): ITileFlyoutNotificationFactory =
        ITileFlyoutNotificationFactory_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: ITileFlyoutNotificationFactory):
        Array<ITileFlyoutNotificationFactory> = (elements as
        Array<ITileFlyoutNotificationFactory>).castToImpl<ITileFlyoutNotificationFactory,ITileFlyoutNotificationFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITileFlyoutNotificationFactory?> =
        arrayOfNulls<ITileFlyoutNotificationFactory_Impl>(size) as
        Array<ITileFlyoutNotificationFactory?>
  }
}

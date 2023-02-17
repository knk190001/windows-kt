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

public interface ITileNotificationFactory : NativeMapped, IWinRTInterface {
  public val ITileNotificationFactory_Ptr: Pointer?

  public val ITileNotificationFactory_VtblPtr: Pointer?
    get() = ITileNotificationFactory_Ptr?.getPointer(0)

  public fun CreateTileNotification(content: XmlDocument): TileNotification {
    val fnPtr = ITileNotificationFactory_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.UI.Notifications.TileNotification.ByReference()
    val hr = fn.invokeHR(arrayOf(ITileNotificationFactory_Ptr, content, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeITileNotificationFactory(pointer.getPointer(0))

    public fun setValue(`value`: ITileNotificationFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class ITileNotificationFactory_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), ITileNotificationFactory {
    public override val ITileNotificationFactory_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("c6abdd6e492846c8bdbf81a047dea0d4")

    public fun makeITileNotificationFactory(ptr: Pointer?): ITileNotificationFactory =
        ITileNotificationFactory_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: ITileNotificationFactory): Array<ITileNotificationFactory>
        = (elements as
        Array<ITileNotificationFactory>).castToImpl<ITileNotificationFactory,ITileNotificationFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITileNotificationFactory?> =
        arrayOfNulls<ITileNotificationFactory_Impl>(size) as Array<ITileNotificationFactory?>
  }
}

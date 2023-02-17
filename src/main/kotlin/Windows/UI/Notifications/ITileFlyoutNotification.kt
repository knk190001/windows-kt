package Windows.UI.Notifications

import Windows.Data.Xml.Dom.XmlDocument
import Windows.Foundation.IReference_DateTime_
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

public interface ITileFlyoutNotification : NativeMapped, IWinRTInterface {
  public val ITileFlyoutNotification_Ptr: Pointer?

  public val ITileFlyoutNotification_VtblPtr: Pointer?
    get() = ITileFlyoutNotification_Ptr?.getPointer(0)

  public fun get_Content(): XmlDocument {
    val fnPtr = ITileFlyoutNotification_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Data.Xml.Dom.XmlDocument.ByReference()
    val hr = fn.invokeHR(arrayOf(ITileFlyoutNotification_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun put_ExpirationTime(`value`: IReference_DateTime_): Unit {
    val fnPtr = ITileFlyoutNotification_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(ITileFlyoutNotification_Ptr, value,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun get_ExpirationTime(): IReference_DateTime_ {
    val fnPtr = ITileFlyoutNotification_VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.IReference_DateTime_.ByReference()
    val hr = fn.invokeHR(arrayOf(ITileFlyoutNotification_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeITileFlyoutNotification(pointer.getPointer(0))

    public fun setValue(`value`: ITileFlyoutNotification_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class ITileFlyoutNotification_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), ITileFlyoutNotification {
    public override val ITileFlyoutNotification_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("9a53b261c70c42beb2f3f42aa97d34e5")

    public fun makeITileFlyoutNotification(ptr: Pointer?): ITileFlyoutNotification =
        ITileFlyoutNotification_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: ITileFlyoutNotification): Array<ITileFlyoutNotification> =
        (elements as
        Array<ITileFlyoutNotification>).castToImpl<ITileFlyoutNotification,ITileFlyoutNotification_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITileFlyoutNotification?> =
        arrayOfNulls<ITileFlyoutNotification_Impl>(size) as Array<ITileFlyoutNotification?>
  }
}

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

public interface IBadgeNotification : NativeMapped, IWinRTInterface {
  public val IBadgeNotification_Ptr: Pointer?

  public val IBadgeNotification_VtblPtr: Pointer?
    get() = IBadgeNotification_Ptr?.getPointer(0)

  public fun get_Content(): XmlDocument {
    val fnPtr = IBadgeNotification_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Data.Xml.Dom.XmlDocument.ByReference()
    val hr = fn.invokeHR(arrayOf(IBadgeNotification_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun put_ExpirationTime(`value`: IReference_DateTime_): Unit {
    val fnPtr = IBadgeNotification_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(IBadgeNotification_Ptr, value,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun get_ExpirationTime(): IReference_DateTime_ {
    val fnPtr = IBadgeNotification_VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.IReference_DateTime_.ByReference()
    val hr = fn.invokeHR(arrayOf(IBadgeNotification_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIBadgeNotification(pointer.getPointer(0))

    public fun setValue(`value`: IBadgeNotification_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IBadgeNotification_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IBadgeNotification {
    public override val IBadgeNotification_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("075cb4cad08a4e2f92337e289c1f7722")

    public fun makeIBadgeNotification(ptr: Pointer?): IBadgeNotification =
        IBadgeNotification_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IBadgeNotification): Array<IBadgeNotification> = (elements
        as Array<IBadgeNotification>).castToImpl<IBadgeNotification,IBadgeNotification_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBadgeNotification?> =
        arrayOfNulls<IBadgeNotification_Impl>(size) as Array<IBadgeNotification?>
  }
}

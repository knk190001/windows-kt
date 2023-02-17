package Windows.UI.Notifications

import Windows.Data.Xml.Dom.XmlDocument
import Windows.Foundation.DateTime
import Windows.Foundation.IReference_TimeSpan_
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
import com.sun.jna.platform.win32.WinNT
import java.lang.RuntimeException
import kotlin.Array
import kotlin.Int
import kotlin.String
import kotlin.Unit

public interface IScheduledToastNotification : NativeMapped, IWinRTInterface {
  public val IScheduledToastNotification_Ptr: Pointer?

  public val IScheduledToastNotification_VtblPtr: Pointer?
    get() = IScheduledToastNotification_Ptr?.getPointer(0)

  public fun get_Content(): XmlDocument {
    val fnPtr = IScheduledToastNotification_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Data.Xml.Dom.XmlDocument.ByReference()
    val hr = fn.invokeHR(arrayOf(IScheduledToastNotification_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun get_DeliveryTime(): DateTime {
    val fnPtr = IScheduledToastNotification_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.DateTime.ByReference()
    val hr = fn.invokeHR(arrayOf(IScheduledToastNotification_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun get_SnoozeInterval(): IReference_TimeSpan_ {
    val fnPtr = IScheduledToastNotification_VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.IReference_TimeSpan_.ByReference()
    val hr = fn.invokeHR(arrayOf(IScheduledToastNotification_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun get_MaximumSnoozeCount(): WinDef.UINT {
    val fnPtr = IScheduledToastNotification_VtblPtr!!.getPointer(9L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinDef.UINTByReference()
    val hr = fn.invokeHR(arrayOf(IScheduledToastNotification_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun put_Id(`value`: String): Unit {
    val fnPtr = IScheduledToastNotification_VtblPtr!!.getPointer(10L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val value_Native = value.toHandle()
    val hr = fn.invokeHR(arrayOf(IScheduledToastNotification_Ptr, value_Native,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun get_Id(): String {
    val fnPtr = IScheduledToastNotification_VtblPtr!!.getPointer(11L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(IScheduledToastNotification_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIScheduledToastNotification(pointer.getPointer(0))

    public fun setValue(`value`: IScheduledToastNotification_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IScheduledToastNotification_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IScheduledToastNotification {
    public override val IScheduledToastNotification_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("79f577f80de748cd97409b370490c838")

    public fun makeIScheduledToastNotification(ptr: Pointer?): IScheduledToastNotification =
        IScheduledToastNotification_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IScheduledToastNotification):
        Array<IScheduledToastNotification> = (elements as
        Array<IScheduledToastNotification>).castToImpl<IScheduledToastNotification,IScheduledToastNotification_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IScheduledToastNotification?> =
        arrayOfNulls<IScheduledToastNotification_Impl>(size) as Array<IScheduledToastNotification?>
  }
}

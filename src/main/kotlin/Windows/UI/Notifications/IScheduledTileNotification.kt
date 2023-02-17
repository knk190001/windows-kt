package Windows.UI.Notifications

import Windows.Data.Xml.Dom.XmlDocument
import Windows.Foundation.DateTime
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
import com.sun.jna.platform.win32.WinNT
import java.lang.RuntimeException
import kotlin.Array
import kotlin.Int
import kotlin.String
import kotlin.Unit

public interface IScheduledTileNotification : NativeMapped, IWinRTInterface {
  public val IScheduledTileNotification_Ptr: Pointer?

  public val IScheduledTileNotification_VtblPtr: Pointer?
    get() = IScheduledTileNotification_Ptr?.getPointer(0)

  public fun get_Content(): XmlDocument {
    val fnPtr = IScheduledTileNotification_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Data.Xml.Dom.XmlDocument.ByReference()
    val hr = fn.invokeHR(arrayOf(IScheduledTileNotification_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun get_DeliveryTime(): DateTime {
    val fnPtr = IScheduledTileNotification_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.DateTime.ByReference()
    val hr = fn.invokeHR(arrayOf(IScheduledTileNotification_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun put_ExpirationTime(`value`: IReference_DateTime_): Unit {
    val fnPtr = IScheduledTileNotification_VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(IScheduledTileNotification_Ptr, value,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun get_ExpirationTime(): IReference_DateTime_ {
    val fnPtr = IScheduledTileNotification_VtblPtr!!.getPointer(9L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.IReference_DateTime_.ByReference()
    val hr = fn.invokeHR(arrayOf(IScheduledTileNotification_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun put_Tag(`value`: String): Unit {
    val fnPtr = IScheduledTileNotification_VtblPtr!!.getPointer(10L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val value_Native = value.toHandle()
    val hr = fn.invokeHR(arrayOf(IScheduledTileNotification_Ptr, value_Native,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun get_Tag(): String {
    val fnPtr = IScheduledTileNotification_VtblPtr!!.getPointer(11L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(IScheduledTileNotification_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public fun put_Id(`value`: String): Unit {
    val fnPtr = IScheduledTileNotification_VtblPtr!!.getPointer(12L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val value_Native = value.toHandle()
    val hr = fn.invokeHR(arrayOf(IScheduledTileNotification_Ptr, value_Native,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun get_Id(): String {
    val fnPtr = IScheduledTileNotification_VtblPtr!!.getPointer(13L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(IScheduledTileNotification_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIScheduledTileNotification(pointer.getPointer(0))

    public fun setValue(`value`: IScheduledTileNotification_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IScheduledTileNotification_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IScheduledTileNotification {
    public override val IScheduledTileNotification_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("0abca6d599dc4c78a11cc9e7f86d7ef7")

    public fun makeIScheduledTileNotification(ptr: Pointer?): IScheduledTileNotification =
        IScheduledTileNotification_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IScheduledTileNotification):
        Array<IScheduledTileNotification> = (elements as
        Array<IScheduledTileNotification>).castToImpl<IScheduledTileNotification,IScheduledTileNotification_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IScheduledTileNotification?> =
        arrayOfNulls<IScheduledTileNotification_Impl>(size) as Array<IScheduledTileNotification?>
  }
}

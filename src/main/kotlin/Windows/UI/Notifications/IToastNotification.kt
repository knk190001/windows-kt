package Windows.UI.Notifications

import Windows.Data.Xml.Dom.XmlDocument
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IReference_DateTime_
import Windows.Foundation.TypedEventHandler_ToastNotification_Object_
import Windows.Foundation.TypedEventHandler_ToastNotification_ToastDismissedEventArgs_
import Windows.Foundation.TypedEventHandler_ToastNotification_ToastFailedEventArgs_
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

public interface IToastNotification : NativeMapped, IWinRTInterface {
  public val IToastNotification_Ptr: Pointer?

  public val IToastNotification_VtblPtr: Pointer?
    get() = IToastNotification_Ptr?.getPointer(0)

  public fun get_Content(): XmlDocument {
    val fnPtr = IToastNotification_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Data.Xml.Dom.XmlDocument.ByReference()
    val hr = fn.invokeHR(arrayOf(IToastNotification_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun put_ExpirationTime(`value`: IReference_DateTime_): Unit {
    val fnPtr = IToastNotification_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(IToastNotification_Ptr, value,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun get_ExpirationTime(): IReference_DateTime_ {
    val fnPtr = IToastNotification_VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.IReference_DateTime_.ByReference()
    val hr = fn.invokeHR(arrayOf(IToastNotification_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun add_Dismissed(handler: TypedEventHandler_ToastNotification_ToastDismissedEventArgs_):
      EventRegistrationToken {
    val fnPtr = IToastNotification_VtblPtr!!.getPointer(9L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.EventRegistrationToken.ByReference()
    val hr = fn.invokeHR(arrayOf(IToastNotification_Ptr, handler, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun remove_Dismissed(token: EventRegistrationToken.ByValue): Unit {
    val fnPtr = IToastNotification_VtblPtr!!.getPointer(10L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(IToastNotification_Ptr, token,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun add_Activated(handler: TypedEventHandler_ToastNotification_Object_):
      EventRegistrationToken {
    val fnPtr = IToastNotification_VtblPtr!!.getPointer(11L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.EventRegistrationToken.ByReference()
    val hr = fn.invokeHR(arrayOf(IToastNotification_Ptr, handler, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun remove_Activated(token: EventRegistrationToken.ByValue): Unit {
    val fnPtr = IToastNotification_VtblPtr!!.getPointer(12L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(IToastNotification_Ptr, token,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun add_Failed(handler: TypedEventHandler_ToastNotification_ToastFailedEventArgs_):
      EventRegistrationToken {
    val fnPtr = IToastNotification_VtblPtr!!.getPointer(13L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.EventRegistrationToken.ByReference()
    val hr = fn.invokeHR(arrayOf(IToastNotification_Ptr, handler, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun remove_Failed(token: EventRegistrationToken.ByValue): Unit {
    val fnPtr = IToastNotification_VtblPtr!!.getPointer(14L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(IToastNotification_Ptr, token,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIToastNotification(pointer.getPointer(0))

    public fun setValue(`value`: IToastNotification_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IToastNotification_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IToastNotification {
    public override val IToastNotification_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("997e2675059e4e608b061760917c8b80")

    public fun makeIToastNotification(ptr: Pointer?): IToastNotification =
        IToastNotification_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IToastNotification): Array<IToastNotification> = (elements
        as Array<IToastNotification>).castToImpl<IToastNotification,IToastNotification_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IToastNotification?> =
        arrayOfNulls<IToastNotification_Impl>(size) as Array<IToastNotification?>
  }
}

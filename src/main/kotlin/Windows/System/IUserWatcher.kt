package Windows.System

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler_UserWatcher_Object_
import Windows.Foundation.TypedEventHandler_UserWatcher_UserAuthenticationStatusChangingEventArgs_
import Windows.Foundation.TypedEventHandler_UserWatcher_UserChangedEventArgs_
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

public interface IUserWatcher : NativeMapped, IWinRTInterface {
  public val IUserWatcher_Ptr: Pointer?

  public val IUserWatcher_VtblPtr: Pointer?
    get() = IUserWatcher_Ptr?.getPointer(0)

  public fun get_Status(): UserWatcherStatus {
    val fnPtr = IUserWatcher_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.System.UserWatcherStatus.ByReference()
    val hr = fn.invokeHR(arrayOf(IUserWatcher_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun Start(): Unit {
    val fnPtr = IUserWatcher_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(IUserWatcher_Ptr, ))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun Stop(): Unit {
    val fnPtr = IUserWatcher_VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(IUserWatcher_Ptr, ))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun add_Added(handler: TypedEventHandler_UserWatcher_UserChangedEventArgs_):
      EventRegistrationToken {
    val fnPtr = IUserWatcher_VtblPtr!!.getPointer(9L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.EventRegistrationToken.ByReference()
    val hr = fn.invokeHR(arrayOf(IUserWatcher_Ptr, handler, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun remove_Added(token: EventRegistrationToken.ByValue): Unit {
    val fnPtr = IUserWatcher_VtblPtr!!.getPointer(10L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(IUserWatcher_Ptr, token,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun add_Removed(handler: TypedEventHandler_UserWatcher_UserChangedEventArgs_):
      EventRegistrationToken {
    val fnPtr = IUserWatcher_VtblPtr!!.getPointer(11L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.EventRegistrationToken.ByReference()
    val hr = fn.invokeHR(arrayOf(IUserWatcher_Ptr, handler, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun remove_Removed(token: EventRegistrationToken.ByValue): Unit {
    val fnPtr = IUserWatcher_VtblPtr!!.getPointer(12L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(IUserWatcher_Ptr, token,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun add_Updated(handler: TypedEventHandler_UserWatcher_UserChangedEventArgs_):
      EventRegistrationToken {
    val fnPtr = IUserWatcher_VtblPtr!!.getPointer(13L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.EventRegistrationToken.ByReference()
    val hr = fn.invokeHR(arrayOf(IUserWatcher_Ptr, handler, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun remove_Updated(token: EventRegistrationToken.ByValue): Unit {
    val fnPtr = IUserWatcher_VtblPtr!!.getPointer(14L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(IUserWatcher_Ptr, token,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public
      fun add_AuthenticationStatusChanged(handler: TypedEventHandler_UserWatcher_UserChangedEventArgs_):
      EventRegistrationToken {
    val fnPtr = IUserWatcher_VtblPtr!!.getPointer(15L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.EventRegistrationToken.ByReference()
    val hr = fn.invokeHR(arrayOf(IUserWatcher_Ptr, handler, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun remove_AuthenticationStatusChanged(token: EventRegistrationToken.ByValue): Unit {
    val fnPtr = IUserWatcher_VtblPtr!!.getPointer(16L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(IUserWatcher_Ptr, token,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public
      fun add_AuthenticationStatusChanging(handler: TypedEventHandler_UserWatcher_UserAuthenticationStatusChangingEventArgs_):
      EventRegistrationToken {
    val fnPtr = IUserWatcher_VtblPtr!!.getPointer(17L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.EventRegistrationToken.ByReference()
    val hr = fn.invokeHR(arrayOf(IUserWatcher_Ptr, handler, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun remove_AuthenticationStatusChanging(token: EventRegistrationToken.ByValue): Unit {
    val fnPtr = IUserWatcher_VtblPtr!!.getPointer(18L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(IUserWatcher_Ptr, token,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun add_EnumerationCompleted(handler: TypedEventHandler_UserWatcher_Object_):
      EventRegistrationToken {
    val fnPtr = IUserWatcher_VtblPtr!!.getPointer(19L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.EventRegistrationToken.ByReference()
    val hr = fn.invokeHR(arrayOf(IUserWatcher_Ptr, handler, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun remove_EnumerationCompleted(token: EventRegistrationToken.ByValue): Unit {
    val fnPtr = IUserWatcher_VtblPtr!!.getPointer(20L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(IUserWatcher_Ptr, token,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun add_Stopped(handler: TypedEventHandler_UserWatcher_Object_): EventRegistrationToken {
    val fnPtr = IUserWatcher_VtblPtr!!.getPointer(21L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.EventRegistrationToken.ByReference()
    val hr = fn.invokeHR(arrayOf(IUserWatcher_Ptr, handler, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun remove_Stopped(token: EventRegistrationToken.ByValue): Unit {
    val fnPtr = IUserWatcher_VtblPtr!!.getPointer(22L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(IUserWatcher_Ptr, token,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIUserWatcher(pointer.getPointer(0))

    public fun setValue(`value`: IUserWatcher_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IUserWatcher_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IUserWatcher {
    public override val IUserWatcher_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("155eb23b242a45e0a2e93171fc6a7fbb")

    public fun makeIUserWatcher(ptr: Pointer?): IUserWatcher = IUserWatcher_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IUserWatcher): Array<IUserWatcher> = (elements as
        Array<IUserWatcher>).castToImpl<IUserWatcher,IUserWatcher_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUserWatcher?> =
        arrayOfNulls<IUserWatcher_Impl>(size) as Array<IUserWatcher?>
  }
}

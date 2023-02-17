package Windows.UI.Notifications

import Windows.Foundation.Deferral
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
import com.sun.jna.ptr.ByteByReference
import java.lang.RuntimeException
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit

public interface IScheduledToastNotificationShowingEventArgs : NativeMapped, IWinRTInterface {
  public val IScheduledToastNotificationShowingEventArgs_Ptr: Pointer?

  public val IScheduledToastNotificationShowingEventArgs_VtblPtr: Pointer?
    get() = IScheduledToastNotificationShowingEventArgs_Ptr?.getPointer(0)

  public fun get_Cancel(): Boolean {
    val fnPtr = IScheduledToastNotificationShowingEventArgs_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = ByteByReference()
    val hr = fn.invokeHR(arrayOf(IScheduledToastNotificationShowingEventArgs_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue != 0.toByte()
    return resultValue_Managed
  }

  public fun put_Cancel(`value`: Boolean): Unit {
    val fnPtr = IScheduledToastNotificationShowingEventArgs_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val value_Native: Byte = if(value) 1 else 0 
    val hr = fn.invokeHR(arrayOf(IScheduledToastNotificationShowingEventArgs_Ptr, value_Native,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun get_ScheduledToastNotification(): ScheduledToastNotification {
    val fnPtr = IScheduledToastNotificationShowingEventArgs_VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.UI.Notifications.ScheduledToastNotification.ByReference()
    val hr = fn.invokeHR(arrayOf(IScheduledToastNotificationShowingEventArgs_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun GetDeferral(): Deferral {
    val fnPtr = IScheduledToastNotificationShowingEventArgs_VtblPtr!!.getPointer(9L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.Deferral.ByReference()
    val hr = fn.invokeHR(arrayOf(IScheduledToastNotificationShowingEventArgs_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() =
        ABI.makeIScheduledToastNotificationShowingEventArgs(pointer.getPointer(0))

    public fun setValue(`value`: IScheduledToastNotificationShowingEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IScheduledToastNotificationShowingEventArgs_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IScheduledToastNotificationShowingEventArgs {
    public override val IScheduledToastNotificationShowingEventArgs_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("6173f6b4412a5e2ca6eda0209aef9a09")

    public fun makeIScheduledToastNotificationShowingEventArgs(ptr: Pointer?):
        IScheduledToastNotificationShowingEventArgs =
        IScheduledToastNotificationShowingEventArgs_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IScheduledToastNotificationShowingEventArgs):
        Array<IScheduledToastNotificationShowingEventArgs> = (elements as
        Array<IScheduledToastNotificationShowingEventArgs>).castToImpl<IScheduledToastNotificationShowingEventArgs,IScheduledToastNotificationShowingEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IScheduledToastNotificationShowingEventArgs?> =
        arrayOfNulls<IScheduledToastNotificationShowingEventArgs_Impl>(size) as
        Array<IScheduledToastNotificationShowingEventArgs?>
  }
}

package Windows.UI.Notifications

import Windows.Foundation.DateTime
import Windows.Foundation.Uri
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

public interface IBadgeUpdater : NativeMapped, IWinRTInterface {
  public val IBadgeUpdater_Ptr: Pointer?

  public val IBadgeUpdater_VtblPtr: Pointer?
    get() = IBadgeUpdater_Ptr?.getPointer(0)

  public fun Update(notification: BadgeNotification): Unit {
    val fnPtr = IBadgeUpdater_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(IBadgeUpdater_Ptr, notification,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun Clear(): Unit {
    val fnPtr = IBadgeUpdater_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(IBadgeUpdater_Ptr, ))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun StartPeriodicUpdate(badgeContent: Uri, requestedInterval: PeriodicUpdateRecurrence):
      Unit {
    val fnPtr = IBadgeUpdater_VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(IBadgeUpdater_Ptr, badgeContent, requestedInterval,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun StartPeriodicUpdate(
    badgeContent: Uri,
    startTime: DateTime.ByValue,
    requestedInterval: PeriodicUpdateRecurrence,
  ): Unit {
    val fnPtr = IBadgeUpdater_VtblPtr!!.getPointer(9L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(IBadgeUpdater_Ptr, badgeContent, startTime, requestedInterval,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun StopPeriodicUpdate(): Unit {
    val fnPtr = IBadgeUpdater_VtblPtr!!.getPointer(10L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(IBadgeUpdater_Ptr, ))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIBadgeUpdater(pointer.getPointer(0))

    public fun setValue(`value`: IBadgeUpdater_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IBadgeUpdater_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IBadgeUpdater {
    public override val IBadgeUpdater_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("b5fa1fd475624f6cbfa31b6ed2e57f2f")

    public fun makeIBadgeUpdater(ptr: Pointer?): IBadgeUpdater = IBadgeUpdater_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IBadgeUpdater): Array<IBadgeUpdater> = (elements as
        Array<IBadgeUpdater>).castToImpl<IBadgeUpdater,IBadgeUpdater_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBadgeUpdater?> =
        arrayOfNulls<IBadgeUpdater_Impl>(size) as Array<IBadgeUpdater?>
  }
}

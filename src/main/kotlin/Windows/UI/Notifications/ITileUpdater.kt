package Windows.UI.Notifications

import Windows.Foundation.Collections.IIterable_Uri_
import Windows.Foundation.Collections.IVectorView_ScheduledTileNotification_
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit

public interface ITileUpdater : NativeMapped, IWinRTInterface {
  public val ITileUpdater_Ptr: Pointer?

  public val ITileUpdater_VtblPtr: Pointer?
    get() = ITileUpdater_Ptr?.getPointer(0)

  public fun Update(notification: TileNotification): Unit {
    val fnPtr = ITileUpdater_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(ITileUpdater_Ptr, notification,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun Clear(): Unit {
    val fnPtr = ITileUpdater_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(ITileUpdater_Ptr, ))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun EnableNotificationQueue(enable: Boolean): Unit {
    val fnPtr = ITileUpdater_VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val enable_Native: Byte = if(enable) 1 else 0 
    val hr = fn.invokeHR(arrayOf(ITileUpdater_Ptr, enable_Native,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun get_Setting(): NotificationSetting {
    val fnPtr = ITileUpdater_VtblPtr!!.getPointer(9L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.UI.Notifications.NotificationSetting.ByReference()
    val hr = fn.invokeHR(arrayOf(ITileUpdater_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun AddToSchedule(scheduledTile: ScheduledTileNotification): Unit {
    val fnPtr = ITileUpdater_VtblPtr!!.getPointer(10L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(ITileUpdater_Ptr, scheduledTile,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun RemoveFromSchedule(scheduledTile: ScheduledTileNotification): Unit {
    val fnPtr = ITileUpdater_VtblPtr!!.getPointer(11L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(ITileUpdater_Ptr, scheduledTile,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun GetScheduledTileNotifications(): IVectorView_ScheduledTileNotification_ {
    val fnPtr = ITileUpdater_VtblPtr!!.getPointer(12L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.Collections.IVectorView_ScheduledTileNotification_.ByReference()
    val hr = fn.invokeHR(arrayOf(ITileUpdater_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun StartPeriodicUpdate(tileContent: Uri, requestedInterval: PeriodicUpdateRecurrence):
      Unit {
    val fnPtr = ITileUpdater_VtblPtr!!.getPointer(13L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(ITileUpdater_Ptr, tileContent, requestedInterval,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun StartPeriodicUpdate(
    tileContent: Uri,
    startTime: DateTime.ByValue,
    requestedInterval: PeriodicUpdateRecurrence,
  ): Unit {
    val fnPtr = ITileUpdater_VtblPtr!!.getPointer(14L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(ITileUpdater_Ptr, tileContent, startTime, requestedInterval,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun StopPeriodicUpdate(): Unit {
    val fnPtr = ITileUpdater_VtblPtr!!.getPointer(15L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(ITileUpdater_Ptr, ))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun StartPeriodicUpdateBatch(tileContents: IIterable_Uri_,
      requestedInterval: PeriodicUpdateRecurrence): Unit {
    val fnPtr = ITileUpdater_VtblPtr!!.getPointer(16L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(ITileUpdater_Ptr, tileContents, requestedInterval,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun StartPeriodicUpdateBatch(
    tileContents: IIterable_Uri_,
    startTime: DateTime.ByValue,
    requestedInterval: PeriodicUpdateRecurrence,
  ): Unit {
    val fnPtr = ITileUpdater_VtblPtr!!.getPointer(17L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(ITileUpdater_Ptr, tileContents, startTime, requestedInterval,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeITileUpdater(pointer.getPointer(0))

    public fun setValue(`value`: ITileUpdater_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class ITileUpdater_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), ITileUpdater {
    public override val ITileUpdater_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("0942a48b1d9144ec9243c1e821c29a20")

    public fun makeITileUpdater(ptr: Pointer?): ITileUpdater = ITileUpdater_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: ITileUpdater): Array<ITileUpdater> = (elements as
        Array<ITileUpdater>).castToImpl<ITileUpdater,ITileUpdater_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITileUpdater?> =
        arrayOfNulls<ITileUpdater_Impl>(size) as Array<ITileUpdater?>
  }
}

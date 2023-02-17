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

public interface ITileFlyoutUpdater : NativeMapped, IWinRTInterface {
  public val ITileFlyoutUpdater_Ptr: Pointer?

  public val ITileFlyoutUpdater_VtblPtr: Pointer?
    get() = ITileFlyoutUpdater_Ptr?.getPointer(0)

  public fun Update(notification: TileFlyoutNotification): Unit {
    val fnPtr = ITileFlyoutUpdater_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(ITileFlyoutUpdater_Ptr, notification,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun Clear(): Unit {
    val fnPtr = ITileFlyoutUpdater_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(ITileFlyoutUpdater_Ptr, ))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun StartPeriodicUpdate(tileFlyoutContent: Uri,
      requestedInterval: PeriodicUpdateRecurrence): Unit {
    val fnPtr = ITileFlyoutUpdater_VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(ITileFlyoutUpdater_Ptr, tileFlyoutContent, requestedInterval,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun StartPeriodicUpdate(
    tileFlyoutContent: Uri,
    startTime: DateTime.ByValue,
    requestedInterval: PeriodicUpdateRecurrence,
  ): Unit {
    val fnPtr = ITileFlyoutUpdater_VtblPtr!!.getPointer(9L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(ITileFlyoutUpdater_Ptr, tileFlyoutContent, startTime,
        requestedInterval,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun StopPeriodicUpdate(): Unit {
    val fnPtr = ITileFlyoutUpdater_VtblPtr!!.getPointer(10L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(ITileFlyoutUpdater_Ptr, ))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun get_Setting(): NotificationSetting {
    val fnPtr = ITileFlyoutUpdater_VtblPtr!!.getPointer(11L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.UI.Notifications.NotificationSetting.ByReference()
    val hr = fn.invokeHR(arrayOf(ITileFlyoutUpdater_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeITileFlyoutUpdater(pointer.getPointer(0))

    public fun setValue(`value`: ITileFlyoutUpdater_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class ITileFlyoutUpdater_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), ITileFlyoutUpdater {
    public override val ITileFlyoutUpdater_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("8d40c76ac4654052a7405c2654c1a089")

    public fun makeITileFlyoutUpdater(ptr: Pointer?): ITileFlyoutUpdater =
        ITileFlyoutUpdater_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: ITileFlyoutUpdater): Array<ITileFlyoutUpdater> = (elements
        as Array<ITileFlyoutUpdater>).castToImpl<ITileFlyoutUpdater,ITileFlyoutUpdater_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITileFlyoutUpdater?> =
        arrayOfNulls<ITileFlyoutUpdater_Impl>(size) as Array<ITileFlyoutUpdater?>
  }
}

package Windows.UI.Notifications

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
import kotlin.String
import kotlin.Unit

public interface IToastNotificationHistory : NativeMapped, IWinRTInterface {
  public val IToastNotificationHistory_Ptr: Pointer?

  public val IToastNotificationHistory_VtblPtr: Pointer?
    get() = IToastNotificationHistory_Ptr?.getPointer(0)

  public fun RemoveGroup(group: String): Unit {
    val fnPtr = IToastNotificationHistory_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val group_Native = group.toHandle()
    val hr = fn.invokeHR(arrayOf(IToastNotificationHistory_Ptr, group_Native,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun RemoveGroup(group: String, applicationId: String): Unit {
    val fnPtr = IToastNotificationHistory_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val group_Native = group.toHandle()
    val applicationId_Native = applicationId.toHandle()
    val hr = fn.invokeHR(arrayOf(IToastNotificationHistory_Ptr, group_Native,
        applicationId_Native,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun Remove(
    tag: String,
    group: String,
    applicationId: String,
  ): Unit {
    val fnPtr = IToastNotificationHistory_VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val tag_Native = tag.toHandle()
    val group_Native = group.toHandle()
    val applicationId_Native = applicationId.toHandle()
    val hr = fn.invokeHR(arrayOf(IToastNotificationHistory_Ptr, tag_Native, group_Native,
        applicationId_Native,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun Remove(tag: String, group: String): Unit {
    val fnPtr = IToastNotificationHistory_VtblPtr!!.getPointer(9L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val tag_Native = tag.toHandle()
    val group_Native = group.toHandle()
    val hr = fn.invokeHR(arrayOf(IToastNotificationHistory_Ptr, tag_Native, group_Native,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun Remove(tag: String): Unit {
    val fnPtr = IToastNotificationHistory_VtblPtr!!.getPointer(10L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val tag_Native = tag.toHandle()
    val hr = fn.invokeHR(arrayOf(IToastNotificationHistory_Ptr, tag_Native,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun Clear(): Unit {
    val fnPtr = IToastNotificationHistory_VtblPtr!!.getPointer(11L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(IToastNotificationHistory_Ptr, ))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun Clear(applicationId: String): Unit {
    val fnPtr = IToastNotificationHistory_VtblPtr!!.getPointer(12L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val applicationId_Native = applicationId.toHandle()
    val hr = fn.invokeHR(arrayOf(IToastNotificationHistory_Ptr, applicationId_Native,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIToastNotificationHistory(pointer.getPointer(0))

    public fun setValue(`value`: IToastNotificationHistory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IToastNotificationHistory_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IToastNotificationHistory {
    public override val IToastNotificationHistory_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("5caddc6301d34c97986f0533483fee14")

    public fun makeIToastNotificationHistory(ptr: Pointer?): IToastNotificationHistory =
        IToastNotificationHistory_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IToastNotificationHistory):
        Array<IToastNotificationHistory> = (elements as
        Array<IToastNotificationHistory>).castToImpl<IToastNotificationHistory,IToastNotificationHistory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IToastNotificationHistory?> =
        arrayOfNulls<IToastNotificationHistory_Impl>(size) as Array<IToastNotificationHistory?>
  }
}

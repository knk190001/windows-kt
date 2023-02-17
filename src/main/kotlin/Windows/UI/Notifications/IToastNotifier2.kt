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

public interface IToastNotifier2 : NativeMapped, IWinRTInterface {
  public val IToastNotifier2_Ptr: Pointer?

  public val IToastNotifier2_VtblPtr: Pointer?
    get() = IToastNotifier2_Ptr?.getPointer(0)

  public fun Update(
    `data`: NotificationData,
    tag: String,
    group: String,
  ): NotificationUpdateResult {
    val fnPtr = IToastNotifier2_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val tag_Native = tag.toHandle()
    val group_Native = group.toHandle()
    val result = Windows.UI.Notifications.NotificationUpdateResult.ByReference()
    val hr = fn.invokeHR(arrayOf(IToastNotifier2_Ptr, data, tag_Native, group_Native, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun Update(`data`: NotificationData, tag: String): NotificationUpdateResult {
    val fnPtr = IToastNotifier2_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val tag_Native = tag.toHandle()
    val result = Windows.UI.Notifications.NotificationUpdateResult.ByReference()
    val hr = fn.invokeHR(arrayOf(IToastNotifier2_Ptr, data, tag_Native, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIToastNotifier2(pointer.getPointer(0))

    public fun setValue(`value`: IToastNotifier2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IToastNotifier2_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IToastNotifier2 {
    public override val IToastNotifier2_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("354389c67c014bd59c20604340cd2b74")

    public fun makeIToastNotifier2(ptr: Pointer?): IToastNotifier2 = IToastNotifier2_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IToastNotifier2): Array<IToastNotifier2> = (elements as
        Array<IToastNotifier2>).castToImpl<IToastNotifier2,IToastNotifier2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IToastNotifier2?> =
        arrayOfNulls<IToastNotifier2_Impl>(size) as Array<IToastNotifier2?>
  }
}

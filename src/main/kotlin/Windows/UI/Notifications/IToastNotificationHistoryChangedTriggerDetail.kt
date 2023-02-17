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
import kotlin.Unit

public interface IToastNotificationHistoryChangedTriggerDetail : NativeMapped, IWinRTInterface {
  public val IToastNotificationHistoryChangedTriggerDetail_Ptr: Pointer?

  public val IToastNotificationHistoryChangedTriggerDetail_VtblPtr: Pointer?
    get() = IToastNotificationHistoryChangedTriggerDetail_Ptr?.getPointer(0)

  public fun get_ChangeType(): ToastHistoryChangedType {
    val fnPtr = IToastNotificationHistoryChangedTriggerDetail_VtblPtr!!.getPointer(6L *
        POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.UI.Notifications.ToastHistoryChangedType.ByReference()
    val hr = fn.invokeHR(arrayOf(IToastNotificationHistoryChangedTriggerDetail_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() =
        ABI.makeIToastNotificationHistoryChangedTriggerDetail(pointer.getPointer(0))

    public fun setValue(`value`: IToastNotificationHistoryChangedTriggerDetail_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IToastNotificationHistoryChangedTriggerDetail_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IToastNotificationHistoryChangedTriggerDetail {
    public override val IToastNotificationHistoryChangedTriggerDetail_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("db037ffa0068412c9c83267c37f65670")

    public fun makeIToastNotificationHistoryChangedTriggerDetail(ptr: Pointer?):
        IToastNotificationHistoryChangedTriggerDetail =
        IToastNotificationHistoryChangedTriggerDetail_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IToastNotificationHistoryChangedTriggerDetail):
        Array<IToastNotificationHistoryChangedTriggerDetail> = (elements as
        Array<IToastNotificationHistoryChangedTriggerDetail>).castToImpl<IToastNotificationHistoryChangedTriggerDetail,IToastNotificationHistoryChangedTriggerDetail_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IToastNotificationHistoryChangedTriggerDetail?> =
        arrayOfNulls<IToastNotificationHistoryChangedTriggerDetail_Impl>(size) as
        Array<IToastNotificationHistoryChangedTriggerDetail?>
  }
}

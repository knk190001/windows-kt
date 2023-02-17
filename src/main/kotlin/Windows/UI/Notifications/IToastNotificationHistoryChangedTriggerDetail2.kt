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
import com.sun.jna.platform.win32.WinNT
import java.lang.RuntimeException
import kotlin.Array
import kotlin.Int
import kotlin.String
import kotlin.Unit

public interface IToastNotificationHistoryChangedTriggerDetail2 : NativeMapped, IWinRTInterface {
  public val IToastNotificationHistoryChangedTriggerDetail2_Ptr: Pointer?

  public val IToastNotificationHistoryChangedTriggerDetail2_VtblPtr: Pointer?
    get() = IToastNotificationHistoryChangedTriggerDetail2_Ptr?.getPointer(0)

  public fun get_CollectionId(): String {
    val fnPtr = IToastNotificationHistoryChangedTriggerDetail2_VtblPtr!!.getPointer(6L *
        POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(IToastNotificationHistoryChangedTriggerDetail2_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() =
        ABI.makeIToastNotificationHistoryChangedTriggerDetail2(pointer.getPointer(0))

    public fun setValue(`value`: IToastNotificationHistoryChangedTriggerDetail2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IToastNotificationHistoryChangedTriggerDetail2_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IToastNotificationHistoryChangedTriggerDetail2 {
    public override val IToastNotificationHistoryChangedTriggerDetail2_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("0b36e982c87149fbbabb25bdbc4cc45b")

    public fun makeIToastNotificationHistoryChangedTriggerDetail2(ptr: Pointer?):
        IToastNotificationHistoryChangedTriggerDetail2 =
        IToastNotificationHistoryChangedTriggerDetail2_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IToastNotificationHistoryChangedTriggerDetail2):
        Array<IToastNotificationHistoryChangedTriggerDetail2> = (elements as
        Array<IToastNotificationHistoryChangedTriggerDetail2>).castToImpl<IToastNotificationHistoryChangedTriggerDetail2,IToastNotificationHistoryChangedTriggerDetail2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IToastNotificationHistoryChangedTriggerDetail2?> =
        arrayOfNulls<IToastNotificationHistoryChangedTriggerDetail2_Impl>(size) as
        Array<IToastNotificationHistoryChangedTriggerDetail2?>
  }
}

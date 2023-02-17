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

public interface IToastNotificationManagerStatics2 : NativeMapped, IWinRTInterface {
  public val IToastNotificationManagerStatics2_Ptr: Pointer?

  public val IToastNotificationManagerStatics2_VtblPtr: Pointer?
    get() = IToastNotificationManagerStatics2_Ptr?.getPointer(0)

  public fun get_History(): ToastNotificationHistory {
    val fnPtr = IToastNotificationManagerStatics2_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.UI.Notifications.ToastNotificationHistory.ByReference()
    val hr = fn.invokeHR(arrayOf(IToastNotificationManagerStatics2_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIToastNotificationManagerStatics2(pointer.getPointer(0))

    public fun setValue(`value`: IToastNotificationManagerStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IToastNotificationManagerStatics2_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IToastNotificationManagerStatics2 {
    public override val IToastNotificationManagerStatics2_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("7ab93c520e484750ba9d1a4113981847")

    public fun makeIToastNotificationManagerStatics2(ptr: Pointer?):
        IToastNotificationManagerStatics2 = IToastNotificationManagerStatics2_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IToastNotificationManagerStatics2):
        Array<IToastNotificationManagerStatics2> = (elements as
        Array<IToastNotificationManagerStatics2>).castToImpl<IToastNotificationManagerStatics2,IToastNotificationManagerStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IToastNotificationManagerStatics2?> =
        arrayOfNulls<IToastNotificationManagerStatics2_Impl>(size) as
        Array<IToastNotificationManagerStatics2?>
  }
}

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

public interface IToastNotificationManagerStatics5 : NativeMapped, IWinRTInterface {
  public val IToastNotificationManagerStatics5_Ptr: Pointer?

  public val IToastNotificationManagerStatics5_VtblPtr: Pointer?
    get() = IToastNotificationManagerStatics5_Ptr?.getPointer(0)

  public fun GetDefault(): ToastNotificationManagerForUser {
    val fnPtr = IToastNotificationManagerStatics5_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.UI.Notifications.ToastNotificationManagerForUser.ByReference()
    val hr = fn.invokeHR(arrayOf(IToastNotificationManagerStatics5_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIToastNotificationManagerStatics5(pointer.getPointer(0))

    public fun setValue(`value`: IToastNotificationManagerStatics5_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IToastNotificationManagerStatics5_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IToastNotificationManagerStatics5 {
    public override val IToastNotificationManagerStatics5_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("d6f5f569d40d407c898988cab42cfd14")

    public fun makeIToastNotificationManagerStatics5(ptr: Pointer?):
        IToastNotificationManagerStatics5 = IToastNotificationManagerStatics5_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IToastNotificationManagerStatics5):
        Array<IToastNotificationManagerStatics5> = (elements as
        Array<IToastNotificationManagerStatics5>).castToImpl<IToastNotificationManagerStatics5,IToastNotificationManagerStatics5_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IToastNotificationManagerStatics5?> =
        arrayOfNulls<IToastNotificationManagerStatics5_Impl>(size) as
        Array<IToastNotificationManagerStatics5?>
  }
}

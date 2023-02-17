package Windows.UI.Notifications

import Windows.Foundation.Collections.IVectorView_ToastNotification_
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

public interface IToastNotificationHistory2 : NativeMapped, IWinRTInterface {
  public val IToastNotificationHistory2_Ptr: Pointer?

  public val IToastNotificationHistory2_VtblPtr: Pointer?
    get() = IToastNotificationHistory2_Ptr?.getPointer(0)

  public fun GetHistory(): IVectorView_ToastNotification_ {
    val fnPtr = IToastNotificationHistory2_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.Collections.IVectorView_ToastNotification_.ByReference()
    val hr = fn.invokeHR(arrayOf(IToastNotificationHistory2_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun GetHistory(applicationId: String): IVectorView_ToastNotification_ {
    val fnPtr = IToastNotificationHistory2_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val applicationId_Native = applicationId.toHandle()
    val result = Windows.Foundation.Collections.IVectorView_ToastNotification_.ByReference()
    val hr = fn.invokeHR(arrayOf(IToastNotificationHistory2_Ptr, applicationId_Native, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIToastNotificationHistory2(pointer.getPointer(0))

    public fun setValue(`value`: IToastNotificationHistory2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IToastNotificationHistory2_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IToastNotificationHistory2 {
    public override val IToastNotificationHistory2_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("3bc3d2532f31409291298ad5abf067da")

    public fun makeIToastNotificationHistory2(ptr: Pointer?): IToastNotificationHistory2 =
        IToastNotificationHistory2_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IToastNotificationHistory2):
        Array<IToastNotificationHistory2> = (elements as
        Array<IToastNotificationHistory2>).castToImpl<IToastNotificationHistory2,IToastNotificationHistory2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IToastNotificationHistory2?> =
        arrayOfNulls<IToastNotificationHistory2_Impl>(size) as Array<IToastNotificationHistory2?>
  }
}

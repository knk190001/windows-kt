package Windows.UI.Notifications

import Windows.Foundation.Collections.ValueSet
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

public interface IToastNotificationActionTriggerDetail : NativeMapped, IWinRTInterface {
  public val IToastNotificationActionTriggerDetail_Ptr: Pointer?

  public val IToastNotificationActionTriggerDetail_VtblPtr: Pointer?
    get() = IToastNotificationActionTriggerDetail_Ptr?.getPointer(0)

  public fun get_Argument(): String {
    val fnPtr = IToastNotificationActionTriggerDetail_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(IToastNotificationActionTriggerDetail_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public fun get_UserInput(): ValueSet {
    val fnPtr = IToastNotificationActionTriggerDetail_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.Collections.ValueSet.ByReference()
    val hr = fn.invokeHR(arrayOf(IToastNotificationActionTriggerDetail_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIToastNotificationActionTriggerDetail(pointer.getPointer(0))

    public fun setValue(`value`: IToastNotificationActionTriggerDetail_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IToastNotificationActionTriggerDetail_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IToastNotificationActionTriggerDetail {
    public override val IToastNotificationActionTriggerDetail_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("9445135a38f342f696aa7955b0f03da2")

    public fun makeIToastNotificationActionTriggerDetail(ptr: Pointer?):
        IToastNotificationActionTriggerDetail = IToastNotificationActionTriggerDetail_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IToastNotificationActionTriggerDetail):
        Array<IToastNotificationActionTriggerDetail> = (elements as
        Array<IToastNotificationActionTriggerDetail>).castToImpl<IToastNotificationActionTriggerDetail,IToastNotificationActionTriggerDetail_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IToastNotificationActionTriggerDetail?> =
        arrayOfNulls<IToastNotificationActionTriggerDetail_Impl>(size) as
        Array<IToastNotificationActionTriggerDetail?>
  }
}

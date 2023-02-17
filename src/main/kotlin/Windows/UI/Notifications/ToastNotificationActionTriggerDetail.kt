package Windows.UI.Notifications

import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.interfaces.IUnknownVtbl
import com.github.knk190001.winrtbinding.runtime.interfaces.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.interfaces.IWinRTObject
import com.github.knk190001.winrtbinding.runtime.interfaces.getValue
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import kotlin.Array
import kotlin.Unit

public class ToastNotificationActionTriggerDetail(
  ptr: Pointer? = Pointer.NULL,
) : PointerType(ptr), IToastNotificationActionTriggerDetail, IWinRTObject {
  public val IToastNotificationActionTriggerDetail_Interface: IToastNotificationActionTriggerDetail
      by lazy {
    asIToastNotificationActionTriggerDetail()
  }


  public override val IToastNotificationActionTriggerDetail_Ptr: Pointer? by lazy {
    IToastNotificationActionTriggerDetail_Interface.IToastNotificationActionTriggerDetail_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(IToastNotificationActionTriggerDetail_Interface)

  private fun asIToastNotificationActionTriggerDetail(): IToastNotificationActionTriggerDetail {
    if(pointer == Pointer.NULL) {
      return(IToastNotificationActionTriggerDetail.ABI.makeIToastNotificationActionTriggerDetail(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IToastNotificationActionTriggerDetail.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IToastNotificationActionTriggerDetail.ABI.makeIToastNotificationActionTriggerDetail(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue(): ToastNotificationActionTriggerDetail =
        ToastNotificationActionTriggerDetail(pointer.getPointer(0))

    public fun setValue(`value`: ToastNotificationActionTriggerDetail): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI
}

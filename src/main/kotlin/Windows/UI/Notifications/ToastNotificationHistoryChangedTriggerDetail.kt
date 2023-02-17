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

public class ToastNotificationHistoryChangedTriggerDetail(
  ptr: Pointer? = Pointer.NULL,
) : PointerType(ptr), IToastNotificationHistoryChangedTriggerDetail,
    IToastNotificationHistoryChangedTriggerDetail2, IWinRTObject {
  public val IToastNotificationHistoryChangedTriggerDetail_Interface:
      IToastNotificationHistoryChangedTriggerDetail by lazy {
    asIToastNotificationHistoryChangedTriggerDetail()
  }


  public val IToastNotificationHistoryChangedTriggerDetail2_Interface:
      IToastNotificationHistoryChangedTriggerDetail2 by lazy {
    asIToastNotificationHistoryChangedTriggerDetail2()
  }


  public override val IToastNotificationHistoryChangedTriggerDetail_Ptr: Pointer? by lazy {
    IToastNotificationHistoryChangedTriggerDetail_Interface.IToastNotificationHistoryChangedTriggerDetail_Ptr
  }


  public override val IToastNotificationHistoryChangedTriggerDetail2_Ptr: Pointer? by lazy {
    IToastNotificationHistoryChangedTriggerDetail2_Interface.IToastNotificationHistoryChangedTriggerDetail2_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(IToastNotificationHistoryChangedTriggerDetail_Interface,
        IToastNotificationHistoryChangedTriggerDetail2_Interface)

  private fun asIToastNotificationHistoryChangedTriggerDetail():
      IToastNotificationHistoryChangedTriggerDetail {
    if(pointer == Pointer.NULL) {
      return(IToastNotificationHistoryChangedTriggerDetail.ABI.makeIToastNotificationHistoryChangedTriggerDetail(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IToastNotificationHistoryChangedTriggerDetail.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IToastNotificationHistoryChangedTriggerDetail.ABI.makeIToastNotificationHistoryChangedTriggerDetail(ref.value))
  }

  private fun asIToastNotificationHistoryChangedTriggerDetail2():
      IToastNotificationHistoryChangedTriggerDetail2 {
    if(pointer == Pointer.NULL) {
      return(IToastNotificationHistoryChangedTriggerDetail2.ABI.makeIToastNotificationHistoryChangedTriggerDetail2(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IToastNotificationHistoryChangedTriggerDetail2.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IToastNotificationHistoryChangedTriggerDetail2.ABI.makeIToastNotificationHistoryChangedTriggerDetail2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue(): ToastNotificationHistoryChangedTriggerDetail =
        ToastNotificationHistoryChangedTriggerDetail(pointer.getPointer(0))

    public fun setValue(`value`: ToastNotificationHistoryChangedTriggerDetail): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI
}

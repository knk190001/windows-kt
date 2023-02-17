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

public class ToastNotificationHistory(
  ptr: Pointer? = Pointer.NULL,
) : PointerType(ptr), IToastNotificationHistory2, IToastNotificationHistory, IWinRTObject {
  public val IToastNotificationHistory2_Interface: IToastNotificationHistory2 by lazy {
    asIToastNotificationHistory2()
  }


  public val IToastNotificationHistory_Interface: IToastNotificationHistory by lazy {
    asIToastNotificationHistory()
  }


  public override val IToastNotificationHistory2_Ptr: Pointer? by lazy {
    IToastNotificationHistory2_Interface.IToastNotificationHistory2_Ptr
  }


  public override val IToastNotificationHistory_Ptr: Pointer? by lazy {
    IToastNotificationHistory_Interface.IToastNotificationHistory_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(IToastNotificationHistory2_Interface, IToastNotificationHistory_Interface)

  private fun asIToastNotificationHistory2(): IToastNotificationHistory2 {
    if(pointer == Pointer.NULL) {
      return(IToastNotificationHistory2.ABI.makeIToastNotificationHistory2(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IToastNotificationHistory2.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IToastNotificationHistory2.ABI.makeIToastNotificationHistory2(ref.value))
  }

  private fun asIToastNotificationHistory(): IToastNotificationHistory {
    if(pointer == Pointer.NULL) {
      return(IToastNotificationHistory.ABI.makeIToastNotificationHistory(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IToastNotificationHistory.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IToastNotificationHistory.ABI.makeIToastNotificationHistory(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue(): ToastNotificationHistory =
        ToastNotificationHistory(pointer.getPointer(0))

    public fun setValue(`value`: ToastNotificationHistory): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI
}

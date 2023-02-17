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

public class NotificationBinding(
  ptr: Pointer? = Pointer.NULL,
) : PointerType(ptr), INotificationBinding, IWinRTObject {
  public val INotificationBinding_Interface: INotificationBinding by lazy {
    asINotificationBinding()
  }


  public override val INotificationBinding_Ptr: Pointer? by lazy {
    INotificationBinding_Interface.INotificationBinding_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(INotificationBinding_Interface)

  private fun asINotificationBinding(): INotificationBinding {
    if(pointer == Pointer.NULL) {
      return(INotificationBinding.ABI.makeINotificationBinding(Pointer.NULL))
    }
    val refiid = Guid.REFIID(INotificationBinding.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(INotificationBinding.ABI.makeINotificationBinding(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue(): NotificationBinding = NotificationBinding(pointer.getPointer(0))

    public fun setValue(`value`: NotificationBinding): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI
}

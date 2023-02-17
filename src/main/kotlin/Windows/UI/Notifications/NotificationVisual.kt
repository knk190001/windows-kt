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

public class NotificationVisual(
  ptr: Pointer? = Pointer.NULL,
) : PointerType(ptr), INotificationVisual, IWinRTObject {
  public val INotificationVisual_Interface: INotificationVisual by lazy {
    asINotificationVisual()
  }


  public override val INotificationVisual_Ptr: Pointer? by lazy {
    INotificationVisual_Interface.INotificationVisual_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(INotificationVisual_Interface)

  private fun asINotificationVisual(): INotificationVisual {
    if(pointer == Pointer.NULL) {
      return(INotificationVisual.ABI.makeINotificationVisual(Pointer.NULL))
    }
    val refiid = Guid.REFIID(INotificationVisual.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(INotificationVisual.ABI.makeINotificationVisual(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue(): NotificationVisual = NotificationVisual(pointer.getPointer(0))

    public fun setValue(`value`: NotificationVisual): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI
}

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

public class UserNotification(
  ptr: Pointer? = Pointer.NULL,
) : PointerType(ptr), IUserNotification, IWinRTObject {
  public val IUserNotification_Interface: IUserNotification by lazy {
    asIUserNotification()
  }


  public override val IUserNotification_Ptr: Pointer? by lazy {
    IUserNotification_Interface.IUserNotification_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(IUserNotification_Interface)

  private fun asIUserNotification(): IUserNotification {
    if(pointer == Pointer.NULL) {
      return(IUserNotification.ABI.makeIUserNotification(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IUserNotification.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUserNotification.ABI.makeIUserNotification(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue(): UserNotification = UserNotification(pointer.getPointer(0))

    public fun setValue(`value`: UserNotification): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI
}

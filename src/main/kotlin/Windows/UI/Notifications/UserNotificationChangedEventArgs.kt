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

public class UserNotificationChangedEventArgs(
  ptr: Pointer? = Pointer.NULL,
) : PointerType(ptr), IUserNotificationChangedEventArgs, IWinRTObject {
  public val IUserNotificationChangedEventArgs_Interface: IUserNotificationChangedEventArgs by
      lazy {
    asIUserNotificationChangedEventArgs()
  }


  public override val IUserNotificationChangedEventArgs_Ptr: Pointer? by lazy {
    IUserNotificationChangedEventArgs_Interface.IUserNotificationChangedEventArgs_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(IUserNotificationChangedEventArgs_Interface)

  private fun asIUserNotificationChangedEventArgs(): IUserNotificationChangedEventArgs {
    if(pointer == Pointer.NULL) {
      return(IUserNotificationChangedEventArgs.ABI.makeIUserNotificationChangedEventArgs(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IUserNotificationChangedEventArgs.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUserNotificationChangedEventArgs.ABI.makeIUserNotificationChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue(): UserNotificationChangedEventArgs =
        UserNotificationChangedEventArgs(pointer.getPointer(0))

    public fun setValue(`value`: UserNotificationChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI
}

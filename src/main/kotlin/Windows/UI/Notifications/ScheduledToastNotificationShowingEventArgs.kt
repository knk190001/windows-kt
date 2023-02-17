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

public class ScheduledToastNotificationShowingEventArgs(
  ptr: Pointer? = Pointer.NULL,
) : PointerType(ptr), IScheduledToastNotificationShowingEventArgs, IWinRTObject {
  public val IScheduledToastNotificationShowingEventArgs_Interface:
      IScheduledToastNotificationShowingEventArgs by lazy {
    asIScheduledToastNotificationShowingEventArgs()
  }


  public override val IScheduledToastNotificationShowingEventArgs_Ptr: Pointer? by lazy {
    IScheduledToastNotificationShowingEventArgs_Interface.IScheduledToastNotificationShowingEventArgs_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(IScheduledToastNotificationShowingEventArgs_Interface)

  private fun asIScheduledToastNotificationShowingEventArgs():
      IScheduledToastNotificationShowingEventArgs {
    if(pointer == Pointer.NULL) {
      return(IScheduledToastNotificationShowingEventArgs.ABI.makeIScheduledToastNotificationShowingEventArgs(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IScheduledToastNotificationShowingEventArgs.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IScheduledToastNotificationShowingEventArgs.ABI.makeIScheduledToastNotificationShowingEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue(): ScheduledToastNotificationShowingEventArgs =
        ScheduledToastNotificationShowingEventArgs(pointer.getPointer(0))

    public fun setValue(`value`: ScheduledToastNotificationShowingEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI
}

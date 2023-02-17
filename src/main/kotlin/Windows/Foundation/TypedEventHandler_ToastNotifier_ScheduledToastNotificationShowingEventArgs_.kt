package Windows.Foundation

import Windows.UI.Notifications.ScheduledToastNotificationShowingEventArgs
import Windows.UI.Notifications.ToastNotifier
import com.github.knk190001.winrtbinding.runtime.interfaces.Delegate
import com.github.knk190001.winrtbinding.runtime.interfaces.getValue
import com.sun.jna.Memory
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.platform.win32.Guid
import com.sun.jna.platform.win32.WinNT
import com.sun.jna.win32.StdCallLibrary
import kotlin.Unit

public typealias TypedEventHandler_ToastNotifier_ScheduledToastNotificationShowingEventArgs_Body =
    TypedEventHandler_ToastNotifier_ScheduledToastNotificationShowingEventArgs_.(sender: ToastNotifier,
    args: ScheduledToastNotificationShowingEventArgs) -> Unit

public class TypedEventHandler_ToastNotifier_ScheduledToastNotificationShowingEventArgs_(
  ptr: Pointer? = Pointer.NULL,
) :
    Delegate<TypedEventHandler_ToastNotifier_ScheduledToastNotificationShowingEventArgs_.Native>(ptr)
    {
  public fun invoke(sender: ToastNotifier, args: ScheduledToastNotificationShowingEventArgs): Unit {
    delegateStruct.fn!!.invoke(this.pointer,sender, args)
  }

  public companion object {
    public
        fun create(fn: TypedEventHandler_ToastNotifier_ScheduledToastNotificationShowingEventArgs_Body):
        TypedEventHandler_ToastNotifier_ScheduledToastNotificationShowingEventArgs_ {
      val nativeFn = Native { 
          thisPtr: Pointer,
          sender: ToastNotifier,
          args: ScheduledToastNotificationShowingEventArgs,
           ->
        val thisObj = TypedEventHandler_ToastNotifier_ScheduledToastNotificationShowingEventArgs_()
        fn(thisObj, sender, args)
        WinNT.HRESULT(0)
      }
      val newDelegate =
          TypedEventHandler_ToastNotifier_ScheduledToastNotificationShowingEventArgs_(Memory(12))
      newDelegate.init(listOf(ABI.PIID), nativeFn)
      return newDelegate
    }
  }

  public fun interface Native : StdCallLibrary.StdCallCallback {
    public fun invoke(
      thisPtr: Pointer,
      sender: ToastNotifier,
      args: ScheduledToastNotificationShowingEventArgs,
    ): WinNT.HRESULT
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue():
        TypedEventHandler_ToastNotifier_ScheduledToastNotificationShowingEventArgs_ =
        TypedEventHandler_ToastNotifier_ScheduledToastNotificationShowingEventArgs_(pointer.getPointer(0))

    public
        fun setValue(`delegate`: TypedEventHandler_ToastNotifier_ScheduledToastNotificationShowingEventArgs_):
        Unit {
      pointer.setPointer(0, delegate.pointer)
    }
  }

  public object ABI {
    public val PIID: Guid.IID = Guid.IID("b1bb0cabf8b95909a872ef29e05a8c7a")

    public val IID: Guid.IID = Guid.IID("9de1c5346ae111e084e118a905bcc53f")
  }
}

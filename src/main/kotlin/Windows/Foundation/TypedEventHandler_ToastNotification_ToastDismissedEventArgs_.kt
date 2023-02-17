package Windows.Foundation

import Windows.UI.Notifications.ToastDismissedEventArgs
import Windows.UI.Notifications.ToastNotification
import com.github.knk190001.winrtbinding.runtime.interfaces.Delegate
import com.github.knk190001.winrtbinding.runtime.interfaces.getValue
import com.sun.jna.Memory
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.platform.win32.Guid
import com.sun.jna.platform.win32.WinNT
import com.sun.jna.win32.StdCallLibrary
import kotlin.Unit

public typealias TypedEventHandler_ToastNotification_ToastDismissedEventArgs_Body =
    TypedEventHandler_ToastNotification_ToastDismissedEventArgs_.(sender: ToastNotification,
    args: ToastDismissedEventArgs) -> Unit

public class TypedEventHandler_ToastNotification_ToastDismissedEventArgs_(
  ptr: Pointer? = Pointer.NULL,
) : Delegate<TypedEventHandler_ToastNotification_ToastDismissedEventArgs_.Native>(ptr) {
  public fun invoke(sender: ToastNotification, args: ToastDismissedEventArgs): Unit {
    delegateStruct.fn!!.invoke(this.pointer,sender, args)
  }

  public companion object {
    public fun create(fn: TypedEventHandler_ToastNotification_ToastDismissedEventArgs_Body):
        TypedEventHandler_ToastNotification_ToastDismissedEventArgs_ {
      val nativeFn = Native { 
          thisPtr: Pointer,
          sender: ToastNotification,
          args: ToastDismissedEventArgs,
           ->
        val thisObj = TypedEventHandler_ToastNotification_ToastDismissedEventArgs_()
        fn(thisObj, sender, args)
        WinNT.HRESULT(0)
      }
      val newDelegate = TypedEventHandler_ToastNotification_ToastDismissedEventArgs_(Memory(12))
      newDelegate.init(listOf(ABI.PIID), nativeFn)
      return newDelegate
    }
  }

  public fun interface Native : StdCallLibrary.StdCallCallback {
    public fun invoke(
      thisPtr: Pointer,
      sender: ToastNotification,
      args: ToastDismissedEventArgs,
    ): WinNT.HRESULT
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue(): TypedEventHandler_ToastNotification_ToastDismissedEventArgs_ =
        TypedEventHandler_ToastNotification_ToastDismissedEventArgs_(pointer.getPointer(0))

    public fun setValue(`delegate`: TypedEventHandler_ToastNotification_ToastDismissedEventArgs_):
        Unit {
      pointer.setPointer(0, delegate.pointer)
    }
  }

  public object ABI {
    public val PIID: Guid.IID = Guid.IID("61c2402f0ed05a18ab6959f4aa99a368")

    public val IID: Guid.IID = Guid.IID("9de1c5346ae111e084e118a905bcc53f")
  }
}

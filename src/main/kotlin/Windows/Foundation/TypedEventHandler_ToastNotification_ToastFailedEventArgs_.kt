package Windows.Foundation

import Windows.UI.Notifications.ToastFailedEventArgs
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

public typealias TypedEventHandler_ToastNotification_ToastFailedEventArgs_Body =
    TypedEventHandler_ToastNotification_ToastFailedEventArgs_.(sender: ToastNotification,
    args: ToastFailedEventArgs) -> Unit

public class TypedEventHandler_ToastNotification_ToastFailedEventArgs_(
  ptr: Pointer? = Pointer.NULL,
) : Delegate<TypedEventHandler_ToastNotification_ToastFailedEventArgs_.Native>(ptr) {
  public fun invoke(sender: ToastNotification, args: ToastFailedEventArgs): Unit {
    delegateStruct.fn!!.invoke(this.pointer,sender, args)
  }

  public companion object {
    public fun create(fn: TypedEventHandler_ToastNotification_ToastFailedEventArgs_Body):
        TypedEventHandler_ToastNotification_ToastFailedEventArgs_ {
      val nativeFn = Native { 
          thisPtr: Pointer,
          sender: ToastNotification,
          args: ToastFailedEventArgs,
           ->
        val thisObj = TypedEventHandler_ToastNotification_ToastFailedEventArgs_()
        fn(thisObj, sender, args)
        WinNT.HRESULT(0)
      }
      val newDelegate = TypedEventHandler_ToastNotification_ToastFailedEventArgs_(Memory(12))
      newDelegate.init(listOf(ABI.PIID), nativeFn)
      return newDelegate
    }
  }

  public fun interface Native : StdCallLibrary.StdCallCallback {
    public fun invoke(
      thisPtr: Pointer,
      sender: ToastNotification,
      args: ToastFailedEventArgs,
    ): WinNT.HRESULT
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue(): TypedEventHandler_ToastNotification_ToastFailedEventArgs_ =
        TypedEventHandler_ToastNotification_ToastFailedEventArgs_(pointer.getPointer(0))

    public fun setValue(`delegate`: TypedEventHandler_ToastNotification_ToastFailedEventArgs_):
        Unit {
      pointer.setPointer(0, delegate.pointer)
    }
  }

  public object ABI {
    public val PIID: Guid.IID = Guid.IID("95e3e803c9695e3a9753ea2ad22a9a33")

    public val IID: Guid.IID = Guid.IID("9de1c5346ae111e084e118a905bcc53f")
  }
}

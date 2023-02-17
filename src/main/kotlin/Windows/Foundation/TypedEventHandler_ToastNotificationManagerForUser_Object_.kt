package Windows.Foundation

import Windows.UI.Notifications.ToastNotificationManagerForUser
import com.github.knk190001.winrtbinding.runtime.interfaces.Delegate
import com.github.knk190001.winrtbinding.runtime.interfaces.getValue
import com.sun.jna.Memory
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.platform.win32.COM.Unknown
import com.sun.jna.platform.win32.Guid
import com.sun.jna.platform.win32.WinNT
import com.sun.jna.win32.StdCallLibrary
import kotlin.Unit

public typealias TypedEventHandler_ToastNotificationManagerForUser_Object_Body =
    TypedEventHandler_ToastNotificationManagerForUser_Object_.(sender: ToastNotificationManagerForUser,
    args: Unknown) -> Unit

public class TypedEventHandler_ToastNotificationManagerForUser_Object_(
  ptr: Pointer? = Pointer.NULL,
) : Delegate<TypedEventHandler_ToastNotificationManagerForUser_Object_.Native>(ptr) {
  public fun invoke(sender: ToastNotificationManagerForUser, args: Unknown): Unit {
    delegateStruct.fn!!.invoke(this.pointer,sender, args)
  }

  public companion object {
    public fun create(fn: TypedEventHandler_ToastNotificationManagerForUser_Object_Body):
        TypedEventHandler_ToastNotificationManagerForUser_Object_ {
      val nativeFn = Native { 
          thisPtr: Pointer,
          sender: ToastNotificationManagerForUser,
          args: Unknown,
           ->
        val thisObj = TypedEventHandler_ToastNotificationManagerForUser_Object_()
        fn(thisObj, sender, args)
        WinNT.HRESULT(0)
      }
      val newDelegate = TypedEventHandler_ToastNotificationManagerForUser_Object_(Memory(12))
      newDelegate.init(listOf(ABI.PIID), nativeFn)
      return newDelegate
    }
  }

  public fun interface Native : StdCallLibrary.StdCallCallback {
    public fun invoke(
      thisPtr: Pointer,
      sender: ToastNotificationManagerForUser,
      args: Unknown,
    ): WinNT.HRESULT
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue(): TypedEventHandler_ToastNotificationManagerForUser_Object_ =
        TypedEventHandler_ToastNotificationManagerForUser_Object_(pointer.getPointer(0))

    public fun setValue(`delegate`: TypedEventHandler_ToastNotificationManagerForUser_Object_):
        Unit {
      pointer.setPointer(0, delegate.pointer)
    }
  }

  public object ABI {
    public val PIID: Guid.IID = Guid.IID("821bdf6b029a529993f33077b2ee5e33")

    public val IID: Guid.IID = Guid.IID("9de1c5346ae111e084e118a905bcc53f")
  }
}

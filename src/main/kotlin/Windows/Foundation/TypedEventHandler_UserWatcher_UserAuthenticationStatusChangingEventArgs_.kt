package Windows.Foundation

import Windows.System.UserAuthenticationStatusChangingEventArgs
import Windows.System.UserWatcher
import com.github.knk190001.winrtbinding.runtime.interfaces.Delegate
import com.github.knk190001.winrtbinding.runtime.interfaces.getValue
import com.sun.jna.Memory
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.platform.win32.Guid
import com.sun.jna.platform.win32.WinNT
import com.sun.jna.win32.StdCallLibrary
import kotlin.Unit

public typealias TypedEventHandler_UserWatcher_UserAuthenticationStatusChangingEventArgs_Body =
    TypedEventHandler_UserWatcher_UserAuthenticationStatusChangingEventArgs_.(sender: UserWatcher,
    args: UserAuthenticationStatusChangingEventArgs) -> Unit

public class TypedEventHandler_UserWatcher_UserAuthenticationStatusChangingEventArgs_(
  ptr: Pointer? = Pointer.NULL,
) : Delegate<TypedEventHandler_UserWatcher_UserAuthenticationStatusChangingEventArgs_.Native>(ptr) {
  public fun invoke(sender: UserWatcher, args: UserAuthenticationStatusChangingEventArgs): Unit {
    delegateStruct.fn!!.invoke(this.pointer,sender, args)
  }

  public companion object {
    public
        fun create(fn: TypedEventHandler_UserWatcher_UserAuthenticationStatusChangingEventArgs_Body):
        TypedEventHandler_UserWatcher_UserAuthenticationStatusChangingEventArgs_ {
      val nativeFn = Native { 
          thisPtr: Pointer,
          sender: UserWatcher,
          args: UserAuthenticationStatusChangingEventArgs,
           ->
        val thisObj = TypedEventHandler_UserWatcher_UserAuthenticationStatusChangingEventArgs_()
        fn(thisObj, sender, args)
        WinNT.HRESULT(0)
      }
      val newDelegate =
          TypedEventHandler_UserWatcher_UserAuthenticationStatusChangingEventArgs_(Memory(12))
      newDelegate.init(listOf(ABI.PIID), nativeFn)
      return newDelegate
    }
  }

  public fun interface Native : StdCallLibrary.StdCallCallback {
    public fun invoke(
      thisPtr: Pointer,
      sender: UserWatcher,
      args: UserAuthenticationStatusChangingEventArgs,
    ): WinNT.HRESULT
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue(): TypedEventHandler_UserWatcher_UserAuthenticationStatusChangingEventArgs_
        =
        TypedEventHandler_UserWatcher_UserAuthenticationStatusChangingEventArgs_(pointer.getPointer(0))

    public
        fun setValue(`delegate`: TypedEventHandler_UserWatcher_UserAuthenticationStatusChangingEventArgs_):
        Unit {
      pointer.setPointer(0, delegate.pointer)
    }
  }

  public object ABI {
    public val PIID: Guid.IID = Guid.IID("9ec3d9d5b41351df8c64640e3356e351")

    public val IID: Guid.IID = Guid.IID("9de1c5346ae111e084e118a905bcc53f")
  }
}

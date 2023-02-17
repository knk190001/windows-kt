package Windows.Foundation

import Windows.System.UserWatcher
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

public typealias TypedEventHandler_UserWatcher_Object_Body =
    TypedEventHandler_UserWatcher_Object_.(sender: UserWatcher, args: Unknown) -> Unit

public class TypedEventHandler_UserWatcher_Object_(
  ptr: Pointer? = Pointer.NULL,
) : Delegate<TypedEventHandler_UserWatcher_Object_.Native>(ptr) {
  public fun invoke(sender: UserWatcher, args: Unknown): Unit {
    delegateStruct.fn!!.invoke(this.pointer,sender, args)
  }

  public companion object {
    public fun create(fn: TypedEventHandler_UserWatcher_Object_Body):
        TypedEventHandler_UserWatcher_Object_ {
      val nativeFn = Native { 
          thisPtr: Pointer,
          sender: UserWatcher,
          args: Unknown,
           ->
        val thisObj = TypedEventHandler_UserWatcher_Object_()
        fn(thisObj, sender, args)
        WinNT.HRESULT(0)
      }
      val newDelegate = TypedEventHandler_UserWatcher_Object_(Memory(12))
      newDelegate.init(listOf(ABI.PIID), nativeFn)
      return newDelegate
    }
  }

  public fun interface Native : StdCallLibrary.StdCallCallback {
    public fun invoke(
      thisPtr: Pointer,
      sender: UserWatcher,
      args: Unknown,
    ): WinNT.HRESULT
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue(): TypedEventHandler_UserWatcher_Object_ =
        TypedEventHandler_UserWatcher_Object_(pointer.getPointer(0))

    public fun setValue(`delegate`: TypedEventHandler_UserWatcher_Object_): Unit {
      pointer.setPointer(0, delegate.pointer)
    }
  }

  public object ABI {
    public val PIID: Guid.IID = Guid.IID("f155e0ffdbb55c34ac0c7e291e3300ab")

    public val IID: Guid.IID = Guid.IID("9de1c5346ae111e084e118a905bcc53f")
  }
}

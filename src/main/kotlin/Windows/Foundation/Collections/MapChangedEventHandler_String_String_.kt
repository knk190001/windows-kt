package Windows.Foundation.Collections

import com.github.knk190001.winrtbinding.runtime.interfaces.Delegate
import com.github.knk190001.winrtbinding.runtime.interfaces.getValue
import com.sun.jna.Memory
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.platform.win32.Guid
import com.sun.jna.platform.win32.WinNT
import com.sun.jna.win32.StdCallLibrary
import kotlin.Unit

public typealias MapChangedEventHandler_String_String_Body =
    MapChangedEventHandler_String_String_.(sender: IObservableMap_String_String_,
    event: IMapChangedEventArgs_String_) -> Unit

public class MapChangedEventHandler_String_String_(
  ptr: Pointer? = Pointer.NULL,
) : Delegate<MapChangedEventHandler_String_String_.Native>(ptr) {
  public fun invoke(sender: IObservableMap_String_String_, event: IMapChangedEventArgs_String_):
      Unit {
    delegateStruct.fn!!.invoke(this.pointer,sender.toNative() as Pointer, event.toNative() as
        Pointer)
  }

  public companion object {
    public fun create(fn: MapChangedEventHandler_String_String_Body):
        MapChangedEventHandler_String_String_ {
      val nativeFn = Native { 
          thisPtr: Pointer,
          sender: Pointer,
          event: Pointer,
           ->
        val thisObj = MapChangedEventHandler_String_String_()
        fn(thisObj, IObservableMap_String_String_.ABI.makeIObservableMap_String_String_(sender),
            IMapChangedEventArgs_String_.ABI.makeIMapChangedEventArgs_String_(event))
        WinNT.HRESULT(0)
      }
      val newDelegate = MapChangedEventHandler_String_String_(Memory(12))
      newDelegate.init(listOf(ABI.PIID), nativeFn)
      return newDelegate
    }
  }

  public fun interface Native : StdCallLibrary.StdCallCallback {
    public fun invoke(
      thisPtr: Pointer,
      sender: Pointer,
      event: Pointer,
    ): WinNT.HRESULT
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue(): MapChangedEventHandler_String_String_ =
        MapChangedEventHandler_String_String_(pointer.getPointer(0))

    public fun setValue(`delegate`: MapChangedEventHandler_String_String_): Unit {
      pointer.setPointer(0, delegate.pointer)
    }
  }

  public object ABI {
    public val PIID: Guid.IID = Guid.IID("e2663f372e1b500cad68c3ed7a8f74c8")

    public val IID: Guid.IID = Guid.IID("179517f394ee41f8bddc768a895544f3")
  }
}
package Windows.Foundation

import com.github.knk190001.winrtbinding.runtime.interfaces.Delegate
import com.github.knk190001.winrtbinding.runtime.interfaces.getValue
import com.sun.jna.Memory
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.platform.win32.Guid
import com.sun.jna.platform.win32.WinNT
import com.sun.jna.win32.StdCallLibrary
import kotlin.Unit

public typealias DeferralCompletedHandlerBody = DeferralCompletedHandler.() -> Unit

public class DeferralCompletedHandler(
  ptr: Pointer? = Pointer.NULL,
) : Delegate<DeferralCompletedHandler.Native>(ptr) {
  public fun invoke(): Unit {
    delegateStruct.fn!!.invoke(this.pointer,)
  }

  public companion object {
    public fun create(fn: DeferralCompletedHandlerBody): DeferralCompletedHandler {
      val nativeFn = Native { 
          thisPtr: Pointer,
           ->
        val thisObj = DeferralCompletedHandler()
        fn(thisObj, )
        WinNT.HRESULT(0)
      }
      val newDelegate = DeferralCompletedHandler(Memory(12))
      newDelegate.init(listOf(ABI.IID), nativeFn)
      return newDelegate
    }
  }

  public fun interface Native : StdCallLibrary.StdCallCallback {
    public fun invoke(thisPtr: Pointer): WinNT.HRESULT
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue(): DeferralCompletedHandler =
        DeferralCompletedHandler(pointer.getPointer(0))

    public fun setValue(`delegate`: DeferralCompletedHandler): Unit {
      pointer.setPointer(0, delegate.pointer)
    }
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("ed32a372f3c84faa9cfb470148da3888")
  }
}

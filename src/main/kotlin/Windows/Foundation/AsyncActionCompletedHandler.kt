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

public typealias AsyncActionCompletedHandlerBody =
    AsyncActionCompletedHandler.(asyncInfo: IAsyncAction, asyncStatus: AsyncStatus) -> Unit

public class AsyncActionCompletedHandler(
  ptr: Pointer? = Pointer.NULL,
) : Delegate<AsyncActionCompletedHandler.Native>(ptr) {
  public fun invoke(asyncInfo: IAsyncAction, asyncStatus: AsyncStatus): Unit {
    delegateStruct.fn!!.invoke(this.pointer,asyncInfo.toNative() as Pointer, asyncStatus)
  }

  public companion object {
    public fun create(fn: AsyncActionCompletedHandlerBody): AsyncActionCompletedHandler {
      val nativeFn = Native { 
          thisPtr: Pointer,
          asyncInfo: Pointer,
          asyncStatus: AsyncStatus,
           ->
        val thisObj = AsyncActionCompletedHandler()
        fn(thisObj, IAsyncAction.ABI.makeIAsyncAction(asyncInfo), asyncStatus)
        WinNT.HRESULT(0)
      }
      val newDelegate = AsyncActionCompletedHandler(Memory(12))
      newDelegate.init(listOf(ABI.IID), nativeFn)
      return newDelegate
    }
  }

  public fun interface Native : StdCallLibrary.StdCallCallback {
    public fun invoke(
      thisPtr: Pointer,
      asyncInfo: Pointer,
      asyncStatus: AsyncStatus,
    ): WinNT.HRESULT
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue(): AsyncActionCompletedHandler =
        AsyncActionCompletedHandler(pointer.getPointer(0))

    public fun setValue(`delegate`: AsyncActionCompletedHandler): Unit {
      pointer.setPointer(0, delegate.pointer)
    }
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("a4ed5c8176c940bd8be6b1d90fb20ae7")
  }
}

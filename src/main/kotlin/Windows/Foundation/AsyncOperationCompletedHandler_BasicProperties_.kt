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

public typealias AsyncOperationCompletedHandler_BasicProperties_Body =
    AsyncOperationCompletedHandler_BasicProperties_.(asyncInfo: IAsyncOperation_BasicProperties_,
    asyncStatus: AsyncStatus) -> Unit

public class AsyncOperationCompletedHandler_BasicProperties_(
  ptr: Pointer? = Pointer.NULL,
) : Delegate<AsyncOperationCompletedHandler_BasicProperties_.Native>(ptr) {
  public fun invoke(asyncInfo: IAsyncOperation_BasicProperties_, asyncStatus: AsyncStatus): Unit {
    delegateStruct.fn!!.invoke(this.pointer,asyncInfo.toNative() as Pointer, asyncStatus)
  }

  public companion object {
    public fun create(fn: AsyncOperationCompletedHandler_BasicProperties_Body):
        AsyncOperationCompletedHandler_BasicProperties_ {
      val nativeFn = Native { 
          thisPtr: Pointer,
          asyncInfo: Pointer,
          asyncStatus: AsyncStatus,
           ->
        val thisObj = AsyncOperationCompletedHandler_BasicProperties_()
        fn(thisObj,
            IAsyncOperation_BasicProperties_.ABI.makeIAsyncOperation_BasicProperties_(asyncInfo),
            asyncStatus)
        WinNT.HRESULT(0)
      }
      val newDelegate = AsyncOperationCompletedHandler_BasicProperties_(Memory(12))
      newDelegate.init(listOf(ABI.PIID), nativeFn)
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
    public fun getValue(): AsyncOperationCompletedHandler_BasicProperties_ =
        AsyncOperationCompletedHandler_BasicProperties_(pointer.getPointer(0))

    public fun setValue(`delegate`: AsyncOperationCompletedHandler_BasicProperties_): Unit {
      pointer.setPointer(0, delegate.pointer)
    }
  }

  public object ABI {
    public val PIID: Guid.IID = Guid.IID("c8659aae492652ad8f60d89fe5a8df5f")

    public val IID: Guid.IID = Guid.IID("fcdcf02ce5d84478915a4d90b74b83a5")
  }
}

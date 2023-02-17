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

public typealias AsyncOperationWithProgressCompletedHandler_UInt32_UInt32_Body =
    AsyncOperationWithProgressCompletedHandler_UInt32_UInt32_.(asyncInfo: IAsyncOperationWithProgress_UInt32_UInt32_,
    asyncStatus: AsyncStatus) -> Unit

public class AsyncOperationWithProgressCompletedHandler_UInt32_UInt32_(
  ptr: Pointer? = Pointer.NULL,
) : Delegate<AsyncOperationWithProgressCompletedHandler_UInt32_UInt32_.Native>(ptr) {
  public fun invoke(asyncInfo: IAsyncOperationWithProgress_UInt32_UInt32_,
      asyncStatus: AsyncStatus): Unit {
    delegateStruct.fn!!.invoke(this.pointer,asyncInfo.toNative() as Pointer, asyncStatus)
  }

  public companion object {
    public fun create(fn: AsyncOperationWithProgressCompletedHandler_UInt32_UInt32_Body):
        AsyncOperationWithProgressCompletedHandler_UInt32_UInt32_ {
      val nativeFn = Native { 
          thisPtr: Pointer,
          asyncInfo: Pointer,
          asyncStatus: AsyncStatus,
           ->
        val thisObj = AsyncOperationWithProgressCompletedHandler_UInt32_UInt32_()
        fn(thisObj,
            IAsyncOperationWithProgress_UInt32_UInt32_.ABI.makeIAsyncOperationWithProgress_UInt32_UInt32_(asyncInfo),
            asyncStatus)
        WinNT.HRESULT(0)
      }
      val newDelegate = AsyncOperationWithProgressCompletedHandler_UInt32_UInt32_(Memory(12))
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
    public fun getValue(): AsyncOperationWithProgressCompletedHandler_UInt32_UInt32_ =
        AsyncOperationWithProgressCompletedHandler_UInt32_UInt32_(pointer.getPointer(0))

    public fun setValue(`delegate`: AsyncOperationWithProgressCompletedHandler_UInt32_UInt32_):
        Unit {
      pointer.setPointer(0, delegate.pointer)
    }
  }

  public object ABI {
    public val PIID: Guid.IID = Guid.IID("1e466dc5840f54f9b8775e3a9f4b6c74")

    public val IID: Guid.IID = Guid.IID("e85df41d6aa746e3a8e2f009d840c627")
  }
}

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

public typealias AsyncOperationCompletedHandler_DocumentProperties_Body =
    AsyncOperationCompletedHandler_DocumentProperties_.(asyncInfo: IAsyncOperation_DocumentProperties_,
    asyncStatus: AsyncStatus) -> Unit

public class AsyncOperationCompletedHandler_DocumentProperties_(
  ptr: Pointer? = Pointer.NULL,
) : Delegate<AsyncOperationCompletedHandler_DocumentProperties_.Native>(ptr) {
  public fun invoke(asyncInfo: IAsyncOperation_DocumentProperties_, asyncStatus: AsyncStatus):
      Unit {
    delegateStruct.fn!!.invoke(this.pointer,asyncInfo.toNative() as Pointer, asyncStatus)
  }

  public companion object {
    public fun create(fn: AsyncOperationCompletedHandler_DocumentProperties_Body):
        AsyncOperationCompletedHandler_DocumentProperties_ {
      val nativeFn = Native { 
          thisPtr: Pointer,
          asyncInfo: Pointer,
          asyncStatus: AsyncStatus,
           ->
        val thisObj = AsyncOperationCompletedHandler_DocumentProperties_()
        fn(thisObj,
            IAsyncOperation_DocumentProperties_.ABI.makeIAsyncOperation_DocumentProperties_(asyncInfo),
            asyncStatus)
        WinNT.HRESULT(0)
      }
      val newDelegate = AsyncOperationCompletedHandler_DocumentProperties_(Memory(12))
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
    public fun getValue(): AsyncOperationCompletedHandler_DocumentProperties_ =
        AsyncOperationCompletedHandler_DocumentProperties_(pointer.getPointer(0))

    public fun setValue(`delegate`: AsyncOperationCompletedHandler_DocumentProperties_): Unit {
      pointer.setPointer(0, delegate.pointer)
    }
  }

  public object ABI {
    public val PIID: Guid.IID = Guid.IID("4452ed4c642b501b96177d68b4ac3c66")

    public val IID: Guid.IID = Guid.IID("fcdcf02ce5d84478915a4d90b74b83a5")
  }
}

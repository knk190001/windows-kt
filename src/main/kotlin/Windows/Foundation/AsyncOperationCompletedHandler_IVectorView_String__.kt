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

public typealias AsyncOperationCompletedHandler_IVectorView_String__Body =
    AsyncOperationCompletedHandler_IVectorView_String__.(asyncInfo: IAsyncOperation_IVectorView_String__,
    asyncStatus: AsyncStatus) -> Unit

public class AsyncOperationCompletedHandler_IVectorView_String__(
  ptr: Pointer? = Pointer.NULL,
) : Delegate<AsyncOperationCompletedHandler_IVectorView_String__.Native>(ptr) {
  public fun invoke(asyncInfo: IAsyncOperation_IVectorView_String__, asyncStatus: AsyncStatus):
      Unit {
    delegateStruct.fn!!.invoke(this.pointer,asyncInfo.toNative() as Pointer, asyncStatus)
  }

  public companion object {
    public fun create(fn: AsyncOperationCompletedHandler_IVectorView_String__Body):
        AsyncOperationCompletedHandler_IVectorView_String__ {
      val nativeFn = Native { 
          thisPtr: Pointer,
          asyncInfo: Pointer,
          asyncStatus: AsyncStatus,
           ->
        val thisObj = AsyncOperationCompletedHandler_IVectorView_String__()
        fn(thisObj,
            IAsyncOperation_IVectorView_String__.ABI.makeIAsyncOperation_IVectorView_String__(asyncInfo),
            asyncStatus)
        WinNT.HRESULT(0)
      }
      val newDelegate = AsyncOperationCompletedHandler_IVectorView_String__(Memory(12))
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
    public fun getValue(): AsyncOperationCompletedHandler_IVectorView_String__ =
        AsyncOperationCompletedHandler_IVectorView_String__(pointer.getPointer(0))

    public fun setValue(`delegate`: AsyncOperationCompletedHandler_IVectorView_String__): Unit {
      pointer.setPointer(0, delegate.pointer)
    }
  }

  public object ABI {
    public val PIID: Guid.IID = Guid.IID("7c7899be5f2e5bf3ade5ad98b772c7cd")

    public val IID: Guid.IID = Guid.IID("fcdcf02ce5d84478915a4d90b74b83a5")
  }
}
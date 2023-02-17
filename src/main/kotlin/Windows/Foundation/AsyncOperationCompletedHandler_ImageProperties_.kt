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

public typealias AsyncOperationCompletedHandler_ImageProperties_Body =
    AsyncOperationCompletedHandler_ImageProperties_.(asyncInfo: IAsyncOperation_ImageProperties_,
    asyncStatus: AsyncStatus) -> Unit

public class AsyncOperationCompletedHandler_ImageProperties_(
  ptr: Pointer? = Pointer.NULL,
) : Delegate<AsyncOperationCompletedHandler_ImageProperties_.Native>(ptr) {
  public fun invoke(asyncInfo: IAsyncOperation_ImageProperties_, asyncStatus: AsyncStatus): Unit {
    delegateStruct.fn!!.invoke(this.pointer,asyncInfo.toNative() as Pointer, asyncStatus)
  }

  public companion object {
    public fun create(fn: AsyncOperationCompletedHandler_ImageProperties_Body):
        AsyncOperationCompletedHandler_ImageProperties_ {
      val nativeFn = Native { 
          thisPtr: Pointer,
          asyncInfo: Pointer,
          asyncStatus: AsyncStatus,
           ->
        val thisObj = AsyncOperationCompletedHandler_ImageProperties_()
        fn(thisObj,
            IAsyncOperation_ImageProperties_.ABI.makeIAsyncOperation_ImageProperties_(asyncInfo),
            asyncStatus)
        WinNT.HRESULT(0)
      }
      val newDelegate = AsyncOperationCompletedHandler_ImageProperties_(Memory(12))
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
    public fun getValue(): AsyncOperationCompletedHandler_ImageProperties_ =
        AsyncOperationCompletedHandler_ImageProperties_(pointer.getPointer(0))

    public fun setValue(`delegate`: AsyncOperationCompletedHandler_ImageProperties_): Unit {
      pointer.setPointer(0, delegate.pointer)
    }
  }

  public object ABI {
    public val PIID: Guid.IID = Guid.IID("c63729bce4c3564cb1372cb4f5966a83")

    public val IID: Guid.IID = Guid.IID("fcdcf02ce5d84478915a4d90b74b83a5")
  }
}

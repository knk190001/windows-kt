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

public typealias AsyncOperationCompletedHandler_ToastNotificationHistory_Body =
    AsyncOperationCompletedHandler_ToastNotificationHistory_.(asyncInfo: IAsyncOperation_ToastNotificationHistory_,
    asyncStatus: AsyncStatus) -> Unit

public class AsyncOperationCompletedHandler_ToastNotificationHistory_(
  ptr: Pointer? = Pointer.NULL,
) : Delegate<AsyncOperationCompletedHandler_ToastNotificationHistory_.Native>(ptr) {
  public fun invoke(asyncInfo: IAsyncOperation_ToastNotificationHistory_, asyncStatus: AsyncStatus):
      Unit {
    delegateStruct.fn!!.invoke(this.pointer,asyncInfo.toNative() as Pointer, asyncStatus)
  }

  public companion object {
    public fun create(fn: AsyncOperationCompletedHandler_ToastNotificationHistory_Body):
        AsyncOperationCompletedHandler_ToastNotificationHistory_ {
      val nativeFn = Native { 
          thisPtr: Pointer,
          asyncInfo: Pointer,
          asyncStatus: AsyncStatus,
           ->
        val thisObj = AsyncOperationCompletedHandler_ToastNotificationHistory_()
        fn(thisObj,
            IAsyncOperation_ToastNotificationHistory_.ABI.makeIAsyncOperation_ToastNotificationHistory_(asyncInfo),
            asyncStatus)
        WinNT.HRESULT(0)
      }
      val newDelegate = AsyncOperationCompletedHandler_ToastNotificationHistory_(Memory(12))
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
    public fun getValue(): AsyncOperationCompletedHandler_ToastNotificationHistory_ =
        AsyncOperationCompletedHandler_ToastNotificationHistory_(pointer.getPointer(0))

    public fun setValue(`delegate`: AsyncOperationCompletedHandler_ToastNotificationHistory_):
        Unit {
      pointer.setPointer(0, delegate.pointer)
    }
  }

  public object ABI {
    public val PIID: Guid.IID = Guid.IID("fea0a49edee85f9a9b021f32101449fe")

    public val IID: Guid.IID = Guid.IID("fcdcf02ce5d84478915a4d90b74b83a5")
  }
}

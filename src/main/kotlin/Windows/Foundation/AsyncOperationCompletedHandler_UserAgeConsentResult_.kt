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

public typealias AsyncOperationCompletedHandler_UserAgeConsentResult_Body =
    AsyncOperationCompletedHandler_UserAgeConsentResult_.(asyncInfo: IAsyncOperation_UserAgeConsentResult_,
    asyncStatus: AsyncStatus) -> Unit

public class AsyncOperationCompletedHandler_UserAgeConsentResult_(
  ptr: Pointer? = Pointer.NULL,
) : Delegate<AsyncOperationCompletedHandler_UserAgeConsentResult_.Native>(ptr) {
  public fun invoke(asyncInfo: IAsyncOperation_UserAgeConsentResult_, asyncStatus: AsyncStatus):
      Unit {
    delegateStruct.fn!!.invoke(this.pointer,asyncInfo.toNative() as Pointer, asyncStatus)
  }

  public companion object {
    public fun create(fn: AsyncOperationCompletedHandler_UserAgeConsentResult_Body):
        AsyncOperationCompletedHandler_UserAgeConsentResult_ {
      val nativeFn = Native { 
          thisPtr: Pointer,
          asyncInfo: Pointer,
          asyncStatus: AsyncStatus,
           ->
        val thisObj = AsyncOperationCompletedHandler_UserAgeConsentResult_()
        fn(thisObj,
            IAsyncOperation_UserAgeConsentResult_.ABI.makeIAsyncOperation_UserAgeConsentResult_(asyncInfo),
            asyncStatus)
        WinNT.HRESULT(0)
      }
      val newDelegate = AsyncOperationCompletedHandler_UserAgeConsentResult_(Memory(12))
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
    public fun getValue(): AsyncOperationCompletedHandler_UserAgeConsentResult_ =
        AsyncOperationCompletedHandler_UserAgeConsentResult_(pointer.getPointer(0))

    public fun setValue(`delegate`: AsyncOperationCompletedHandler_UserAgeConsentResult_): Unit {
      pointer.setPointer(0, delegate.pointer)
    }
  }

  public object ABI {
    public val PIID: Guid.IID = Guid.IID("5ff26075034f51868fd39eda8da3e739")

    public val IID: Guid.IID = Guid.IID("fcdcf02ce5d84478915a4d90b74b83a5")
  }
}

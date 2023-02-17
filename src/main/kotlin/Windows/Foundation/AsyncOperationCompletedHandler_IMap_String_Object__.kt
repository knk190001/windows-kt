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

public typealias AsyncOperationCompletedHandler_IMap_String_Object__Body =
    AsyncOperationCompletedHandler_IMap_String_Object__.(asyncInfo: IAsyncOperation_IMap_String_Object__,
    asyncStatus: AsyncStatus) -> Unit

public class AsyncOperationCompletedHandler_IMap_String_Object__(
  ptr: Pointer? = Pointer.NULL,
) : Delegate<AsyncOperationCompletedHandler_IMap_String_Object__.Native>(ptr) {
  public fun invoke(asyncInfo: IAsyncOperation_IMap_String_Object__, asyncStatus: AsyncStatus):
      Unit {
    delegateStruct.fn!!.invoke(this.pointer,asyncInfo.toNative() as Pointer, asyncStatus)
  }

  public companion object {
    public fun create(fn: AsyncOperationCompletedHandler_IMap_String_Object__Body):
        AsyncOperationCompletedHandler_IMap_String_Object__ {
      val nativeFn = Native { 
          thisPtr: Pointer,
          asyncInfo: Pointer,
          asyncStatus: AsyncStatus,
           ->
        val thisObj = AsyncOperationCompletedHandler_IMap_String_Object__()
        fn(thisObj,
            IAsyncOperation_IMap_String_Object__.ABI.makeIAsyncOperation_IMap_String_Object__(asyncInfo),
            asyncStatus)
        WinNT.HRESULT(0)
      }
      val newDelegate = AsyncOperationCompletedHandler_IMap_String_Object__(Memory(12))
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
    public fun getValue(): AsyncOperationCompletedHandler_IMap_String_Object__ =
        AsyncOperationCompletedHandler_IMap_String_Object__(pointer.getPointer(0))

    public fun setValue(`delegate`: AsyncOperationCompletedHandler_IMap_String_Object__): Unit {
      pointer.setPointer(0, delegate.pointer)
    }
  }

  public object ABI {
    public val PIID: Guid.IID = Guid.IID("7344f35683995756a2f8abd50c4146ff")

    public val IID: Guid.IID = Guid.IID("fcdcf02ce5d84478915a4d90b74b83a5")
  }
}

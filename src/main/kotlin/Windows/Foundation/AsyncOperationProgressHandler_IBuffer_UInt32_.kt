package Windows.Foundation

import com.github.knk190001.winrtbinding.runtime.interfaces.Delegate
import com.github.knk190001.winrtbinding.runtime.interfaces.getValue
import com.sun.jna.Memory
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.platform.win32.Guid
import com.sun.jna.platform.win32.WinDef
import com.sun.jna.platform.win32.WinNT
import com.sun.jna.win32.StdCallLibrary
import kotlin.Unit

public typealias AsyncOperationProgressHandler_IBuffer_UInt32_Body =
    AsyncOperationProgressHandler_IBuffer_UInt32_.(asyncInfo: IAsyncOperationWithProgress_IBuffer_UInt32_,
    progressInfo: WinDef.UINT) -> Unit

public class AsyncOperationProgressHandler_IBuffer_UInt32_(
  ptr: Pointer? = Pointer.NULL,
) : Delegate<AsyncOperationProgressHandler_IBuffer_UInt32_.Native>(ptr) {
  public fun invoke(asyncInfo: IAsyncOperationWithProgress_IBuffer_UInt32_,
      progressInfo: WinDef.UINT): Unit {
    delegateStruct.fn!!.invoke(this.pointer,asyncInfo.toNative() as Pointer, progressInfo)
  }

  public companion object {
    public fun create(fn: AsyncOperationProgressHandler_IBuffer_UInt32_Body):
        AsyncOperationProgressHandler_IBuffer_UInt32_ {
      val nativeFn = Native { 
          thisPtr: Pointer,
          asyncInfo: Pointer,
          progressInfo: WinDef.UINT,
           ->
        val thisObj = AsyncOperationProgressHandler_IBuffer_UInt32_()
        fn(thisObj,
            IAsyncOperationWithProgress_IBuffer_UInt32_.ABI.makeIAsyncOperationWithProgress_IBuffer_UInt32_(asyncInfo),
            progressInfo)
        WinNT.HRESULT(0)
      }
      val newDelegate = AsyncOperationProgressHandler_IBuffer_UInt32_(Memory(12))
      newDelegate.init(listOf(ABI.PIID), nativeFn)
      return newDelegate
    }
  }

  public fun interface Native : StdCallLibrary.StdCallCallback {
    public fun invoke(
      thisPtr: Pointer,
      asyncInfo: Pointer,
      progressInfo: WinDef.UINT,
    ): WinNT.HRESULT
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue(): AsyncOperationProgressHandler_IBuffer_UInt32_ =
        AsyncOperationProgressHandler_IBuffer_UInt32_(pointer.getPointer(0))

    public fun setValue(`delegate`: AsyncOperationProgressHandler_IBuffer_UInt32_): Unit {
      pointer.setPointer(0, delegate.pointer)
    }
  }

  public object ABI {
    public val PIID: Guid.IID = Guid.IID("bf66655476055d9ab14e18d8c8472afe")

    public val IID: Guid.IID = Guid.IID("556909020aab421a8778f8ce5026d758")
  }
}

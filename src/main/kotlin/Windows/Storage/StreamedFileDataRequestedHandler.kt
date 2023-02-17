package Windows.Storage

import com.github.knk190001.winrtbinding.runtime.interfaces.Delegate
import com.github.knk190001.winrtbinding.runtime.interfaces.getValue
import com.sun.jna.Memory
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.platform.win32.Guid
import com.sun.jna.platform.win32.WinNT
import com.sun.jna.win32.StdCallLibrary
import kotlin.Unit

public typealias StreamedFileDataRequestedHandlerBody =
    StreamedFileDataRequestedHandler.(stream: StreamedFileDataRequest) -> Unit

public class StreamedFileDataRequestedHandler(
  ptr: Pointer? = Pointer.NULL,
) : Delegate<StreamedFileDataRequestedHandler.Native>(ptr) {
  public fun invoke(stream: StreamedFileDataRequest): Unit {
    delegateStruct.fn!!.invoke(this.pointer,stream)
  }

  public companion object {
    public fun create(fn: StreamedFileDataRequestedHandlerBody): StreamedFileDataRequestedHandler {
      val nativeFn = Native { 
          thisPtr: Pointer,
          stream: StreamedFileDataRequest,
           ->
        val thisObj = StreamedFileDataRequestedHandler()
        fn(thisObj, stream)
        WinNT.HRESULT(0)
      }
      val newDelegate = StreamedFileDataRequestedHandler(Memory(12))
      newDelegate.init(listOf(ABI.IID), nativeFn)
      return newDelegate
    }
  }

  public fun interface Native : StdCallLibrary.StdCallCallback {
    public fun invoke(thisPtr: Pointer, stream: StreamedFileDataRequest): WinNT.HRESULT
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue(): StreamedFileDataRequestedHandler =
        StreamedFileDataRequestedHandler(pointer.getPointer(0))

    public fun setValue(`delegate`: StreamedFileDataRequestedHandler): Unit {
      pointer.setPointer(0, delegate.pointer)
    }
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("fef6a8242fe14d07a35bb77c50b5f4cc")
  }
}

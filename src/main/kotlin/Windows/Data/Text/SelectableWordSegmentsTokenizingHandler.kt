package Windows.Data.Text

import Windows.Foundation.Collections.IIterable_SelectableWordSegment_
import com.github.knk190001.winrtbinding.runtime.interfaces.Delegate
import com.github.knk190001.winrtbinding.runtime.interfaces.getValue
import com.sun.jna.Memory
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.platform.win32.Guid
import com.sun.jna.platform.win32.WinNT
import com.sun.jna.win32.StdCallLibrary
import kotlin.Unit

public typealias SelectableWordSegmentsTokenizingHandlerBody =
    SelectableWordSegmentsTokenizingHandler.(precedingWords: IIterable_SelectableWordSegment_,
    words: IIterable_SelectableWordSegment_) -> Unit

public class SelectableWordSegmentsTokenizingHandler(
  ptr: Pointer? = Pointer.NULL,
) : Delegate<SelectableWordSegmentsTokenizingHandler.Native>(ptr) {
  public fun invoke(precedingWords: IIterable_SelectableWordSegment_,
      words: IIterable_SelectableWordSegment_): Unit {
    delegateStruct.fn!!.invoke(this.pointer,precedingWords.toNative() as Pointer, words.toNative()
        as Pointer)
  }

  public companion object {
    public fun create(fn: SelectableWordSegmentsTokenizingHandlerBody):
        SelectableWordSegmentsTokenizingHandler {
      val nativeFn = Native { 
          thisPtr: Pointer,
          precedingWords: Pointer,
          words: Pointer,
           ->
        val thisObj = SelectableWordSegmentsTokenizingHandler()
        fn(thisObj,
            IIterable_SelectableWordSegment_.ABI.makeIIterable_SelectableWordSegment_(precedingWords),
            IIterable_SelectableWordSegment_.ABI.makeIIterable_SelectableWordSegment_(words))
        WinNT.HRESULT(0)
      }
      val newDelegate = SelectableWordSegmentsTokenizingHandler(Memory(12))
      newDelegate.init(listOf(ABI.IID), nativeFn)
      return newDelegate
    }
  }

  public fun interface Native : StdCallLibrary.StdCallCallback {
    public fun invoke(
      thisPtr: Pointer,
      precedingWords: Pointer,
      words: Pointer,
    ): WinNT.HRESULT
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue(): SelectableWordSegmentsTokenizingHandler =
        SelectableWordSegmentsTokenizingHandler(pointer.getPointer(0))

    public fun setValue(`delegate`: SelectableWordSegmentsTokenizingHandler): Unit {
      pointer.setPointer(0, delegate.pointer)
    }
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("3a3dfc9caede4dc79e6c41c044bd3592")
  }
}

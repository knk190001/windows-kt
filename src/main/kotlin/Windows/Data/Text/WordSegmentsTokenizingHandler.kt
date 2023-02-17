package Windows.Data.Text

import Windows.Foundation.Collections.IIterable_WordSegment_
import com.github.knk190001.winrtbinding.runtime.interfaces.Delegate
import com.github.knk190001.winrtbinding.runtime.interfaces.getValue
import com.sun.jna.Memory
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.platform.win32.Guid
import com.sun.jna.platform.win32.WinNT
import com.sun.jna.win32.StdCallLibrary
import kotlin.Unit

public typealias WordSegmentsTokenizingHandlerBody =
    WordSegmentsTokenizingHandler.(precedingWords: IIterable_WordSegment_,
    words: IIterable_WordSegment_) -> Unit

public class WordSegmentsTokenizingHandler(
  ptr: Pointer? = Pointer.NULL,
) : Delegate<WordSegmentsTokenizingHandler.Native>(ptr) {
  public fun invoke(precedingWords: IIterable_WordSegment_, words: IIterable_WordSegment_): Unit {
    delegateStruct.fn!!.invoke(this.pointer,precedingWords.toNative() as Pointer, words.toNative()
        as Pointer)
  }

  public companion object {
    public fun create(fn: WordSegmentsTokenizingHandlerBody): WordSegmentsTokenizingHandler {
      val nativeFn = Native { 
          thisPtr: Pointer,
          precedingWords: Pointer,
          words: Pointer,
           ->
        val thisObj = WordSegmentsTokenizingHandler()
        fn(thisObj, IIterable_WordSegment_.ABI.makeIIterable_WordSegment_(precedingWords),
            IIterable_WordSegment_.ABI.makeIIterable_WordSegment_(words))
        WinNT.HRESULT(0)
      }
      val newDelegate = WordSegmentsTokenizingHandler(Memory(12))
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
    public fun getValue(): WordSegmentsTokenizingHandler =
        WordSegmentsTokenizingHandler(pointer.getPointer(0))

    public fun setValue(`delegate`: WordSegmentsTokenizingHandler): Unit {
      pointer.setPointer(0, delegate.pointer)
    }
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("a5dd6357bf2a4c4fa31f29e71c6f8b35")
  }
}

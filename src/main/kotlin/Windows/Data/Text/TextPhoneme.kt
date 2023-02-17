package Windows.Data.Text

import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.interfaces.IUnknownVtbl
import com.github.knk190001.winrtbinding.runtime.interfaces.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.interfaces.IWinRTObject
import com.github.knk190001.winrtbinding.runtime.interfaces.getValue
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import kotlin.Array
import kotlin.Unit

public class TextPhoneme(
  ptr: Pointer? = Pointer.NULL,
) : PointerType(ptr), ITextPhoneme, IWinRTObject {
  public val ITextPhoneme_Interface: ITextPhoneme by lazy {
    asITextPhoneme()
  }


  public override val ITextPhoneme_Ptr: Pointer? by lazy {
    ITextPhoneme_Interface.ITextPhoneme_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(ITextPhoneme_Interface)

  private fun asITextPhoneme(): ITextPhoneme {
    if(pointer == Pointer.NULL) {
      return(ITextPhoneme.ABI.makeITextPhoneme(Pointer.NULL))
    }
    val refiid = Guid.REFIID(ITextPhoneme.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITextPhoneme.ABI.makeITextPhoneme(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue(): TextPhoneme = TextPhoneme(pointer.getPointer(0))

    public fun setValue(`value`: TextPhoneme): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI
}
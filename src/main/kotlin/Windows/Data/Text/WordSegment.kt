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

public class WordSegment(
  ptr: Pointer? = Pointer.NULL,
) : PointerType(ptr), IWordSegment, IWinRTObject {
  public val IWordSegment_Interface: IWordSegment by lazy {
    asIWordSegment()
  }


  public override val IWordSegment_Ptr: Pointer? by lazy {
    IWordSegment_Interface.IWordSegment_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(IWordSegment_Interface)

  private fun asIWordSegment(): IWordSegment {
    if(pointer == Pointer.NULL) {
      return(IWordSegment.ABI.makeIWordSegment(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IWordSegment.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWordSegment.ABI.makeIWordSegment(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue(): WordSegment = WordSegment(pointer.getPointer(0))

    public fun setValue(`value`: WordSegment): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI
}

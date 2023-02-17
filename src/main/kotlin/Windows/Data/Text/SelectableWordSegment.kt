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

public class SelectableWordSegment(
  ptr: Pointer? = Pointer.NULL,
) : PointerType(ptr), ISelectableWordSegment, IWinRTObject {
  public val ISelectableWordSegment_Interface: ISelectableWordSegment by lazy {
    asISelectableWordSegment()
  }


  public override val ISelectableWordSegment_Ptr: Pointer? by lazy {
    ISelectableWordSegment_Interface.ISelectableWordSegment_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(ISelectableWordSegment_Interface)

  private fun asISelectableWordSegment(): ISelectableWordSegment {
    if(pointer == Pointer.NULL) {
      return(ISelectableWordSegment.ABI.makeISelectableWordSegment(Pointer.NULL))
    }
    val refiid = Guid.REFIID(ISelectableWordSegment.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISelectableWordSegment.ABI.makeISelectableWordSegment(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue(): SelectableWordSegment = SelectableWordSegment(pointer.getPointer(0))

    public fun setValue(`value`: SelectableWordSegment): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI
}

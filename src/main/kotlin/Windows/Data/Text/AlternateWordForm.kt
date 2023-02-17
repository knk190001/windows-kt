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

public class AlternateWordForm(
  ptr: Pointer? = Pointer.NULL,
) : PointerType(ptr), IAlternateWordForm, IWinRTObject {
  public val IAlternateWordForm_Interface: IAlternateWordForm by lazy {
    asIAlternateWordForm()
  }


  public override val IAlternateWordForm_Ptr: Pointer? by lazy {
    IAlternateWordForm_Interface.IAlternateWordForm_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(IAlternateWordForm_Interface)

  private fun asIAlternateWordForm(): IAlternateWordForm {
    if(pointer == Pointer.NULL) {
      return(IAlternateWordForm.ABI.makeIAlternateWordForm(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IAlternateWordForm.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAlternateWordForm.ABI.makeIAlternateWordForm(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue(): AlternateWordForm = AlternateWordForm(pointer.getPointer(0))

    public fun setValue(`value`: AlternateWordForm): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI
}

package Windows.Data.Xml.Dom

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

public class XmlDomImplementation(
  ptr: Pointer? = Pointer.NULL,
) : PointerType(ptr), IXmlDomImplementation, IWinRTObject {
  public val IXmlDomImplementation_Interface: IXmlDomImplementation by lazy {
    asIXmlDomImplementation()
  }


  public override val IXmlDomImplementation_Ptr: Pointer? by lazy {
    IXmlDomImplementation_Interface.IXmlDomImplementation_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(IXmlDomImplementation_Interface)

  private fun asIXmlDomImplementation(): IXmlDomImplementation {
    if(pointer == Pointer.NULL) {
      return(IXmlDomImplementation.ABI.makeIXmlDomImplementation(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IXmlDomImplementation.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IXmlDomImplementation.ABI.makeIXmlDomImplementation(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue(): XmlDomImplementation = XmlDomImplementation(pointer.getPointer(0))

    public fun setValue(`value`: XmlDomImplementation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI
}

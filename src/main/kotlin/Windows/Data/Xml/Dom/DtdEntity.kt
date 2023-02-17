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

public class DtdEntity(
  ptr: Pointer? = Pointer.NULL,
) : PointerType(ptr), IDtdEntity, IXmlNode, IXmlNodeSerializer, IXmlNodeSelector, IWinRTObject {
  public val IDtdEntity_Interface: IDtdEntity by lazy {
    asIDtdEntity()
  }


  public val IXmlNode_Interface: IXmlNode by lazy {
    asIXmlNode()
  }


  public val IXmlNodeSerializer_Interface: IXmlNodeSerializer by lazy {
    asIXmlNodeSerializer()
  }


  public val IXmlNodeSelector_Interface: IXmlNodeSelector by lazy {
    asIXmlNodeSelector()
  }


  public override val IDtdEntity_Ptr: Pointer? by lazy {
    IDtdEntity_Interface.IDtdEntity_Ptr
  }


  public override val IXmlNode_Ptr: Pointer? by lazy {
    IXmlNode_Interface.IXmlNode_Ptr
  }


  public override val IXmlNodeSerializer_Ptr: Pointer? by lazy {
    IXmlNodeSerializer_Interface.IXmlNodeSerializer_Ptr
  }


  public override val IXmlNodeSelector_Ptr: Pointer? by lazy {
    IXmlNodeSelector_Interface.IXmlNodeSelector_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(IDtdEntity_Interface, IXmlNode_Interface, IXmlNodeSerializer_Interface,
        IXmlNodeSelector_Interface)

  private fun asIDtdEntity(): IDtdEntity {
    if(pointer == Pointer.NULL) {
      return(IDtdEntity.ABI.makeIDtdEntity(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IDtdEntity.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDtdEntity.ABI.makeIDtdEntity(ref.value))
  }

  private fun asIXmlNode(): IXmlNode {
    if(pointer == Pointer.NULL) {
      return(IXmlNode.ABI.makeIXmlNode(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IXmlNode.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IXmlNode.ABI.makeIXmlNode(ref.value))
  }

  private fun asIXmlNodeSerializer(): IXmlNodeSerializer {
    if(pointer == Pointer.NULL) {
      return(IXmlNodeSerializer.ABI.makeIXmlNodeSerializer(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IXmlNodeSerializer.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IXmlNodeSerializer.ABI.makeIXmlNodeSerializer(ref.value))
  }

  private fun asIXmlNodeSelector(): IXmlNodeSelector {
    if(pointer == Pointer.NULL) {
      return(IXmlNodeSelector.ABI.makeIXmlNodeSelector(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IXmlNodeSelector.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IXmlNodeSelector.ABI.makeIXmlNodeSelector(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue(): DtdEntity = DtdEntity(pointer.getPointer(0))

    public fun setValue(`value`: DtdEntity): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI
}

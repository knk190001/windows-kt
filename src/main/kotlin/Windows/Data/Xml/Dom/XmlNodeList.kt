package Windows.Data.Xml.Dom

import Windows.Foundation.Collections.IIterable_IXmlNode_
import Windows.Foundation.Collections.IVectorView_IXmlNode_
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

public class XmlNodeList(
  ptr: Pointer? = Pointer.NULL,
) : PointerType(ptr), IXmlNodeList, IVectorView_IXmlNode_, IIterable_IXmlNode_, IWinRTObject {
  public val IXmlNodeList_Interface: IXmlNodeList by lazy {
    asIXmlNodeList()
  }


  public val IVectorView_IXmlNode__Interface: IVectorView_IXmlNode_ by lazy {
    asIVectorView_IXmlNode_()
  }


  public val IIterable_IXmlNode__Interface: IIterable_IXmlNode_ by lazy {
    asIIterable_IXmlNode_()
  }


  public override val IXmlNodeList_Ptr: Pointer? by lazy {
    IXmlNodeList_Interface.IXmlNodeList_Ptr
  }


  public override val IVectorView_IXmlNode__Ptr: Pointer? by lazy {
    IVectorView_IXmlNode__Interface.IVectorView_IXmlNode__Ptr
  }


  public override val IIterable_IXmlNode__Ptr: Pointer? by lazy {
    IIterable_IXmlNode__Interface.IIterable_IXmlNode__Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(IXmlNodeList_Interface, IVectorView_IXmlNode__Interface,
        IIterable_IXmlNode__Interface)

  private fun asIXmlNodeList(): IXmlNodeList {
    if(pointer == Pointer.NULL) {
      return(IXmlNodeList.ABI.makeIXmlNodeList(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IXmlNodeList.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IXmlNodeList.ABI.makeIXmlNodeList(ref.value))
  }

  private fun asIVectorView_IXmlNode_(): IVectorView_IXmlNode_ {
    if(pointer == Pointer.NULL) {
      return(IVectorView_IXmlNode_.ABI.makeIVectorView_IXmlNode_(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IVectorView_IXmlNode_.ABI.PIID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVectorView_IXmlNode_.ABI.makeIVectorView_IXmlNode_(ref.value))
  }

  private fun asIIterable_IXmlNode_(): IIterable_IXmlNode_ {
    if(pointer == Pointer.NULL) {
      return(IIterable_IXmlNode_.ABI.makeIIterable_IXmlNode_(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IIterable_IXmlNode_.ABI.PIID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IIterable_IXmlNode_.ABI.makeIIterable_IXmlNode_(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue(): XmlNodeList = XmlNodeList(pointer.getPointer(0))

    public fun setValue(`value`: XmlNodeList): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI
}

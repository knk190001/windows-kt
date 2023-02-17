package Windows.Storage.FileProperties

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

public class DocumentProperties(
  ptr: Pointer? = Pointer.NULL,
) : PointerType(ptr), IDocumentProperties, IStorageItemExtraProperties, IWinRTObject {
  public val IDocumentProperties_Interface: IDocumentProperties by lazy {
    asIDocumentProperties()
  }


  public val IStorageItemExtraProperties_Interface: IStorageItemExtraProperties by lazy {
    asIStorageItemExtraProperties()
  }


  public override val IDocumentProperties_Ptr: Pointer? by lazy {
    IDocumentProperties_Interface.IDocumentProperties_Ptr
  }


  public override val IStorageItemExtraProperties_Ptr: Pointer? by lazy {
    IStorageItemExtraProperties_Interface.IStorageItemExtraProperties_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(IDocumentProperties_Interface, IStorageItemExtraProperties_Interface)

  private fun asIDocumentProperties(): IDocumentProperties {
    if(pointer == Pointer.NULL) {
      return(IDocumentProperties.ABI.makeIDocumentProperties(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IDocumentProperties.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDocumentProperties.ABI.makeIDocumentProperties(ref.value))
  }

  private fun asIStorageItemExtraProperties(): IStorageItemExtraProperties {
    if(pointer == Pointer.NULL) {
      return(IStorageItemExtraProperties.ABI.makeIStorageItemExtraProperties(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IStorageItemExtraProperties.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStorageItemExtraProperties.ABI.makeIStorageItemExtraProperties(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue(): DocumentProperties = DocumentProperties(pointer.getPointer(0))

    public fun setValue(`value`: DocumentProperties): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI
}

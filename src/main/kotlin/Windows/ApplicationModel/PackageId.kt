package Windows.ApplicationModel

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

public class PackageId(
  ptr: Pointer? = Pointer.NULL,
) : PointerType(ptr), IPackageId, IPackageIdWithMetadata, IWinRTObject {
  public val IPackageId_Interface: IPackageId by lazy {
    asIPackageId()
  }


  public val IPackageIdWithMetadata_Interface: IPackageIdWithMetadata by lazy {
    asIPackageIdWithMetadata()
  }


  public override val IPackageId_Ptr: Pointer? by lazy {
    IPackageId_Interface.IPackageId_Ptr
  }


  public override val IPackageIdWithMetadata_Ptr: Pointer? by lazy {
    IPackageIdWithMetadata_Interface.IPackageIdWithMetadata_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(IPackageId_Interface, IPackageIdWithMetadata_Interface)

  private fun asIPackageId(): IPackageId {
    if(pointer == Pointer.NULL) {
      return(IPackageId.ABI.makeIPackageId(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IPackageId.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPackageId.ABI.makeIPackageId(ref.value))
  }

  private fun asIPackageIdWithMetadata(): IPackageIdWithMetadata {
    if(pointer == Pointer.NULL) {
      return(IPackageIdWithMetadata.ABI.makeIPackageIdWithMetadata(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IPackageIdWithMetadata.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPackageIdWithMetadata.ABI.makeIPackageIdWithMetadata(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue(): PackageId = PackageId(pointer.getPointer(0))

    public fun setValue(`value`: PackageId): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI
}

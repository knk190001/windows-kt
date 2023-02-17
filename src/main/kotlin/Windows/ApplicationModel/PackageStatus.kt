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

public class PackageStatus(
  ptr: Pointer? = Pointer.NULL,
) : PointerType(ptr), IPackageStatus, IPackageStatus2, IWinRTObject {
  public val IPackageStatus_Interface: IPackageStatus by lazy {
    asIPackageStatus()
  }


  public val IPackageStatus2_Interface: IPackageStatus2 by lazy {
    asIPackageStatus2()
  }


  public override val IPackageStatus_Ptr: Pointer? by lazy {
    IPackageStatus_Interface.IPackageStatus_Ptr
  }


  public override val IPackageStatus2_Ptr: Pointer? by lazy {
    IPackageStatus2_Interface.IPackageStatus2_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(IPackageStatus_Interface, IPackageStatus2_Interface)

  private fun asIPackageStatus(): IPackageStatus {
    if(pointer == Pointer.NULL) {
      return(IPackageStatus.ABI.makeIPackageStatus(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IPackageStatus.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPackageStatus.ABI.makeIPackageStatus(ref.value))
  }

  private fun asIPackageStatus2(): IPackageStatus2 {
    if(pointer == Pointer.NULL) {
      return(IPackageStatus2.ABI.makeIPackageStatus2(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IPackageStatus2.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPackageStatus2.ABI.makeIPackageStatus2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue(): PackageStatus = PackageStatus(pointer.getPointer(0))

    public fun setValue(`value`: PackageStatus): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI
}

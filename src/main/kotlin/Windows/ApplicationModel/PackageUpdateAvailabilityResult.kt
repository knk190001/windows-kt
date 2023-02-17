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

public class PackageUpdateAvailabilityResult(
  ptr: Pointer? = Pointer.NULL,
) : PointerType(ptr), IPackageUpdateAvailabilityResult, IWinRTObject {
  public val IPackageUpdateAvailabilityResult_Interface: IPackageUpdateAvailabilityResult by lazy {
    asIPackageUpdateAvailabilityResult()
  }


  public override val IPackageUpdateAvailabilityResult_Ptr: Pointer? by lazy {
    IPackageUpdateAvailabilityResult_Interface.IPackageUpdateAvailabilityResult_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(IPackageUpdateAvailabilityResult_Interface)

  private fun asIPackageUpdateAvailabilityResult(): IPackageUpdateAvailabilityResult {
    if(pointer == Pointer.NULL) {
      return(IPackageUpdateAvailabilityResult.ABI.makeIPackageUpdateAvailabilityResult(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IPackageUpdateAvailabilityResult.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPackageUpdateAvailabilityResult.ABI.makeIPackageUpdateAvailabilityResult(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue(): PackageUpdateAvailabilityResult =
        PackageUpdateAvailabilityResult(pointer.getPointer(0))

    public fun setValue(`value`: PackageUpdateAvailabilityResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI
}

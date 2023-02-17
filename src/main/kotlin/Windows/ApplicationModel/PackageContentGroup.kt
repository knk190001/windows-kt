package Windows.ApplicationModel

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
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

public class PackageContentGroup(
  ptr: Pointer? = Pointer.NULL,
) : PointerType(ptr), IPackageContentGroup, IWinRTObject {
  public val IPackageContentGroup_Interface: IPackageContentGroup by lazy {
    asIPackageContentGroup()
  }


  public override val IPackageContentGroup_Ptr: Pointer? by lazy {
    IPackageContentGroup_Interface.IPackageContentGroup_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(IPackageContentGroup_Interface)

  private fun asIPackageContentGroup(): IPackageContentGroup {
    if(pointer == Pointer.NULL) {
      return(IPackageContentGroup.ABI.makeIPackageContentGroup(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IPackageContentGroup.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPackageContentGroup.ABI.makeIPackageContentGroup(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue(): PackageContentGroup = PackageContentGroup(pointer.getPointer(0))

    public fun setValue(`value`: PackageContentGroup): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI {
    public val IPackageContentGroupStatics_Instance: IPackageContentGroupStatics by lazy {
      createIPackageContentGroupStatics()
    }


    public fun createIPackageContentGroupStatics(): IPackageContentGroupStatics {
      val refiid = Guid.REFIID(IPackageContentGroupStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.PackageContentGroup".toHandle(),refiid,interfacePtr)
      val result =
          IPackageContentGroupStatics.ABI.makeIPackageContentGroupStatics(interfacePtr.value)
      return result
    }
  }

  public companion object {
    public fun get_RequiredGroupName() =
        ABI.IPackageContentGroupStatics_Instance.get_RequiredGroupName()
  }
}

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

public class Package(
  ptr: Pointer? = Pointer.NULL,
) : PointerType(ptr), IPackage, IPackage2, IPackage3, IPackageWithMetadata, IPackage4, IPackage5,
    IPackage6, IPackage7, IPackage8, IWinRTObject {
  public val IPackage_Interface: IPackage by lazy {
    asIPackage()
  }


  public val IPackage2_Interface: IPackage2 by lazy {
    asIPackage2()
  }


  public val IPackage3_Interface: IPackage3 by lazy {
    asIPackage3()
  }


  public val IPackageWithMetadata_Interface: IPackageWithMetadata by lazy {
    asIPackageWithMetadata()
  }


  public val IPackage4_Interface: IPackage4 by lazy {
    asIPackage4()
  }


  public val IPackage5_Interface: IPackage5 by lazy {
    asIPackage5()
  }


  public val IPackage6_Interface: IPackage6 by lazy {
    asIPackage6()
  }


  public val IPackage7_Interface: IPackage7 by lazy {
    asIPackage7()
  }


  public val IPackage8_Interface: IPackage8 by lazy {
    asIPackage8()
  }


  public override val IPackage_Ptr: Pointer? by lazy {
    IPackage_Interface.IPackage_Ptr
  }


  public override val IPackage2_Ptr: Pointer? by lazy {
    IPackage2_Interface.IPackage2_Ptr
  }


  public override val IPackage3_Ptr: Pointer? by lazy {
    IPackage3_Interface.IPackage3_Ptr
  }


  public override val IPackageWithMetadata_Ptr: Pointer? by lazy {
    IPackageWithMetadata_Interface.IPackageWithMetadata_Ptr
  }


  public override val IPackage4_Ptr: Pointer? by lazy {
    IPackage4_Interface.IPackage4_Ptr
  }


  public override val IPackage5_Ptr: Pointer? by lazy {
    IPackage5_Interface.IPackage5_Ptr
  }


  public override val IPackage6_Ptr: Pointer? by lazy {
    IPackage6_Interface.IPackage6_Ptr
  }


  public override val IPackage7_Ptr: Pointer? by lazy {
    IPackage7_Interface.IPackage7_Ptr
  }


  public override val IPackage8_Ptr: Pointer? by lazy {
    IPackage8_Interface.IPackage8_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(IPackage_Interface, IPackage2_Interface, IPackage3_Interface,
        IPackageWithMetadata_Interface, IPackage4_Interface, IPackage5_Interface,
        IPackage6_Interface, IPackage7_Interface, IPackage8_Interface)

  private fun asIPackage(): IPackage {
    if(pointer == Pointer.NULL) {
      return(IPackage.ABI.makeIPackage(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IPackage.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPackage.ABI.makeIPackage(ref.value))
  }

  private fun asIPackage2(): IPackage2 {
    if(pointer == Pointer.NULL) {
      return(IPackage2.ABI.makeIPackage2(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IPackage2.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPackage2.ABI.makeIPackage2(ref.value))
  }

  private fun asIPackage3(): IPackage3 {
    if(pointer == Pointer.NULL) {
      return(IPackage3.ABI.makeIPackage3(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IPackage3.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPackage3.ABI.makeIPackage3(ref.value))
  }

  private fun asIPackageWithMetadata(): IPackageWithMetadata {
    if(pointer == Pointer.NULL) {
      return(IPackageWithMetadata.ABI.makeIPackageWithMetadata(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IPackageWithMetadata.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPackageWithMetadata.ABI.makeIPackageWithMetadata(ref.value))
  }

  private fun asIPackage4(): IPackage4 {
    if(pointer == Pointer.NULL) {
      return(IPackage4.ABI.makeIPackage4(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IPackage4.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPackage4.ABI.makeIPackage4(ref.value))
  }

  private fun asIPackage5(): IPackage5 {
    if(pointer == Pointer.NULL) {
      return(IPackage5.ABI.makeIPackage5(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IPackage5.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPackage5.ABI.makeIPackage5(ref.value))
  }

  private fun asIPackage6(): IPackage6 {
    if(pointer == Pointer.NULL) {
      return(IPackage6.ABI.makeIPackage6(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IPackage6.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPackage6.ABI.makeIPackage6(ref.value))
  }

  private fun asIPackage7(): IPackage7 {
    if(pointer == Pointer.NULL) {
      return(IPackage7.ABI.makeIPackage7(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IPackage7.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPackage7.ABI.makeIPackage7(ref.value))
  }

  private fun asIPackage8(): IPackage8 {
    if(pointer == Pointer.NULL) {
      return(IPackage8.ABI.makeIPackage8(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IPackage8.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPackage8.ABI.makeIPackage8(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue(): Package = Package(pointer.getPointer(0))

    public fun setValue(`value`: Package): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI {
    public val IPackageStatics_Instance: IPackageStatics by lazy {
      createIPackageStatics()
    }


    public fun createIPackageStatics(): IPackageStatics {
      val refiid = Guid.REFIID(IPackageStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Package".toHandle(),refiid,interfacePtr)
      val result = IPackageStatics.ABI.makeIPackageStatics(interfacePtr.value)
      return result
    }
  }

  public companion object {
    public fun get_Current() = ABI.IPackageStatics_Instance.get_Current()
  }
}

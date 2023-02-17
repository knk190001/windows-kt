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

public class StorageItemContentProperties(
  ptr: Pointer? = Pointer.NULL,
) : PointerType(ptr), IStorageItemContentProperties, IStorageItemExtraProperties, IWinRTObject {
  public val IStorageItemContentProperties_Interface: IStorageItemContentProperties by lazy {
    asIStorageItemContentProperties()
  }


  public val IStorageItemExtraProperties_Interface: IStorageItemExtraProperties by lazy {
    asIStorageItemExtraProperties()
  }


  public override val IStorageItemContentProperties_Ptr: Pointer? by lazy {
    IStorageItemContentProperties_Interface.IStorageItemContentProperties_Ptr
  }


  public override val IStorageItemExtraProperties_Ptr: Pointer? by lazy {
    IStorageItemExtraProperties_Interface.IStorageItemExtraProperties_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(IStorageItemContentProperties_Interface, IStorageItemExtraProperties_Interface)

  private fun asIStorageItemContentProperties(): IStorageItemContentProperties {
    if(pointer == Pointer.NULL) {
      return(IStorageItemContentProperties.ABI.makeIStorageItemContentProperties(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IStorageItemContentProperties.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStorageItemContentProperties.ABI.makeIStorageItemContentProperties(ref.value))
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
    public fun getValue(): StorageItemContentProperties =
        StorageItemContentProperties(pointer.getPointer(0))

    public fun setValue(`value`: StorageItemContentProperties): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI
}

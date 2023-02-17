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

public class ImageProperties(
  ptr: Pointer? = Pointer.NULL,
) : PointerType(ptr), IImageProperties, IStorageItemExtraProperties, IWinRTObject {
  public val IImageProperties_Interface: IImageProperties by lazy {
    asIImageProperties()
  }


  public val IStorageItemExtraProperties_Interface: IStorageItemExtraProperties by lazy {
    asIStorageItemExtraProperties()
  }


  public override val IImageProperties_Ptr: Pointer? by lazy {
    IImageProperties_Interface.IImageProperties_Ptr
  }


  public override val IStorageItemExtraProperties_Ptr: Pointer? by lazy {
    IStorageItemExtraProperties_Interface.IStorageItemExtraProperties_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(IImageProperties_Interface, IStorageItemExtraProperties_Interface)

  private fun asIImageProperties(): IImageProperties {
    if(pointer == Pointer.NULL) {
      return(IImageProperties.ABI.makeIImageProperties(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IImageProperties.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IImageProperties.ABI.makeIImageProperties(ref.value))
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
    public fun getValue(): ImageProperties = ImageProperties(pointer.getPointer(0))

    public fun setValue(`value`: ImageProperties): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI
}

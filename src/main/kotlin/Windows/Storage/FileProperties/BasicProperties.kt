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

public class BasicProperties(
  ptr: Pointer? = Pointer.NULL,
) : PointerType(ptr), IBasicProperties, IStorageItemExtraProperties, IWinRTObject {
  public val IBasicProperties_Interface: IBasicProperties by lazy {
    asIBasicProperties()
  }


  public val IStorageItemExtraProperties_Interface: IStorageItemExtraProperties by lazy {
    asIStorageItemExtraProperties()
  }


  public override val IBasicProperties_Ptr: Pointer? by lazy {
    IBasicProperties_Interface.IBasicProperties_Ptr
  }


  public override val IStorageItemExtraProperties_Ptr: Pointer? by lazy {
    IStorageItemExtraProperties_Interface.IStorageItemExtraProperties_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(IBasicProperties_Interface, IStorageItemExtraProperties_Interface)

  private fun asIBasicProperties(): IBasicProperties {
    if(pointer == Pointer.NULL) {
      return(IBasicProperties.ABI.makeIBasicProperties(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IBasicProperties.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBasicProperties.ABI.makeIBasicProperties(ref.value))
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
    public fun getValue(): BasicProperties = BasicProperties(pointer.getPointer(0))

    public fun setValue(`value`: BasicProperties): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI
}

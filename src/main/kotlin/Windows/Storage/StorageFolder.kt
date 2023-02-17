package Windows.Storage

import Windows.Storage.Search.IStorageFolderQueryOperations
import Windows.System.User
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
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
import kotlin.String
import kotlin.Unit

public class StorageFolder(
  ptr: Pointer? = Pointer.NULL,
) : PointerType(ptr), IStorageFolder, IStorageItem, IStorageFolderQueryOperations,
    IStorageItemProperties, IStorageItemProperties2, IStorageItem2, IStorageFolder2,
    IStorageItemPropertiesWithProvider, IStorageFolder3, IWinRTObject {
  public val IStorageFolder_Interface: IStorageFolder by lazy {
    asIStorageFolder()
  }


  public val IStorageItem_Interface: IStorageItem by lazy {
    asIStorageItem()
  }


  public val IStorageFolderQueryOperations_Interface: IStorageFolderQueryOperations by lazy {
    asIStorageFolderQueryOperations()
  }


  public val IStorageItemProperties_Interface: IStorageItemProperties by lazy {
    asIStorageItemProperties()
  }


  public val IStorageItemProperties2_Interface: IStorageItemProperties2 by lazy {
    asIStorageItemProperties2()
  }


  public val IStorageItem2_Interface: IStorageItem2 by lazy {
    asIStorageItem2()
  }


  public val IStorageFolder2_Interface: IStorageFolder2 by lazy {
    asIStorageFolder2()
  }


  public val IStorageItemPropertiesWithProvider_Interface: IStorageItemPropertiesWithProvider by
      lazy {
    asIStorageItemPropertiesWithProvider()
  }


  public val IStorageFolder3_Interface: IStorageFolder3 by lazy {
    asIStorageFolder3()
  }


  public override val IStorageFolder_Ptr: Pointer? by lazy {
    IStorageFolder_Interface.IStorageFolder_Ptr
  }


  public override val IStorageItem_Ptr: Pointer? by lazy {
    IStorageItem_Interface.IStorageItem_Ptr
  }


  public override val IStorageFolderQueryOperations_Ptr: Pointer? by lazy {
    IStorageFolderQueryOperations_Interface.IStorageFolderQueryOperations_Ptr
  }


  public override val IStorageItemProperties_Ptr: Pointer? by lazy {
    IStorageItemProperties_Interface.IStorageItemProperties_Ptr
  }


  public override val IStorageItemProperties2_Ptr: Pointer? by lazy {
    IStorageItemProperties2_Interface.IStorageItemProperties2_Ptr
  }


  public override val IStorageItem2_Ptr: Pointer? by lazy {
    IStorageItem2_Interface.IStorageItem2_Ptr
  }


  public override val IStorageFolder2_Ptr: Pointer? by lazy {
    IStorageFolder2_Interface.IStorageFolder2_Ptr
  }


  public override val IStorageItemPropertiesWithProvider_Ptr: Pointer? by lazy {
    IStorageItemPropertiesWithProvider_Interface.IStorageItemPropertiesWithProvider_Ptr
  }


  public override val IStorageFolder3_Ptr: Pointer? by lazy {
    IStorageFolder3_Interface.IStorageFolder3_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(IStorageFolder_Interface, IStorageItem_Interface,
        IStorageFolderQueryOperations_Interface, IStorageItemProperties_Interface,
        IStorageItemProperties2_Interface, IStorageItem2_Interface, IStorageFolder2_Interface,
        IStorageItemPropertiesWithProvider_Interface, IStorageFolder3_Interface)

  private fun asIStorageFolder(): IStorageFolder {
    if(pointer == Pointer.NULL) {
      return(IStorageFolder.ABI.makeIStorageFolder(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IStorageFolder.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStorageFolder.ABI.makeIStorageFolder(ref.value))
  }

  private fun asIStorageItem(): IStorageItem {
    if(pointer == Pointer.NULL) {
      return(IStorageItem.ABI.makeIStorageItem(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IStorageItem.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStorageItem.ABI.makeIStorageItem(ref.value))
  }

  private fun asIStorageFolderQueryOperations(): IStorageFolderQueryOperations {
    if(pointer == Pointer.NULL) {
      return(IStorageFolderQueryOperations.ABI.makeIStorageFolderQueryOperations(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IStorageFolderQueryOperations.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStorageFolderQueryOperations.ABI.makeIStorageFolderQueryOperations(ref.value))
  }

  private fun asIStorageItemProperties(): IStorageItemProperties {
    if(pointer == Pointer.NULL) {
      return(IStorageItemProperties.ABI.makeIStorageItemProperties(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IStorageItemProperties.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStorageItemProperties.ABI.makeIStorageItemProperties(ref.value))
  }

  private fun asIStorageItemProperties2(): IStorageItemProperties2 {
    if(pointer == Pointer.NULL) {
      return(IStorageItemProperties2.ABI.makeIStorageItemProperties2(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IStorageItemProperties2.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStorageItemProperties2.ABI.makeIStorageItemProperties2(ref.value))
  }

  private fun asIStorageItem2(): IStorageItem2 {
    if(pointer == Pointer.NULL) {
      return(IStorageItem2.ABI.makeIStorageItem2(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IStorageItem2.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStorageItem2.ABI.makeIStorageItem2(ref.value))
  }

  private fun asIStorageFolder2(): IStorageFolder2 {
    if(pointer == Pointer.NULL) {
      return(IStorageFolder2.ABI.makeIStorageFolder2(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IStorageFolder2.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStorageFolder2.ABI.makeIStorageFolder2(ref.value))
  }

  private fun asIStorageItemPropertiesWithProvider(): IStorageItemPropertiesWithProvider {
    if(pointer == Pointer.NULL) {
      return(IStorageItemPropertiesWithProvider.ABI.makeIStorageItemPropertiesWithProvider(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IStorageItemPropertiesWithProvider.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStorageItemPropertiesWithProvider.ABI.makeIStorageItemPropertiesWithProvider(ref.value))
  }

  private fun asIStorageFolder3(): IStorageFolder3 {
    if(pointer == Pointer.NULL) {
      return(IStorageFolder3.ABI.makeIStorageFolder3(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IStorageFolder3.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStorageFolder3.ABI.makeIStorageFolder3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue(): StorageFolder = StorageFolder(pointer.getPointer(0))

    public fun setValue(`value`: StorageFolder): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI {
    public val IStorageFolderStatics2_Instance: IStorageFolderStatics2 by lazy {
      createIStorageFolderStatics2()
    }


    public val IStorageFolderStatics_Instance: IStorageFolderStatics by lazy {
      createIStorageFolderStatics()
    }


    public fun createIStorageFolderStatics2(): IStorageFolderStatics2 {
      val refiid = Guid.REFIID(IStorageFolderStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Storage.StorageFolder".toHandle(),refiid,interfacePtr)
      val result = IStorageFolderStatics2.ABI.makeIStorageFolderStatics2(interfacePtr.value)
      return result
    }

    public fun createIStorageFolderStatics(): IStorageFolderStatics {
      val refiid = Guid.REFIID(IStorageFolderStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Storage.StorageFolder".toHandle(),refiid,interfacePtr)
      val result = IStorageFolderStatics.ABI.makeIStorageFolderStatics(interfacePtr.value)
      return result
    }
  }

  public companion object {
    public fun GetFolderFromPathForUserAsync(user: User, path: String) =
        ABI.IStorageFolderStatics2_Instance.GetFolderFromPathForUserAsync(user, path)

    public fun GetFolderFromPathAsync(path: String) =
        ABI.IStorageFolderStatics_Instance.GetFolderFromPathAsync(path)
  }
}

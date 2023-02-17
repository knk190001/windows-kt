package Windows.Storage

import Windows.Foundation.Uri
import Windows.Storage.Streams.IInputStreamReference
import Windows.Storage.Streams.IRandomAccessStreamReference
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

public class StorageFile(
  ptr: Pointer? = Pointer.NULL,
) : PointerType(ptr), IStorageFile, IInputStreamReference, IRandomAccessStreamReference,
    IStorageItem, IStorageItemProperties, IStorageItemProperties2, IStorageItem2,
    IStorageItemPropertiesWithProvider, IStorageFilePropertiesWithAvailability, IStorageFile2,
    IWinRTObject {
  public val IStorageFile_Interface: IStorageFile by lazy {
    asIStorageFile()
  }


  public val IInputStreamReference_Interface: IInputStreamReference by lazy {
    asIInputStreamReference()
  }


  public val IRandomAccessStreamReference_Interface: IRandomAccessStreamReference by lazy {
    asIRandomAccessStreamReference()
  }


  public val IStorageItem_Interface: IStorageItem by lazy {
    asIStorageItem()
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


  public val IStorageItemPropertiesWithProvider_Interface: IStorageItemPropertiesWithProvider by
      lazy {
    asIStorageItemPropertiesWithProvider()
  }


  public val IStorageFilePropertiesWithAvailability_Interface:
      IStorageFilePropertiesWithAvailability by lazy {
    asIStorageFilePropertiesWithAvailability()
  }


  public val IStorageFile2_Interface: IStorageFile2 by lazy {
    asIStorageFile2()
  }


  public override val IStorageFile_Ptr: Pointer? by lazy {
    IStorageFile_Interface.IStorageFile_Ptr
  }


  public override val IInputStreamReference_Ptr: Pointer? by lazy {
    IInputStreamReference_Interface.IInputStreamReference_Ptr
  }


  public override val IRandomAccessStreamReference_Ptr: Pointer? by lazy {
    IRandomAccessStreamReference_Interface.IRandomAccessStreamReference_Ptr
  }


  public override val IStorageItem_Ptr: Pointer? by lazy {
    IStorageItem_Interface.IStorageItem_Ptr
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


  public override val IStorageItemPropertiesWithProvider_Ptr: Pointer? by lazy {
    IStorageItemPropertiesWithProvider_Interface.IStorageItemPropertiesWithProvider_Ptr
  }


  public override val IStorageFilePropertiesWithAvailability_Ptr: Pointer? by lazy {
    IStorageFilePropertiesWithAvailability_Interface.IStorageFilePropertiesWithAvailability_Ptr
  }


  public override val IStorageFile2_Ptr: Pointer? by lazy {
    IStorageFile2_Interface.IStorageFile2_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(IStorageFile_Interface, IInputStreamReference_Interface,
        IRandomAccessStreamReference_Interface, IStorageItem_Interface,
        IStorageItemProperties_Interface, IStorageItemProperties2_Interface,
        IStorageItem2_Interface, IStorageItemPropertiesWithProvider_Interface,
        IStorageFilePropertiesWithAvailability_Interface, IStorageFile2_Interface)

  private fun asIStorageFile(): IStorageFile {
    if(pointer == Pointer.NULL) {
      return(IStorageFile.ABI.makeIStorageFile(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IStorageFile.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStorageFile.ABI.makeIStorageFile(ref.value))
  }

  private fun asIInputStreamReference(): IInputStreamReference {
    if(pointer == Pointer.NULL) {
      return(IInputStreamReference.ABI.makeIInputStreamReference(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IInputStreamReference.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInputStreamReference.ABI.makeIInputStreamReference(ref.value))
  }

  private fun asIRandomAccessStreamReference(): IRandomAccessStreamReference {
    if(pointer == Pointer.NULL) {
      return(IRandomAccessStreamReference.ABI.makeIRandomAccessStreamReference(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IRandomAccessStreamReference.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRandomAccessStreamReference.ABI.makeIRandomAccessStreamReference(ref.value))
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

  private fun asIStorageItemPropertiesWithProvider(): IStorageItemPropertiesWithProvider {
    if(pointer == Pointer.NULL) {
      return(IStorageItemPropertiesWithProvider.ABI.makeIStorageItemPropertiesWithProvider(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IStorageItemPropertiesWithProvider.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStorageItemPropertiesWithProvider.ABI.makeIStorageItemPropertiesWithProvider(ref.value))
  }

  private fun asIStorageFilePropertiesWithAvailability(): IStorageFilePropertiesWithAvailability {
    if(pointer == Pointer.NULL) {
      return(IStorageFilePropertiesWithAvailability.ABI.makeIStorageFilePropertiesWithAvailability(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IStorageFilePropertiesWithAvailability.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStorageFilePropertiesWithAvailability.ABI.makeIStorageFilePropertiesWithAvailability(ref.value))
  }

  private fun asIStorageFile2(): IStorageFile2 {
    if(pointer == Pointer.NULL) {
      return(IStorageFile2.ABI.makeIStorageFile2(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IStorageFile2.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStorageFile2.ABI.makeIStorageFile2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue(): StorageFile = StorageFile(pointer.getPointer(0))

    public fun setValue(`value`: StorageFile): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI {
    public val IStorageFileStatics_Instance: IStorageFileStatics by lazy {
      createIStorageFileStatics()
    }


    public val IStorageFileStatics2_Instance: IStorageFileStatics2 by lazy {
      createIStorageFileStatics2()
    }


    public fun createIStorageFileStatics(): IStorageFileStatics {
      val refiid = Guid.REFIID(IStorageFileStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Storage.StorageFile".toHandle(),refiid,interfacePtr)
      val result = IStorageFileStatics.ABI.makeIStorageFileStatics(interfacePtr.value)
      return result
    }

    public fun createIStorageFileStatics2(): IStorageFileStatics2 {
      val refiid = Guid.REFIID(IStorageFileStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Storage.StorageFile".toHandle(),refiid,interfacePtr)
      val result = IStorageFileStatics2.ABI.makeIStorageFileStatics2(interfacePtr.value)
      return result
    }
  }

  public companion object {
    public fun GetFileFromPathAsync(path: String) =
        ABI.IStorageFileStatics_Instance.GetFileFromPathAsync(path)

    public fun GetFileFromApplicationUriAsync(uri: Uri) =
        ABI.IStorageFileStatics_Instance.GetFileFromApplicationUriAsync(uri)

    public fun CreateStreamedFileAsync(
      displayNameWithExtension: String,
      dataRequested: StreamedFileDataRequestedHandler,
      thumbnail: IRandomAccessStreamReference,
    ) = ABI.IStorageFileStatics_Instance.CreateStreamedFileAsync(displayNameWithExtension,
        dataRequested, thumbnail)

    public fun ReplaceWithStreamedFileAsync(
      fileToReplace: IStorageFile,
      dataRequested: StreamedFileDataRequestedHandler,
      thumbnail: IRandomAccessStreamReference,
    ) = ABI.IStorageFileStatics_Instance.ReplaceWithStreamedFileAsync(fileToReplace, dataRequested,
        thumbnail)

    public fun CreateStreamedFileFromUriAsync(
      displayNameWithExtension: String,
      uri: Uri,
      thumbnail: IRandomAccessStreamReference,
    ) = ABI.IStorageFileStatics_Instance.CreateStreamedFileFromUriAsync(displayNameWithExtension,
        uri, thumbnail)

    public fun ReplaceWithStreamedFileFromUriAsync(
      fileToReplace: IStorageFile,
      uri: Uri,
      thumbnail: IRandomAccessStreamReference,
    ) = ABI.IStorageFileStatics_Instance.ReplaceWithStreamedFileFromUriAsync(fileToReplace, uri,
        thumbnail)

    public fun GetFileFromPathForUserAsync(user: User, path: String) =
        ABI.IStorageFileStatics2_Instance.GetFileFromPathForUserAsync(user, path)
  }
}

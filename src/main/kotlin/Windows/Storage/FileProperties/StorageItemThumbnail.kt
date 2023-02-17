package Windows.Storage.FileProperties

import Windows.Foundation.IClosable
import Windows.Storage.Streams.IContentTypeProvider
import Windows.Storage.Streams.IInputStream
import Windows.Storage.Streams.IOutputStream
import Windows.Storage.Streams.IRandomAccessStream
import Windows.Storage.Streams.IRandomAccessStreamWithContentType
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

public class StorageItemThumbnail(
  ptr: Pointer? = Pointer.NULL,
) : PointerType(ptr), IRandomAccessStreamWithContentType, IContentTypeProvider, IRandomAccessStream,
    IOutputStream, IClosable, IInputStream, IThumbnailProperties, IWinRTObject {
  public val IRandomAccessStreamWithContentType_Interface: IRandomAccessStreamWithContentType by
      lazy {
    asIRandomAccessStreamWithContentType()
  }


  public val IContentTypeProvider_Interface: IContentTypeProvider by lazy {
    asIContentTypeProvider()
  }


  public val IRandomAccessStream_Interface: IRandomAccessStream by lazy {
    asIRandomAccessStream()
  }


  public val IOutputStream_Interface: IOutputStream by lazy {
    asIOutputStream()
  }


  public val IClosable_Interface: IClosable by lazy {
    asIClosable()
  }


  public val IInputStream_Interface: IInputStream by lazy {
    asIInputStream()
  }


  public val IThumbnailProperties_Interface: IThumbnailProperties by lazy {
    asIThumbnailProperties()
  }


  public override val IRandomAccessStreamWithContentType_Ptr: Pointer? by lazy {
    IRandomAccessStreamWithContentType_Interface.IRandomAccessStreamWithContentType_Ptr
  }


  public override val IContentTypeProvider_Ptr: Pointer? by lazy {
    IContentTypeProvider_Interface.IContentTypeProvider_Ptr
  }


  public override val IRandomAccessStream_Ptr: Pointer? by lazy {
    IRandomAccessStream_Interface.IRandomAccessStream_Ptr
  }


  public override val IOutputStream_Ptr: Pointer? by lazy {
    IOutputStream_Interface.IOutputStream_Ptr
  }


  public override val IClosable_Ptr: Pointer? by lazy {
    IClosable_Interface.IClosable_Ptr
  }


  public override val IInputStream_Ptr: Pointer? by lazy {
    IInputStream_Interface.IInputStream_Ptr
  }


  public override val IThumbnailProperties_Ptr: Pointer? by lazy {
    IThumbnailProperties_Interface.IThumbnailProperties_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(IRandomAccessStreamWithContentType_Interface, IContentTypeProvider_Interface,
        IRandomAccessStream_Interface, IOutputStream_Interface, IClosable_Interface,
        IInputStream_Interface, IThumbnailProperties_Interface)

  private fun asIRandomAccessStreamWithContentType(): IRandomAccessStreamWithContentType {
    if(pointer == Pointer.NULL) {
      return(IRandomAccessStreamWithContentType.ABI.makeIRandomAccessStreamWithContentType(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IRandomAccessStreamWithContentType.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRandomAccessStreamWithContentType.ABI.makeIRandomAccessStreamWithContentType(ref.value))
  }

  private fun asIContentTypeProvider(): IContentTypeProvider {
    if(pointer == Pointer.NULL) {
      return(IContentTypeProvider.ABI.makeIContentTypeProvider(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IContentTypeProvider.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContentTypeProvider.ABI.makeIContentTypeProvider(ref.value))
  }

  private fun asIRandomAccessStream(): IRandomAccessStream {
    if(pointer == Pointer.NULL) {
      return(IRandomAccessStream.ABI.makeIRandomAccessStream(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IRandomAccessStream.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRandomAccessStream.ABI.makeIRandomAccessStream(ref.value))
  }

  private fun asIOutputStream(): IOutputStream {
    if(pointer == Pointer.NULL) {
      return(IOutputStream.ABI.makeIOutputStream(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IOutputStream.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IOutputStream.ABI.makeIOutputStream(ref.value))
  }

  private fun asIClosable(): IClosable {
    if(pointer == Pointer.NULL) {
      return(IClosable.ABI.makeIClosable(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IClosable.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IClosable.ABI.makeIClosable(ref.value))
  }

  private fun asIInputStream(): IInputStream {
    if(pointer == Pointer.NULL) {
      return(IInputStream.ABI.makeIInputStream(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IInputStream.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInputStream.ABI.makeIInputStream(ref.value))
  }

  private fun asIThumbnailProperties(): IThumbnailProperties {
    if(pointer == Pointer.NULL) {
      return(IThumbnailProperties.ABI.makeIThumbnailProperties(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IThumbnailProperties.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IThumbnailProperties.ABI.makeIThumbnailProperties(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue(): StorageItemThumbnail = StorageItemThumbnail(pointer.getPointer(0))

    public fun setValue(`value`: StorageItemThumbnail): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI
}

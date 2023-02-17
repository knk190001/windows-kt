package Windows.Storage

import Windows.Foundation.IClosable
import Windows.Storage.Streams.IOutputStream
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

public class StreamedFileDataRequest(
  ptr: Pointer? = Pointer.NULL,
) : PointerType(ptr), IOutputStream, IClosable, IStreamedFileDataRequest, IWinRTObject {
  public val IOutputStream_Interface: IOutputStream by lazy {
    asIOutputStream()
  }


  public val IClosable_Interface: IClosable by lazy {
    asIClosable()
  }


  public val IStreamedFileDataRequest_Interface: IStreamedFileDataRequest by lazy {
    asIStreamedFileDataRequest()
  }


  public override val IOutputStream_Ptr: Pointer? by lazy {
    IOutputStream_Interface.IOutputStream_Ptr
  }


  public override val IClosable_Ptr: Pointer? by lazy {
    IClosable_Interface.IClosable_Ptr
  }


  public override val IStreamedFileDataRequest_Ptr: Pointer? by lazy {
    IStreamedFileDataRequest_Interface.IStreamedFileDataRequest_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(IOutputStream_Interface, IClosable_Interface,
        IStreamedFileDataRequest_Interface)

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

  private fun asIStreamedFileDataRequest(): IStreamedFileDataRequest {
    if(pointer == Pointer.NULL) {
      return(IStreamedFileDataRequest.ABI.makeIStreamedFileDataRequest(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IStreamedFileDataRequest.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStreamedFileDataRequest.ABI.makeIStreamedFileDataRequest(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue(): StreamedFileDataRequest = StreamedFileDataRequest(pointer.getPointer(0))

    public fun setValue(`value`: StreamedFileDataRequest): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI
}

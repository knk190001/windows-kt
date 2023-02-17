package Windows.Storage.Streams

import Windows.Foundation.Uri
import Windows.Storage.IStorageFile
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

public class RandomAccessStreamReference(
  ptr: Pointer? = Pointer.NULL,
) : PointerType(ptr), IRandomAccessStreamReference, IWinRTObject {
  public val IRandomAccessStreamReference_Interface: IRandomAccessStreamReference by lazy {
    asIRandomAccessStreamReference()
  }


  public override val IRandomAccessStreamReference_Ptr: Pointer? by lazy {
    IRandomAccessStreamReference_Interface.IRandomAccessStreamReference_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(IRandomAccessStreamReference_Interface)

  private fun asIRandomAccessStreamReference(): IRandomAccessStreamReference {
    if(pointer == Pointer.NULL) {
      return(IRandomAccessStreamReference.ABI.makeIRandomAccessStreamReference(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IRandomAccessStreamReference.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRandomAccessStreamReference.ABI.makeIRandomAccessStreamReference(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue(): RandomAccessStreamReference =
        RandomAccessStreamReference(pointer.getPointer(0))

    public fun setValue(`value`: RandomAccessStreamReference): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI {
    public val IRandomAccessStreamReferenceStatics_Instance: IRandomAccessStreamReferenceStatics by
        lazy {
      createIRandomAccessStreamReferenceStatics()
    }


    public fun createIRandomAccessStreamReferenceStatics(): IRandomAccessStreamReferenceStatics {
      val refiid = Guid.REFIID(IRandomAccessStreamReferenceStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Storage.Streams.RandomAccessStreamReference".toHandle(),refiid,interfacePtr)
      val result =
          IRandomAccessStreamReferenceStatics.ABI.makeIRandomAccessStreamReferenceStatics(interfacePtr.value)
      return result
    }
  }

  public companion object {
    public fun CreateFromFile(`file`: IStorageFile) =
        ABI.IRandomAccessStreamReferenceStatics_Instance.CreateFromFile(file)

    public fun CreateFromUri(uri: Uri) =
        ABI.IRandomAccessStreamReferenceStatics_Instance.CreateFromUri(uri)

    public fun CreateFromStream(stream: IRandomAccessStream) =
        ABI.IRandomAccessStreamReferenceStatics_Instance.CreateFromStream(stream)
  }
}

package Windows.Storage

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

public class StorageLibraryChangeReader(
  ptr: Pointer? = Pointer.NULL,
) : PointerType(ptr), IStorageLibraryChangeReader, IStorageLibraryChangeReader2, IWinRTObject {
  public val IStorageLibraryChangeReader_Interface: IStorageLibraryChangeReader by lazy {
    asIStorageLibraryChangeReader()
  }


  public val IStorageLibraryChangeReader2_Interface: IStorageLibraryChangeReader2 by lazy {
    asIStorageLibraryChangeReader2()
  }


  public override val IStorageLibraryChangeReader_Ptr: Pointer? by lazy {
    IStorageLibraryChangeReader_Interface.IStorageLibraryChangeReader_Ptr
  }


  public override val IStorageLibraryChangeReader2_Ptr: Pointer? by lazy {
    IStorageLibraryChangeReader2_Interface.IStorageLibraryChangeReader2_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(IStorageLibraryChangeReader_Interface, IStorageLibraryChangeReader2_Interface)

  private fun asIStorageLibraryChangeReader(): IStorageLibraryChangeReader {
    if(pointer == Pointer.NULL) {
      return(IStorageLibraryChangeReader.ABI.makeIStorageLibraryChangeReader(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IStorageLibraryChangeReader.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStorageLibraryChangeReader.ABI.makeIStorageLibraryChangeReader(ref.value))
  }

  private fun asIStorageLibraryChangeReader2(): IStorageLibraryChangeReader2 {
    if(pointer == Pointer.NULL) {
      return(IStorageLibraryChangeReader2.ABI.makeIStorageLibraryChangeReader2(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IStorageLibraryChangeReader2.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStorageLibraryChangeReader2.ABI.makeIStorageLibraryChangeReader2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue(): StorageLibraryChangeReader =
        StorageLibraryChangeReader(pointer.getPointer(0))

    public fun setValue(`value`: StorageLibraryChangeReader): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI
}

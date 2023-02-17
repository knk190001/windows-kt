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

public class StorageLibraryChange(
  ptr: Pointer? = Pointer.NULL,
) : PointerType(ptr), IStorageLibraryChange, IWinRTObject {
  public val IStorageLibraryChange_Interface: IStorageLibraryChange by lazy {
    asIStorageLibraryChange()
  }


  public override val IStorageLibraryChange_Ptr: Pointer? by lazy {
    IStorageLibraryChange_Interface.IStorageLibraryChange_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(IStorageLibraryChange_Interface)

  private fun asIStorageLibraryChange(): IStorageLibraryChange {
    if(pointer == Pointer.NULL) {
      return(IStorageLibraryChange.ABI.makeIStorageLibraryChange(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IStorageLibraryChange.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStorageLibraryChange.ABI.makeIStorageLibraryChange(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue(): StorageLibraryChange = StorageLibraryChange(pointer.getPointer(0))

    public fun setValue(`value`: StorageLibraryChange): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI
}

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

public class StorageLibraryChangeTracker(
  ptr: Pointer? = Pointer.NULL,
) : PointerType(ptr), IStorageLibraryChangeTracker, IStorageLibraryChangeTracker2, IWinRTObject {
  public val IStorageLibraryChangeTracker_Interface: IStorageLibraryChangeTracker by lazy {
    asIStorageLibraryChangeTracker()
  }


  public val IStorageLibraryChangeTracker2_Interface: IStorageLibraryChangeTracker2 by lazy {
    asIStorageLibraryChangeTracker2()
  }


  public override val IStorageLibraryChangeTracker_Ptr: Pointer? by lazy {
    IStorageLibraryChangeTracker_Interface.IStorageLibraryChangeTracker_Ptr
  }


  public override val IStorageLibraryChangeTracker2_Ptr: Pointer? by lazy {
    IStorageLibraryChangeTracker2_Interface.IStorageLibraryChangeTracker2_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(IStorageLibraryChangeTracker_Interface, IStorageLibraryChangeTracker2_Interface)

  private fun asIStorageLibraryChangeTracker(): IStorageLibraryChangeTracker {
    if(pointer == Pointer.NULL) {
      return(IStorageLibraryChangeTracker.ABI.makeIStorageLibraryChangeTracker(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IStorageLibraryChangeTracker.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStorageLibraryChangeTracker.ABI.makeIStorageLibraryChangeTracker(ref.value))
  }

  private fun asIStorageLibraryChangeTracker2(): IStorageLibraryChangeTracker2 {
    if(pointer == Pointer.NULL) {
      return(IStorageLibraryChangeTracker2.ABI.makeIStorageLibraryChangeTracker2(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IStorageLibraryChangeTracker2.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStorageLibraryChangeTracker2.ABI.makeIStorageLibraryChangeTracker2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue(): StorageLibraryChangeTracker =
        StorageLibraryChangeTracker(pointer.getPointer(0))

    public fun setValue(`value`: StorageLibraryChangeTracker): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI
}

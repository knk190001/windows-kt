package Windows.Storage.Search

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

public class StorageFolderQueryResult(
  ptr: Pointer? = Pointer.NULL,
) : PointerType(ptr), IStorageFolderQueryResult, IStorageQueryResultBase, IWinRTObject {
  public val IStorageFolderQueryResult_Interface: IStorageFolderQueryResult by lazy {
    asIStorageFolderQueryResult()
  }


  public val IStorageQueryResultBase_Interface: IStorageQueryResultBase by lazy {
    asIStorageQueryResultBase()
  }


  public override val IStorageFolderQueryResult_Ptr: Pointer? by lazy {
    IStorageFolderQueryResult_Interface.IStorageFolderQueryResult_Ptr
  }


  public override val IStorageQueryResultBase_Ptr: Pointer? by lazy {
    IStorageQueryResultBase_Interface.IStorageQueryResultBase_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(IStorageFolderQueryResult_Interface, IStorageQueryResultBase_Interface)

  private fun asIStorageFolderQueryResult(): IStorageFolderQueryResult {
    if(pointer == Pointer.NULL) {
      return(IStorageFolderQueryResult.ABI.makeIStorageFolderQueryResult(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IStorageFolderQueryResult.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStorageFolderQueryResult.ABI.makeIStorageFolderQueryResult(ref.value))
  }

  private fun asIStorageQueryResultBase(): IStorageQueryResultBase {
    if(pointer == Pointer.NULL) {
      return(IStorageQueryResultBase.ABI.makeIStorageQueryResultBase(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IStorageQueryResultBase.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStorageQueryResultBase.ABI.makeIStorageQueryResultBase(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue(): StorageFolderQueryResult =
        StorageFolderQueryResult(pointer.getPointer(0))

    public fun setValue(`value`: StorageFolderQueryResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI
}

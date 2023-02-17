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

public class StorageItemQueryResult(
  ptr: Pointer? = Pointer.NULL,
) : PointerType(ptr), IStorageItemQueryResult, IStorageQueryResultBase, IWinRTObject {
  public val IStorageItemQueryResult_Interface: IStorageItemQueryResult by lazy {
    asIStorageItemQueryResult()
  }


  public val IStorageQueryResultBase_Interface: IStorageQueryResultBase by lazy {
    asIStorageQueryResultBase()
  }


  public override val IStorageItemQueryResult_Ptr: Pointer? by lazy {
    IStorageItemQueryResult_Interface.IStorageItemQueryResult_Ptr
  }


  public override val IStorageQueryResultBase_Ptr: Pointer? by lazy {
    IStorageQueryResultBase_Interface.IStorageQueryResultBase_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(IStorageItemQueryResult_Interface, IStorageQueryResultBase_Interface)

  private fun asIStorageItemQueryResult(): IStorageItemQueryResult {
    if(pointer == Pointer.NULL) {
      return(IStorageItemQueryResult.ABI.makeIStorageItemQueryResult(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IStorageItemQueryResult.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStorageItemQueryResult.ABI.makeIStorageItemQueryResult(ref.value))
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
    public fun getValue(): StorageItemQueryResult = StorageItemQueryResult(pointer.getPointer(0))

    public fun setValue(`value`: StorageItemQueryResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI
}

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

public class StorageFileQueryResult(
  ptr: Pointer? = Pointer.NULL,
) : PointerType(ptr), IStorageFileQueryResult, IStorageQueryResultBase, IStorageFileQueryResult2,
    IWinRTObject {
  public val IStorageFileQueryResult_Interface: IStorageFileQueryResult by lazy {
    asIStorageFileQueryResult()
  }


  public val IStorageQueryResultBase_Interface: IStorageQueryResultBase by lazy {
    asIStorageQueryResultBase()
  }


  public val IStorageFileQueryResult2_Interface: IStorageFileQueryResult2 by lazy {
    asIStorageFileQueryResult2()
  }


  public override val IStorageFileQueryResult_Ptr: Pointer? by lazy {
    IStorageFileQueryResult_Interface.IStorageFileQueryResult_Ptr
  }


  public override val IStorageQueryResultBase_Ptr: Pointer? by lazy {
    IStorageQueryResultBase_Interface.IStorageQueryResultBase_Ptr
  }


  public override val IStorageFileQueryResult2_Ptr: Pointer? by lazy {
    IStorageFileQueryResult2_Interface.IStorageFileQueryResult2_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(IStorageFileQueryResult_Interface, IStorageQueryResultBase_Interface,
        IStorageFileQueryResult2_Interface)

  private fun asIStorageFileQueryResult(): IStorageFileQueryResult {
    if(pointer == Pointer.NULL) {
      return(IStorageFileQueryResult.ABI.makeIStorageFileQueryResult(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IStorageFileQueryResult.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStorageFileQueryResult.ABI.makeIStorageFileQueryResult(ref.value))
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

  private fun asIStorageFileQueryResult2(): IStorageFileQueryResult2 {
    if(pointer == Pointer.NULL) {
      return(IStorageFileQueryResult2.ABI.makeIStorageFileQueryResult2(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IStorageFileQueryResult2.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStorageFileQueryResult2.ABI.makeIStorageFileQueryResult2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue(): StorageFileQueryResult = StorageFileQueryResult(pointer.getPointer(0))

    public fun setValue(`value`: StorageFileQueryResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI
}

package Windows.Storage

import Windows.Foundation.IClosable
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

public class StorageStreamTransaction(
  ptr: Pointer? = Pointer.NULL,
) : PointerType(ptr), IStorageStreamTransaction, IClosable, IWinRTObject {
  public val IStorageStreamTransaction_Interface: IStorageStreamTransaction by lazy {
    asIStorageStreamTransaction()
  }


  public val IClosable_Interface: IClosable by lazy {
    asIClosable()
  }


  public override val IStorageStreamTransaction_Ptr: Pointer? by lazy {
    IStorageStreamTransaction_Interface.IStorageStreamTransaction_Ptr
  }


  public override val IClosable_Ptr: Pointer? by lazy {
    IClosable_Interface.IClosable_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(IStorageStreamTransaction_Interface, IClosable_Interface)

  private fun asIStorageStreamTransaction(): IStorageStreamTransaction {
    if(pointer == Pointer.NULL) {
      return(IStorageStreamTransaction.ABI.makeIStorageStreamTransaction(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IStorageStreamTransaction.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStorageStreamTransaction.ABI.makeIStorageStreamTransaction(ref.value))
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

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue(): StorageStreamTransaction =
        StorageStreamTransaction(pointer.getPointer(0))

    public fun setValue(`value`: StorageStreamTransaction): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI
}

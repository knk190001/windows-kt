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

public class StorageProvider(
  ptr: Pointer? = Pointer.NULL,
) : PointerType(ptr), IStorageProvider, IStorageProvider2, IWinRTObject {
  public val IStorageProvider_Interface: IStorageProvider by lazy {
    asIStorageProvider()
  }


  public val IStorageProvider2_Interface: IStorageProvider2 by lazy {
    asIStorageProvider2()
  }


  public override val IStorageProvider_Ptr: Pointer? by lazy {
    IStorageProvider_Interface.IStorageProvider_Ptr
  }


  public override val IStorageProvider2_Ptr: Pointer? by lazy {
    IStorageProvider2_Interface.IStorageProvider2_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(IStorageProvider_Interface, IStorageProvider2_Interface)

  private fun asIStorageProvider(): IStorageProvider {
    if(pointer == Pointer.NULL) {
      return(IStorageProvider.ABI.makeIStorageProvider(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IStorageProvider.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStorageProvider.ABI.makeIStorageProvider(ref.value))
  }

  private fun asIStorageProvider2(): IStorageProvider2 {
    if(pointer == Pointer.NULL) {
      return(IStorageProvider2.ABI.makeIStorageProvider2(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IStorageProvider2.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStorageProvider2.ABI.makeIStorageProvider2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue(): StorageProvider = StorageProvider(pointer.getPointer(0))

    public fun setValue(`value`: StorageProvider): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI
}

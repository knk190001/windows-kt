package Windows.UI.Notifications

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

public class ToastCollectionManager(
  ptr: Pointer? = Pointer.NULL,
) : PointerType(ptr), IToastCollectionManager, IWinRTObject {
  public val IToastCollectionManager_Interface: IToastCollectionManager by lazy {
    asIToastCollectionManager()
  }


  public override val IToastCollectionManager_Ptr: Pointer? by lazy {
    IToastCollectionManager_Interface.IToastCollectionManager_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(IToastCollectionManager_Interface)

  private fun asIToastCollectionManager(): IToastCollectionManager {
    if(pointer == Pointer.NULL) {
      return(IToastCollectionManager.ABI.makeIToastCollectionManager(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IToastCollectionManager.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IToastCollectionManager.ABI.makeIToastCollectionManager(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue(): ToastCollectionManager = ToastCollectionManager(pointer.getPointer(0))

    public fun setValue(`value`: ToastCollectionManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI
}

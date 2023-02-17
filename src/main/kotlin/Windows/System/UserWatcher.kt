package Windows.System

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

public class UserWatcher(
  ptr: Pointer? = Pointer.NULL,
) : PointerType(ptr), IUserWatcher, IWinRTObject {
  public val IUserWatcher_Interface: IUserWatcher by lazy {
    asIUserWatcher()
  }


  public override val IUserWatcher_Ptr: Pointer? by lazy {
    IUserWatcher_Interface.IUserWatcher_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(IUserWatcher_Interface)

  private fun asIUserWatcher(): IUserWatcher {
    if(pointer == Pointer.NULL) {
      return(IUserWatcher.ABI.makeIUserWatcher(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IUserWatcher.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUserWatcher.ABI.makeIUserWatcher(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue(): UserWatcher = UserWatcher(pointer.getPointer(0))

    public fun setValue(`value`: UserWatcher): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI
}

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

public class BadgeUpdater(
  ptr: Pointer? = Pointer.NULL,
) : PointerType(ptr), IBadgeUpdater, IWinRTObject {
  public val IBadgeUpdater_Interface: IBadgeUpdater by lazy {
    asIBadgeUpdater()
  }


  public override val IBadgeUpdater_Ptr: Pointer? by lazy {
    IBadgeUpdater_Interface.IBadgeUpdater_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(IBadgeUpdater_Interface)

  private fun asIBadgeUpdater(): IBadgeUpdater {
    if(pointer == Pointer.NULL) {
      return(IBadgeUpdater.ABI.makeIBadgeUpdater(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IBadgeUpdater.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBadgeUpdater.ABI.makeIBadgeUpdater(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue(): BadgeUpdater = BadgeUpdater(pointer.getPointer(0))

    public fun setValue(`value`: BadgeUpdater): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI
}

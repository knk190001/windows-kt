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

public class TileFlyoutUpdater(
  ptr: Pointer? = Pointer.NULL,
) : PointerType(ptr), ITileFlyoutUpdater, IWinRTObject {
  public val ITileFlyoutUpdater_Interface: ITileFlyoutUpdater by lazy {
    asITileFlyoutUpdater()
  }


  public override val ITileFlyoutUpdater_Ptr: Pointer? by lazy {
    ITileFlyoutUpdater_Interface.ITileFlyoutUpdater_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(ITileFlyoutUpdater_Interface)

  private fun asITileFlyoutUpdater(): ITileFlyoutUpdater {
    if(pointer == Pointer.NULL) {
      return(ITileFlyoutUpdater.ABI.makeITileFlyoutUpdater(Pointer.NULL))
    }
    val refiid = Guid.REFIID(ITileFlyoutUpdater.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITileFlyoutUpdater.ABI.makeITileFlyoutUpdater(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue(): TileFlyoutUpdater = TileFlyoutUpdater(pointer.getPointer(0))

    public fun setValue(`value`: TileFlyoutUpdater): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI
}

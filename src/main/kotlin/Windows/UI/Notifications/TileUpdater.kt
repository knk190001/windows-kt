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

public class TileUpdater(
  ptr: Pointer? = Pointer.NULL,
) : PointerType(ptr), ITileUpdater, ITileUpdater2, IWinRTObject {
  public val ITileUpdater_Interface: ITileUpdater by lazy {
    asITileUpdater()
  }


  public val ITileUpdater2_Interface: ITileUpdater2 by lazy {
    asITileUpdater2()
  }


  public override val ITileUpdater_Ptr: Pointer? by lazy {
    ITileUpdater_Interface.ITileUpdater_Ptr
  }


  public override val ITileUpdater2_Ptr: Pointer? by lazy {
    ITileUpdater2_Interface.ITileUpdater2_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(ITileUpdater_Interface, ITileUpdater2_Interface)

  private fun asITileUpdater(): ITileUpdater {
    if(pointer == Pointer.NULL) {
      return(ITileUpdater.ABI.makeITileUpdater(Pointer.NULL))
    }
    val refiid = Guid.REFIID(ITileUpdater.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITileUpdater.ABI.makeITileUpdater(ref.value))
  }

  private fun asITileUpdater2(): ITileUpdater2 {
    if(pointer == Pointer.NULL) {
      return(ITileUpdater2.ABI.makeITileUpdater2(Pointer.NULL))
    }
    val refiid = Guid.REFIID(ITileUpdater2.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITileUpdater2.ABI.makeITileUpdater2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue(): TileUpdater = TileUpdater(pointer.getPointer(0))

    public fun setValue(`value`: TileUpdater): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI
}

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

public class TileUpdateManagerForUser(
  ptr: Pointer? = Pointer.NULL,
) : PointerType(ptr), ITileUpdateManagerForUser, IWinRTObject {
  public val ITileUpdateManagerForUser_Interface: ITileUpdateManagerForUser by lazy {
    asITileUpdateManagerForUser()
  }


  public override val ITileUpdateManagerForUser_Ptr: Pointer? by lazy {
    ITileUpdateManagerForUser_Interface.ITileUpdateManagerForUser_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(ITileUpdateManagerForUser_Interface)

  private fun asITileUpdateManagerForUser(): ITileUpdateManagerForUser {
    if(pointer == Pointer.NULL) {
      return(ITileUpdateManagerForUser.ABI.makeITileUpdateManagerForUser(Pointer.NULL))
    }
    val refiid = Guid.REFIID(ITileUpdateManagerForUser.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITileUpdateManagerForUser.ABI.makeITileUpdateManagerForUser(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue(): TileUpdateManagerForUser =
        TileUpdateManagerForUser(pointer.getPointer(0))

    public fun setValue(`value`: TileUpdateManagerForUser): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI
}

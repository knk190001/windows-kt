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

public class BadgeUpdateManagerForUser(
  ptr: Pointer? = Pointer.NULL,
) : PointerType(ptr), IBadgeUpdateManagerForUser, IWinRTObject {
  public val IBadgeUpdateManagerForUser_Interface: IBadgeUpdateManagerForUser by lazy {
    asIBadgeUpdateManagerForUser()
  }


  public override val IBadgeUpdateManagerForUser_Ptr: Pointer? by lazy {
    IBadgeUpdateManagerForUser_Interface.IBadgeUpdateManagerForUser_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(IBadgeUpdateManagerForUser_Interface)

  private fun asIBadgeUpdateManagerForUser(): IBadgeUpdateManagerForUser {
    if(pointer == Pointer.NULL) {
      return(IBadgeUpdateManagerForUser.ABI.makeIBadgeUpdateManagerForUser(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IBadgeUpdateManagerForUser.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBadgeUpdateManagerForUser.ABI.makeIBadgeUpdateManagerForUser(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue(): BadgeUpdateManagerForUser =
        BadgeUpdateManagerForUser(pointer.getPointer(0))

    public fun setValue(`value`: BadgeUpdateManagerForUser): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI
}

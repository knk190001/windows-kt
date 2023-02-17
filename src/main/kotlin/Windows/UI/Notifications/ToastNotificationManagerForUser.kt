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

public class ToastNotificationManagerForUser(
  ptr: Pointer? = Pointer.NULL,
) : PointerType(ptr), IToastNotificationManagerForUser, IToastNotificationManagerForUser2,
    IToastNotificationManagerForUser3, IWinRTObject {
  public val IToastNotificationManagerForUser_Interface: IToastNotificationManagerForUser by lazy {
    asIToastNotificationManagerForUser()
  }


  public val IToastNotificationManagerForUser2_Interface: IToastNotificationManagerForUser2 by
      lazy {
    asIToastNotificationManagerForUser2()
  }


  public val IToastNotificationManagerForUser3_Interface: IToastNotificationManagerForUser3 by
      lazy {
    asIToastNotificationManagerForUser3()
  }


  public override val IToastNotificationManagerForUser_Ptr: Pointer? by lazy {
    IToastNotificationManagerForUser_Interface.IToastNotificationManagerForUser_Ptr
  }


  public override val IToastNotificationManagerForUser2_Ptr: Pointer? by lazy {
    IToastNotificationManagerForUser2_Interface.IToastNotificationManagerForUser2_Ptr
  }


  public override val IToastNotificationManagerForUser3_Ptr: Pointer? by lazy {
    IToastNotificationManagerForUser3_Interface.IToastNotificationManagerForUser3_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(IToastNotificationManagerForUser_Interface,
        IToastNotificationManagerForUser2_Interface, IToastNotificationManagerForUser3_Interface)

  private fun asIToastNotificationManagerForUser(): IToastNotificationManagerForUser {
    if(pointer == Pointer.NULL) {
      return(IToastNotificationManagerForUser.ABI.makeIToastNotificationManagerForUser(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IToastNotificationManagerForUser.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IToastNotificationManagerForUser.ABI.makeIToastNotificationManagerForUser(ref.value))
  }

  private fun asIToastNotificationManagerForUser2(): IToastNotificationManagerForUser2 {
    if(pointer == Pointer.NULL) {
      return(IToastNotificationManagerForUser2.ABI.makeIToastNotificationManagerForUser2(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IToastNotificationManagerForUser2.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IToastNotificationManagerForUser2.ABI.makeIToastNotificationManagerForUser2(ref.value))
  }

  private fun asIToastNotificationManagerForUser3(): IToastNotificationManagerForUser3 {
    if(pointer == Pointer.NULL) {
      return(IToastNotificationManagerForUser3.ABI.makeIToastNotificationManagerForUser3(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IToastNotificationManagerForUser3.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IToastNotificationManagerForUser3.ABI.makeIToastNotificationManagerForUser3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue(): ToastNotificationManagerForUser =
        ToastNotificationManagerForUser(pointer.getPointer(0))

    public fun setValue(`value`: ToastNotificationManagerForUser): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI
}

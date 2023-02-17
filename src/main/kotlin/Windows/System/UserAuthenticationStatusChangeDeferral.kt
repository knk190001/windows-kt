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

public class UserAuthenticationStatusChangeDeferral(
  ptr: Pointer? = Pointer.NULL,
) : PointerType(ptr), IUserAuthenticationStatusChangeDeferral, IWinRTObject {
  public val IUserAuthenticationStatusChangeDeferral_Interface:
      IUserAuthenticationStatusChangeDeferral by lazy {
    asIUserAuthenticationStatusChangeDeferral()
  }


  public override val IUserAuthenticationStatusChangeDeferral_Ptr: Pointer? by lazy {
    IUserAuthenticationStatusChangeDeferral_Interface.IUserAuthenticationStatusChangeDeferral_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(IUserAuthenticationStatusChangeDeferral_Interface)

  private fun asIUserAuthenticationStatusChangeDeferral(): IUserAuthenticationStatusChangeDeferral {
    if(pointer == Pointer.NULL) {
      return(IUserAuthenticationStatusChangeDeferral.ABI.makeIUserAuthenticationStatusChangeDeferral(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IUserAuthenticationStatusChangeDeferral.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUserAuthenticationStatusChangeDeferral.ABI.makeIUserAuthenticationStatusChangeDeferral(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue(): UserAuthenticationStatusChangeDeferral =
        UserAuthenticationStatusChangeDeferral(pointer.getPointer(0))

    public fun setValue(`value`: UserAuthenticationStatusChangeDeferral): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI
}

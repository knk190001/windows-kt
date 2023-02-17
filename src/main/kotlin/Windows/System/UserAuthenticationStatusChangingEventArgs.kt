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

public class UserAuthenticationStatusChangingEventArgs(
  ptr: Pointer? = Pointer.NULL,
) : PointerType(ptr), IUserAuthenticationStatusChangingEventArgs, IWinRTObject {
  public val IUserAuthenticationStatusChangingEventArgs_Interface:
      IUserAuthenticationStatusChangingEventArgs by lazy {
    asIUserAuthenticationStatusChangingEventArgs()
  }


  public override val IUserAuthenticationStatusChangingEventArgs_Ptr: Pointer? by lazy {
    IUserAuthenticationStatusChangingEventArgs_Interface.IUserAuthenticationStatusChangingEventArgs_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(IUserAuthenticationStatusChangingEventArgs_Interface)

  private fun asIUserAuthenticationStatusChangingEventArgs():
      IUserAuthenticationStatusChangingEventArgs {
    if(pointer == Pointer.NULL) {
      return(IUserAuthenticationStatusChangingEventArgs.ABI.makeIUserAuthenticationStatusChangingEventArgs(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IUserAuthenticationStatusChangingEventArgs.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUserAuthenticationStatusChangingEventArgs.ABI.makeIUserAuthenticationStatusChangingEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue(): UserAuthenticationStatusChangingEventArgs =
        UserAuthenticationStatusChangingEventArgs(pointer.getPointer(0))

    public fun setValue(`value`: UserAuthenticationStatusChangingEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI
}

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

public class UserChangedEventArgs(
  ptr: Pointer? = Pointer.NULL,
) : PointerType(ptr), IUserChangedEventArgs, IUserChangedEventArgs2, IWinRTObject {
  public val IUserChangedEventArgs_Interface: IUserChangedEventArgs by lazy {
    asIUserChangedEventArgs()
  }


  public val IUserChangedEventArgs2_Interface: IUserChangedEventArgs2 by lazy {
    asIUserChangedEventArgs2()
  }


  public override val IUserChangedEventArgs_Ptr: Pointer? by lazy {
    IUserChangedEventArgs_Interface.IUserChangedEventArgs_Ptr
  }


  public override val IUserChangedEventArgs2_Ptr: Pointer? by lazy {
    IUserChangedEventArgs2_Interface.IUserChangedEventArgs2_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(IUserChangedEventArgs_Interface, IUserChangedEventArgs2_Interface)

  private fun asIUserChangedEventArgs(): IUserChangedEventArgs {
    if(pointer == Pointer.NULL) {
      return(IUserChangedEventArgs.ABI.makeIUserChangedEventArgs(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IUserChangedEventArgs.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUserChangedEventArgs.ABI.makeIUserChangedEventArgs(ref.value))
  }

  private fun asIUserChangedEventArgs2(): IUserChangedEventArgs2 {
    if(pointer == Pointer.NULL) {
      return(IUserChangedEventArgs2.ABI.makeIUserChangedEventArgs2(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IUserChangedEventArgs2.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUserChangedEventArgs2.ABI.makeIUserChangedEventArgs2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue(): UserChangedEventArgs = UserChangedEventArgs(pointer.getPointer(0))

    public fun setValue(`value`: UserChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI
}

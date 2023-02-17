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

public class ToastActivatedEventArgs(
  ptr: Pointer? = Pointer.NULL,
) : PointerType(ptr), IToastActivatedEventArgs, IToastActivatedEventArgs2, IWinRTObject {
  public val IToastActivatedEventArgs_Interface: IToastActivatedEventArgs by lazy {
    asIToastActivatedEventArgs()
  }


  public val IToastActivatedEventArgs2_Interface: IToastActivatedEventArgs2 by lazy {
    asIToastActivatedEventArgs2()
  }


  public override val IToastActivatedEventArgs_Ptr: Pointer? by lazy {
    IToastActivatedEventArgs_Interface.IToastActivatedEventArgs_Ptr
  }


  public override val IToastActivatedEventArgs2_Ptr: Pointer? by lazy {
    IToastActivatedEventArgs2_Interface.IToastActivatedEventArgs2_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(IToastActivatedEventArgs_Interface, IToastActivatedEventArgs2_Interface)

  private fun asIToastActivatedEventArgs(): IToastActivatedEventArgs {
    if(pointer == Pointer.NULL) {
      return(IToastActivatedEventArgs.ABI.makeIToastActivatedEventArgs(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IToastActivatedEventArgs.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IToastActivatedEventArgs.ABI.makeIToastActivatedEventArgs(ref.value))
  }

  private fun asIToastActivatedEventArgs2(): IToastActivatedEventArgs2 {
    if(pointer == Pointer.NULL) {
      return(IToastActivatedEventArgs2.ABI.makeIToastActivatedEventArgs2(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IToastActivatedEventArgs2.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IToastActivatedEventArgs2.ABI.makeIToastActivatedEventArgs2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue(): ToastActivatedEventArgs = ToastActivatedEventArgs(pointer.getPointer(0))

    public fun setValue(`value`: ToastActivatedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI
}

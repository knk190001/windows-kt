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

public class ToastFailedEventArgs(
  ptr: Pointer? = Pointer.NULL,
) : PointerType(ptr), IToastFailedEventArgs, IWinRTObject {
  public val IToastFailedEventArgs_Interface: IToastFailedEventArgs by lazy {
    asIToastFailedEventArgs()
  }


  public override val IToastFailedEventArgs_Ptr: Pointer? by lazy {
    IToastFailedEventArgs_Interface.IToastFailedEventArgs_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(IToastFailedEventArgs_Interface)

  private fun asIToastFailedEventArgs(): IToastFailedEventArgs {
    if(pointer == Pointer.NULL) {
      return(IToastFailedEventArgs.ABI.makeIToastFailedEventArgs(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IToastFailedEventArgs.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IToastFailedEventArgs.ABI.makeIToastFailedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue(): ToastFailedEventArgs = ToastFailedEventArgs(pointer.getPointer(0))

    public fun setValue(`value`: ToastFailedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI
}

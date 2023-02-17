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

public class ToastDismissedEventArgs(
  ptr: Pointer? = Pointer.NULL,
) : PointerType(ptr), IToastDismissedEventArgs, IWinRTObject {
  public val IToastDismissedEventArgs_Interface: IToastDismissedEventArgs by lazy {
    asIToastDismissedEventArgs()
  }


  public override val IToastDismissedEventArgs_Ptr: Pointer? by lazy {
    IToastDismissedEventArgs_Interface.IToastDismissedEventArgs_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(IToastDismissedEventArgs_Interface)

  private fun asIToastDismissedEventArgs(): IToastDismissedEventArgs {
    if(pointer == Pointer.NULL) {
      return(IToastDismissedEventArgs.ABI.makeIToastDismissedEventArgs(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IToastDismissedEventArgs.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IToastDismissedEventArgs.ABI.makeIToastDismissedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue(): ToastDismissedEventArgs = ToastDismissedEventArgs(pointer.getPointer(0))

    public fun setValue(`value`: ToastDismissedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI
}

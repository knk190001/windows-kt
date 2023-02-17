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

public class ToastNotifier(
  ptr: Pointer? = Pointer.NULL,
) : PointerType(ptr), IToastNotifier, IToastNotifier2, IToastNotifier3, IWinRTObject {
  public val IToastNotifier_Interface: IToastNotifier by lazy {
    asIToastNotifier()
  }


  public val IToastNotifier2_Interface: IToastNotifier2 by lazy {
    asIToastNotifier2()
  }


  public val IToastNotifier3_Interface: IToastNotifier3 by lazy {
    asIToastNotifier3()
  }


  public override val IToastNotifier_Ptr: Pointer? by lazy {
    IToastNotifier_Interface.IToastNotifier_Ptr
  }


  public override val IToastNotifier2_Ptr: Pointer? by lazy {
    IToastNotifier2_Interface.IToastNotifier2_Ptr
  }


  public override val IToastNotifier3_Ptr: Pointer? by lazy {
    IToastNotifier3_Interface.IToastNotifier3_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(IToastNotifier_Interface, IToastNotifier2_Interface, IToastNotifier3_Interface)

  private fun asIToastNotifier(): IToastNotifier {
    if(pointer == Pointer.NULL) {
      return(IToastNotifier.ABI.makeIToastNotifier(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IToastNotifier.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IToastNotifier.ABI.makeIToastNotifier(ref.value))
  }

  private fun asIToastNotifier2(): IToastNotifier2 {
    if(pointer == Pointer.NULL) {
      return(IToastNotifier2.ABI.makeIToastNotifier2(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IToastNotifier2.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IToastNotifier2.ABI.makeIToastNotifier2(ref.value))
  }

  private fun asIToastNotifier3(): IToastNotifier3 {
    if(pointer == Pointer.NULL) {
      return(IToastNotifier3.ABI.makeIToastNotifier3(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IToastNotifier3.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IToastNotifier3.ABI.makeIToastNotifier3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue(): ToastNotifier = ToastNotifier(pointer.getPointer(0))

    public fun setValue(`value`: ToastNotifier): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI
}

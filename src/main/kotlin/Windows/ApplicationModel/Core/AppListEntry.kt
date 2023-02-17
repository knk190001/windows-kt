package Windows.ApplicationModel.Core

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

public class AppListEntry(
  ptr: Pointer? = Pointer.NULL,
) : PointerType(ptr), IAppListEntry, IAppListEntry2, IAppListEntry3, IAppListEntry4, IWinRTObject {
  public val IAppListEntry_Interface: IAppListEntry by lazy {
    asIAppListEntry()
  }


  public val IAppListEntry2_Interface: IAppListEntry2 by lazy {
    asIAppListEntry2()
  }


  public val IAppListEntry3_Interface: IAppListEntry3 by lazy {
    asIAppListEntry3()
  }


  public val IAppListEntry4_Interface: IAppListEntry4 by lazy {
    asIAppListEntry4()
  }


  public override val IAppListEntry_Ptr: Pointer? by lazy {
    IAppListEntry_Interface.IAppListEntry_Ptr
  }


  public override val IAppListEntry2_Ptr: Pointer? by lazy {
    IAppListEntry2_Interface.IAppListEntry2_Ptr
  }


  public override val IAppListEntry3_Ptr: Pointer? by lazy {
    IAppListEntry3_Interface.IAppListEntry3_Ptr
  }


  public override val IAppListEntry4_Ptr: Pointer? by lazy {
    IAppListEntry4_Interface.IAppListEntry4_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(IAppListEntry_Interface, IAppListEntry2_Interface, IAppListEntry3_Interface,
        IAppListEntry4_Interface)

  private fun asIAppListEntry(): IAppListEntry {
    if(pointer == Pointer.NULL) {
      return(IAppListEntry.ABI.makeIAppListEntry(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IAppListEntry.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppListEntry.ABI.makeIAppListEntry(ref.value))
  }

  private fun asIAppListEntry2(): IAppListEntry2 {
    if(pointer == Pointer.NULL) {
      return(IAppListEntry2.ABI.makeIAppListEntry2(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IAppListEntry2.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppListEntry2.ABI.makeIAppListEntry2(ref.value))
  }

  private fun asIAppListEntry3(): IAppListEntry3 {
    if(pointer == Pointer.NULL) {
      return(IAppListEntry3.ABI.makeIAppListEntry3(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IAppListEntry3.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppListEntry3.ABI.makeIAppListEntry3(ref.value))
  }

  private fun asIAppListEntry4(): IAppListEntry4 {
    if(pointer == Pointer.NULL) {
      return(IAppListEntry4.ABI.makeIAppListEntry4(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IAppListEntry4.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppListEntry4.ABI.makeIAppListEntry4(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue(): AppListEntry = AppListEntry(pointer.getPointer(0))

    public fun setValue(`value`: AppListEntry): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI
}

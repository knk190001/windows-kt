package Windows.ApplicationModel

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

public class AppDisplayInfo(
  ptr: Pointer? = Pointer.NULL,
) : PointerType(ptr), IAppDisplayInfo, IWinRTObject {
  public val IAppDisplayInfo_Interface: IAppDisplayInfo by lazy {
    asIAppDisplayInfo()
  }


  public override val IAppDisplayInfo_Ptr: Pointer? by lazy {
    IAppDisplayInfo_Interface.IAppDisplayInfo_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(IAppDisplayInfo_Interface)

  private fun asIAppDisplayInfo(): IAppDisplayInfo {
    if(pointer == Pointer.NULL) {
      return(IAppDisplayInfo.ABI.makeIAppDisplayInfo(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IAppDisplayInfo.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppDisplayInfo.ABI.makeIAppDisplayInfo(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue(): AppDisplayInfo = AppDisplayInfo(pointer.getPointer(0))

    public fun setValue(`value`: AppDisplayInfo): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI
}

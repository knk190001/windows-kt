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

public class AppInstallerInfo(
  ptr: Pointer? = Pointer.NULL,
) : PointerType(ptr), IAppInstallerInfo, IAppInstallerInfo2, IWinRTObject {
  public val IAppInstallerInfo_Interface: IAppInstallerInfo by lazy {
    asIAppInstallerInfo()
  }


  public val IAppInstallerInfo2_Interface: IAppInstallerInfo2 by lazy {
    asIAppInstallerInfo2()
  }


  public override val IAppInstallerInfo_Ptr: Pointer? by lazy {
    IAppInstallerInfo_Interface.IAppInstallerInfo_Ptr
  }


  public override val IAppInstallerInfo2_Ptr: Pointer? by lazy {
    IAppInstallerInfo2_Interface.IAppInstallerInfo2_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(IAppInstallerInfo_Interface, IAppInstallerInfo2_Interface)

  private fun asIAppInstallerInfo(): IAppInstallerInfo {
    if(pointer == Pointer.NULL) {
      return(IAppInstallerInfo.ABI.makeIAppInstallerInfo(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IAppInstallerInfo.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppInstallerInfo.ABI.makeIAppInstallerInfo(ref.value))
  }

  private fun asIAppInstallerInfo2(): IAppInstallerInfo2 {
    if(pointer == Pointer.NULL) {
      return(IAppInstallerInfo2.ABI.makeIAppInstallerInfo2(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IAppInstallerInfo2.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppInstallerInfo2.ABI.makeIAppInstallerInfo2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue(): AppInstallerInfo = AppInstallerInfo(pointer.getPointer(0))

    public fun setValue(`value`: AppInstallerInfo): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI
}

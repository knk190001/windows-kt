package Windows.ApplicationModel

import Windows.System.User
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
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
import kotlin.String
import kotlin.Unit

public class AppInfo(
  ptr: Pointer? = Pointer.NULL,
) : PointerType(ptr), IAppInfo, IAppInfo2, IAppInfo3, IAppInfo4, IWinRTObject {
  public val IAppInfo_Interface: IAppInfo by lazy {
    asIAppInfo()
  }


  public val IAppInfo2_Interface: IAppInfo2 by lazy {
    asIAppInfo2()
  }


  public val IAppInfo3_Interface: IAppInfo3 by lazy {
    asIAppInfo3()
  }


  public val IAppInfo4_Interface: IAppInfo4 by lazy {
    asIAppInfo4()
  }


  public override val IAppInfo_Ptr: Pointer? by lazy {
    IAppInfo_Interface.IAppInfo_Ptr
  }


  public override val IAppInfo2_Ptr: Pointer? by lazy {
    IAppInfo2_Interface.IAppInfo2_Ptr
  }


  public override val IAppInfo3_Ptr: Pointer? by lazy {
    IAppInfo3_Interface.IAppInfo3_Ptr
  }


  public override val IAppInfo4_Ptr: Pointer? by lazy {
    IAppInfo4_Interface.IAppInfo4_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(IAppInfo_Interface, IAppInfo2_Interface, IAppInfo3_Interface,
        IAppInfo4_Interface)

  private fun asIAppInfo(): IAppInfo {
    if(pointer == Pointer.NULL) {
      return(IAppInfo.ABI.makeIAppInfo(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IAppInfo.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppInfo.ABI.makeIAppInfo(ref.value))
  }

  private fun asIAppInfo2(): IAppInfo2 {
    if(pointer == Pointer.NULL) {
      return(IAppInfo2.ABI.makeIAppInfo2(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IAppInfo2.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppInfo2.ABI.makeIAppInfo2(ref.value))
  }

  private fun asIAppInfo3(): IAppInfo3 {
    if(pointer == Pointer.NULL) {
      return(IAppInfo3.ABI.makeIAppInfo3(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IAppInfo3.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppInfo3.ABI.makeIAppInfo3(ref.value))
  }

  private fun asIAppInfo4(): IAppInfo4 {
    if(pointer == Pointer.NULL) {
      return(IAppInfo4.ABI.makeIAppInfo4(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IAppInfo4.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppInfo4.ABI.makeIAppInfo4(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue(): AppInfo = AppInfo(pointer.getPointer(0))

    public fun setValue(`value`: AppInfo): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI {
    public val IAppInfoStatics_Instance: IAppInfoStatics by lazy {
      createIAppInfoStatics()
    }


    public fun createIAppInfoStatics(): IAppInfoStatics {
      val refiid = Guid.REFIID(IAppInfoStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.AppInfo".toHandle(),refiid,interfacePtr)
      val result = IAppInfoStatics.ABI.makeIAppInfoStatics(interfacePtr.value)
      return result
    }
  }

  public companion object {
    public fun get_Current() = ABI.IAppInfoStatics_Instance.get_Current()

    public fun GetFromAppUserModelId(appUserModelId: String) =
        ABI.IAppInfoStatics_Instance.GetFromAppUserModelId(appUserModelId)

    public fun GetFromAppUserModelIdForUser(user: User, appUserModelId: String) =
        ABI.IAppInfoStatics_Instance.GetFromAppUserModelIdForUser(user, appUserModelId)
  }
}

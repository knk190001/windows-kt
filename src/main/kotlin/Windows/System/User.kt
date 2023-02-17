package Windows.System

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
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

public class User(
  ptr: Pointer? = Pointer.NULL,
) : PointerType(ptr), IUser, IUser2, IWinRTObject {
  public val IUser_Interface: IUser by lazy {
    asIUser()
  }


  public val IUser2_Interface: IUser2 by lazy {
    asIUser2()
  }


  public override val IUser_Ptr: Pointer? by lazy {
    IUser_Interface.IUser_Ptr
  }


  public override val IUser2_Ptr: Pointer? by lazy {
    IUser2_Interface.IUser2_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(IUser_Interface, IUser2_Interface)

  private fun asIUser(): IUser {
    if(pointer == Pointer.NULL) {
      return(IUser.ABI.makeIUser(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IUser.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUser.ABI.makeIUser(ref.value))
  }

  private fun asIUser2(): IUser2 {
    if(pointer == Pointer.NULL) {
      return(IUser2.ABI.makeIUser2(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IUser2.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUser2.ABI.makeIUser2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue(): User = User(pointer.getPointer(0))

    public fun setValue(`value`: User): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI {
    public val IUserStatics2_Instance: IUserStatics2 by lazy {
      createIUserStatics2()
    }


    public val IUserStatics_Instance: IUserStatics by lazy {
      createIUserStatics()
    }


    public fun createIUserStatics2(): IUserStatics2 {
      val refiid = Guid.REFIID(IUserStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr = INSTANCE.RoGetActivationFactory("Windows.System.User".toHandle(),refiid,interfacePtr)
      val result = IUserStatics2.ABI.makeIUserStatics2(interfacePtr.value)
      return result
    }

    public fun createIUserStatics(): IUserStatics {
      val refiid = Guid.REFIID(IUserStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr = INSTANCE.RoGetActivationFactory("Windows.System.User".toHandle(),refiid,interfacePtr)
      val result = IUserStatics.ABI.makeIUserStatics(interfacePtr.value)
      return result
    }
  }

  public companion object {
    public fun GetDefault() = ABI.IUserStatics2_Instance.GetDefault()

    public fun CreateWatcher() = ABI.IUserStatics_Instance.CreateWatcher()

    public fun FindAllAsync() = ABI.IUserStatics_Instance.FindAllAsync()

    public fun FindAllAsync(type: UserType) = ABI.IUserStatics_Instance.FindAllAsync(type)

    public fun FindAllAsync(type: UserType, status: UserAuthenticationStatus) =
        ABI.IUserStatics_Instance.FindAllAsync(type, status)

    public fun GetFromId(nonRoamableId: String) = ABI.IUserStatics_Instance.GetFromId(nonRoamableId)
  }
}

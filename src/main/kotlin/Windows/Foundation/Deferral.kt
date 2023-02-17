package Windows.Foundation

import Windows.Foundation.IDeferralFactory.ABI.IID
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
import kotlin.Unit

public class Deferral(
  ptr: Pointer? = Pointer.NULL,
) : PointerType(ptr), IDeferral, IClosable, IWinRTObject {
  public val IDeferral_Interface: IDeferral by lazy {
    asIDeferral()
  }


  public val IClosable_Interface: IClosable by lazy {
    asIClosable()
  }


  public override val IDeferral_Ptr: Pointer? by lazy {
    IDeferral_Interface.IDeferral_Ptr
  }


  public override val IClosable_Ptr: Pointer? by lazy {
    IClosable_Interface.IClosable_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(IDeferral_Interface, IClosable_Interface)

  public constructor(handler: DeferralCompletedHandler) : this(ABI.activate(handler))

  private fun asIDeferral(): IDeferral {
    if(pointer == Pointer.NULL) {
      return(IDeferral.ABI.makeIDeferral(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IDeferral.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDeferral.ABI.makeIDeferral(ref.value))
  }

  private fun asIClosable(): IClosable {
    if(pointer == Pointer.NULL) {
      return(IClosable.ABI.makeIClosable(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IClosable.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IClosable.ABI.makeIClosable(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue(): Deferral = Deferral(pointer.getPointer(0))

    public fun setValue(`value`: Deferral): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI {
    public val IDeferralFactory_Instance: IDeferralFactory by lazy {
      createIDeferralFactory()
    }


    public fun createIDeferralFactory(): IDeferralFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Foundation.Deferral".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IDeferralFactory.ABI.makeIDeferralFactory(factoryActivatorPtr.value))
    }

    public fun activate(handler: DeferralCompletedHandler): Pointer =
        IDeferralFactory_Instance.Create(handler).pointer
  }
}

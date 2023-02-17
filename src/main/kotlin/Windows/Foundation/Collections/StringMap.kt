package Windows.Foundation.Collections

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.interfaces.IActivationFactory
import com.github.knk190001.winrtbinding.runtime.interfaces.IActivationFactory.Companion.IID
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

public class StringMap(
  ptr: Pointer? = Pointer.NULL,
) : PointerType(ptr), IMap_String_String_, IIterable_IKeyValuePair_String_String__,
    IObservableMap_String_String_, IWinRTObject {
  public val IMap_String_String__Interface: IMap_String_String_ by lazy {
    asIMap_String_String_()
  }


  public val IIterable_IKeyValuePair_String_String___Interface:
      IIterable_IKeyValuePair_String_String__ by lazy {
    asIIterable_IKeyValuePair_String_String__()
  }


  public val IObservableMap_String_String__Interface: IObservableMap_String_String_ by lazy {
    asIObservableMap_String_String_()
  }


  public override val IMap_String_String__Ptr: Pointer? by lazy {
    IMap_String_String__Interface.IMap_String_String__Ptr
  }


  public override val IIterable_IKeyValuePair_String_String___Ptr: Pointer? by lazy {
    IIterable_IKeyValuePair_String_String___Interface.IIterable_IKeyValuePair_String_String___Ptr
  }


  public override val IObservableMap_String_String__Ptr: Pointer? by lazy {
    IObservableMap_String_String__Interface.IObservableMap_String_String__Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(IMap_String_String__Interface,
        IIterable_IKeyValuePair_String_String___Interface, IObservableMap_String_String__Interface)

  public constructor() : this(ABI.activate())

  private fun asIMap_String_String_(): IMap_String_String_ {
    if(pointer == Pointer.NULL) {
      return(IMap_String_String_.ABI.makeIMap_String_String_(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IMap_String_String_.ABI.PIID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMap_String_String_.ABI.makeIMap_String_String_(ref.value))
  }

  private fun asIIterable_IKeyValuePair_String_String__(): IIterable_IKeyValuePair_String_String__ {
    if(pointer == Pointer.NULL) {
      return(IIterable_IKeyValuePair_String_String__.ABI.makeIIterable_IKeyValuePair_String_String__(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IIterable_IKeyValuePair_String_String__.ABI.PIID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IIterable_IKeyValuePair_String_String__.ABI.makeIIterable_IKeyValuePair_String_String__(ref.value))
  }

  private fun asIObservableMap_String_String_(): IObservableMap_String_String_ {
    if(pointer == Pointer.NULL) {
      return(IObservableMap_String_String_.ABI.makeIObservableMap_String_String_(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IObservableMap_String_String_.ABI.PIID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IObservableMap_String_String_.ABI.makeIObservableMap_String_String_(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue(): StringMap = StringMap(pointer.getPointer(0))

    public fun setValue(`value`: StringMap): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Foundation.Collections.StringMap".toHandle(),refiid,iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): Pointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }
  }
}

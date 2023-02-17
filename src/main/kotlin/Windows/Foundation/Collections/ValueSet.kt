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

public class ValueSet(
  ptr: Pointer? = Pointer.NULL,
) : PointerType(ptr), IPropertySet, IObservableMap_String_Object_, IMap_String_Object_,
    IIterable_IKeyValuePair_String_Object__, IWinRTObject {
  public val IPropertySet_Interface: IPropertySet by lazy {
    asIPropertySet()
  }


  public val IObservableMap_String_Object__Interface: IObservableMap_String_Object_ by lazy {
    asIObservableMap_String_Object_()
  }


  public val IMap_String_Object__Interface: IMap_String_Object_ by lazy {
    asIMap_String_Object_()
  }


  public val IIterable_IKeyValuePair_String_Object___Interface:
      IIterable_IKeyValuePair_String_Object__ by lazy {
    asIIterable_IKeyValuePair_String_Object__()
  }


  public override val IPropertySet_Ptr: Pointer? by lazy {
    IPropertySet_Interface.IPropertySet_Ptr
  }


  public override val IObservableMap_String_Object__Ptr: Pointer? by lazy {
    IObservableMap_String_Object__Interface.IObservableMap_String_Object__Ptr
  }


  public override val IMap_String_Object__Ptr: Pointer? by lazy {
    IMap_String_Object__Interface.IMap_String_Object__Ptr
  }


  public override val IIterable_IKeyValuePair_String_Object___Ptr: Pointer? by lazy {
    IIterable_IKeyValuePair_String_Object___Interface.IIterable_IKeyValuePair_String_Object___Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(IPropertySet_Interface, IObservableMap_String_Object__Interface,
        IMap_String_Object__Interface, IIterable_IKeyValuePair_String_Object___Interface)

  public constructor() : this(ABI.activate())

  private fun asIPropertySet(): IPropertySet {
    if(pointer == Pointer.NULL) {
      return(IPropertySet.ABI.makeIPropertySet(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IPropertySet.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPropertySet.ABI.makeIPropertySet(ref.value))
  }

  private fun asIObservableMap_String_Object_(): IObservableMap_String_Object_ {
    if(pointer == Pointer.NULL) {
      return(IObservableMap_String_Object_.ABI.makeIObservableMap_String_Object_(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IObservableMap_String_Object_.ABI.PIID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IObservableMap_String_Object_.ABI.makeIObservableMap_String_Object_(ref.value))
  }

  private fun asIMap_String_Object_(): IMap_String_Object_ {
    if(pointer == Pointer.NULL) {
      return(IMap_String_Object_.ABI.makeIMap_String_Object_(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IMap_String_Object_.ABI.PIID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMap_String_Object_.ABI.makeIMap_String_Object_(ref.value))
  }

  private fun asIIterable_IKeyValuePair_String_Object__(): IIterable_IKeyValuePair_String_Object__ {
    if(pointer == Pointer.NULL) {
      return(IIterable_IKeyValuePair_String_Object__.ABI.makeIIterable_IKeyValuePair_String_Object__(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IIterable_IKeyValuePair_String_Object__.ABI.PIID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IIterable_IKeyValuePair_String_Object__.ABI.makeIIterable_IKeyValuePair_String_Object__(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue(): ValueSet = ValueSet(pointer.getPointer(0))

    public fun setValue(`value`: ValueSet): Unit {
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
          INSTANCE.RoGetActivationFactory("Windows.Foundation.Collections.ValueSet".toHandle(),refiid,iAFPtr)
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

package Windows.Data.Json

import Windows.Foundation.Collections.IIterable_IKeyValuePair_String_IJsonValue__
import Windows.Foundation.Collections.IMap_String_IJsonValue_
import Windows.Foundation.IStringable
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
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
import kotlin.String
import kotlin.Unit

public class JsonObject(
  ptr: Pointer? = Pointer.NULL,
) : PointerType(ptr), IJsonObject, IJsonValue, IMap_String_IJsonValue_,
    IIterable_IKeyValuePair_String_IJsonValue__, IJsonObjectWithDefaultValues, IStringable,
    IWinRTObject {
  public val IJsonObject_Interface: IJsonObject by lazy {
    asIJsonObject()
  }


  public val IJsonValue_Interface: IJsonValue by lazy {
    asIJsonValue()
  }


  public val IMap_String_IJsonValue__Interface: IMap_String_IJsonValue_ by lazy {
    asIMap_String_IJsonValue_()
  }


  public val IIterable_IKeyValuePair_String_IJsonValue___Interface:
      IIterable_IKeyValuePair_String_IJsonValue__ by lazy {
    asIIterable_IKeyValuePair_String_IJsonValue__()
  }


  public val IJsonObjectWithDefaultValues_Interface: IJsonObjectWithDefaultValues by lazy {
    asIJsonObjectWithDefaultValues()
  }


  public val IStringable_Interface: IStringable by lazy {
    asIStringable()
  }


  public override val IJsonObject_Ptr: Pointer? by lazy {
    IJsonObject_Interface.IJsonObject_Ptr
  }


  public override val IJsonValue_Ptr: Pointer? by lazy {
    IJsonValue_Interface.IJsonValue_Ptr
  }


  public override val IMap_String_IJsonValue__Ptr: Pointer? by lazy {
    IMap_String_IJsonValue__Interface.IMap_String_IJsonValue__Ptr
  }


  public override val IIterable_IKeyValuePair_String_IJsonValue___Ptr: Pointer? by lazy {
    IIterable_IKeyValuePair_String_IJsonValue___Interface.IIterable_IKeyValuePair_String_IJsonValue___Ptr
  }


  public override val IJsonObjectWithDefaultValues_Ptr: Pointer? by lazy {
    IJsonObjectWithDefaultValues_Interface.IJsonObjectWithDefaultValues_Ptr
  }


  public override val IStringable_Ptr: Pointer? by lazy {
    IStringable_Interface.IStringable_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(IJsonObject_Interface, IJsonValue_Interface, IMap_String_IJsonValue__Interface,
        IIterable_IKeyValuePair_String_IJsonValue___Interface,
        IJsonObjectWithDefaultValues_Interface, IStringable_Interface)

  public constructor() : this(ABI.activate())

  private fun asIJsonObject(): IJsonObject {
    if(pointer == Pointer.NULL) {
      return(IJsonObject.ABI.makeIJsonObject(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IJsonObject.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IJsonObject.ABI.makeIJsonObject(ref.value))
  }

  private fun asIJsonValue(): IJsonValue {
    if(pointer == Pointer.NULL) {
      return(IJsonValue.ABI.makeIJsonValue(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IJsonValue.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IJsonValue.ABI.makeIJsonValue(ref.value))
  }

  private fun asIMap_String_IJsonValue_(): IMap_String_IJsonValue_ {
    if(pointer == Pointer.NULL) {
      return(IMap_String_IJsonValue_.ABI.makeIMap_String_IJsonValue_(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IMap_String_IJsonValue_.ABI.PIID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMap_String_IJsonValue_.ABI.makeIMap_String_IJsonValue_(ref.value))
  }

  private fun asIIterable_IKeyValuePair_String_IJsonValue__():
      IIterable_IKeyValuePair_String_IJsonValue__ {
    if(pointer == Pointer.NULL) {
      return(IIterable_IKeyValuePair_String_IJsonValue__.ABI.makeIIterable_IKeyValuePair_String_IJsonValue__(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IIterable_IKeyValuePair_String_IJsonValue__.ABI.PIID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IIterable_IKeyValuePair_String_IJsonValue__.ABI.makeIIterable_IKeyValuePair_String_IJsonValue__(ref.value))
  }

  private fun asIJsonObjectWithDefaultValues(): IJsonObjectWithDefaultValues {
    if(pointer == Pointer.NULL) {
      return(IJsonObjectWithDefaultValues.ABI.makeIJsonObjectWithDefaultValues(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IJsonObjectWithDefaultValues.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IJsonObjectWithDefaultValues.ABI.makeIJsonObjectWithDefaultValues(ref.value))
  }

  private fun asIStringable(): IStringable {
    if(pointer == Pointer.NULL) {
      return(IStringable.ABI.makeIStringable(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IStringable.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStringable.ABI.makeIStringable(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue(): JsonObject = JsonObject(pointer.getPointer(0))

    public fun setValue(`value`: JsonObject): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IJsonObjectStatics_Instance: IJsonObjectStatics by lazy {
      createIJsonObjectStatics()
    }


    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Data.Json.JsonObject".toHandle(),refiid,iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): Pointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public fun createIJsonObjectStatics(): IJsonObjectStatics {
      val refiid = Guid.REFIID(IJsonObjectStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Data.Json.JsonObject".toHandle(),refiid,interfacePtr)
      val result = IJsonObjectStatics.ABI.makeIJsonObjectStatics(interfacePtr.value)
      return result
    }
  }

  public companion object {
    public fun Parse(input: String) = ABI.IJsonObjectStatics_Instance.Parse(input)

    public fun TryParse(input: String, result: ByReference) =
        ABI.IJsonObjectStatics_Instance.TryParse(input, result)
  }
}

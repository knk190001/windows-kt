package Windows.Data.Json

import Windows.Foundation.Collections.IIterable_IJsonValue_
import Windows.Foundation.Collections.IVector_IJsonValue_
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

public class JsonArray(
  ptr: Pointer? = Pointer.NULL,
) : PointerType(ptr), IJsonArray, IJsonValue, IVector_IJsonValue_, IIterable_IJsonValue_,
    IStringable, IWinRTObject {
  public val IJsonArray_Interface: IJsonArray by lazy {
    asIJsonArray()
  }


  public val IJsonValue_Interface: IJsonValue by lazy {
    asIJsonValue()
  }


  public val IVector_IJsonValue__Interface: IVector_IJsonValue_ by lazy {
    asIVector_IJsonValue_()
  }


  public val IIterable_IJsonValue__Interface: IIterable_IJsonValue_ by lazy {
    asIIterable_IJsonValue_()
  }


  public val IStringable_Interface: IStringable by lazy {
    asIStringable()
  }


  public override val IJsonArray_Ptr: Pointer? by lazy {
    IJsonArray_Interface.IJsonArray_Ptr
  }


  public override val IJsonValue_Ptr: Pointer? by lazy {
    IJsonValue_Interface.IJsonValue_Ptr
  }


  public override val IVector_IJsonValue__Ptr: Pointer? by lazy {
    IVector_IJsonValue__Interface.IVector_IJsonValue__Ptr
  }


  public override val IIterable_IJsonValue__Ptr: Pointer? by lazy {
    IIterable_IJsonValue__Interface.IIterable_IJsonValue__Ptr
  }


  public override val IStringable_Ptr: Pointer? by lazy {
    IStringable_Interface.IStringable_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(IJsonArray_Interface, IJsonValue_Interface, IVector_IJsonValue__Interface,
        IIterable_IJsonValue__Interface, IStringable_Interface)

  public constructor() : this(ABI.activate())

  private fun asIJsonArray(): IJsonArray {
    if(pointer == Pointer.NULL) {
      return(IJsonArray.ABI.makeIJsonArray(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IJsonArray.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IJsonArray.ABI.makeIJsonArray(ref.value))
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

  private fun asIVector_IJsonValue_(): IVector_IJsonValue_ {
    if(pointer == Pointer.NULL) {
      return(IVector_IJsonValue_.ABI.makeIVector_IJsonValue_(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IVector_IJsonValue_.ABI.PIID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVector_IJsonValue_.ABI.makeIVector_IJsonValue_(ref.value))
  }

  private fun asIIterable_IJsonValue_(): IIterable_IJsonValue_ {
    if(pointer == Pointer.NULL) {
      return(IIterable_IJsonValue_.ABI.makeIIterable_IJsonValue_(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IIterable_IJsonValue_.ABI.PIID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IIterable_IJsonValue_.ABI.makeIIterable_IJsonValue_(ref.value))
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
    public fun getValue(): JsonArray = JsonArray(pointer.getPointer(0))

    public fun setValue(`value`: JsonArray): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IJsonArrayStatics_Instance: IJsonArrayStatics by lazy {
      createIJsonArrayStatics()
    }


    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Data.Json.JsonArray".toHandle(),refiid,iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): Pointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public fun createIJsonArrayStatics(): IJsonArrayStatics {
      val refiid = Guid.REFIID(IJsonArrayStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Data.Json.JsonArray".toHandle(),refiid,interfacePtr)
      val result = IJsonArrayStatics.ABI.makeIJsonArrayStatics(interfacePtr.value)
      return result
    }
  }

  public companion object {
    public fun Parse(input: String) = ABI.IJsonArrayStatics_Instance.Parse(input)

    public fun TryParse(input: String, result: ByReference) =
        ABI.IJsonArrayStatics_Instance.TryParse(input, result)
  }
}

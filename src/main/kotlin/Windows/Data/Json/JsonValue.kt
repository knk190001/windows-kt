package Windows.Data.Json

import Windows.Foundation.IStringable
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
import kotlin.Boolean
import kotlin.Double
import kotlin.String
import kotlin.Unit

public class JsonValue(
  ptr: Pointer? = Pointer.NULL,
) : PointerType(ptr), IJsonValue, IStringable, IWinRTObject {
  public val IJsonValue_Interface: IJsonValue by lazy {
    asIJsonValue()
  }


  public val IStringable_Interface: IStringable by lazy {
    asIStringable()
  }


  public override val IJsonValue_Ptr: Pointer? by lazy {
    IJsonValue_Interface.IJsonValue_Ptr
  }


  public override val IStringable_Ptr: Pointer? by lazy {
    IStringable_Interface.IStringable_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(IJsonValue_Interface, IStringable_Interface)

  private fun asIJsonValue(): IJsonValue {
    if(pointer == Pointer.NULL) {
      return(IJsonValue.ABI.makeIJsonValue(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IJsonValue.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IJsonValue.ABI.makeIJsonValue(ref.value))
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
    public fun getValue(): JsonValue = JsonValue(pointer.getPointer(0))

    public fun setValue(`value`: JsonValue): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI {
    public val IJsonValueStatics_Instance: IJsonValueStatics by lazy {
      createIJsonValueStatics()
    }


    public val IJsonValueStatics2_Instance: IJsonValueStatics2 by lazy {
      createIJsonValueStatics2()
    }


    public fun createIJsonValueStatics(): IJsonValueStatics {
      val refiid = Guid.REFIID(IJsonValueStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Data.Json.JsonValue".toHandle(),refiid,interfacePtr)
      val result = IJsonValueStatics.ABI.makeIJsonValueStatics(interfacePtr.value)
      return result
    }

    public fun createIJsonValueStatics2(): IJsonValueStatics2 {
      val refiid = Guid.REFIID(IJsonValueStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Data.Json.JsonValue".toHandle(),refiid,interfacePtr)
      val result = IJsonValueStatics2.ABI.makeIJsonValueStatics2(interfacePtr.value)
      return result
    }
  }

  public companion object {
    public fun Parse(input: String) = ABI.IJsonValueStatics_Instance.Parse(input)

    public fun TryParse(input: String, result: ByReference) =
        ABI.IJsonValueStatics_Instance.TryParse(input, result)

    public fun CreateBooleanValue(input: Boolean) =
        ABI.IJsonValueStatics_Instance.CreateBooleanValue(input)

    public fun CreateNumberValue(input: Double) =
        ABI.IJsonValueStatics_Instance.CreateNumberValue(input)

    public fun CreateStringValue(input: String) =
        ABI.IJsonValueStatics_Instance.CreateStringValue(input)

    public fun CreateNullValue() = ABI.IJsonValueStatics2_Instance.CreateNullValue()
  }
}

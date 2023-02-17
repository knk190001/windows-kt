package Windows.Data.Json

import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.handleToString
import com.github.knk190001.winrtbinding.runtime.interfaces.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.interfaces.getValue
import com.github.knk190001.winrtbinding.runtime.invokeHR
import com.github.knk190001.winrtbinding.runtime.makeOutArray
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Function
import com.sun.jna.Function.ALT_CONVENTION
import com.sun.jna.Native
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.ByteByReference
import java.lang.RuntimeException
import kotlin.Array
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.Unit

public interface IJsonValueStatics : NativeMapped, IWinRTInterface {
  public val IJsonValueStatics_Ptr: Pointer?

  public val IJsonValueStatics_VtblPtr: Pointer?
    get() = IJsonValueStatics_Ptr?.getPointer(0)

  public fun Parse(input: String): JsonValue {
    val fnPtr = IJsonValueStatics_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val input_Native = input.toHandle()
    val result = Windows.Data.Json.JsonValue.ByReference()
    val hr = fn.invokeHR(arrayOf(IJsonValueStatics_Ptr, input_Native, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun TryParse(input: String, result: Windows.Data.Json.JsonValue.ByReference): Boolean {
    val fnPtr = IJsonValueStatics_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val input_Native = input.toHandle()
    val result = ByteByReference()
    val hr = fn.invokeHR(arrayOf(IJsonValueStatics_Ptr, input_Native, result, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue != 0.toByte()
    return resultValue_Managed
  }

  public fun CreateBooleanValue(input: Boolean): JsonValue {
    val fnPtr = IJsonValueStatics_VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val input_Native: Byte = if(input) 1 else 0 
    val result = Windows.Data.Json.JsonValue.ByReference()
    val hr = fn.invokeHR(arrayOf(IJsonValueStatics_Ptr, input_Native, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun CreateNumberValue(input: Double): JsonValue {
    val fnPtr = IJsonValueStatics_VtblPtr!!.getPointer(9L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Data.Json.JsonValue.ByReference()
    val hr = fn.invokeHR(arrayOf(IJsonValueStatics_Ptr, input, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun CreateStringValue(input: String): JsonValue {
    val fnPtr = IJsonValueStatics_VtblPtr!!.getPointer(10L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val input_Native = input.toHandle()
    val result = Windows.Data.Json.JsonValue.ByReference()
    val hr = fn.invokeHR(arrayOf(IJsonValueStatics_Ptr, input_Native, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIJsonValueStatics(pointer.getPointer(0))

    public fun setValue(`value`: IJsonValueStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IJsonValueStatics_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IJsonValueStatics {
    public override val IJsonValueStatics_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("5f6b544a2f5348e191a3f78b50a6345c")

    public fun makeIJsonValueStatics(ptr: Pointer?): IJsonValueStatics = IJsonValueStatics_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IJsonValueStatics): Array<IJsonValueStatics> = (elements
        as Array<IJsonValueStatics>).castToImpl<IJsonValueStatics,IJsonValueStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IJsonValueStatics?> =
        arrayOfNulls<IJsonValueStatics_Impl>(size) as Array<IJsonValueStatics?>
  }
}

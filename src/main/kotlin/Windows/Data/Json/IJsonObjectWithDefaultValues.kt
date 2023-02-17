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
import com.sun.jna.platform.win32.WinNT
import com.sun.jna.ptr.ByteByReference
import com.sun.jna.ptr.DoubleByReference
import java.lang.RuntimeException
import kotlin.Array
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.Unit

public interface IJsonObjectWithDefaultValues : NativeMapped, IWinRTInterface {
  public val IJsonObjectWithDefaultValues_Ptr: Pointer?

  public val IJsonObjectWithDefaultValues_VtblPtr: Pointer?
    get() = IJsonObjectWithDefaultValues_Ptr?.getPointer(0)

  public fun GetNamedValue(name: String, defaultValue: JsonValue): JsonValue {
    val fnPtr = IJsonObjectWithDefaultValues_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val name_Native = name.toHandle()
    val result = Windows.Data.Json.JsonValue.ByReference()
    val hr = fn.invokeHR(arrayOf(IJsonObjectWithDefaultValues_Ptr, name_Native, defaultValue,
        result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun GetNamedObject(name: String, defaultValue: JsonObject): JsonObject {
    val fnPtr = IJsonObjectWithDefaultValues_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val name_Native = name.toHandle()
    val result = Windows.Data.Json.JsonObject.ByReference()
    val hr = fn.invokeHR(arrayOf(IJsonObjectWithDefaultValues_Ptr, name_Native, defaultValue,
        result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun GetNamedString(name: String, defaultValue: String): String {
    val fnPtr = IJsonObjectWithDefaultValues_VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val name_Native = name.toHandle()
    val defaultValue_Native = defaultValue.toHandle()
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(IJsonObjectWithDefaultValues_Ptr, name_Native, defaultValue_Native,
        result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public fun GetNamedArray(name: String, defaultValue: JsonArray): JsonArray {
    val fnPtr = IJsonObjectWithDefaultValues_VtblPtr!!.getPointer(9L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val name_Native = name.toHandle()
    val result = Windows.Data.Json.JsonArray.ByReference()
    val hr = fn.invokeHR(arrayOf(IJsonObjectWithDefaultValues_Ptr, name_Native, defaultValue,
        result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun GetNamedNumber(name: String, defaultValue: Double): Double {
    val fnPtr = IJsonObjectWithDefaultValues_VtblPtr!!.getPointer(10L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val name_Native = name.toHandle()
    val result = DoubleByReference()
    val hr = fn.invokeHR(arrayOf(IJsonObjectWithDefaultValues_Ptr, name_Native, defaultValue,
        result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun GetNamedBoolean(name: String, defaultValue: Boolean): Boolean {
    val fnPtr = IJsonObjectWithDefaultValues_VtblPtr!!.getPointer(11L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val name_Native = name.toHandle()
    val defaultValue_Native: Byte = if(defaultValue) 1 else 0 
    val result = ByteByReference()
    val hr = fn.invokeHR(arrayOf(IJsonObjectWithDefaultValues_Ptr, name_Native, defaultValue_Native,
        result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue != 0.toByte()
    return resultValue_Managed
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIJsonObjectWithDefaultValues(pointer.getPointer(0))

    public fun setValue(`value`: IJsonObjectWithDefaultValues_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IJsonObjectWithDefaultValues_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IJsonObjectWithDefaultValues {
    public override val IJsonObjectWithDefaultValues_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("d960d2a2b7f04f008e44d82cf415ea13")

    public fun makeIJsonObjectWithDefaultValues(ptr: Pointer?): IJsonObjectWithDefaultValues =
        IJsonObjectWithDefaultValues_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IJsonObjectWithDefaultValues):
        Array<IJsonObjectWithDefaultValues> = (elements as
        Array<IJsonObjectWithDefaultValues>).castToImpl<IJsonObjectWithDefaultValues,IJsonObjectWithDefaultValues_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IJsonObjectWithDefaultValues?> =
        arrayOfNulls<IJsonObjectWithDefaultValues_Impl>(size) as
        Array<IJsonObjectWithDefaultValues?>
  }
}

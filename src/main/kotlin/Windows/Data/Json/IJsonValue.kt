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

public interface IJsonValue : NativeMapped, IWinRTInterface {
  public val IJsonValue_Ptr: Pointer?

  public val IJsonValue_VtblPtr: Pointer?
    get() = IJsonValue_Ptr?.getPointer(0)

  public fun get_ValueType(): JsonValueType {
    val fnPtr = IJsonValue_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Data.Json.JsonValueType.ByReference()
    val hr = fn.invokeHR(arrayOf(IJsonValue_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun Stringify(): String {
    val fnPtr = IJsonValue_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(IJsonValue_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public fun GetString(): String {
    val fnPtr = IJsonValue_VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(IJsonValue_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public fun GetNumber(): Double {
    val fnPtr = IJsonValue_VtblPtr!!.getPointer(9L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = DoubleByReference()
    val hr = fn.invokeHR(arrayOf(IJsonValue_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun GetBoolean(): Boolean {
    val fnPtr = IJsonValue_VtblPtr!!.getPointer(10L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = ByteByReference()
    val hr = fn.invokeHR(arrayOf(IJsonValue_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue != 0.toByte()
    return resultValue_Managed
  }

  public fun GetArray(): JsonArray {
    val fnPtr = IJsonValue_VtblPtr!!.getPointer(11L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Data.Json.JsonArray.ByReference()
    val hr = fn.invokeHR(arrayOf(IJsonValue_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun GetObject(): JsonObject {
    val fnPtr = IJsonValue_VtblPtr!!.getPointer(12L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Data.Json.JsonObject.ByReference()
    val hr = fn.invokeHR(arrayOf(IJsonValue_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIJsonValue(pointer.getPointer(0))

    public fun setValue(`value`: IJsonValue_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IJsonValue_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IJsonValue {
    public override val IJsonValue_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("a3219ecbf0b34dcdbeee19d48cd3ed1e")

    public fun makeIJsonValue(ptr: Pointer?): IJsonValue = IJsonValue_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IJsonValue): Array<IJsonValue> = (elements as
        Array<IJsonValue>).castToImpl<IJsonValue,IJsonValue_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IJsonValue?> = arrayOfNulls<IJsonValue_Impl>(size)
        as Array<IJsonValue?>
  }
}

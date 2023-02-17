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

public interface IJsonObject : NativeMapped, IWinRTInterface {
  public val IJsonObject_Ptr: Pointer?

  public val IJsonObject_VtblPtr: Pointer?
    get() = IJsonObject_Ptr?.getPointer(0)

  public fun GetNamedValue(name: String): JsonValue {
    val fnPtr = IJsonObject_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val name_Native = name.toHandle()
    val result = Windows.Data.Json.JsonValue.ByReference()
    val hr = fn.invokeHR(arrayOf(IJsonObject_Ptr, name_Native, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun SetNamedValue(name: String, `value`: IJsonValue): Unit {
    val fnPtr = IJsonObject_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val name_Native = name.toHandle()
    val hr = fn.invokeHR(arrayOf(IJsonObject_Ptr, name_Native, value,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun GetNamedObject(name: String): JsonObject {
    val fnPtr = IJsonObject_VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val name_Native = name.toHandle()
    val result = Windows.Data.Json.JsonObject.ByReference()
    val hr = fn.invokeHR(arrayOf(IJsonObject_Ptr, name_Native, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun GetNamedArray(name: String): JsonArray {
    val fnPtr = IJsonObject_VtblPtr!!.getPointer(9L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val name_Native = name.toHandle()
    val result = Windows.Data.Json.JsonArray.ByReference()
    val hr = fn.invokeHR(arrayOf(IJsonObject_Ptr, name_Native, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun GetNamedString(name: String): String {
    val fnPtr = IJsonObject_VtblPtr!!.getPointer(10L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val name_Native = name.toHandle()
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(IJsonObject_Ptr, name_Native, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public fun GetNamedNumber(name: String): Double {
    val fnPtr = IJsonObject_VtblPtr!!.getPointer(11L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val name_Native = name.toHandle()
    val result = DoubleByReference()
    val hr = fn.invokeHR(arrayOf(IJsonObject_Ptr, name_Native, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun GetNamedBoolean(name: String): Boolean {
    val fnPtr = IJsonObject_VtblPtr!!.getPointer(12L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val name_Native = name.toHandle()
    val result = ByteByReference()
    val hr = fn.invokeHR(arrayOf(IJsonObject_Ptr, name_Native, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue != 0.toByte()
    return resultValue_Managed
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIJsonObject(pointer.getPointer(0))

    public fun setValue(`value`: IJsonObject_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IJsonObject_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IJsonObject {
    public override val IJsonObject_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("064e24dd29c24f839ac19ee11578beb3")

    public fun makeIJsonObject(ptr: Pointer?): IJsonObject = IJsonObject_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IJsonObject): Array<IJsonObject> = (elements as
        Array<IJsonObject>).castToImpl<IJsonObject,IJsonObject_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IJsonObject?> =
        arrayOfNulls<IJsonObject_Impl>(size) as Array<IJsonObject?>
  }
}

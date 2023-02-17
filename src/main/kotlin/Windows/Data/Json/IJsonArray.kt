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
import com.sun.jna.platform.win32.WinDef
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

public interface IJsonArray : NativeMapped, IWinRTInterface {
  public val IJsonArray_Ptr: Pointer?

  public val IJsonArray_VtblPtr: Pointer?
    get() = IJsonArray_Ptr?.getPointer(0)

  public fun GetObjectAt(index: WinDef.UINT): JsonObject {
    val fnPtr = IJsonArray_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Data.Json.JsonObject.ByReference()
    val hr = fn.invokeHR(arrayOf(IJsonArray_Ptr, index, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun GetArrayAt(index: WinDef.UINT): JsonArray {
    val fnPtr = IJsonArray_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Data.Json.JsonArray.ByReference()
    val hr = fn.invokeHR(arrayOf(IJsonArray_Ptr, index, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun GetStringAt(index: WinDef.UINT): String {
    val fnPtr = IJsonArray_VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(IJsonArray_Ptr, index, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public fun GetNumberAt(index: WinDef.UINT): Double {
    val fnPtr = IJsonArray_VtblPtr!!.getPointer(9L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = DoubleByReference()
    val hr = fn.invokeHR(arrayOf(IJsonArray_Ptr, index, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun GetBooleanAt(index: WinDef.UINT): Boolean {
    val fnPtr = IJsonArray_VtblPtr!!.getPointer(10L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = ByteByReference()
    val hr = fn.invokeHR(arrayOf(IJsonArray_Ptr, index, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue != 0.toByte()
    return resultValue_Managed
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIJsonArray(pointer.getPointer(0))

    public fun setValue(`value`: IJsonArray_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IJsonArray_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IJsonArray {
    public override val IJsonArray_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("08c1ddb60cbd4a9ab5d32f852dc37e81")

    public fun makeIJsonArray(ptr: Pointer?): IJsonArray = IJsonArray_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IJsonArray): Array<IJsonArray> = (elements as
        Array<IJsonArray>).castToImpl<IJsonArray,IJsonArray_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IJsonArray?> = arrayOfNulls<IJsonArray_Impl>(size)
        as Array<IJsonArray?>
  }
}

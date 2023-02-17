package Windows.Foundation.Collections

import Windows.Data.Json.IJsonValue
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
import com.sun.jna.ptr.ByteByReference
import java.lang.RuntimeException
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit

public interface IMap_String_IJsonValue_ : NativeMapped, IWinRTInterface {
  public val IMap_String_IJsonValue__Ptr: Pointer?

  public val IMap_String_IJsonValue__VtblPtr: Pointer?
    get() = IMap_String_IJsonValue__Ptr?.getPointer(0)

  public fun Lookup(key: String): IJsonValue {
    val fnPtr = IMap_String_IJsonValue__VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val key_Native = key.toHandle()
    val result = Windows.Data.Json.IJsonValue.ByReference()
    val hr = fn.invokeHR(arrayOf(IMap_String_IJsonValue__Ptr, key_Native, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun get_Size(): WinDef.UINT {
    val fnPtr = IMap_String_IJsonValue__VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinDef.UINTByReference()
    val hr = fn.invokeHR(arrayOf(IMap_String_IJsonValue__Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun HasKey(key: String): Boolean {
    val fnPtr = IMap_String_IJsonValue__VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val key_Native = key.toHandle()
    val result = ByteByReference()
    val hr = fn.invokeHR(arrayOf(IMap_String_IJsonValue__Ptr, key_Native, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue != 0.toByte()
    return resultValue_Managed
  }

  public fun GetView(): IMapView_String_IJsonValue_ {
    val fnPtr = IMap_String_IJsonValue__VtblPtr!!.getPointer(9L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.Collections.IMapView_String_IJsonValue_.ByReference()
    val hr = fn.invokeHR(arrayOf(IMap_String_IJsonValue__Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun Insert(key: String, `value`: IJsonValue): Boolean {
    val fnPtr = IMap_String_IJsonValue__VtblPtr!!.getPointer(10L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val key_Native = key.toHandle()
    val result = ByteByReference()
    val hr = fn.invokeHR(arrayOf(IMap_String_IJsonValue__Ptr, key_Native, value, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue != 0.toByte()
    return resultValue_Managed
  }

  public fun Remove(key: String): Unit {
    val fnPtr = IMap_String_IJsonValue__VtblPtr!!.getPointer(11L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val key_Native = key.toHandle()
    val hr = fn.invokeHR(arrayOf(IMap_String_IJsonValue__Ptr, key_Native,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun Clear(): Unit {
    val fnPtr = IMap_String_IJsonValue__VtblPtr!!.getPointer(12L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(IMap_String_IJsonValue__Ptr, ))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIMap_String_IJsonValue_(pointer.getPointer(0))

    public fun setValue(`value`: IMap_String_IJsonValue__Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IMap_String_IJsonValue__Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IMap_String_IJsonValue_ {
    public override val IMap_String_IJsonValue__Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val PIID: Guid.IID = Guid.IID("c9d9a725786b5113b4b79b61764c220b")

    public val IID: Guid.IID = Guid.IID("3c2925fe851945c1aa79197b6718c1c1")

    public fun makeIMap_String_IJsonValue_(ptr: Pointer?): IMap_String_IJsonValue_ =
        IMap_String_IJsonValue__Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IMap_String_IJsonValue_): Array<IMap_String_IJsonValue_> =
        (elements as
        Array<IMap_String_IJsonValue_>).castToImpl<IMap_String_IJsonValue_,IMap_String_IJsonValue__Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMap_String_IJsonValue_?> =
        arrayOfNulls<IMap_String_IJsonValue__Impl>(size) as Array<IMap_String_IJsonValue_?>
  }
}

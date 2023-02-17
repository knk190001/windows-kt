package Windows.Foundation.Collections

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
import com.sun.jna.platform.win32.COM.Unknown
import com.sun.jna.platform.win32.Guid
import com.sun.jna.platform.win32.WinDef
import com.sun.jna.ptr.ByteByReference
import java.lang.RuntimeException
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit

public interface IMap_String_Object_ : NativeMapped, IWinRTInterface {
  public val IMap_String_Object__Ptr: Pointer?

  public val IMap_String_Object__VtblPtr: Pointer?
    get() = IMap_String_Object__Ptr?.getPointer(0)

  public fun Lookup(key: String): Unknown {
    val fnPtr = IMap_String_Object__VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val key_Native = key.toHandle()
    val result = com.sun.jna.platform.win32.COM.Unknown.ByReference()
    val hr = fn.invokeHR(arrayOf(IMap_String_Object__Ptr, key_Native, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun get_Size(): WinDef.UINT {
    val fnPtr = IMap_String_Object__VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinDef.UINTByReference()
    val hr = fn.invokeHR(arrayOf(IMap_String_Object__Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun HasKey(key: String): Boolean {
    val fnPtr = IMap_String_Object__VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val key_Native = key.toHandle()
    val result = ByteByReference()
    val hr = fn.invokeHR(arrayOf(IMap_String_Object__Ptr, key_Native, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue != 0.toByte()
    return resultValue_Managed
  }

  public fun GetView(): IMapView_String_Object_ {
    val fnPtr = IMap_String_Object__VtblPtr!!.getPointer(9L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.Collections.IMapView_String_Object_.ByReference()
    val hr = fn.invokeHR(arrayOf(IMap_String_Object__Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun Insert(key: String, `value`: Unknown): Boolean {
    val fnPtr = IMap_String_Object__VtblPtr!!.getPointer(10L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val key_Native = key.toHandle()
    val result = ByteByReference()
    val hr = fn.invokeHR(arrayOf(IMap_String_Object__Ptr, key_Native, value, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue != 0.toByte()
    return resultValue_Managed
  }

  public fun Remove(key: String): Unit {
    val fnPtr = IMap_String_Object__VtblPtr!!.getPointer(11L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val key_Native = key.toHandle()
    val hr = fn.invokeHR(arrayOf(IMap_String_Object__Ptr, key_Native,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun Clear(): Unit {
    val fnPtr = IMap_String_Object__VtblPtr!!.getPointer(12L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(IMap_String_Object__Ptr, ))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIMap_String_Object_(pointer.getPointer(0))

    public fun setValue(`value`: IMap_String_Object__Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IMap_String_Object__Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IMap_String_Object_ {
    public override val IMap_String_Object__Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val PIID: Guid.IID = Guid.IID("1b0d357008775ec28a2c3b9539506aca")

    public val IID: Guid.IID = Guid.IID("3c2925fe851945c1aa79197b6718c1c1")

    public fun makeIMap_String_Object_(ptr: Pointer?): IMap_String_Object_ =
        IMap_String_Object__Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IMap_String_Object_): Array<IMap_String_Object_> =
        (elements as
        Array<IMap_String_Object_>).castToImpl<IMap_String_Object_,IMap_String_Object__Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMap_String_Object_?> =
        arrayOfNulls<IMap_String_Object__Impl>(size) as Array<IMap_String_Object_?>
  }
}

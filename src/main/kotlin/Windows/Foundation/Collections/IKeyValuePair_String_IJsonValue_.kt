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
import com.sun.jna.platform.win32.WinNT
import java.lang.RuntimeException
import kotlin.Array
import kotlin.Int
import kotlin.String
import kotlin.Unit

public interface IKeyValuePair_String_IJsonValue_ : NativeMapped, IWinRTInterface {
  public val IKeyValuePair_String_IJsonValue__Ptr: Pointer?

  public val IKeyValuePair_String_IJsonValue__VtblPtr: Pointer?
    get() = IKeyValuePair_String_IJsonValue__Ptr?.getPointer(0)

  public fun get_Key(): String {
    val fnPtr = IKeyValuePair_String_IJsonValue__VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(IKeyValuePair_String_IJsonValue__Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public fun get_Value(): IJsonValue {
    val fnPtr = IKeyValuePair_String_IJsonValue__VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Data.Json.IJsonValue.ByReference()
    val hr = fn.invokeHR(arrayOf(IKeyValuePair_String_IJsonValue__Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIKeyValuePair_String_IJsonValue_(pointer.getPointer(0))

    public fun setValue(`value`: IKeyValuePair_String_IJsonValue__Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IKeyValuePair_String_IJsonValue__Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IKeyValuePair_String_IJsonValue_ {
    public override val IKeyValuePair_String_IJsonValue__Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val PIID: Guid.IID = Guid.IID("4deecc89b0b85ee8a51d1c25ad9a5b01")

    public val IID: Guid.IID = Guid.IID("02b51929c1c44a7e89400312b5c18500")

    public fun makeIKeyValuePair_String_IJsonValue_(ptr: Pointer?): IKeyValuePair_String_IJsonValue_
        = IKeyValuePair_String_IJsonValue__Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IKeyValuePair_String_IJsonValue_):
        Array<IKeyValuePair_String_IJsonValue_> = (elements as
        Array<IKeyValuePair_String_IJsonValue_>).castToImpl<IKeyValuePair_String_IJsonValue_,IKeyValuePair_String_IJsonValue__Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IKeyValuePair_String_IJsonValue_?> =
        arrayOfNulls<IKeyValuePair_String_IJsonValue__Impl>(size) as
        Array<IKeyValuePair_String_IJsonValue_?>
  }
}

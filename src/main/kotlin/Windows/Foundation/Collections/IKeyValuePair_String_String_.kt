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
import com.sun.jna.platform.win32.Guid
import com.sun.jna.platform.win32.WinNT
import java.lang.RuntimeException
import kotlin.Array
import kotlin.Int
import kotlin.String
import kotlin.Unit

public interface IKeyValuePair_String_String_ : NativeMapped, IWinRTInterface {
  public val IKeyValuePair_String_String__Ptr: Pointer?

  public val IKeyValuePair_String_String__VtblPtr: Pointer?
    get() = IKeyValuePair_String_String__Ptr?.getPointer(0)

  public fun get_Key(): String {
    val fnPtr = IKeyValuePair_String_String__VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(IKeyValuePair_String_String__Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public fun get_Value(): String {
    val fnPtr = IKeyValuePair_String_String__VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(IKeyValuePair_String_String__Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIKeyValuePair_String_String_(pointer.getPointer(0))

    public fun setValue(`value`: IKeyValuePair_String_String__Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IKeyValuePair_String_String__Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IKeyValuePair_String_String_ {
    public override val IKeyValuePair_String_String__Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val PIID: Guid.IID = Guid.IID("6031030349c552e6abc6a9b36eccc716")

    public val IID: Guid.IID = Guid.IID("02b51929c1c44a7e89400312b5c18500")

    public fun makeIKeyValuePair_String_String_(ptr: Pointer?): IKeyValuePair_String_String_ =
        IKeyValuePair_String_String__Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IKeyValuePair_String_String_):
        Array<IKeyValuePair_String_String_> = (elements as
        Array<IKeyValuePair_String_String_>).castToImpl<IKeyValuePair_String_String_,IKeyValuePair_String_String__Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IKeyValuePair_String_String_?> =
        arrayOfNulls<IKeyValuePair_String_String__Impl>(size) as
        Array<IKeyValuePair_String_String_?>
  }
}

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
import java.lang.RuntimeException
import kotlin.Array
import kotlin.Int
import kotlin.Unit

public interface IJsonValueStatics2 : NativeMapped, IWinRTInterface {
  public val IJsonValueStatics2_Ptr: Pointer?

  public val IJsonValueStatics2_VtblPtr: Pointer?
    get() = IJsonValueStatics2_Ptr?.getPointer(0)

  public fun CreateNullValue(): JsonValue {
    val fnPtr = IJsonValueStatics2_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Data.Json.JsonValue.ByReference()
    val hr = fn.invokeHR(arrayOf(IJsonValueStatics2_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIJsonValueStatics2(pointer.getPointer(0))

    public fun setValue(`value`: IJsonValueStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IJsonValueStatics2_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IJsonValueStatics2 {
    public override val IJsonValueStatics2_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("1d9ecbe43fe84335839293d8e36865f0")

    public fun makeIJsonValueStatics2(ptr: Pointer?): IJsonValueStatics2 =
        IJsonValueStatics2_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IJsonValueStatics2): Array<IJsonValueStatics2> = (elements
        as Array<IJsonValueStatics2>).castToImpl<IJsonValueStatics2,IJsonValueStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IJsonValueStatics2?> =
        arrayOfNulls<IJsonValueStatics2_Impl>(size) as Array<IJsonValueStatics2?>
  }
}

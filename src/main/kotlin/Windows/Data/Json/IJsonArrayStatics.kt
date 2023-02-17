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
import kotlin.Int
import kotlin.String
import kotlin.Unit

public interface IJsonArrayStatics : NativeMapped, IWinRTInterface {
  public val IJsonArrayStatics_Ptr: Pointer?

  public val IJsonArrayStatics_VtblPtr: Pointer?
    get() = IJsonArrayStatics_Ptr?.getPointer(0)

  public fun Parse(input: String): JsonArray {
    val fnPtr = IJsonArrayStatics_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val input_Native = input.toHandle()
    val result = Windows.Data.Json.JsonArray.ByReference()
    val hr = fn.invokeHR(arrayOf(IJsonArrayStatics_Ptr, input_Native, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun TryParse(input: String, result: Windows.Data.Json.JsonArray.ByReference): Boolean {
    val fnPtr = IJsonArrayStatics_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val input_Native = input.toHandle()
    val result = ByteByReference()
    val hr = fn.invokeHR(arrayOf(IJsonArrayStatics_Ptr, input_Native, result, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue != 0.toByte()
    return resultValue_Managed
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIJsonArrayStatics(pointer.getPointer(0))

    public fun setValue(`value`: IJsonArrayStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IJsonArrayStatics_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IJsonArrayStatics {
    public override val IJsonArrayStatics_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("db1434a9e164499f93e28a8f49bb90ba")

    public fun makeIJsonArrayStatics(ptr: Pointer?): IJsonArrayStatics = IJsonArrayStatics_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IJsonArrayStatics): Array<IJsonArrayStatics> = (elements
        as Array<IJsonArrayStatics>).castToImpl<IJsonArrayStatics,IJsonArrayStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IJsonArrayStatics?> =
        arrayOfNulls<IJsonArrayStatics_Impl>(size) as Array<IJsonArrayStatics?>
  }
}

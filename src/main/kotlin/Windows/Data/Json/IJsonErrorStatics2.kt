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

public interface IJsonErrorStatics2 : NativeMapped, IWinRTInterface {
  public val IJsonErrorStatics2_Ptr: Pointer?

  public val IJsonErrorStatics2_VtblPtr: Pointer?
    get() = IJsonErrorStatics2_Ptr?.getPointer(0)

  public fun GetJsonStatus(hresult: Int): JsonErrorStatus {
    val fnPtr = IJsonErrorStatics2_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Data.Json.JsonErrorStatus.ByReference()
    val hr = fn.invokeHR(arrayOf(IJsonErrorStatics2_Ptr, hresult, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIJsonErrorStatics2(pointer.getPointer(0))

    public fun setValue(`value`: IJsonErrorStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IJsonErrorStatics2_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IJsonErrorStatics2 {
    public override val IJsonErrorStatics2_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("404030da87d0436c83abfc7b12c0cc26")

    public fun makeIJsonErrorStatics2(ptr: Pointer?): IJsonErrorStatics2 =
        IJsonErrorStatics2_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IJsonErrorStatics2): Array<IJsonErrorStatics2> = (elements
        as Array<IJsonErrorStatics2>).castToImpl<IJsonErrorStatics2,IJsonErrorStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IJsonErrorStatics2?> =
        arrayOfNulls<IJsonErrorStatics2_Impl>(size) as Array<IJsonErrorStatics2?>
  }
}

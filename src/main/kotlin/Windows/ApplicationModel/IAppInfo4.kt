package Windows.ApplicationModel

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
import kotlin.String
import kotlin.Unit

public interface IAppInfo4 : NativeMapped, IWinRTInterface {
  public val IAppInfo4_Ptr: Pointer?

  public val IAppInfo4_VtblPtr: Pointer?
    get() = IAppInfo4_Ptr?.getPointer(0)

  public fun get_SupportedFileExtensions(): Array<String?> {
    val fnPtr = IAppInfo4_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = makeOutArray<String>()
    val hr = fn.invokeHR(arrayOf(IAppInfo4_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.array
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIAppInfo4(pointer.getPointer(0))

    public fun setValue(`value`: IAppInfo4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IAppInfo4_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IAppInfo4 {
    public override val IAppInfo4_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("2f34bdeb160945549f3312e1e803e0d4")

    public fun makeIAppInfo4(ptr: Pointer?): IAppInfo4 = IAppInfo4_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IAppInfo4): Array<IAppInfo4> = (elements as
        Array<IAppInfo4>).castToImpl<IAppInfo4,IAppInfo4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppInfo4?> = arrayOfNulls<IAppInfo4_Impl>(size)
        as Array<IAppInfo4?>
  }
}

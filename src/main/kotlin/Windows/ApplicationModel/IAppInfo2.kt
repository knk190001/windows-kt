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
import kotlin.Unit

public interface IAppInfo2 : NativeMapped, IWinRTInterface {
  public val IAppInfo2_Ptr: Pointer?

  public val IAppInfo2_VtblPtr: Pointer?
    get() = IAppInfo2_Ptr?.getPointer(0)

  public fun get_Package(): Package {
    val fnPtr = IAppInfo2_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.ApplicationModel.Package.ByReference()
    val hr = fn.invokeHR(arrayOf(IAppInfo2_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIAppInfo2(pointer.getPointer(0))

    public fun setValue(`value`: IAppInfo2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IAppInfo2_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IAppInfo2 {
    public override val IAppInfo2_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("be4b1f5a2098431bbd25b30878748d47")

    public fun makeIAppInfo2(ptr: Pointer?): IAppInfo2 = IAppInfo2_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IAppInfo2): Array<IAppInfo2> = (elements as
        Array<IAppInfo2>).castToImpl<IAppInfo2,IAppInfo2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppInfo2?> = arrayOfNulls<IAppInfo2_Impl>(size)
        as Array<IAppInfo2?>
  }
}

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

public interface IAppInfo3 : NativeMapped, IWinRTInterface {
  public val IAppInfo3_Ptr: Pointer?

  public val IAppInfo3_VtblPtr: Pointer?
    get() = IAppInfo3_Ptr?.getPointer(0)

  public fun get_ExecutionContext(): AppExecutionContext {
    val fnPtr = IAppInfo3_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.ApplicationModel.AppExecutionContext.ByReference()
    val hr = fn.invokeHR(arrayOf(IAppInfo3_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIAppInfo3(pointer.getPointer(0))

    public fun setValue(`value`: IAppInfo3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IAppInfo3_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IAppInfo3 {
    public override val IAppInfo3_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("09a78e4693a446de93970843b57115ea")

    public fun makeIAppInfo3(ptr: Pointer?): IAppInfo3 = IAppInfo3_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IAppInfo3): Array<IAppInfo3> = (elements as
        Array<IAppInfo3>).castToImpl<IAppInfo3,IAppInfo3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppInfo3?> = arrayOfNulls<IAppInfo3_Impl>(size)
        as Array<IAppInfo3?>
  }
}

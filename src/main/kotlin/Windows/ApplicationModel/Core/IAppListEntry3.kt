package Windows.ApplicationModel.Core

import Windows.Foundation.IAsyncOperation_Boolean_
import Windows.System.User
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

public interface IAppListEntry3 : NativeMapped, IWinRTInterface {
  public val IAppListEntry3_Ptr: Pointer?

  public val IAppListEntry3_VtblPtr: Pointer?
    get() = IAppListEntry3_Ptr?.getPointer(0)

  public fun LaunchForUserAsync(user: User): IAsyncOperation_Boolean_ {
    val fnPtr = IAppListEntry3_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.IAsyncOperation_Boolean_.ByReference()
    val hr = fn.invokeHR(arrayOf(IAppListEntry3_Ptr, user, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIAppListEntry3(pointer.getPointer(0))

    public fun setValue(`value`: IAppListEntry3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IAppListEntry3_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IAppListEntry3 {
    public override val IAppListEntry3_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("6099f28dfc32470abc694b061a76ef2e")

    public fun makeIAppListEntry3(ptr: Pointer?): IAppListEntry3 = IAppListEntry3_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IAppListEntry3): Array<IAppListEntry3> = (elements as
        Array<IAppListEntry3>).castToImpl<IAppListEntry3,IAppListEntry3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppListEntry3?> =
        arrayOfNulls<IAppListEntry3_Impl>(size) as Array<IAppListEntry3?>
  }
}

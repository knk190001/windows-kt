package Windows.System

import Windows.Foundation.IAsyncOperation_UserAgeConsentResult_
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

public interface IUser2 : NativeMapped, IWinRTInterface {
  public val IUser2_Ptr: Pointer?

  public val IUser2_VtblPtr: Pointer?
    get() = IUser2_Ptr?.getPointer(0)

  public fun CheckUserAgeConsentGroupAsync(consentGroup: UserAgeConsentGroup):
      IAsyncOperation_UserAgeConsentResult_ {
    val fnPtr = IUser2_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.IAsyncOperation_UserAgeConsentResult_.ByReference()
    val hr = fn.invokeHR(arrayOf(IUser2_Ptr, consentGroup, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIUser2(pointer.getPointer(0))

    public fun setValue(`value`: IUser2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IUser2_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IUser2 {
    public override val IUser2_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("98ba5628a6e3518e89d9d3b2b1991a10")

    public fun makeIUser2(ptr: Pointer?): IUser2 = IUser2_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IUser2): Array<IUser2> = (elements as
        Array<IUser2>).castToImpl<IUser2,IUser2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUser2?> = arrayOfNulls<IUser2_Impl>(size) as
        Array<IUser2?>
  }
}

package Windows.UI.Notifications

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

public interface IBadgeUpdateManagerStatics2 : NativeMapped, IWinRTInterface {
  public val IBadgeUpdateManagerStatics2_Ptr: Pointer?

  public val IBadgeUpdateManagerStatics2_VtblPtr: Pointer?
    get() = IBadgeUpdateManagerStatics2_Ptr?.getPointer(0)

  public fun GetForUser(user: User): BadgeUpdateManagerForUser {
    val fnPtr = IBadgeUpdateManagerStatics2_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.UI.Notifications.BadgeUpdateManagerForUser.ByReference()
    val hr = fn.invokeHR(arrayOf(IBadgeUpdateManagerStatics2_Ptr, user, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIBadgeUpdateManagerStatics2(pointer.getPointer(0))

    public fun setValue(`value`: IBadgeUpdateManagerStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IBadgeUpdateManagerStatics2_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IBadgeUpdateManagerStatics2 {
    public override val IBadgeUpdateManagerStatics2_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("979a35cef94048bf94e8ca244d400b41")

    public fun makeIBadgeUpdateManagerStatics2(ptr: Pointer?): IBadgeUpdateManagerStatics2 =
        IBadgeUpdateManagerStatics2_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IBadgeUpdateManagerStatics2):
        Array<IBadgeUpdateManagerStatics2> = (elements as
        Array<IBadgeUpdateManagerStatics2>).castToImpl<IBadgeUpdateManagerStatics2,IBadgeUpdateManagerStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBadgeUpdateManagerStatics2?> =
        arrayOfNulls<IBadgeUpdateManagerStatics2_Impl>(size) as Array<IBadgeUpdateManagerStatics2?>
  }
}

package Windows.System

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

public interface IUserAuthenticationStatusChangeDeferral : NativeMapped, IWinRTInterface {
  public val IUserAuthenticationStatusChangeDeferral_Ptr: Pointer?

  public val IUserAuthenticationStatusChangeDeferral_VtblPtr: Pointer?
    get() = IUserAuthenticationStatusChangeDeferral_Ptr?.getPointer(0)

  public fun Complete(): Unit {
    val fnPtr = IUserAuthenticationStatusChangeDeferral_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(IUserAuthenticationStatusChangeDeferral_Ptr, ))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIUserAuthenticationStatusChangeDeferral(pointer.getPointer(0))

    public fun setValue(`value`: IUserAuthenticationStatusChangeDeferral_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IUserAuthenticationStatusChangeDeferral_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IUserAuthenticationStatusChangeDeferral {
    public override val IUserAuthenticationStatusChangeDeferral_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("88b59568bb3042fba270e9902e40efa7")

    public fun makeIUserAuthenticationStatusChangeDeferral(ptr: Pointer?):
        IUserAuthenticationStatusChangeDeferral = IUserAuthenticationStatusChangeDeferral_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IUserAuthenticationStatusChangeDeferral):
        Array<IUserAuthenticationStatusChangeDeferral> = (elements as
        Array<IUserAuthenticationStatusChangeDeferral>).castToImpl<IUserAuthenticationStatusChangeDeferral,IUserAuthenticationStatusChangeDeferral_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUserAuthenticationStatusChangeDeferral?> =
        arrayOfNulls<IUserAuthenticationStatusChangeDeferral_Impl>(size) as
        Array<IUserAuthenticationStatusChangeDeferral?>
  }
}

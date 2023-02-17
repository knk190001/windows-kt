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

public interface IUserAuthenticationStatusChangingEventArgs : NativeMapped, IWinRTInterface {
  public val IUserAuthenticationStatusChangingEventArgs_Ptr: Pointer?

  public val IUserAuthenticationStatusChangingEventArgs_VtblPtr: Pointer?
    get() = IUserAuthenticationStatusChangingEventArgs_Ptr?.getPointer(0)

  public fun GetDeferral(): UserAuthenticationStatusChangeDeferral {
    val fnPtr = IUserAuthenticationStatusChangingEventArgs_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.System.UserAuthenticationStatusChangeDeferral.ByReference()
    val hr = fn.invokeHR(arrayOf(IUserAuthenticationStatusChangingEventArgs_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun get_User(): User {
    val fnPtr = IUserAuthenticationStatusChangingEventArgs_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.System.User.ByReference()
    val hr = fn.invokeHR(arrayOf(IUserAuthenticationStatusChangingEventArgs_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun get_NewStatus(): UserAuthenticationStatus {
    val fnPtr = IUserAuthenticationStatusChangingEventArgs_VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.System.UserAuthenticationStatus.ByReference()
    val hr = fn.invokeHR(arrayOf(IUserAuthenticationStatusChangingEventArgs_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun get_CurrentStatus(): UserAuthenticationStatus {
    val fnPtr = IUserAuthenticationStatusChangingEventArgs_VtblPtr!!.getPointer(9L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.System.UserAuthenticationStatus.ByReference()
    val hr = fn.invokeHR(arrayOf(IUserAuthenticationStatusChangingEventArgs_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() =
        ABI.makeIUserAuthenticationStatusChangingEventArgs(pointer.getPointer(0))

    public fun setValue(`value`: IUserAuthenticationStatusChangingEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IUserAuthenticationStatusChangingEventArgs_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IUserAuthenticationStatusChangingEventArgs {
    public override val IUserAuthenticationStatusChangingEventArgs_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("8c030f28a7114c1eab4804179c15938f")

    public fun makeIUserAuthenticationStatusChangingEventArgs(ptr: Pointer?):
        IUserAuthenticationStatusChangingEventArgs =
        IUserAuthenticationStatusChangingEventArgs_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IUserAuthenticationStatusChangingEventArgs):
        Array<IUserAuthenticationStatusChangingEventArgs> = (elements as
        Array<IUserAuthenticationStatusChangingEventArgs>).castToImpl<IUserAuthenticationStatusChangingEventArgs,IUserAuthenticationStatusChangingEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUserAuthenticationStatusChangingEventArgs?> =
        arrayOfNulls<IUserAuthenticationStatusChangingEventArgs_Impl>(size) as
        Array<IUserAuthenticationStatusChangingEventArgs?>
  }
}

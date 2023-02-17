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

public interface IUserChangedEventArgs : NativeMapped, IWinRTInterface {
  public val IUserChangedEventArgs_Ptr: Pointer?

  public val IUserChangedEventArgs_VtblPtr: Pointer?
    get() = IUserChangedEventArgs_Ptr?.getPointer(0)

  public fun get_User(): User {
    val fnPtr = IUserChangedEventArgs_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.System.User.ByReference()
    val hr = fn.invokeHR(arrayOf(IUserChangedEventArgs_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIUserChangedEventArgs(pointer.getPointer(0))

    public fun setValue(`value`: IUserChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IUserChangedEventArgs_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IUserChangedEventArgs {
    public override val IUserChangedEventArgs_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("086459dc18c648dbbc99724fb9203ccc")

    public fun makeIUserChangedEventArgs(ptr: Pointer?): IUserChangedEventArgs =
        IUserChangedEventArgs_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IUserChangedEventArgs): Array<IUserChangedEventArgs> =
        (elements as
        Array<IUserChangedEventArgs>).castToImpl<IUserChangedEventArgs,IUserChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUserChangedEventArgs?> =
        arrayOfNulls<IUserChangedEventArgs_Impl>(size) as Array<IUserChangedEventArgs?>
  }
}

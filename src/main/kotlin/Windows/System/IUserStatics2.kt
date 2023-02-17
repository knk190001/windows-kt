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

public interface IUserStatics2 : NativeMapped, IWinRTInterface {
  public val IUserStatics2_Ptr: Pointer?

  public val IUserStatics2_VtblPtr: Pointer?
    get() = IUserStatics2_Ptr?.getPointer(0)

  public fun GetDefault(): User {
    val fnPtr = IUserStatics2_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.System.User.ByReference()
    val hr = fn.invokeHR(arrayOf(IUserStatics2_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIUserStatics2(pointer.getPointer(0))

    public fun setValue(`value`: IUserStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IUserStatics2_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IUserStatics2 {
    public override val IUserStatics2_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("74a37e112eb54487b0d52c6790e013e9")

    public fun makeIUserStatics2(ptr: Pointer?): IUserStatics2 = IUserStatics2_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IUserStatics2): Array<IUserStatics2> = (elements as
        Array<IUserStatics2>).castToImpl<IUserStatics2,IUserStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUserStatics2?> =
        arrayOfNulls<IUserStatics2_Impl>(size) as Array<IUserStatics2?>
  }
}

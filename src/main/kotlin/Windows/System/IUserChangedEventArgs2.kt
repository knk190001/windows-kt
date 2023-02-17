package Windows.System

import Windows.Foundation.Collections.IVectorView_UserWatcherUpdateKind_
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

public interface IUserChangedEventArgs2 : NativeMapped, IWinRTInterface {
  public val IUserChangedEventArgs2_Ptr: Pointer?

  public val IUserChangedEventArgs2_VtblPtr: Pointer?
    get() = IUserChangedEventArgs2_Ptr?.getPointer(0)

  public fun get_ChangedPropertyKinds(): IVectorView_UserWatcherUpdateKind_ {
    val fnPtr = IUserChangedEventArgs2_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.Collections.IVectorView_UserWatcherUpdateKind_.ByReference()
    val hr = fn.invokeHR(arrayOf(IUserChangedEventArgs2_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIUserChangedEventArgs2(pointer.getPointer(0))

    public fun setValue(`value`: IUserChangedEventArgs2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IUserChangedEventArgs2_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IUserChangedEventArgs2 {
    public override val IUserChangedEventArgs2_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("6b2ccb446f01560c97adfc7f32ec581f")

    public fun makeIUserChangedEventArgs2(ptr: Pointer?): IUserChangedEventArgs2 =
        IUserChangedEventArgs2_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IUserChangedEventArgs2): Array<IUserChangedEventArgs2> =
        (elements as
        Array<IUserChangedEventArgs2>).castToImpl<IUserChangedEventArgs2,IUserChangedEventArgs2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUserChangedEventArgs2?> =
        arrayOfNulls<IUserChangedEventArgs2_Impl>(size) as Array<IUserChangedEventArgs2?>
  }
}

package Windows.ApplicationModel.Core

import Windows.ApplicationModel.AppInfo
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

public interface IAppListEntry4 : NativeMapped, IWinRTInterface {
  public val IAppListEntry4_Ptr: Pointer?

  public val IAppListEntry4_VtblPtr: Pointer?
    get() = IAppListEntry4_Ptr?.getPointer(0)

  public fun get_AppInfo(): AppInfo {
    val fnPtr = IAppListEntry4_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.ApplicationModel.AppInfo.ByReference()
    val hr = fn.invokeHR(arrayOf(IAppListEntry4_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIAppListEntry4(pointer.getPointer(0))

    public fun setValue(`value`: IAppListEntry4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IAppListEntry4_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IAppListEntry4 {
    public override val IAppListEntry4_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("2a131ed256f5487c86975166f3b33da0")

    public fun makeIAppListEntry4(ptr: Pointer?): IAppListEntry4 = IAppListEntry4_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IAppListEntry4): Array<IAppListEntry4> = (elements as
        Array<IAppListEntry4>).castToImpl<IAppListEntry4,IAppListEntry4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppListEntry4?> =
        arrayOfNulls<IAppListEntry4_Impl>(size) as Array<IAppListEntry4?>
  }
}

package Windows.ApplicationModel.Core

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
import com.sun.jna.platform.win32.WinNT
import java.lang.RuntimeException
import kotlin.Array
import kotlin.Int
import kotlin.String
import kotlin.Unit

public interface IAppListEntry2 : NativeMapped, IWinRTInterface {
  public val IAppListEntry2_Ptr: Pointer?

  public val IAppListEntry2_VtblPtr: Pointer?
    get() = IAppListEntry2_Ptr?.getPointer(0)

  public fun get_AppUserModelId(): String {
    val fnPtr = IAppListEntry2_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(IAppListEntry2_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIAppListEntry2(pointer.getPointer(0))

    public fun setValue(`value`: IAppListEntry2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IAppListEntry2_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IAppListEntry2 {
    public override val IAppListEntry2_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("d0a618adbf3542acac0686eeeb41d04b")

    public fun makeIAppListEntry2(ptr: Pointer?): IAppListEntry2 = IAppListEntry2_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IAppListEntry2): Array<IAppListEntry2> = (elements as
        Array<IAppListEntry2>).castToImpl<IAppListEntry2,IAppListEntry2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppListEntry2?> =
        arrayOfNulls<IAppListEntry2_Impl>(size) as Array<IAppListEntry2?>
  }
}

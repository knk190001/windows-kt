package Windows.UI.Notifications

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

public interface IToastActivatedEventArgs : NativeMapped, IWinRTInterface {
  public val IToastActivatedEventArgs_Ptr: Pointer?

  public val IToastActivatedEventArgs_VtblPtr: Pointer?
    get() = IToastActivatedEventArgs_Ptr?.getPointer(0)

  public fun get_Arguments(): String {
    val fnPtr = IToastActivatedEventArgs_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(IToastActivatedEventArgs_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIToastActivatedEventArgs(pointer.getPointer(0))

    public fun setValue(`value`: IToastActivatedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IToastActivatedEventArgs_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IToastActivatedEventArgs {
    public override val IToastActivatedEventArgs_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("e3bf92f3c197436f82650625824f8dac")

    public fun makeIToastActivatedEventArgs(ptr: Pointer?): IToastActivatedEventArgs =
        IToastActivatedEventArgs_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IToastActivatedEventArgs): Array<IToastActivatedEventArgs>
        = (elements as
        Array<IToastActivatedEventArgs>).castToImpl<IToastActivatedEventArgs,IToastActivatedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IToastActivatedEventArgs?> =
        arrayOfNulls<IToastActivatedEventArgs_Impl>(size) as Array<IToastActivatedEventArgs?>
  }
}

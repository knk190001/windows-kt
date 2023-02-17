package Windows.UI.Notifications

import Windows.Foundation.Collections.ValueSet
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

public interface IToastActivatedEventArgs2 : NativeMapped, IWinRTInterface {
  public val IToastActivatedEventArgs2_Ptr: Pointer?

  public val IToastActivatedEventArgs2_VtblPtr: Pointer?
    get() = IToastActivatedEventArgs2_Ptr?.getPointer(0)

  public fun get_UserInput(): ValueSet {
    val fnPtr = IToastActivatedEventArgs2_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.Collections.ValueSet.ByReference()
    val hr = fn.invokeHR(arrayOf(IToastActivatedEventArgs2_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIToastActivatedEventArgs2(pointer.getPointer(0))

    public fun setValue(`value`: IToastActivatedEventArgs2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IToastActivatedEventArgs2_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IToastActivatedEventArgs2 {
    public override val IToastActivatedEventArgs2_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("ab7da512cc61568e81be304ac31038fa")

    public fun makeIToastActivatedEventArgs2(ptr: Pointer?): IToastActivatedEventArgs2 =
        IToastActivatedEventArgs2_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IToastActivatedEventArgs2):
        Array<IToastActivatedEventArgs2> = (elements as
        Array<IToastActivatedEventArgs2>).castToImpl<IToastActivatedEventArgs2,IToastActivatedEventArgs2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IToastActivatedEventArgs2?> =
        arrayOfNulls<IToastActivatedEventArgs2_Impl>(size) as Array<IToastActivatedEventArgs2?>
  }
}

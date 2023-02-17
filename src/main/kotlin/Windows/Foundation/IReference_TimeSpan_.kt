package Windows.Foundation

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

public interface IReference_TimeSpan_ : NativeMapped, IWinRTInterface {
  public val IReference_TimeSpan__Ptr: Pointer?

  public val IReference_TimeSpan__VtblPtr: Pointer?
    get() = IReference_TimeSpan__Ptr?.getPointer(0)

  public fun get_Value(): TimeSpan {
    val fnPtr = IReference_TimeSpan__VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.TimeSpan.ByReference()
    val hr = fn.invokeHR(arrayOf(IReference_TimeSpan__Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIReference_TimeSpan_(pointer.getPointer(0))

    public fun setValue(`value`: IReference_TimeSpan__Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IReference_TimeSpan__Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IReference_TimeSpan_ {
    public override val IReference_TimeSpan__Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val PIID: Guid.IID = Guid.IID("604d0c4c91de5c2a935f362f13eaf800")

    public val IID: Guid.IID = Guid.IID("61c177062d6511e09ae8d48564015472")

    public fun makeIReference_TimeSpan_(ptr: Pointer?): IReference_TimeSpan_ =
        IReference_TimeSpan__Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IReference_TimeSpan_): Array<IReference_TimeSpan_> =
        (elements as
        Array<IReference_TimeSpan_>).castToImpl<IReference_TimeSpan_,IReference_TimeSpan__Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IReference_TimeSpan_?> =
        arrayOfNulls<IReference_TimeSpan__Impl>(size) as Array<IReference_TimeSpan_?>
  }
}

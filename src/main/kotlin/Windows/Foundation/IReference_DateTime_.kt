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

public interface IReference_DateTime_ : NativeMapped, IWinRTInterface {
  public val IReference_DateTime__Ptr: Pointer?

  public val IReference_DateTime__VtblPtr: Pointer?
    get() = IReference_DateTime__Ptr?.getPointer(0)

  public fun get_Value(): DateTime {
    val fnPtr = IReference_DateTime__VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.DateTime.ByReference()
    val hr = fn.invokeHR(arrayOf(IReference_DateTime__Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIReference_DateTime_(pointer.getPointer(0))

    public fun setValue(`value`: IReference_DateTime__Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IReference_DateTime__Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IReference_DateTime_ {
    public override val IReference_DateTime__Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val PIID: Guid.IID = Guid.IID("5541d8a7497c5aa486fc7713adbf2a2c")

    public val IID: Guid.IID = Guid.IID("61c177062d6511e09ae8d48564015472")

    public fun makeIReference_DateTime_(ptr: Pointer?): IReference_DateTime_ =
        IReference_DateTime__Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IReference_DateTime_): Array<IReference_DateTime_> =
        (elements as
        Array<IReference_DateTime_>).castToImpl<IReference_DateTime_,IReference_DateTime__Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IReference_DateTime_?> =
        arrayOfNulls<IReference_DateTime__Impl>(size) as Array<IReference_DateTime_?>
  }
}

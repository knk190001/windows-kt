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
import com.sun.jna.ptr.DoubleByReference
import java.lang.RuntimeException
import kotlin.Array
import kotlin.Double
import kotlin.Int
import kotlin.Unit

public interface IReference_Double_ : NativeMapped, IWinRTInterface {
  public val IReference_Double__Ptr: Pointer?

  public val IReference_Double__VtblPtr: Pointer?
    get() = IReference_Double__Ptr?.getPointer(0)

  public fun get_Value(): Double {
    val fnPtr = IReference_Double__VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = DoubleByReference()
    val hr = fn.invokeHR(arrayOf(IReference_Double__Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIReference_Double_(pointer.getPointer(0))

    public fun setValue(`value`: IReference_Double__Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IReference_Double__Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IReference_Double_ {
    public override val IReference_Double__Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val PIID: Guid.IID = Guid.IID("2f2d6c2954735f3e92e796572bb990e2")

    public val IID: Guid.IID = Guid.IID("61c177062d6511e09ae8d48564015472")

    public fun makeIReference_Double_(ptr: Pointer?): IReference_Double_ =
        IReference_Double__Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IReference_Double_): Array<IReference_Double_> = (elements
        as Array<IReference_Double_>).castToImpl<IReference_Double_,IReference_Double__Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IReference_Double_?> =
        arrayOfNulls<IReference_Double__Impl>(size) as Array<IReference_Double_?>
  }
}

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

public interface IDeferral : NativeMapped, IWinRTInterface {
  public val IDeferral_Ptr: Pointer?

  public val IDeferral_VtblPtr: Pointer?
    get() = IDeferral_Ptr?.getPointer(0)

  public fun Complete(): Unit {
    val fnPtr = IDeferral_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(IDeferral_Ptr, ))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIDeferral(pointer.getPointer(0))

    public fun setValue(`value`: IDeferral_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IDeferral_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IDeferral {
    public override val IDeferral_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("d62697323b7f46a7b40b4fdca2a2c693")

    public fun makeIDeferral(ptr: Pointer?): IDeferral = IDeferral_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IDeferral): Array<IDeferral> = (elements as
        Array<IDeferral>).castToImpl<IDeferral,IDeferral_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDeferral?> = arrayOfNulls<IDeferral_Impl>(size)
        as Array<IDeferral?>
  }
}

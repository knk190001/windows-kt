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

public interface IDeferralFactory : NativeMapped, IWinRTInterface {
  public val IDeferralFactory_Ptr: Pointer?

  public val IDeferralFactory_VtblPtr: Pointer?
    get() = IDeferralFactory_Ptr?.getPointer(0)

  public fun Create(handler: DeferralCompletedHandler): Deferral {
    val fnPtr = IDeferralFactory_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.Deferral.ByReference()
    val hr = fn.invokeHR(arrayOf(IDeferralFactory_Ptr, handler, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIDeferralFactory(pointer.getPointer(0))

    public fun setValue(`value`: IDeferralFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IDeferralFactory_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IDeferralFactory {
    public override val IDeferralFactory_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("65a1ecc53fb548328ca9f061b281d13a")

    public fun makeIDeferralFactory(ptr: Pointer?): IDeferralFactory = IDeferralFactory_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IDeferralFactory): Array<IDeferralFactory> = (elements as
        Array<IDeferralFactory>).castToImpl<IDeferralFactory,IDeferralFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDeferralFactory?> =
        arrayOfNulls<IDeferralFactory_Impl>(size) as Array<IDeferralFactory?>
  }
}

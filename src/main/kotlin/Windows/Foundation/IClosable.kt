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

public interface IClosable : NativeMapped, IWinRTInterface {
  public val IClosable_Ptr: Pointer?

  public val IClosable_VtblPtr: Pointer?
    get() = IClosable_Ptr?.getPointer(0)

  public fun Close(): Unit {
    val fnPtr = IClosable_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(IClosable_Ptr, ))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIClosable(pointer.getPointer(0))

    public fun setValue(`value`: IClosable_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IClosable_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IClosable {
    public override val IClosable_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("30d5a8297fa4402683bbd75bae4ea99e")

    public fun makeIClosable(ptr: Pointer?): IClosable = IClosable_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IClosable): Array<IClosable> = (elements as
        Array<IClosable>).castToImpl<IClosable,IClosable_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IClosable?> = arrayOfNulls<IClosable_Impl>(size)
        as Array<IClosable?>
  }
}

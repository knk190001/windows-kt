package Windows.Foundation.Collections

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

public interface IIterable_IKeyValuePair_String_String__ : NativeMapped, IWinRTInterface {
  public val IIterable_IKeyValuePair_String_String___Ptr: Pointer?

  public val IIterable_IKeyValuePair_String_String___VtblPtr: Pointer?
    get() = IIterable_IKeyValuePair_String_String___Ptr?.getPointer(0)

  public fun First(): IIterator_IKeyValuePair_String_String__ {
    val fnPtr = IIterable_IKeyValuePair_String_String___VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result =
        Windows.Foundation.Collections.IIterator_IKeyValuePair_String_String__.ByReference()
    val hr = fn.invokeHR(arrayOf(IIterable_IKeyValuePair_String_String___Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIIterable_IKeyValuePair_String_String__(pointer.getPointer(0))

    public fun setValue(`value`: IIterable_IKeyValuePair_String_String___Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IIterable_IKeyValuePair_String_String___Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IIterable_IKeyValuePair_String_String__ {
    public override val IIterable_IKeyValuePair_String_String___Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val PIID: Guid.IID = Guid.IID("e9bdaaf0cbf65c72be9029cbf3a1319b")

    public val IID: Guid.IID = Guid.IID("faa585ea62144217afda7f46de5869b3")

    public fun makeIIterable_IKeyValuePair_String_String__(ptr: Pointer?):
        IIterable_IKeyValuePair_String_String__ = IIterable_IKeyValuePair_String_String___Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IIterable_IKeyValuePair_String_String__):
        Array<IIterable_IKeyValuePair_String_String__> = (elements as
        Array<IIterable_IKeyValuePair_String_String__>).castToImpl<IIterable_IKeyValuePair_String_String__,IIterable_IKeyValuePair_String_String___Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IIterable_IKeyValuePair_String_String__?> =
        arrayOfNulls<IIterable_IKeyValuePair_String_String___Impl>(size) as
        Array<IIterable_IKeyValuePair_String_String__?>
  }
}

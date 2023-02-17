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

public interface IIterable_WordSegment_ : NativeMapped, IWinRTInterface {
  public val IIterable_WordSegment__Ptr: Pointer?

  public val IIterable_WordSegment__VtblPtr: Pointer?
    get() = IIterable_WordSegment__Ptr?.getPointer(0)

  public fun First(): IIterator_WordSegment_ {
    val fnPtr = IIterable_WordSegment__VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.Collections.IIterator_WordSegment_.ByReference()
    val hr = fn.invokeHR(arrayOf(IIterable_WordSegment__Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIIterable_WordSegment_(pointer.getPointer(0))

    public fun setValue(`value`: IIterable_WordSegment__Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IIterable_WordSegment__Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IIterable_WordSegment_ {
    public override val IIterable_WordSegment__Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val PIID: Guid.IID = Guid.IID("d14dc94aa3115ddcbf8bd58795d87d6d")

    public val IID: Guid.IID = Guid.IID("faa585ea62144217afda7f46de5869b3")

    public fun makeIIterable_WordSegment_(ptr: Pointer?): IIterable_WordSegment_ =
        IIterable_WordSegment__Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IIterable_WordSegment_): Array<IIterable_WordSegment_> =
        (elements as
        Array<IIterable_WordSegment_>).castToImpl<IIterable_WordSegment_,IIterable_WordSegment__Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IIterable_WordSegment_?> =
        arrayOfNulls<IIterable_WordSegment__Impl>(size) as Array<IIterable_WordSegment_?>
  }
}

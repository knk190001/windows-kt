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

public interface IIterable_SelectableWordSegment_ : NativeMapped, IWinRTInterface {
  public val IIterable_SelectableWordSegment__Ptr: Pointer?

  public val IIterable_SelectableWordSegment__VtblPtr: Pointer?
    get() = IIterable_SelectableWordSegment__Ptr?.getPointer(0)

  public fun First(): IIterator_SelectableWordSegment_ {
    val fnPtr = IIterable_SelectableWordSegment__VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.Collections.IIterator_SelectableWordSegment_.ByReference()
    val hr = fn.invokeHR(arrayOf(IIterable_SelectableWordSegment__Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIIterable_SelectableWordSegment_(pointer.getPointer(0))

    public fun setValue(`value`: IIterable_SelectableWordSegment__Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IIterable_SelectableWordSegment__Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IIterable_SelectableWordSegment_ {
    public override val IIterable_SelectableWordSegment__Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val PIID: Guid.IID = Guid.IID("784b0cec1348533491e52e013294e211")

    public val IID: Guid.IID = Guid.IID("faa585ea62144217afda7f46de5869b3")

    public fun makeIIterable_SelectableWordSegment_(ptr: Pointer?): IIterable_SelectableWordSegment_
        = IIterable_SelectableWordSegment__Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IIterable_SelectableWordSegment_):
        Array<IIterable_SelectableWordSegment_> = (elements as
        Array<IIterable_SelectableWordSegment_>).castToImpl<IIterable_SelectableWordSegment_,IIterable_SelectableWordSegment__Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IIterable_SelectableWordSegment_?> =
        arrayOfNulls<IIterable_SelectableWordSegment__Impl>(size) as
        Array<IIterable_SelectableWordSegment_?>
  }
}

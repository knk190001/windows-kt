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

public interface IIterable_IXmlNode_ : NativeMapped, IWinRTInterface {
  public val IIterable_IXmlNode__Ptr: Pointer?

  public val IIterable_IXmlNode__VtblPtr: Pointer?
    get() = IIterable_IXmlNode__Ptr?.getPointer(0)

  public fun First(): IIterator_IXmlNode_ {
    val fnPtr = IIterable_IXmlNode__VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.Collections.IIterator_IXmlNode_.ByReference()
    val hr = fn.invokeHR(arrayOf(IIterable_IXmlNode__Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIIterable_IXmlNode_(pointer.getPointer(0))

    public fun setValue(`value`: IIterable_IXmlNode__Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IIterable_IXmlNode__Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IIterable_IXmlNode_ {
    public override val IIterable_IXmlNode__Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val PIID: Guid.IID = Guid.IID("f1146ffc8c9256e893f1711f86722633")

    public val IID: Guid.IID = Guid.IID("faa585ea62144217afda7f46de5869b3")

    public fun makeIIterable_IXmlNode_(ptr: Pointer?): IIterable_IXmlNode_ =
        IIterable_IXmlNode__Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IIterable_IXmlNode_): Array<IIterable_IXmlNode_> =
        (elements as
        Array<IIterable_IXmlNode_>).castToImpl<IIterable_IXmlNode_,IIterable_IXmlNode__Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IIterable_IXmlNode_?> =
        arrayOfNulls<IIterable_IXmlNode__Impl>(size) as Array<IIterable_IXmlNode_?>
  }
}

package Windows.Foundation.Collections

import Windows.Data.Text.SelectableWordSegment
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
import com.sun.jna.platform.win32.WinDef
import com.sun.jna.ptr.ByteByReference
import java.lang.RuntimeException
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit

public interface IIterator_SelectableWordSegment_ : NativeMapped, IWinRTInterface {
  public val IIterator_SelectableWordSegment__Ptr: Pointer?

  public val IIterator_SelectableWordSegment__VtblPtr: Pointer?
    get() = IIterator_SelectableWordSegment__Ptr?.getPointer(0)

  public fun get_Current(): SelectableWordSegment {
    val fnPtr = IIterator_SelectableWordSegment__VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Data.Text.SelectableWordSegment.ByReference()
    val hr = fn.invokeHR(arrayOf(IIterator_SelectableWordSegment__Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun get_HasCurrent(): Boolean {
    val fnPtr = IIterator_SelectableWordSegment__VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = ByteByReference()
    val hr = fn.invokeHR(arrayOf(IIterator_SelectableWordSegment__Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue != 0.toByte()
    return resultValue_Managed
  }

  public fun MoveNext(): Boolean {
    val fnPtr = IIterator_SelectableWordSegment__VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = ByteByReference()
    val hr = fn.invokeHR(arrayOf(IIterator_SelectableWordSegment__Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue != 0.toByte()
    return resultValue_Managed
  }

  public fun GetMany(items: Array<SelectableWordSegment?>): WinDef.UINT {
    val fnPtr = IIterator_SelectableWordSegment__VtblPtr!!.getPointer(9L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinDef.UINTByReference()
    val hr = fn.invokeHR(arrayOf(IIterator_SelectableWordSegment__Ptr, items.size, items, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIIterator_SelectableWordSegment_(pointer.getPointer(0))

    public fun setValue(`value`: IIterator_SelectableWordSegment__Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IIterator_SelectableWordSegment__Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IIterator_SelectableWordSegment_ {
    public override val IIterator_SelectableWordSegment__Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val PIID: Guid.IID = Guid.IID("a5842459147d5a888f23a3398afd8a85")

    public val IID: Guid.IID = Guid.IID("6a79e8634300459a9966cbb660963ee1")

    public fun makeIIterator_SelectableWordSegment_(ptr: Pointer?): IIterator_SelectableWordSegment_
        = IIterator_SelectableWordSegment__Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IIterator_SelectableWordSegment_):
        Array<IIterator_SelectableWordSegment_> = (elements as
        Array<IIterator_SelectableWordSegment_>).castToImpl<IIterator_SelectableWordSegment_,IIterator_SelectableWordSegment__Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IIterator_SelectableWordSegment_?> =
        arrayOfNulls<IIterator_SelectableWordSegment__Impl>(size) as
        Array<IIterator_SelectableWordSegment_?>
  }
}

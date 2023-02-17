package Windows.Foundation.Collections

import Windows.Storage.Search.SortEntry
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

public interface IVector_SortEntry_ : NativeMapped, IWinRTInterface {
  public val IVector_SortEntry__Ptr: Pointer?

  public val IVector_SortEntry__VtblPtr: Pointer?
    get() = IVector_SortEntry__Ptr?.getPointer(0)

  public fun GetAt(index: WinDef.UINT): SortEntry {
    val fnPtr = IVector_SortEntry__VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Storage.Search.SortEntry.ByReference()
    val hr = fn.invokeHR(arrayOf(IVector_SortEntry__Ptr, index, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun get_Size(): WinDef.UINT {
    val fnPtr = IVector_SortEntry__VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinDef.UINTByReference()
    val hr = fn.invokeHR(arrayOf(IVector_SortEntry__Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun GetView(): IVectorView_SortEntry_ {
    val fnPtr = IVector_SortEntry__VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.Collections.IVectorView_SortEntry_.ByReference()
    val hr = fn.invokeHR(arrayOf(IVector_SortEntry__Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun IndexOf(`value`: SortEntry.ByValue, index: WinDef.UINT): Boolean {
    val fnPtr = IVector_SortEntry__VtblPtr!!.getPointer(9L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = ByteByReference()
    val hr = fn.invokeHR(arrayOf(IVector_SortEntry__Ptr, value, index, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue != 0.toByte()
    return resultValue_Managed
  }

  public fun SetAt(index: WinDef.UINT, `value`: SortEntry.ByValue): Unit {
    val fnPtr = IVector_SortEntry__VtblPtr!!.getPointer(10L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(IVector_SortEntry__Ptr, index, value,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun InsertAt(index: WinDef.UINT, `value`: SortEntry.ByValue): Unit {
    val fnPtr = IVector_SortEntry__VtblPtr!!.getPointer(11L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(IVector_SortEntry__Ptr, index, value,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun RemoveAt(index: WinDef.UINT): Unit {
    val fnPtr = IVector_SortEntry__VtblPtr!!.getPointer(12L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(IVector_SortEntry__Ptr, index,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun Append(`value`: SortEntry.ByValue): Unit {
    val fnPtr = IVector_SortEntry__VtblPtr!!.getPointer(13L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(IVector_SortEntry__Ptr, value,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun RemoveAtEnd(): Unit {
    val fnPtr = IVector_SortEntry__VtblPtr!!.getPointer(14L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(IVector_SortEntry__Ptr, ))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun Clear(): Unit {
    val fnPtr = IVector_SortEntry__VtblPtr!!.getPointer(15L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(IVector_SortEntry__Ptr, ))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun GetMany(startIndex: WinDef.UINT, items: Array<SortEntry?>): WinDef.UINT {
    val fnPtr = IVector_SortEntry__VtblPtr!!.getPointer(16L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinDef.UINTByReference()
    val hr = fn.invokeHR(arrayOf(IVector_SortEntry__Ptr, startIndex, items.size, items, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun ReplaceAll(items: Array<SortEntry?>): Unit {
    val fnPtr = IVector_SortEntry__VtblPtr!!.getPointer(17L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(IVector_SortEntry__Ptr, items.size, items,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIVector_SortEntry_(pointer.getPointer(0))

    public fun setValue(`value`: IVector_SortEntry__Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IVector_SortEntry__Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IVector_SortEntry_ {
    public override val IVector_SortEntry__Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val PIID: Guid.IID = Guid.IID("d8ea401b47b3525484f4eea10c4cf068")

    public val IID: Guid.IID = Guid.IID("913337e911a14345a3a24e7f956e222d")

    public fun makeIVector_SortEntry_(ptr: Pointer?): IVector_SortEntry_ =
        IVector_SortEntry__Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IVector_SortEntry_): Array<IVector_SortEntry_> = (elements
        as Array<IVector_SortEntry_>).castToImpl<IVector_SortEntry_,IVector_SortEntry__Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVector_SortEntry_?> =
        arrayOfNulls<IVector_SortEntry__Impl>(size) as Array<IVector_SortEntry_?>
  }
}

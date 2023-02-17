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
import com.sun.jna.platform.win32.WinDef
import com.sun.jna.ptr.ByteByReference
import java.lang.RuntimeException
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit

public interface IIterator_IKeyValuePair_String_Object__ : NativeMapped, IWinRTInterface {
  public val IIterator_IKeyValuePair_String_Object___Ptr: Pointer?

  public val IIterator_IKeyValuePair_String_Object___VtblPtr: Pointer?
    get() = IIterator_IKeyValuePair_String_Object___Ptr?.getPointer(0)

  public fun get_Current(): IKeyValuePair_String_Object_ {
    val fnPtr = IIterator_IKeyValuePair_String_Object___VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.Collections.IKeyValuePair_String_Object_.ByReference()
    val hr = fn.invokeHR(arrayOf(IIterator_IKeyValuePair_String_Object___Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun get_HasCurrent(): Boolean {
    val fnPtr = IIterator_IKeyValuePair_String_Object___VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = ByteByReference()
    val hr = fn.invokeHR(arrayOf(IIterator_IKeyValuePair_String_Object___Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue != 0.toByte()
    return resultValue_Managed
  }

  public fun MoveNext(): Boolean {
    val fnPtr = IIterator_IKeyValuePair_String_Object___VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = ByteByReference()
    val hr = fn.invokeHR(arrayOf(IIterator_IKeyValuePair_String_Object___Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue != 0.toByte()
    return resultValue_Managed
  }

  public fun GetMany(items: Array<IKeyValuePair_String_Object_?>): WinDef.UINT {
    val fnPtr = IIterator_IKeyValuePair_String_Object___VtblPtr!!.getPointer(9L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinDef.UINTByReference()
    val hr = fn.invokeHR(arrayOf(IIterator_IKeyValuePair_String_Object___Ptr, items.size, items,
        result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIIterator_IKeyValuePair_String_Object__(pointer.getPointer(0))

    public fun setValue(`value`: IIterator_IKeyValuePair_String_Object___Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IIterator_IKeyValuePair_String_Object___Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IIterator_IKeyValuePair_String_Object__ {
    public override val IIterator_IKeyValuePair_String_Object___Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val PIID: Guid.IID = Guid.IID("5db5fa32707c5849a06b91c8eb9d10e8")

    public val IID: Guid.IID = Guid.IID("6a79e8634300459a9966cbb660963ee1")

    public fun makeIIterator_IKeyValuePair_String_Object__(ptr: Pointer?):
        IIterator_IKeyValuePair_String_Object__ = IIterator_IKeyValuePair_String_Object___Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IIterator_IKeyValuePair_String_Object__):
        Array<IIterator_IKeyValuePair_String_Object__> = (elements as
        Array<IIterator_IKeyValuePair_String_Object__>).castToImpl<IIterator_IKeyValuePair_String_Object__,IIterator_IKeyValuePair_String_Object___Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IIterator_IKeyValuePair_String_Object__?> =
        arrayOfNulls<IIterator_IKeyValuePair_String_Object___Impl>(size) as
        Array<IIterator_IKeyValuePair_String_Object__?>
  }
}
package Windows.Foundation.Collections

import Windows.Data.Text.AlternateWordForm
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

public interface IVectorView_AlternateWordForm_ : NativeMapped, IWinRTInterface {
  public val IVectorView_AlternateWordForm__Ptr: Pointer?

  public val IVectorView_AlternateWordForm__VtblPtr: Pointer?
    get() = IVectorView_AlternateWordForm__Ptr?.getPointer(0)

  public fun GetAt(index: WinDef.UINT): AlternateWordForm {
    val fnPtr = IVectorView_AlternateWordForm__VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Data.Text.AlternateWordForm.ByReference()
    val hr = fn.invokeHR(arrayOf(IVectorView_AlternateWordForm__Ptr, index, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun get_Size(): WinDef.UINT {
    val fnPtr = IVectorView_AlternateWordForm__VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinDef.UINTByReference()
    val hr = fn.invokeHR(arrayOf(IVectorView_AlternateWordForm__Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun IndexOf(`value`: AlternateWordForm, index: WinDef.UINT): Boolean {
    val fnPtr = IVectorView_AlternateWordForm__VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = ByteByReference()
    val hr = fn.invokeHR(arrayOf(IVectorView_AlternateWordForm__Ptr, value, index, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue != 0.toByte()
    return resultValue_Managed
  }

  public fun GetMany(startIndex: WinDef.UINT, items: Array<AlternateWordForm?>): WinDef.UINT {
    val fnPtr = IVectorView_AlternateWordForm__VtblPtr!!.getPointer(9L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinDef.UINTByReference()
    val hr = fn.invokeHR(arrayOf(IVectorView_AlternateWordForm__Ptr, startIndex, items.size, items,
        result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIVectorView_AlternateWordForm_(pointer.getPointer(0))

    public fun setValue(`value`: IVectorView_AlternateWordForm__Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IVectorView_AlternateWordForm__Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IVectorView_AlternateWordForm_ {
    public override val IVectorView_AlternateWordForm__Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val PIID: Guid.IID = Guid.IID("6b742ff2746a5545a6ed3bba453cf5d9")

    public val IID: Guid.IID = Guid.IID("bbe1fa4cb0e34583baef1f1b2e483e56")

    public fun makeIVectorView_AlternateWordForm_(ptr: Pointer?): IVectorView_AlternateWordForm_ =
        IVectorView_AlternateWordForm__Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IVectorView_AlternateWordForm_):
        Array<IVectorView_AlternateWordForm_> = (elements as
        Array<IVectorView_AlternateWordForm_>).castToImpl<IVectorView_AlternateWordForm_,IVectorView_AlternateWordForm__Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVectorView_AlternateWordForm_?> =
        arrayOfNulls<IVectorView_AlternateWordForm__Impl>(size) as
        Array<IVectorView_AlternateWordForm_?>
  }
}

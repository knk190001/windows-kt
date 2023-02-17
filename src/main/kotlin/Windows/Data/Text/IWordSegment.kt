package Windows.Data.Text

import Windows.Foundation.Collections.IVectorView_AlternateWordForm_
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
import com.sun.jna.platform.win32.WinNT
import java.lang.RuntimeException
import kotlin.Array
import kotlin.Int
import kotlin.String
import kotlin.Unit

public interface IWordSegment : NativeMapped, IWinRTInterface {
  public val IWordSegment_Ptr: Pointer?

  public val IWordSegment_VtblPtr: Pointer?
    get() = IWordSegment_Ptr?.getPointer(0)

  public fun get_Text(): String {
    val fnPtr = IWordSegment_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(IWordSegment_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public fun get_SourceTextSegment(): TextSegment {
    val fnPtr = IWordSegment_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Data.Text.TextSegment.ByReference()
    val hr = fn.invokeHR(arrayOf(IWordSegment_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun get_AlternateForms(): IVectorView_AlternateWordForm_ {
    val fnPtr = IWordSegment_VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.Collections.IVectorView_AlternateWordForm_.ByReference()
    val hr = fn.invokeHR(arrayOf(IWordSegment_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIWordSegment(pointer.getPointer(0))

    public fun setValue(`value`: IWordSegment_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IWordSegment_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IWordSegment {
    public override val IWordSegment_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("d2d4ba6d987c4cc0b6bdd49a11b38f9a")

    public fun makeIWordSegment(ptr: Pointer?): IWordSegment = IWordSegment_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IWordSegment): Array<IWordSegment> = (elements as
        Array<IWordSegment>).castToImpl<IWordSegment,IWordSegment_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWordSegment?> =
        arrayOfNulls<IWordSegment_Impl>(size) as Array<IWordSegment?>
  }
}

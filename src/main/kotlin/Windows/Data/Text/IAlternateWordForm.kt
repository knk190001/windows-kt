package Windows.Data.Text

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

public interface IAlternateWordForm : NativeMapped, IWinRTInterface {
  public val IAlternateWordForm_Ptr: Pointer?

  public val IAlternateWordForm_VtblPtr: Pointer?
    get() = IAlternateWordForm_Ptr?.getPointer(0)

  public fun get_SourceTextSegment(): TextSegment {
    val fnPtr = IAlternateWordForm_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Data.Text.TextSegment.ByReference()
    val hr = fn.invokeHR(arrayOf(IAlternateWordForm_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun get_AlternateText(): String {
    val fnPtr = IAlternateWordForm_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(IAlternateWordForm_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public fun get_NormalizationFormat(): AlternateNormalizationFormat {
    val fnPtr = IAlternateWordForm_VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Data.Text.AlternateNormalizationFormat.ByReference()
    val hr = fn.invokeHR(arrayOf(IAlternateWordForm_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIAlternateWordForm(pointer.getPointer(0))

    public fun setValue(`value`: IAlternateWordForm_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IAlternateWordForm_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IAlternateWordForm {
    public override val IAlternateWordForm_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("47396c1e51b942079146248e636a1d1d")

    public fun makeIAlternateWordForm(ptr: Pointer?): IAlternateWordForm =
        IAlternateWordForm_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IAlternateWordForm): Array<IAlternateWordForm> = (elements
        as Array<IAlternateWordForm>).castToImpl<IAlternateWordForm,IAlternateWordForm_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAlternateWordForm?> =
        arrayOfNulls<IAlternateWordForm_Impl>(size) as Array<IAlternateWordForm?>
  }
}

package Windows.Data.Text

import Windows.Foundation.IAsyncOperation_IVectorView_TextPhoneme__
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
import kotlin.String
import kotlin.Unit

public interface ITextReverseConversionGenerator2 : NativeMapped, IWinRTInterface {
  public val ITextReverseConversionGenerator2_Ptr: Pointer?

  public val ITextReverseConversionGenerator2_VtblPtr: Pointer?
    get() = ITextReverseConversionGenerator2_Ptr?.getPointer(0)

  public fun GetPhonemesAsync(input: String): IAsyncOperation_IVectorView_TextPhoneme__ {
    val fnPtr = ITextReverseConversionGenerator2_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val input_Native = input.toHandle()
    val result = Windows.Foundation.IAsyncOperation_IVectorView_TextPhoneme__.ByReference()
    val hr = fn.invokeHR(arrayOf(ITextReverseConversionGenerator2_Ptr, input_Native, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeITextReverseConversionGenerator2(pointer.getPointer(0))

    public fun setValue(`value`: ITextReverseConversionGenerator2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class ITextReverseConversionGenerator2_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), ITextReverseConversionGenerator2 {
    public override val ITextReverseConversionGenerator2_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("1aafd2ec85d646fd828a3a4830fa6e18")

    public fun makeITextReverseConversionGenerator2(ptr: Pointer?): ITextReverseConversionGenerator2
        = ITextReverseConversionGenerator2_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: ITextReverseConversionGenerator2):
        Array<ITextReverseConversionGenerator2> = (elements as
        Array<ITextReverseConversionGenerator2>).castToImpl<ITextReverseConversionGenerator2,ITextReverseConversionGenerator2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITextReverseConversionGenerator2?> =
        arrayOfNulls<ITextReverseConversionGenerator2_Impl>(size) as
        Array<ITextReverseConversionGenerator2?>
  }
}

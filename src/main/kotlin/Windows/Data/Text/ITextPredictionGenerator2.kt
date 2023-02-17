package Windows.Data.Text

import Windows.Foundation.Collections.IIterable_String_
import Windows.Foundation.IAsyncOperation_IVectorView_String__
import Windows.UI.Text.Core.CoreTextInputScope
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
import java.lang.RuntimeException
import kotlin.Array
import kotlin.Int
import kotlin.String
import kotlin.Unit

public interface ITextPredictionGenerator2 : NativeMapped, IWinRTInterface {
  public val ITextPredictionGenerator2_Ptr: Pointer?

  public val ITextPredictionGenerator2_VtblPtr: Pointer?
    get() = ITextPredictionGenerator2_Ptr?.getPointer(0)

  public fun GetCandidatesAsync(
    input: String,
    maxCandidates: WinDef.UINT,
    predictionOptions: TextPredictionOptions,
    previousStrings: IIterable_String_,
  ): IAsyncOperation_IVectorView_String__ {
    val fnPtr = ITextPredictionGenerator2_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val input_Native = input.toHandle()
    val result = Windows.Foundation.IAsyncOperation_IVectorView_String__.ByReference()
    val hr = fn.invokeHR(arrayOf(ITextPredictionGenerator2_Ptr, input_Native, maxCandidates,
        predictionOptions, previousStrings, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun GetNextWordCandidatesAsync(maxCandidates: WinDef.UINT,
      previousStrings: IIterable_String_): IAsyncOperation_IVectorView_String__ {
    val fnPtr = ITextPredictionGenerator2_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.IAsyncOperation_IVectorView_String__.ByReference()
    val hr = fn.invokeHR(arrayOf(ITextPredictionGenerator2_Ptr, maxCandidates, previousStrings,
        result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun get_InputScope(): CoreTextInputScope {
    val fnPtr = ITextPredictionGenerator2_VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.UI.Text.Core.CoreTextInputScope.ByReference()
    val hr = fn.invokeHR(arrayOf(ITextPredictionGenerator2_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun put_InputScope(`value`: CoreTextInputScope): Unit {
    val fnPtr = ITextPredictionGenerator2_VtblPtr!!.getPointer(9L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(ITextPredictionGenerator2_Ptr, value,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeITextPredictionGenerator2(pointer.getPointer(0))

    public fun setValue(`value`: ITextPredictionGenerator2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class ITextPredictionGenerator2_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), ITextPredictionGenerator2 {
    public override val ITextPredictionGenerator2_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("b84723b82c77486a900aa3453eedc15d")

    public fun makeITextPredictionGenerator2(ptr: Pointer?): ITextPredictionGenerator2 =
        ITextPredictionGenerator2_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: ITextPredictionGenerator2):
        Array<ITextPredictionGenerator2> = (elements as
        Array<ITextPredictionGenerator2>).castToImpl<ITextPredictionGenerator2,ITextPredictionGenerator2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITextPredictionGenerator2?> =
        arrayOfNulls<ITextPredictionGenerator2_Impl>(size) as Array<ITextPredictionGenerator2?>
  }
}

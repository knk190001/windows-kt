package Windows.Data.Text

import Windows.Foundation.IAsyncOperation_IVectorView_String__
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
import com.sun.jna.platform.win32.WinNT
import com.sun.jna.ptr.ByteByReference
import java.lang.RuntimeException
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit

public interface ITextPredictionGenerator : NativeMapped, IWinRTInterface {
  public val ITextPredictionGenerator_Ptr: Pointer?

  public val ITextPredictionGenerator_VtblPtr: Pointer?
    get() = ITextPredictionGenerator_Ptr?.getPointer(0)

  public fun get_ResolvedLanguage(): String {
    val fnPtr = ITextPredictionGenerator_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(ITextPredictionGenerator_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public fun get_LanguageAvailableButNotInstalled(): Boolean {
    val fnPtr = ITextPredictionGenerator_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = ByteByReference()
    val hr = fn.invokeHR(arrayOf(ITextPredictionGenerator_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue != 0.toByte()
    return resultValue_Managed
  }

  public fun GetCandidatesAsync(input: String): IAsyncOperation_IVectorView_String__ {
    val fnPtr = ITextPredictionGenerator_VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val input_Native = input.toHandle()
    val result = Windows.Foundation.IAsyncOperation_IVectorView_String__.ByReference()
    val hr = fn.invokeHR(arrayOf(ITextPredictionGenerator_Ptr, input_Native, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun GetCandidatesAsync(input: String, maxCandidates: WinDef.UINT):
      IAsyncOperation_IVectorView_String__ {
    val fnPtr = ITextPredictionGenerator_VtblPtr!!.getPointer(9L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val input_Native = input.toHandle()
    val result = Windows.Foundation.IAsyncOperation_IVectorView_String__.ByReference()
    val hr = fn.invokeHR(arrayOf(ITextPredictionGenerator_Ptr, input_Native, maxCandidates, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeITextPredictionGenerator(pointer.getPointer(0))

    public fun setValue(`value`: ITextPredictionGenerator_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class ITextPredictionGenerator_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), ITextPredictionGenerator {
    public override val ITextPredictionGenerator_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("5eacab07abf14cb69d9e326f2b468756")

    public fun makeITextPredictionGenerator(ptr: Pointer?): ITextPredictionGenerator =
        ITextPredictionGenerator_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: ITextPredictionGenerator): Array<ITextPredictionGenerator>
        = (elements as
        Array<ITextPredictionGenerator>).castToImpl<ITextPredictionGenerator,ITextPredictionGenerator_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITextPredictionGenerator?> =
        arrayOfNulls<ITextPredictionGenerator_Impl>(size) as Array<ITextPredictionGenerator?>
  }
}

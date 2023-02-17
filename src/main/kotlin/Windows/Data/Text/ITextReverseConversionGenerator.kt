package Windows.Data.Text

import Windows.Foundation.IAsyncOperation_String_
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
import com.sun.jna.ptr.ByteByReference
import java.lang.RuntimeException
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit

public interface ITextReverseConversionGenerator : NativeMapped, IWinRTInterface {
  public val ITextReverseConversionGenerator_Ptr: Pointer?

  public val ITextReverseConversionGenerator_VtblPtr: Pointer?
    get() = ITextReverseConversionGenerator_Ptr?.getPointer(0)

  public fun get_ResolvedLanguage(): String {
    val fnPtr = ITextReverseConversionGenerator_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(ITextReverseConversionGenerator_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public fun get_LanguageAvailableButNotInstalled(): Boolean {
    val fnPtr = ITextReverseConversionGenerator_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = ByteByReference()
    val hr = fn.invokeHR(arrayOf(ITextReverseConversionGenerator_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue != 0.toByte()
    return resultValue_Managed
  }

  public fun ConvertBackAsync(input: String): IAsyncOperation_String_ {
    val fnPtr = ITextReverseConversionGenerator_VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val input_Native = input.toHandle()
    val result = Windows.Foundation.IAsyncOperation_String_.ByReference()
    val hr = fn.invokeHR(arrayOf(ITextReverseConversionGenerator_Ptr, input_Native, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeITextReverseConversionGenerator(pointer.getPointer(0))

    public fun setValue(`value`: ITextReverseConversionGenerator_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class ITextReverseConversionGenerator_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), ITextReverseConversionGenerator {
    public override val ITextReverseConversionGenerator_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("51e7f5149c514d86ae1bb498fbad8313")

    public fun makeITextReverseConversionGenerator(ptr: Pointer?): ITextReverseConversionGenerator =
        ITextReverseConversionGenerator_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: ITextReverseConversionGenerator):
        Array<ITextReverseConversionGenerator> = (elements as
        Array<ITextReverseConversionGenerator>).castToImpl<ITextReverseConversionGenerator,ITextReverseConversionGenerator_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITextReverseConversionGenerator?> =
        arrayOfNulls<ITextReverseConversionGenerator_Impl>(size) as
        Array<ITextReverseConversionGenerator?>
  }
}

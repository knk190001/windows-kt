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
import java.lang.RuntimeException
import kotlin.Array
import kotlin.Int
import kotlin.String
import kotlin.Unit

public interface ITextReverseConversionGeneratorFactory : NativeMapped, IWinRTInterface {
  public val ITextReverseConversionGeneratorFactory_Ptr: Pointer?

  public val ITextReverseConversionGeneratorFactory_VtblPtr: Pointer?
    get() = ITextReverseConversionGeneratorFactory_Ptr?.getPointer(0)

  public fun Create(languageTag: String): TextReverseConversionGenerator {
    val fnPtr = ITextReverseConversionGeneratorFactory_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val languageTag_Native = languageTag.toHandle()
    val result = Windows.Data.Text.TextReverseConversionGenerator.ByReference()
    val hr = fn.invokeHR(arrayOf(ITextReverseConversionGeneratorFactory_Ptr, languageTag_Native,
        result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeITextReverseConversionGeneratorFactory(pointer.getPointer(0))

    public fun setValue(`value`: ITextReverseConversionGeneratorFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class ITextReverseConversionGeneratorFactory_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), ITextReverseConversionGeneratorFactory {
    public override val ITextReverseConversionGeneratorFactory_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("63bed3261fda41f689d523ddea3c729a")

    public fun makeITextReverseConversionGeneratorFactory(ptr: Pointer?):
        ITextReverseConversionGeneratorFactory = ITextReverseConversionGeneratorFactory_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: ITextReverseConversionGeneratorFactory):
        Array<ITextReverseConversionGeneratorFactory> = (elements as
        Array<ITextReverseConversionGeneratorFactory>).castToImpl<ITextReverseConversionGeneratorFactory,ITextReverseConversionGeneratorFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITextReverseConversionGeneratorFactory?> =
        arrayOfNulls<ITextReverseConversionGeneratorFactory_Impl>(size) as
        Array<ITextReverseConversionGeneratorFactory?>
  }
}

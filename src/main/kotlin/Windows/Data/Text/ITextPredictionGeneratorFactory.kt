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

public interface ITextPredictionGeneratorFactory : NativeMapped, IWinRTInterface {
  public val ITextPredictionGeneratorFactory_Ptr: Pointer?

  public val ITextPredictionGeneratorFactory_VtblPtr: Pointer?
    get() = ITextPredictionGeneratorFactory_Ptr?.getPointer(0)

  public fun Create(languageTag: String): TextPredictionGenerator {
    val fnPtr = ITextPredictionGeneratorFactory_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val languageTag_Native = languageTag.toHandle()
    val result = Windows.Data.Text.TextPredictionGenerator.ByReference()
    val hr = fn.invokeHR(arrayOf(ITextPredictionGeneratorFactory_Ptr, languageTag_Native, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeITextPredictionGeneratorFactory(pointer.getPointer(0))

    public fun setValue(`value`: ITextPredictionGeneratorFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class ITextPredictionGeneratorFactory_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), ITextPredictionGeneratorFactory {
    public override val ITextPredictionGeneratorFactory_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("7257b4168ba247519d309d85435653a2")

    public fun makeITextPredictionGeneratorFactory(ptr: Pointer?): ITextPredictionGeneratorFactory =
        ITextPredictionGeneratorFactory_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: ITextPredictionGeneratorFactory):
        Array<ITextPredictionGeneratorFactory> = (elements as
        Array<ITextPredictionGeneratorFactory>).castToImpl<ITextPredictionGeneratorFactory,ITextPredictionGeneratorFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITextPredictionGeneratorFactory?> =
        arrayOfNulls<ITextPredictionGeneratorFactory_Impl>(size) as
        Array<ITextPredictionGeneratorFactory?>
  }
}

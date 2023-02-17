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

public interface ITextConversionGeneratorFactory : NativeMapped, IWinRTInterface {
  public val ITextConversionGeneratorFactory_Ptr: Pointer?

  public val ITextConversionGeneratorFactory_VtblPtr: Pointer?
    get() = ITextConversionGeneratorFactory_Ptr?.getPointer(0)

  public fun Create(languageTag: String): TextConversionGenerator {
    val fnPtr = ITextConversionGeneratorFactory_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val languageTag_Native = languageTag.toHandle()
    val result = Windows.Data.Text.TextConversionGenerator.ByReference()
    val hr = fn.invokeHR(arrayOf(ITextConversionGeneratorFactory_Ptr, languageTag_Native, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeITextConversionGeneratorFactory(pointer.getPointer(0))

    public fun setValue(`value`: ITextConversionGeneratorFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class ITextConversionGeneratorFactory_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), ITextConversionGeneratorFactory {
    public override val ITextConversionGeneratorFactory_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("fcaa3781308349abbe1556dfbbb74d6f")

    public fun makeITextConversionGeneratorFactory(ptr: Pointer?): ITextConversionGeneratorFactory =
        ITextConversionGeneratorFactory_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: ITextConversionGeneratorFactory):
        Array<ITextConversionGeneratorFactory> = (elements as
        Array<ITextConversionGeneratorFactory>).castToImpl<ITextConversionGeneratorFactory,ITextConversionGeneratorFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITextConversionGeneratorFactory?> =
        arrayOfNulls<ITextConversionGeneratorFactory_Impl>(size) as
        Array<ITextConversionGeneratorFactory?>
  }
}

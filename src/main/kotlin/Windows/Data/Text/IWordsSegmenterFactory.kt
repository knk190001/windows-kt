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

public interface IWordsSegmenterFactory : NativeMapped, IWinRTInterface {
  public val IWordsSegmenterFactory_Ptr: Pointer?

  public val IWordsSegmenterFactory_VtblPtr: Pointer?
    get() = IWordsSegmenterFactory_Ptr?.getPointer(0)

  public fun CreateWithLanguage(language: String): WordsSegmenter {
    val fnPtr = IWordsSegmenterFactory_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val language_Native = language.toHandle()
    val result = Windows.Data.Text.WordsSegmenter.ByReference()
    val hr = fn.invokeHR(arrayOf(IWordsSegmenterFactory_Ptr, language_Native, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIWordsSegmenterFactory(pointer.getPointer(0))

    public fun setValue(`value`: IWordsSegmenterFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IWordsSegmenterFactory_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IWordsSegmenterFactory {
    public override val IWordsSegmenterFactory_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("e6977274fc35455c8bfb6d7f4653ca97")

    public fun makeIWordsSegmenterFactory(ptr: Pointer?): IWordsSegmenterFactory =
        IWordsSegmenterFactory_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IWordsSegmenterFactory): Array<IWordsSegmenterFactory> =
        (elements as
        Array<IWordsSegmenterFactory>).castToImpl<IWordsSegmenterFactory,IWordsSegmenterFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWordsSegmenterFactory?> =
        arrayOfNulls<IWordsSegmenterFactory_Impl>(size) as Array<IWordsSegmenterFactory?>
  }
}

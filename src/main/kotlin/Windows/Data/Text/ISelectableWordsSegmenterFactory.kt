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

public interface ISelectableWordsSegmenterFactory : NativeMapped, IWinRTInterface {
  public val ISelectableWordsSegmenterFactory_Ptr: Pointer?

  public val ISelectableWordsSegmenterFactory_VtblPtr: Pointer?
    get() = ISelectableWordsSegmenterFactory_Ptr?.getPointer(0)

  public fun CreateWithLanguage(language: String): SelectableWordsSegmenter {
    val fnPtr = ISelectableWordsSegmenterFactory_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val language_Native = language.toHandle()
    val result = Windows.Data.Text.SelectableWordsSegmenter.ByReference()
    val hr = fn.invokeHR(arrayOf(ISelectableWordsSegmenterFactory_Ptr, language_Native, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeISelectableWordsSegmenterFactory(pointer.getPointer(0))

    public fun setValue(`value`: ISelectableWordsSegmenterFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class ISelectableWordsSegmenterFactory_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), ISelectableWordsSegmenterFactory {
    public override val ISelectableWordsSegmenterFactory_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("8c7a764860574339bc70f210010a4150")

    public fun makeISelectableWordsSegmenterFactory(ptr: Pointer?): ISelectableWordsSegmenterFactory
        = ISelectableWordsSegmenterFactory_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: ISelectableWordsSegmenterFactory):
        Array<ISelectableWordsSegmenterFactory> = (elements as
        Array<ISelectableWordsSegmenterFactory>).castToImpl<ISelectableWordsSegmenterFactory,ISelectableWordsSegmenterFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISelectableWordsSegmenterFactory?> =
        arrayOfNulls<ISelectableWordsSegmenterFactory_Impl>(size) as
        Array<ISelectableWordsSegmenterFactory?>
  }
}

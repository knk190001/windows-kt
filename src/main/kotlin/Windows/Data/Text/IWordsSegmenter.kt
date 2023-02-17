package Windows.Data.Text

import Windows.Foundation.Collections.IVectorView_WordSegment_
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
import java.lang.RuntimeException
import kotlin.Array
import kotlin.Int
import kotlin.String
import kotlin.Unit

public interface IWordsSegmenter : NativeMapped, IWinRTInterface {
  public val IWordsSegmenter_Ptr: Pointer?

  public val IWordsSegmenter_VtblPtr: Pointer?
    get() = IWordsSegmenter_Ptr?.getPointer(0)

  public fun get_ResolvedLanguage(): String {
    val fnPtr = IWordsSegmenter_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(IWordsSegmenter_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public fun GetTokenAt(text: String, startIndex: WinDef.UINT): WordSegment {
    val fnPtr = IWordsSegmenter_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val text_Native = text.toHandle()
    val result = Windows.Data.Text.WordSegment.ByReference()
    val hr = fn.invokeHR(arrayOf(IWordsSegmenter_Ptr, text_Native, startIndex, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun GetTokens(text: String): IVectorView_WordSegment_ {
    val fnPtr = IWordsSegmenter_VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val text_Native = text.toHandle()
    val result = Windows.Foundation.Collections.IVectorView_WordSegment_.ByReference()
    val hr = fn.invokeHR(arrayOf(IWordsSegmenter_Ptr, text_Native, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun Tokenize(
    text: String,
    startIndex: WinDef.UINT,
    handler: WordSegmentsTokenizingHandler,
  ): Unit {
    val fnPtr = IWordsSegmenter_VtblPtr!!.getPointer(9L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val text_Native = text.toHandle()
    val hr = fn.invokeHR(arrayOf(IWordsSegmenter_Ptr, text_Native, startIndex, handler,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIWordsSegmenter(pointer.getPointer(0))

    public fun setValue(`value`: IWordsSegmenter_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IWordsSegmenter_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IWordsSegmenter {
    public override val IWordsSegmenter_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("86b4d4d1b2fe4e34a81d66640300454f")

    public fun makeIWordsSegmenter(ptr: Pointer?): IWordsSegmenter = IWordsSegmenter_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IWordsSegmenter): Array<IWordsSegmenter> = (elements as
        Array<IWordsSegmenter>).castToImpl<IWordsSegmenter,IWordsSegmenter_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWordsSegmenter?> =
        arrayOfNulls<IWordsSegmenter_Impl>(size) as Array<IWordsSegmenter?>
  }
}

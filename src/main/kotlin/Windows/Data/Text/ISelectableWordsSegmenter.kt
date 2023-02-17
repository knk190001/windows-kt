package Windows.Data.Text

import Windows.Foundation.Collections.IVectorView_SelectableWordSegment_
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

public interface ISelectableWordsSegmenter : NativeMapped, IWinRTInterface {
  public val ISelectableWordsSegmenter_Ptr: Pointer?

  public val ISelectableWordsSegmenter_VtblPtr: Pointer?
    get() = ISelectableWordsSegmenter_Ptr?.getPointer(0)

  public fun get_ResolvedLanguage(): String {
    val fnPtr = ISelectableWordsSegmenter_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(ISelectableWordsSegmenter_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public fun GetTokenAt(text: String, startIndex: WinDef.UINT): SelectableWordSegment {
    val fnPtr = ISelectableWordsSegmenter_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val text_Native = text.toHandle()
    val result = Windows.Data.Text.SelectableWordSegment.ByReference()
    val hr = fn.invokeHR(arrayOf(ISelectableWordsSegmenter_Ptr, text_Native, startIndex, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun GetTokens(text: String): IVectorView_SelectableWordSegment_ {
    val fnPtr = ISelectableWordsSegmenter_VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val text_Native = text.toHandle()
    val result = Windows.Foundation.Collections.IVectorView_SelectableWordSegment_.ByReference()
    val hr = fn.invokeHR(arrayOf(ISelectableWordsSegmenter_Ptr, text_Native, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun Tokenize(
    text: String,
    startIndex: WinDef.UINT,
    handler: SelectableWordSegmentsTokenizingHandler,
  ): Unit {
    val fnPtr = ISelectableWordsSegmenter_VtblPtr!!.getPointer(9L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val text_Native = text.toHandle()
    val hr = fn.invokeHR(arrayOf(ISelectableWordsSegmenter_Ptr, text_Native, startIndex, handler,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeISelectableWordsSegmenter(pointer.getPointer(0))

    public fun setValue(`value`: ISelectableWordsSegmenter_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class ISelectableWordsSegmenter_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), ISelectableWordsSegmenter {
    public override val ISelectableWordsSegmenter_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("f6dc31e74b1345c588977d71269e085d")

    public fun makeISelectableWordsSegmenter(ptr: Pointer?): ISelectableWordsSegmenter =
        ISelectableWordsSegmenter_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: ISelectableWordsSegmenter):
        Array<ISelectableWordsSegmenter> = (elements as
        Array<ISelectableWordsSegmenter>).castToImpl<ISelectableWordsSegmenter,ISelectableWordsSegmenter_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISelectableWordsSegmenter?> =
        arrayOfNulls<ISelectableWordsSegmenter_Impl>(size) as Array<ISelectableWordsSegmenter?>
  }
}

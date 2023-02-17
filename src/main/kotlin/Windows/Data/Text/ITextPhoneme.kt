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
import com.sun.jna.platform.win32.WinNT
import java.lang.RuntimeException
import kotlin.Array
import kotlin.Int
import kotlin.String
import kotlin.Unit

public interface ITextPhoneme : NativeMapped, IWinRTInterface {
  public val ITextPhoneme_Ptr: Pointer?

  public val ITextPhoneme_VtblPtr: Pointer?
    get() = ITextPhoneme_Ptr?.getPointer(0)

  public fun get_DisplayText(): String {
    val fnPtr = ITextPhoneme_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(ITextPhoneme_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public fun get_ReadingText(): String {
    val fnPtr = ITextPhoneme_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(ITextPhoneme_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeITextPhoneme(pointer.getPointer(0))

    public fun setValue(`value`: ITextPhoneme_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class ITextPhoneme_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), ITextPhoneme {
    public override val ITextPhoneme_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("9362a40a9b7a456994cfd84f2f38cf9b")

    public fun makeITextPhoneme(ptr: Pointer?): ITextPhoneme = ITextPhoneme_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: ITextPhoneme): Array<ITextPhoneme> = (elements as
        Array<ITextPhoneme>).castToImpl<ITextPhoneme,ITextPhoneme_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITextPhoneme?> =
        arrayOfNulls<ITextPhoneme_Impl>(size) as Array<ITextPhoneme?>
  }
}

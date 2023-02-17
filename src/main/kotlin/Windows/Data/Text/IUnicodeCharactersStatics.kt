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
import com.sun.jna.platform.win32.WinDef
import com.sun.jna.ptr.ByteByReference
import java.lang.RuntimeException
import kotlin.Array
import kotlin.Boolean
import kotlin.Char
import kotlin.Int
import kotlin.Unit

public interface IUnicodeCharactersStatics : NativeMapped, IWinRTInterface {
  public val IUnicodeCharactersStatics_Ptr: Pointer?

  public val IUnicodeCharactersStatics_VtblPtr: Pointer?
    get() = IUnicodeCharactersStatics_Ptr?.getPointer(0)

  public fun GetCodepointFromSurrogatePair(highSurrogate: WinDef.UINT, lowSurrogate: WinDef.UINT):
      WinDef.UINT {
    val fnPtr = IUnicodeCharactersStatics_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinDef.UINTByReference()
    val hr = fn.invokeHR(arrayOf(IUnicodeCharactersStatics_Ptr, highSurrogate, lowSurrogate,
        result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun GetSurrogatePairFromCodepoint(
    codepoint: WinDef.UINT,
    highSurrogate: Char,
    lowSurrogate: Char,
  ): Unit {
    val fnPtr = IUnicodeCharactersStatics_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(IUnicodeCharactersStatics_Ptr, codepoint, highSurrogate,
        lowSurrogate,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun IsHighSurrogate(codepoint: WinDef.UINT): Boolean {
    val fnPtr = IUnicodeCharactersStatics_VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = ByteByReference()
    val hr = fn.invokeHR(arrayOf(IUnicodeCharactersStatics_Ptr, codepoint, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue != 0.toByte()
    return resultValue_Managed
  }

  public fun IsLowSurrogate(codepoint: WinDef.UINT): Boolean {
    val fnPtr = IUnicodeCharactersStatics_VtblPtr!!.getPointer(9L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = ByteByReference()
    val hr = fn.invokeHR(arrayOf(IUnicodeCharactersStatics_Ptr, codepoint, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue != 0.toByte()
    return resultValue_Managed
  }

  public fun IsSupplementary(codepoint: WinDef.UINT): Boolean {
    val fnPtr = IUnicodeCharactersStatics_VtblPtr!!.getPointer(10L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = ByteByReference()
    val hr = fn.invokeHR(arrayOf(IUnicodeCharactersStatics_Ptr, codepoint, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue != 0.toByte()
    return resultValue_Managed
  }

  public fun IsNoncharacter(codepoint: WinDef.UINT): Boolean {
    val fnPtr = IUnicodeCharactersStatics_VtblPtr!!.getPointer(11L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = ByteByReference()
    val hr = fn.invokeHR(arrayOf(IUnicodeCharactersStatics_Ptr, codepoint, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue != 0.toByte()
    return resultValue_Managed
  }

  public fun IsWhitespace(codepoint: WinDef.UINT): Boolean {
    val fnPtr = IUnicodeCharactersStatics_VtblPtr!!.getPointer(12L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = ByteByReference()
    val hr = fn.invokeHR(arrayOf(IUnicodeCharactersStatics_Ptr, codepoint, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue != 0.toByte()
    return resultValue_Managed
  }

  public fun IsAlphabetic(codepoint: WinDef.UINT): Boolean {
    val fnPtr = IUnicodeCharactersStatics_VtblPtr!!.getPointer(13L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = ByteByReference()
    val hr = fn.invokeHR(arrayOf(IUnicodeCharactersStatics_Ptr, codepoint, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue != 0.toByte()
    return resultValue_Managed
  }

  public fun IsCased(codepoint: WinDef.UINT): Boolean {
    val fnPtr = IUnicodeCharactersStatics_VtblPtr!!.getPointer(14L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = ByteByReference()
    val hr = fn.invokeHR(arrayOf(IUnicodeCharactersStatics_Ptr, codepoint, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue != 0.toByte()
    return resultValue_Managed
  }

  public fun IsUppercase(codepoint: WinDef.UINT): Boolean {
    val fnPtr = IUnicodeCharactersStatics_VtblPtr!!.getPointer(15L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = ByteByReference()
    val hr = fn.invokeHR(arrayOf(IUnicodeCharactersStatics_Ptr, codepoint, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue != 0.toByte()
    return resultValue_Managed
  }

  public fun IsLowercase(codepoint: WinDef.UINT): Boolean {
    val fnPtr = IUnicodeCharactersStatics_VtblPtr!!.getPointer(16L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = ByteByReference()
    val hr = fn.invokeHR(arrayOf(IUnicodeCharactersStatics_Ptr, codepoint, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue != 0.toByte()
    return resultValue_Managed
  }

  public fun IsIdStart(codepoint: WinDef.UINT): Boolean {
    val fnPtr = IUnicodeCharactersStatics_VtblPtr!!.getPointer(17L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = ByteByReference()
    val hr = fn.invokeHR(arrayOf(IUnicodeCharactersStatics_Ptr, codepoint, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue != 0.toByte()
    return resultValue_Managed
  }

  public fun IsIdContinue(codepoint: WinDef.UINT): Boolean {
    val fnPtr = IUnicodeCharactersStatics_VtblPtr!!.getPointer(18L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = ByteByReference()
    val hr = fn.invokeHR(arrayOf(IUnicodeCharactersStatics_Ptr, codepoint, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue != 0.toByte()
    return resultValue_Managed
  }

  public fun IsGraphemeBase(codepoint: WinDef.UINT): Boolean {
    val fnPtr = IUnicodeCharactersStatics_VtblPtr!!.getPointer(19L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = ByteByReference()
    val hr = fn.invokeHR(arrayOf(IUnicodeCharactersStatics_Ptr, codepoint, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue != 0.toByte()
    return resultValue_Managed
  }

  public fun IsGraphemeExtend(codepoint: WinDef.UINT): Boolean {
    val fnPtr = IUnicodeCharactersStatics_VtblPtr!!.getPointer(20L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = ByteByReference()
    val hr = fn.invokeHR(arrayOf(IUnicodeCharactersStatics_Ptr, codepoint, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue != 0.toByte()
    return resultValue_Managed
  }

  public fun GetNumericType(codepoint: WinDef.UINT): UnicodeNumericType {
    val fnPtr = IUnicodeCharactersStatics_VtblPtr!!.getPointer(21L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Data.Text.UnicodeNumericType.ByReference()
    val hr = fn.invokeHR(arrayOf(IUnicodeCharactersStatics_Ptr, codepoint, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun GetGeneralCategory(codepoint: WinDef.UINT): UnicodeGeneralCategory {
    val fnPtr = IUnicodeCharactersStatics_VtblPtr!!.getPointer(22L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Data.Text.UnicodeGeneralCategory.ByReference()
    val hr = fn.invokeHR(arrayOf(IUnicodeCharactersStatics_Ptr, codepoint, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIUnicodeCharactersStatics(pointer.getPointer(0))

    public fun setValue(`value`: IUnicodeCharactersStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IUnicodeCharactersStatics_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IUnicodeCharactersStatics {
    public override val IUnicodeCharactersStatics_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("97909e8792914f91b6c8b6e359d7a7fb")

    public fun makeIUnicodeCharactersStatics(ptr: Pointer?): IUnicodeCharactersStatics =
        IUnicodeCharactersStatics_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IUnicodeCharactersStatics):
        Array<IUnicodeCharactersStatics> = (elements as
        Array<IUnicodeCharactersStatics>).castToImpl<IUnicodeCharactersStatics,IUnicodeCharactersStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUnicodeCharactersStatics?> =
        arrayOfNulls<IUnicodeCharactersStatics_Impl>(size) as Array<IUnicodeCharactersStatics?>
  }
}

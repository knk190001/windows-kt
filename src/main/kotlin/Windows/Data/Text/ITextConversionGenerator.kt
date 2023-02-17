package Windows.Data.Text

import Windows.Foundation.IAsyncOperation_IVectorView_String__
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
import com.sun.jna.ptr.ByteByReference
import java.lang.RuntimeException
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit

public interface ITextConversionGenerator : NativeMapped, IWinRTInterface {
  public val ITextConversionGenerator_Ptr: Pointer?

  public val ITextConversionGenerator_VtblPtr: Pointer?
    get() = ITextConversionGenerator_Ptr?.getPointer(0)

  public fun get_ResolvedLanguage(): String {
    val fnPtr = ITextConversionGenerator_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(ITextConversionGenerator_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public fun get_LanguageAvailableButNotInstalled(): Boolean {
    val fnPtr = ITextConversionGenerator_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = ByteByReference()
    val hr = fn.invokeHR(arrayOf(ITextConversionGenerator_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue != 0.toByte()
    return resultValue_Managed
  }

  public fun GetCandidatesAsync(input: String): IAsyncOperation_IVectorView_String__ {
    val fnPtr = ITextConversionGenerator_VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val input_Native = input.toHandle()
    val result = Windows.Foundation.IAsyncOperation_IVectorView_String__.ByReference()
    val hr = fn.invokeHR(arrayOf(ITextConversionGenerator_Ptr, input_Native, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun GetCandidatesAsync(input: String, maxCandidates: WinDef.UINT):
      IAsyncOperation_IVectorView_String__ {
    val fnPtr = ITextConversionGenerator_VtblPtr!!.getPointer(9L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val input_Native = input.toHandle()
    val result = Windows.Foundation.IAsyncOperation_IVectorView_String__.ByReference()
    val hr = fn.invokeHR(arrayOf(ITextConversionGenerator_Ptr, input_Native, maxCandidates, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeITextConversionGenerator(pointer.getPointer(0))

    public fun setValue(`value`: ITextConversionGenerator_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class ITextConversionGenerator_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), ITextConversionGenerator {
    public override val ITextConversionGenerator_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("03606a5e2aa94ab6af8ba562b63a8992")

    public fun makeITextConversionGenerator(ptr: Pointer?): ITextConversionGenerator =
        ITextConversionGenerator_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: ITextConversionGenerator): Array<ITextConversionGenerator>
        = (elements as
        Array<ITextConversionGenerator>).castToImpl<ITextConversionGenerator,ITextConversionGenerator_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITextConversionGenerator?> =
        arrayOfNulls<ITextConversionGenerator_Impl>(size) as Array<ITextConversionGenerator?>
  }
}

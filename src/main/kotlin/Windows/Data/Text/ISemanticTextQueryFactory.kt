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

public interface ISemanticTextQueryFactory : NativeMapped, IWinRTInterface {
  public val ISemanticTextQueryFactory_Ptr: Pointer?

  public val ISemanticTextQueryFactory_VtblPtr: Pointer?
    get() = ISemanticTextQueryFactory_Ptr?.getPointer(0)

  public fun Create(aqsFilter: String): SemanticTextQuery {
    val fnPtr = ISemanticTextQueryFactory_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val aqsFilter_Native = aqsFilter.toHandle()
    val result = Windows.Data.Text.SemanticTextQuery.ByReference()
    val hr = fn.invokeHR(arrayOf(ISemanticTextQueryFactory_Ptr, aqsFilter_Native, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun CreateWithLanguage(aqsFilter: String, filterLanguage: String): SemanticTextQuery {
    val fnPtr = ISemanticTextQueryFactory_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val aqsFilter_Native = aqsFilter.toHandle()
    val filterLanguage_Native = filterLanguage.toHandle()
    val result = Windows.Data.Text.SemanticTextQuery.ByReference()
    val hr = fn.invokeHR(arrayOf(ISemanticTextQueryFactory_Ptr, aqsFilter_Native,
        filterLanguage_Native, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeISemanticTextQueryFactory(pointer.getPointer(0))

    public fun setValue(`value`: ISemanticTextQueryFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class ISemanticTextQueryFactory_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), ISemanticTextQueryFactory {
    public override val ISemanticTextQueryFactory_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("238c0503f99545878777a2b7d80acfef")

    public fun makeISemanticTextQueryFactory(ptr: Pointer?): ISemanticTextQueryFactory =
        ISemanticTextQueryFactory_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: ISemanticTextQueryFactory):
        Array<ISemanticTextQueryFactory> = (elements as
        Array<ISemanticTextQueryFactory>).castToImpl<ISemanticTextQueryFactory,ISemanticTextQueryFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISemanticTextQueryFactory?> =
        arrayOfNulls<ISemanticTextQueryFactory_Impl>(size) as Array<ISemanticTextQueryFactory?>
  }
}

package Windows.Data.Text

import Windows.Foundation.Collections.IVectorView_TextSegment_
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

public interface ISemanticTextQuery : NativeMapped, IWinRTInterface {
  public val ISemanticTextQuery_Ptr: Pointer?

  public val ISemanticTextQuery_VtblPtr: Pointer?
    get() = ISemanticTextQuery_Ptr?.getPointer(0)

  public fun Find(content: String): IVectorView_TextSegment_ {
    val fnPtr = ISemanticTextQuery_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val content_Native = content.toHandle()
    val result = Windows.Foundation.Collections.IVectorView_TextSegment_.ByReference()
    val hr = fn.invokeHR(arrayOf(ISemanticTextQuery_Ptr, content_Native, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun FindInProperty(propertyContent: String, propertyName: String):
      IVectorView_TextSegment_ {
    val fnPtr = ISemanticTextQuery_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val propertyContent_Native = propertyContent.toHandle()
    val propertyName_Native = propertyName.toHandle()
    val result = Windows.Foundation.Collections.IVectorView_TextSegment_.ByReference()
    val hr = fn.invokeHR(arrayOf(ISemanticTextQuery_Ptr, propertyContent_Native,
        propertyName_Native, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeISemanticTextQuery(pointer.getPointer(0))

    public fun setValue(`value`: ISemanticTextQuery_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class ISemanticTextQuery_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), ISemanticTextQuery {
    public override val ISemanticTextQuery_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("6a1cab511fb2490980b835731a2b3e7f")

    public fun makeISemanticTextQuery(ptr: Pointer?): ISemanticTextQuery =
        ISemanticTextQuery_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: ISemanticTextQuery): Array<ISemanticTextQuery> = (elements
        as Array<ISemanticTextQuery>).castToImpl<ISemanticTextQuery,ISemanticTextQuery_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISemanticTextQuery?> =
        arrayOfNulls<ISemanticTextQuery_Impl>(size) as Array<ISemanticTextQuery?>
  }
}

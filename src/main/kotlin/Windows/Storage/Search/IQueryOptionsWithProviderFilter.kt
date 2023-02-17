package Windows.Storage.Search

import Windows.Foundation.Collections.IVector_String_
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
import kotlin.Unit

public interface IQueryOptionsWithProviderFilter : NativeMapped, IWinRTInterface {
  public val IQueryOptionsWithProviderFilter_Ptr: Pointer?

  public val IQueryOptionsWithProviderFilter_VtblPtr: Pointer?
    get() = IQueryOptionsWithProviderFilter_Ptr?.getPointer(0)

  public fun get_StorageProviderIdFilter(): IVector_String_ {
    val fnPtr = IQueryOptionsWithProviderFilter_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.Collections.IVector_String_.ByReference()
    val hr = fn.invokeHR(arrayOf(IQueryOptionsWithProviderFilter_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIQueryOptionsWithProviderFilter(pointer.getPointer(0))

    public fun setValue(`value`: IQueryOptionsWithProviderFilter_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IQueryOptionsWithProviderFilter_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IQueryOptionsWithProviderFilter {
    public override val IQueryOptionsWithProviderFilter_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("5b9d102615c444ddb89a47a59b7d7c4f")

    public fun makeIQueryOptionsWithProviderFilter(ptr: Pointer?): IQueryOptionsWithProviderFilter =
        IQueryOptionsWithProviderFilter_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IQueryOptionsWithProviderFilter):
        Array<IQueryOptionsWithProviderFilter> = (elements as
        Array<IQueryOptionsWithProviderFilter>).castToImpl<IQueryOptionsWithProviderFilter,IQueryOptionsWithProviderFilter_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IQueryOptionsWithProviderFilter?> =
        arrayOfNulls<IQueryOptionsWithProviderFilter_Impl>(size) as
        Array<IQueryOptionsWithProviderFilter?>
  }
}

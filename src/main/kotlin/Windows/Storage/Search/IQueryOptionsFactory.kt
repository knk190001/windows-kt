package Windows.Storage.Search

import Windows.Foundation.Collections.IIterable_String_
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

public interface IQueryOptionsFactory : NativeMapped, IWinRTInterface {
  public val IQueryOptionsFactory_Ptr: Pointer?

  public val IQueryOptionsFactory_VtblPtr: Pointer?
    get() = IQueryOptionsFactory_Ptr?.getPointer(0)

  public fun CreateCommonFileQuery(query: CommonFileQuery, fileTypeFilter: IIterable_String_):
      QueryOptions {
    val fnPtr = IQueryOptionsFactory_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Storage.Search.QueryOptions.ByReference()
    val hr = fn.invokeHR(arrayOf(IQueryOptionsFactory_Ptr, query, fileTypeFilter, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun CreateCommonFolderQuery(query: CommonFolderQuery): QueryOptions {
    val fnPtr = IQueryOptionsFactory_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Storage.Search.QueryOptions.ByReference()
    val hr = fn.invokeHR(arrayOf(IQueryOptionsFactory_Ptr, query, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIQueryOptionsFactory(pointer.getPointer(0))

    public fun setValue(`value`: IQueryOptionsFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IQueryOptionsFactory_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IQueryOptionsFactory {
    public override val IQueryOptionsFactory_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("032e1f8ca9c14e7180110dee9d4811a3")

    public fun makeIQueryOptionsFactory(ptr: Pointer?): IQueryOptionsFactory =
        IQueryOptionsFactory_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IQueryOptionsFactory): Array<IQueryOptionsFactory> =
        (elements as
        Array<IQueryOptionsFactory>).castToImpl<IQueryOptionsFactory,IQueryOptionsFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IQueryOptionsFactory?> =
        arrayOfNulls<IQueryOptionsFactory_Impl>(size) as Array<IQueryOptionsFactory?>
  }
}

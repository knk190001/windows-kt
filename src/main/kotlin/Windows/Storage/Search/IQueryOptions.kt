package Windows.Storage.Search

import Windows.Foundation.Collections.IIterable_String_
import Windows.Foundation.Collections.IVector_SortEntry_
import Windows.Foundation.Collections.IVector_String_
import Windows.Storage.FileProperties.PropertyPrefetchOptions
import Windows.Storage.FileProperties.ThumbnailMode
import Windows.Storage.FileProperties.ThumbnailOptions
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

public interface IQueryOptions : NativeMapped, IWinRTInterface {
  public val IQueryOptions_Ptr: Pointer?

  public val IQueryOptions_VtblPtr: Pointer?
    get() = IQueryOptions_Ptr?.getPointer(0)

  public fun get_FileTypeFilter(): IVector_String_ {
    val fnPtr = IQueryOptions_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.Collections.IVector_String_.ByReference()
    val hr = fn.invokeHR(arrayOf(IQueryOptions_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun get_FolderDepth(): FolderDepth {
    val fnPtr = IQueryOptions_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Storage.Search.FolderDepth.ByReference()
    val hr = fn.invokeHR(arrayOf(IQueryOptions_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun put_FolderDepth(`value`: FolderDepth): Unit {
    val fnPtr = IQueryOptions_VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(IQueryOptions_Ptr, value,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun get_ApplicationSearchFilter(): String {
    val fnPtr = IQueryOptions_VtblPtr!!.getPointer(9L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(IQueryOptions_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public fun put_ApplicationSearchFilter(`value`: String): Unit {
    val fnPtr = IQueryOptions_VtblPtr!!.getPointer(10L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val value_Native = value.toHandle()
    val hr = fn.invokeHR(arrayOf(IQueryOptions_Ptr, value_Native,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun get_UserSearchFilter(): String {
    val fnPtr = IQueryOptions_VtblPtr!!.getPointer(11L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(IQueryOptions_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public fun put_UserSearchFilter(`value`: String): Unit {
    val fnPtr = IQueryOptions_VtblPtr!!.getPointer(12L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val value_Native = value.toHandle()
    val hr = fn.invokeHR(arrayOf(IQueryOptions_Ptr, value_Native,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun get_Language(): String {
    val fnPtr = IQueryOptions_VtblPtr!!.getPointer(13L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(IQueryOptions_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public fun put_Language(`value`: String): Unit {
    val fnPtr = IQueryOptions_VtblPtr!!.getPointer(14L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val value_Native = value.toHandle()
    val hr = fn.invokeHR(arrayOf(IQueryOptions_Ptr, value_Native,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun get_IndexerOption(): IndexerOption {
    val fnPtr = IQueryOptions_VtblPtr!!.getPointer(15L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Storage.Search.IndexerOption.ByReference()
    val hr = fn.invokeHR(arrayOf(IQueryOptions_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun put_IndexerOption(`value`: IndexerOption): Unit {
    val fnPtr = IQueryOptions_VtblPtr!!.getPointer(16L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(IQueryOptions_Ptr, value,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun get_SortOrder(): IVector_SortEntry_ {
    val fnPtr = IQueryOptions_VtblPtr!!.getPointer(17L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.Collections.IVector_SortEntry_.ByReference()
    val hr = fn.invokeHR(arrayOf(IQueryOptions_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun get_GroupPropertyName(): String {
    val fnPtr = IQueryOptions_VtblPtr!!.getPointer(18L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(IQueryOptions_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public fun get_DateStackOption(): DateStackOption {
    val fnPtr = IQueryOptions_VtblPtr!!.getPointer(19L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Storage.Search.DateStackOption.ByReference()
    val hr = fn.invokeHR(arrayOf(IQueryOptions_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun SaveToString(): String {
    val fnPtr = IQueryOptions_VtblPtr!!.getPointer(20L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(IQueryOptions_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public fun LoadFromString(`value`: String): Unit {
    val fnPtr = IQueryOptions_VtblPtr!!.getPointer(21L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val value_Native = value.toHandle()
    val hr = fn.invokeHR(arrayOf(IQueryOptions_Ptr, value_Native,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun SetThumbnailPrefetch(
    mode: ThumbnailMode,
    requestedSize: WinDef.UINT,
    options: ThumbnailOptions,
  ): Unit {
    val fnPtr = IQueryOptions_VtblPtr!!.getPointer(22L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(IQueryOptions_Ptr, mode, requestedSize, options,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun SetPropertyPrefetch(options: PropertyPrefetchOptions,
      propertiesToRetrieve: IIterable_String_): Unit {
    val fnPtr = IQueryOptions_VtblPtr!!.getPointer(23L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(IQueryOptions_Ptr, options, propertiesToRetrieve,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIQueryOptions(pointer.getPointer(0))

    public fun setValue(`value`: IQueryOptions_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IQueryOptions_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IQueryOptions {
    public override val IQueryOptions_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("1e5e46ee0f454838a8e9d0479d446c30")

    public fun makeIQueryOptions(ptr: Pointer?): IQueryOptions = IQueryOptions_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IQueryOptions): Array<IQueryOptions> = (elements as
        Array<IQueryOptions>).castToImpl<IQueryOptions,IQueryOptions_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IQueryOptions?> =
        arrayOfNulls<IQueryOptions_Impl>(size) as Array<IQueryOptions?>
  }
}

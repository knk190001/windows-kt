package Windows.Storage.Search

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncOperation_UInt32_
import Windows.Foundation.TypedEventHandler_IStorageQueryResultBase_Object_
import Windows.Storage.StorageFolder
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
import com.sun.jna.platform.win32.COM.Unknown
import com.sun.jna.platform.win32.Guid
import java.lang.RuntimeException
import kotlin.Array
import kotlin.Int
import kotlin.Unit

public interface IStorageQueryResultBase : NativeMapped, IWinRTInterface {
  public val IStorageQueryResultBase_Ptr: Pointer?

  public val IStorageQueryResultBase_VtblPtr: Pointer?
    get() = IStorageQueryResultBase_Ptr?.getPointer(0)

  public fun GetItemCountAsync(): IAsyncOperation_UInt32_ {
    val fnPtr = IStorageQueryResultBase_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.IAsyncOperation_UInt32_.ByReference()
    val hr = fn.invokeHR(arrayOf(IStorageQueryResultBase_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun get_Folder(): StorageFolder {
    val fnPtr = IStorageQueryResultBase_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Storage.StorageFolder.ByReference()
    val hr = fn.invokeHR(arrayOf(IStorageQueryResultBase_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun add_ContentsChanged(handler: TypedEventHandler_IStorageQueryResultBase_Object_):
      EventRegistrationToken {
    val fnPtr = IStorageQueryResultBase_VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.EventRegistrationToken.ByReference()
    val hr = fn.invokeHR(arrayOf(IStorageQueryResultBase_Ptr, handler, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun remove_ContentsChanged(eventCookie: EventRegistrationToken.ByValue): Unit {
    val fnPtr = IStorageQueryResultBase_VtblPtr!!.getPointer(9L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(IStorageQueryResultBase_Ptr, eventCookie,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun add_OptionsChanged(changedHandler: TypedEventHandler_IStorageQueryResultBase_Object_):
      EventRegistrationToken {
    val fnPtr = IStorageQueryResultBase_VtblPtr!!.getPointer(10L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.EventRegistrationToken.ByReference()
    val hr = fn.invokeHR(arrayOf(IStorageQueryResultBase_Ptr, changedHandler, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun remove_OptionsChanged(eventCookie: EventRegistrationToken.ByValue): Unit {
    val fnPtr = IStorageQueryResultBase_VtblPtr!!.getPointer(11L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(IStorageQueryResultBase_Ptr, eventCookie,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun FindStartIndexAsync(`value`: Unknown): IAsyncOperation_UInt32_ {
    val fnPtr = IStorageQueryResultBase_VtblPtr!!.getPointer(12L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.IAsyncOperation_UInt32_.ByReference()
    val hr = fn.invokeHR(arrayOf(IStorageQueryResultBase_Ptr, value, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun GetCurrentQueryOptions(): QueryOptions {
    val fnPtr = IStorageQueryResultBase_VtblPtr!!.getPointer(13L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Storage.Search.QueryOptions.ByReference()
    val hr = fn.invokeHR(arrayOf(IStorageQueryResultBase_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun ApplyNewQueryOptions(newQueryOptions: QueryOptions): Unit {
    val fnPtr = IStorageQueryResultBase_VtblPtr!!.getPointer(14L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(IStorageQueryResultBase_Ptr, newQueryOptions,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIStorageQueryResultBase(pointer.getPointer(0))

    public fun setValue(`value`: IStorageQueryResultBase_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IStorageQueryResultBase_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IStorageQueryResultBase {
    public override val IStorageQueryResultBase_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("c297d70d735347abba588c61425dc54b")

    public fun makeIStorageQueryResultBase(ptr: Pointer?): IStorageQueryResultBase =
        IStorageQueryResultBase_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IStorageQueryResultBase): Array<IStorageQueryResultBase> =
        (elements as
        Array<IStorageQueryResultBase>).castToImpl<IStorageQueryResultBase,IStorageQueryResultBase_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStorageQueryResultBase?> =
        arrayOfNulls<IStorageQueryResultBase_Impl>(size) as Array<IStorageQueryResultBase?>
  }
}

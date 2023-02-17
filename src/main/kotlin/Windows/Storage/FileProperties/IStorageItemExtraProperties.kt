package Windows.Storage.FileProperties

import Windows.Foundation.Collections.IIterable_IKeyValuePair_String_Object__
import Windows.Foundation.Collections.IIterable_String_
import Windows.Foundation.IAsyncAction
import Windows.Foundation.IAsyncOperation_IMap_String_Object__
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

public interface IStorageItemExtraProperties : NativeMapped, IWinRTInterface {
  public val IStorageItemExtraProperties_Ptr: Pointer?

  public val IStorageItemExtraProperties_VtblPtr: Pointer?
    get() = IStorageItemExtraProperties_Ptr?.getPointer(0)

  public fun RetrievePropertiesAsync(propertiesToRetrieve: IIterable_String_):
      IAsyncOperation_IMap_String_Object__ {
    val fnPtr = IStorageItemExtraProperties_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.IAsyncOperation_IMap_String_Object__.ByReference()
    val hr = fn.invokeHR(arrayOf(IStorageItemExtraProperties_Ptr, propertiesToRetrieve, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun SavePropertiesAsync(propertiesToSave: IIterable_IKeyValuePair_String_Object__):
      IAsyncAction {
    val fnPtr = IStorageItemExtraProperties_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.IAsyncAction.ByReference()
    val hr = fn.invokeHR(arrayOf(IStorageItemExtraProperties_Ptr, propertiesToSave, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun SavePropertiesAsync(): IAsyncAction {
    val fnPtr = IStorageItemExtraProperties_VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.IAsyncAction.ByReference()
    val hr = fn.invokeHR(arrayOf(IStorageItemExtraProperties_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIStorageItemExtraProperties(pointer.getPointer(0))

    public fun setValue(`value`: IStorageItemExtraProperties_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IStorageItemExtraProperties_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IStorageItemExtraProperties {
    public override val IStorageItemExtraProperties_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("c54361b254cd432bbdbc4b19c4b470d7")

    public fun makeIStorageItemExtraProperties(ptr: Pointer?): IStorageItemExtraProperties =
        IStorageItemExtraProperties_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IStorageItemExtraProperties):
        Array<IStorageItemExtraProperties> = (elements as
        Array<IStorageItemExtraProperties>).castToImpl<IStorageItemExtraProperties,IStorageItemExtraProperties_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStorageItemExtraProperties?> =
        arrayOfNulls<IStorageItemExtraProperties_Impl>(size) as Array<IStorageItemExtraProperties?>
  }
}

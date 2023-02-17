package Windows.Storage

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

public interface IStorageItemPropertiesWithProvider : NativeMapped, IWinRTInterface {
  public val IStorageItemPropertiesWithProvider_Ptr: Pointer?

  public val IStorageItemPropertiesWithProvider_VtblPtr: Pointer?
    get() = IStorageItemPropertiesWithProvider_Ptr?.getPointer(0)

  public fun get_Provider(): StorageProvider {
    val fnPtr = IStorageItemPropertiesWithProvider_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Storage.StorageProvider.ByReference()
    val hr = fn.invokeHR(arrayOf(IStorageItemPropertiesWithProvider_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIStorageItemPropertiesWithProvider(pointer.getPointer(0))

    public fun setValue(`value`: IStorageItemPropertiesWithProvider_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IStorageItemPropertiesWithProvider_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IStorageItemPropertiesWithProvider {
    public override val IStorageItemPropertiesWithProvider_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("861bf39b63684deeb40e74684a5ce714")

    public fun makeIStorageItemPropertiesWithProvider(ptr: Pointer?):
        IStorageItemPropertiesWithProvider = IStorageItemPropertiesWithProvider_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IStorageItemPropertiesWithProvider):
        Array<IStorageItemPropertiesWithProvider> = (elements as
        Array<IStorageItemPropertiesWithProvider>).castToImpl<IStorageItemPropertiesWithProvider,IStorageItemPropertiesWithProvider_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStorageItemPropertiesWithProvider?> =
        arrayOfNulls<IStorageItemPropertiesWithProvider_Impl>(size) as
        Array<IStorageItemPropertiesWithProvider?>
  }
}

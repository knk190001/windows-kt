package Windows.Storage

import Windows.Foundation.IAsyncOperation_Boolean_
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

public interface IStorageProvider2 : NativeMapped, IWinRTInterface {
  public val IStorageProvider2_Ptr: Pointer?

  public val IStorageProvider2_VtblPtr: Pointer?
    get() = IStorageProvider2_Ptr?.getPointer(0)

  public fun IsPropertySupportedForPartialFileAsync(propertyCanonicalName: String):
      IAsyncOperation_Boolean_ {
    val fnPtr = IStorageProvider2_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val propertyCanonicalName_Native = propertyCanonicalName.toHandle()
    val result = Windows.Foundation.IAsyncOperation_Boolean_.ByReference()
    val hr = fn.invokeHR(arrayOf(IStorageProvider2_Ptr, propertyCanonicalName_Native, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIStorageProvider2(pointer.getPointer(0))

    public fun setValue(`value`: IStorageProvider2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IStorageProvider2_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IStorageProvider2 {
    public override val IStorageProvider2_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("010d19173404414b9fd7cd44472eaa39")

    public fun makeIStorageProvider2(ptr: Pointer?): IStorageProvider2 = IStorageProvider2_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IStorageProvider2): Array<IStorageProvider2> = (elements
        as Array<IStorageProvider2>).castToImpl<IStorageProvider2,IStorageProvider2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStorageProvider2?> =
        arrayOfNulls<IStorageProvider2_Impl>(size) as Array<IStorageProvider2?>
  }
}

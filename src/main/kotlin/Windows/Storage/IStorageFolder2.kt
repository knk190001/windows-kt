package Windows.Storage

import Windows.Foundation.IAsyncOperation_IStorageItem_
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

public interface IStorageFolder2 : NativeMapped, IWinRTInterface {
  public val IStorageFolder2_Ptr: Pointer?

  public val IStorageFolder2_VtblPtr: Pointer?
    get() = IStorageFolder2_Ptr?.getPointer(0)

  public fun TryGetItemAsync(name: String): IAsyncOperation_IStorageItem_ {
    val fnPtr = IStorageFolder2_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val name_Native = name.toHandle()
    val result = Windows.Foundation.IAsyncOperation_IStorageItem_.ByReference()
    val hr = fn.invokeHR(arrayOf(IStorageFolder2_Ptr, name_Native, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIStorageFolder2(pointer.getPointer(0))

    public fun setValue(`value`: IStorageFolder2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IStorageFolder2_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IStorageFolder2 {
    public override val IStorageFolder2_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("e827e8b908d94a8ea0acfe5ed3cbbbd3")

    public fun makeIStorageFolder2(ptr: Pointer?): IStorageFolder2 = IStorageFolder2_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IStorageFolder2): Array<IStorageFolder2> = (elements as
        Array<IStorageFolder2>).castToImpl<IStorageFolder2,IStorageFolder2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStorageFolder2?> =
        arrayOfNulls<IStorageFolder2_Impl>(size) as Array<IStorageFolder2?>
  }
}

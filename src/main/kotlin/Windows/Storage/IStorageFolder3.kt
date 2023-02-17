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

public interface IStorageFolder3 : NativeMapped, IWinRTInterface {
  public val IStorageFolder3_Ptr: Pointer?

  public val IStorageFolder3_VtblPtr: Pointer?
    get() = IStorageFolder3_Ptr?.getPointer(0)

  public fun TryGetChangeTracker(): StorageLibraryChangeTracker {
    val fnPtr = IStorageFolder3_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Storage.StorageLibraryChangeTracker.ByReference()
    val hr = fn.invokeHR(arrayOf(IStorageFolder3_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIStorageFolder3(pointer.getPointer(0))

    public fun setValue(`value`: IStorageFolder3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IStorageFolder3_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IStorageFolder3 {
    public override val IStorageFolder3_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("9f617899bde14124aeb3b06ad96f98d4")

    public fun makeIStorageFolder3(ptr: Pointer?): IStorageFolder3 = IStorageFolder3_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IStorageFolder3): Array<IStorageFolder3> = (elements as
        Array<IStorageFolder3>).castToImpl<IStorageFolder3,IStorageFolder3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStorageFolder3?> =
        arrayOfNulls<IStorageFolder3_Impl>(size) as Array<IStorageFolder3?>
  }
}

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

public interface IStorageLibraryChangeTracker : NativeMapped, IWinRTInterface {
  public val IStorageLibraryChangeTracker_Ptr: Pointer?

  public val IStorageLibraryChangeTracker_VtblPtr: Pointer?
    get() = IStorageLibraryChangeTracker_Ptr?.getPointer(0)

  public fun GetChangeReader(): StorageLibraryChangeReader {
    val fnPtr = IStorageLibraryChangeTracker_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Storage.StorageLibraryChangeReader.ByReference()
    val hr = fn.invokeHR(arrayOf(IStorageLibraryChangeTracker_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun Enable(): Unit {
    val fnPtr = IStorageLibraryChangeTracker_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(IStorageLibraryChangeTracker_Ptr, ))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun Reset(): Unit {
    val fnPtr = IStorageLibraryChangeTracker_VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(IStorageLibraryChangeTracker_Ptr, ))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIStorageLibraryChangeTracker(pointer.getPointer(0))

    public fun setValue(`value`: IStorageLibraryChangeTracker_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IStorageLibraryChangeTracker_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IStorageLibraryChangeTracker {
    public override val IStorageLibraryChangeTracker_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("9e157316607344f696817492d1286c90")

    public fun makeIStorageLibraryChangeTracker(ptr: Pointer?): IStorageLibraryChangeTracker =
        IStorageLibraryChangeTracker_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IStorageLibraryChangeTracker):
        Array<IStorageLibraryChangeTracker> = (elements as
        Array<IStorageLibraryChangeTracker>).castToImpl<IStorageLibraryChangeTracker,IStorageLibraryChangeTracker_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStorageLibraryChangeTracker?> =
        arrayOfNulls<IStorageLibraryChangeTracker_Impl>(size) as
        Array<IStorageLibraryChangeTracker?>
  }
}

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

public interface IStorageLibraryChangeTracker2 : NativeMapped, IWinRTInterface {
  public val IStorageLibraryChangeTracker2_Ptr: Pointer?

  public val IStorageLibraryChangeTracker2_VtblPtr: Pointer?
    get() = IStorageLibraryChangeTracker2_Ptr?.getPointer(0)

  public fun Enable(options: StorageLibraryChangeTrackerOptions): Unit {
    val fnPtr = IStorageLibraryChangeTracker2_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(IStorageLibraryChangeTracker2_Ptr, options,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun Disable(): Unit {
    val fnPtr = IStorageLibraryChangeTracker2_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(IStorageLibraryChangeTracker2_Ptr, ))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIStorageLibraryChangeTracker2(pointer.getPointer(0))

    public fun setValue(`value`: IStorageLibraryChangeTracker2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IStorageLibraryChangeTracker2_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IStorageLibraryChangeTracker2 {
    public override val IStorageLibraryChangeTracker2_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("cd051c3b0f9f42f98fb3158d82e13821")

    public fun makeIStorageLibraryChangeTracker2(ptr: Pointer?): IStorageLibraryChangeTracker2 =
        IStorageLibraryChangeTracker2_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IStorageLibraryChangeTracker2):
        Array<IStorageLibraryChangeTracker2> = (elements as
        Array<IStorageLibraryChangeTracker2>).castToImpl<IStorageLibraryChangeTracker2,IStorageLibraryChangeTracker2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStorageLibraryChangeTracker2?> =
        arrayOfNulls<IStorageLibraryChangeTracker2_Impl>(size) as
        Array<IStorageLibraryChangeTracker2?>
  }
}

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
import com.sun.jna.ptr.ByteByReference
import java.lang.RuntimeException
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit

public interface IStorageLibraryChangeTrackerOptions : NativeMapped, IWinRTInterface {
  public val IStorageLibraryChangeTrackerOptions_Ptr: Pointer?

  public val IStorageLibraryChangeTrackerOptions_VtblPtr: Pointer?
    get() = IStorageLibraryChangeTrackerOptions_Ptr?.getPointer(0)

  public fun get_TrackChangeDetails(): Boolean {
    val fnPtr = IStorageLibraryChangeTrackerOptions_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = ByteByReference()
    val hr = fn.invokeHR(arrayOf(IStorageLibraryChangeTrackerOptions_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue != 0.toByte()
    return resultValue_Managed
  }

  public fun put_TrackChangeDetails(`value`: Boolean): Unit {
    val fnPtr = IStorageLibraryChangeTrackerOptions_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val value_Native: Byte = if(value) 1 else 0 
    val hr = fn.invokeHR(arrayOf(IStorageLibraryChangeTrackerOptions_Ptr, value_Native,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIStorageLibraryChangeTrackerOptions(pointer.getPointer(0))

    public fun setValue(`value`: IStorageLibraryChangeTrackerOptions_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IStorageLibraryChangeTrackerOptions_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IStorageLibraryChangeTrackerOptions {
    public override val IStorageLibraryChangeTrackerOptions_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("bb52bcd41a6d59c0ad2a823a20532483")

    public fun makeIStorageLibraryChangeTrackerOptions(ptr: Pointer?):
        IStorageLibraryChangeTrackerOptions = IStorageLibraryChangeTrackerOptions_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IStorageLibraryChangeTrackerOptions):
        Array<IStorageLibraryChangeTrackerOptions> = (elements as
        Array<IStorageLibraryChangeTrackerOptions>).castToImpl<IStorageLibraryChangeTrackerOptions,IStorageLibraryChangeTrackerOptions_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStorageLibraryChangeTrackerOptions?> =
        arrayOfNulls<IStorageLibraryChangeTrackerOptions_Impl>(size) as
        Array<IStorageLibraryChangeTrackerOptions?>
  }
}

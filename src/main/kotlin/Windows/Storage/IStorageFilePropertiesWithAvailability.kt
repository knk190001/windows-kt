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

public interface IStorageFilePropertiesWithAvailability : NativeMapped, IWinRTInterface {
  public val IStorageFilePropertiesWithAvailability_Ptr: Pointer?

  public val IStorageFilePropertiesWithAvailability_VtblPtr: Pointer?
    get() = IStorageFilePropertiesWithAvailability_Ptr?.getPointer(0)

  public fun get_IsAvailable(): Boolean {
    val fnPtr = IStorageFilePropertiesWithAvailability_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = ByteByReference()
    val hr = fn.invokeHR(arrayOf(IStorageFilePropertiesWithAvailability_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue != 0.toByte()
    return resultValue_Managed
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIStorageFilePropertiesWithAvailability(pointer.getPointer(0))

    public fun setValue(`value`: IStorageFilePropertiesWithAvailability_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IStorageFilePropertiesWithAvailability_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IStorageFilePropertiesWithAvailability {
    public override val IStorageFilePropertiesWithAvailability_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("afcbbe9b582b41339648e44ca46ee491")

    public fun makeIStorageFilePropertiesWithAvailability(ptr: Pointer?):
        IStorageFilePropertiesWithAvailability = IStorageFilePropertiesWithAvailability_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IStorageFilePropertiesWithAvailability):
        Array<IStorageFilePropertiesWithAvailability> = (elements as
        Array<IStorageFilePropertiesWithAvailability>).castToImpl<IStorageFilePropertiesWithAvailability,IStorageFilePropertiesWithAvailability_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStorageFilePropertiesWithAvailability?> =
        arrayOfNulls<IStorageFilePropertiesWithAvailability_Impl>(size) as
        Array<IStorageFilePropertiesWithAvailability?>
  }
}

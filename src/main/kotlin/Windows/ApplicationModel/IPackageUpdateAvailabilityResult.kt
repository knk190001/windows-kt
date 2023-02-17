package Windows.ApplicationModel

import Windows.Foundation.HResult
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

public interface IPackageUpdateAvailabilityResult : NativeMapped, IWinRTInterface {
  public val IPackageUpdateAvailabilityResult_Ptr: Pointer?

  public val IPackageUpdateAvailabilityResult_VtblPtr: Pointer?
    get() = IPackageUpdateAvailabilityResult_Ptr?.getPointer(0)

  public fun get_Availability(): PackageUpdateAvailability {
    val fnPtr = IPackageUpdateAvailabilityResult_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.ApplicationModel.PackageUpdateAvailability.ByReference()
    val hr = fn.invokeHR(arrayOf(IPackageUpdateAvailabilityResult_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun get_ExtendedError(): HResult {
    val fnPtr = IPackageUpdateAvailabilityResult_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.HResult.ByReference()
    val hr = fn.invokeHR(arrayOf(IPackageUpdateAvailabilityResult_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIPackageUpdateAvailabilityResult(pointer.getPointer(0))

    public fun setValue(`value`: IPackageUpdateAvailabilityResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IPackageUpdateAvailabilityResult_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IPackageUpdateAvailabilityResult {
    public override val IPackageUpdateAvailabilityResult_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("114e5009199a48a1a079313c45634a71")

    public fun makeIPackageUpdateAvailabilityResult(ptr: Pointer?): IPackageUpdateAvailabilityResult
        = IPackageUpdateAvailabilityResult_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IPackageUpdateAvailabilityResult):
        Array<IPackageUpdateAvailabilityResult> = (elements as
        Array<IPackageUpdateAvailabilityResult>).castToImpl<IPackageUpdateAvailabilityResult,IPackageUpdateAvailabilityResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPackageUpdateAvailabilityResult?> =
        arrayOfNulls<IPackageUpdateAvailabilityResult_Impl>(size) as
        Array<IPackageUpdateAvailabilityResult?>
  }
}

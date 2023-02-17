package Windows.ApplicationModel

import Windows.Foundation.IAsyncOperation_PackageUpdateAvailabilityResult_
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

public interface IPackage6 : NativeMapped, IWinRTInterface {
  public val IPackage6_Ptr: Pointer?

  public val IPackage6_VtblPtr: Pointer?
    get() = IPackage6_Ptr?.getPointer(0)

  public fun GetAppInstallerInfo(): AppInstallerInfo {
    val fnPtr = IPackage6_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.ApplicationModel.AppInstallerInfo.ByReference()
    val hr = fn.invokeHR(arrayOf(IPackage6_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun CheckUpdateAvailabilityAsync(): IAsyncOperation_PackageUpdateAvailabilityResult_ {
    val fnPtr = IPackage6_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.IAsyncOperation_PackageUpdateAvailabilityResult_.ByReference()
    val hr = fn.invokeHR(arrayOf(IPackage6_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIPackage6(pointer.getPointer(0))

    public fun setValue(`value`: IPackage6_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IPackage6_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IPackage6 {
    public override val IPackage6_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("8b1ad94212d74754ae4e638cbc0e3a2e")

    public fun makeIPackage6(ptr: Pointer?): IPackage6 = IPackage6_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IPackage6): Array<IPackage6> = (elements as
        Array<IPackage6>).castToImpl<IPackage6,IPackage6_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPackage6?> = arrayOfNulls<IPackage6_Impl>(size)
        as Array<IPackage6?>
  }
}

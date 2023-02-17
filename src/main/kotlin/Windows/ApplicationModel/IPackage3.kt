package Windows.ApplicationModel

import Windows.Foundation.DateTime
import Windows.Foundation.IAsyncOperation_IVectorView_AppListEntry__
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

public interface IPackage3 : NativeMapped, IWinRTInterface {
  public val IPackage3_Ptr: Pointer?

  public val IPackage3_VtblPtr: Pointer?
    get() = IPackage3_Ptr?.getPointer(0)

  public fun get_Status(): PackageStatus {
    val fnPtr = IPackage3_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.ApplicationModel.PackageStatus.ByReference()
    val hr = fn.invokeHR(arrayOf(IPackage3_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun get_InstalledDate(): DateTime {
    val fnPtr = IPackage3_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.DateTime.ByReference()
    val hr = fn.invokeHR(arrayOf(IPackage3_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun GetAppListEntriesAsync(): IAsyncOperation_IVectorView_AppListEntry__ {
    val fnPtr = IPackage3_VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.IAsyncOperation_IVectorView_AppListEntry__.ByReference()
    val hr = fn.invokeHR(arrayOf(IPackage3_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIPackage3(pointer.getPointer(0))

    public fun setValue(`value`: IPackage3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IPackage3_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IPackage3 {
    public override val IPackage3_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("5f738b61f86a491793d1f1ee9d3b35d9")

    public fun makeIPackage3(ptr: Pointer?): IPackage3 = IPackage3_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IPackage3): Array<IPackage3> = (elements as
        Array<IPackage3>).castToImpl<IPackage3,IPackage3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPackage3?> = arrayOfNulls<IPackage3_Impl>(size)
        as Array<IPackage3?>
  }
}

package Windows.ApplicationModel

import Windows.Foundation.DateTime
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
import com.sun.jna.platform.win32.WinNT
import java.lang.RuntimeException
import kotlin.Array
import kotlin.Int
import kotlin.String
import kotlin.Unit

public interface IPackageWithMetadata : NativeMapped, IWinRTInterface {
  public val IPackageWithMetadata_Ptr: Pointer?

  public val IPackageWithMetadata_VtblPtr: Pointer?
    get() = IPackageWithMetadata_Ptr?.getPointer(0)

  public fun get_InstallDate(): DateTime {
    val fnPtr = IPackageWithMetadata_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.DateTime.ByReference()
    val hr = fn.invokeHR(arrayOf(IPackageWithMetadata_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun GetThumbnailToken(): String {
    val fnPtr = IPackageWithMetadata_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(IPackageWithMetadata_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public fun Launch(parameters: String): Unit {
    val fnPtr = IPackageWithMetadata_VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val parameters_Native = parameters.toHandle()
    val hr = fn.invokeHR(arrayOf(IPackageWithMetadata_Ptr, parameters_Native,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIPackageWithMetadata(pointer.getPointer(0))

    public fun setValue(`value`: IPackageWithMetadata_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IPackageWithMetadata_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IPackageWithMetadata {
    public override val IPackageWithMetadata_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("959497801de940f2b4520de9f1910012")

    public fun makeIPackageWithMetadata(ptr: Pointer?): IPackageWithMetadata =
        IPackageWithMetadata_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IPackageWithMetadata): Array<IPackageWithMetadata> =
        (elements as
        Array<IPackageWithMetadata>).castToImpl<IPackageWithMetadata,IPackageWithMetadata_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPackageWithMetadata?> =
        arrayOfNulls<IPackageWithMetadata_Impl>(size) as Array<IPackageWithMetadata?>
  }
}

package Windows.ApplicationModel

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

public interface IPackageIdWithMetadata : NativeMapped, IWinRTInterface {
  public val IPackageIdWithMetadata_Ptr: Pointer?

  public val IPackageIdWithMetadata_VtblPtr: Pointer?
    get() = IPackageIdWithMetadata_Ptr?.getPointer(0)

  public fun get_ProductId(): String {
    val fnPtr = IPackageIdWithMetadata_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(IPackageIdWithMetadata_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public fun get_Author(): String {
    val fnPtr = IPackageIdWithMetadata_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(IPackageIdWithMetadata_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIPackageIdWithMetadata(pointer.getPointer(0))

    public fun setValue(`value`: IPackageIdWithMetadata_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IPackageIdWithMetadata_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IPackageIdWithMetadata {
    public override val IPackageIdWithMetadata_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("40577a7c0c9e443d9074855f5ce0a08d")

    public fun makeIPackageIdWithMetadata(ptr: Pointer?): IPackageIdWithMetadata =
        IPackageIdWithMetadata_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IPackageIdWithMetadata): Array<IPackageIdWithMetadata> =
        (elements as
        Array<IPackageIdWithMetadata>).castToImpl<IPackageIdWithMetadata,IPackageIdWithMetadata_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPackageIdWithMetadata?> =
        arrayOfNulls<IPackageIdWithMetadata_Impl>(size) as Array<IPackageIdWithMetadata?>
  }
}
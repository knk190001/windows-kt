package Windows.ApplicationModel

import Windows.Foundation.Collections.IVectorView_Package_
import Windows.Storage.StorageFolder
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

public interface IPackage : NativeMapped, IWinRTInterface {
  public val IPackage_Ptr: Pointer?

  public val IPackage_VtblPtr: Pointer?
    get() = IPackage_Ptr?.getPointer(0)

  public fun get_Id(): PackageId {
    val fnPtr = IPackage_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.ApplicationModel.PackageId.ByReference()
    val hr = fn.invokeHR(arrayOf(IPackage_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun get_InstalledLocation(): StorageFolder {
    val fnPtr = IPackage_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Storage.StorageFolder.ByReference()
    val hr = fn.invokeHR(arrayOf(IPackage_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun get_IsFramework(): Boolean {
    val fnPtr = IPackage_VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = ByteByReference()
    val hr = fn.invokeHR(arrayOf(IPackage_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue != 0.toByte()
    return resultValue_Managed
  }

  public fun get_Dependencies(): IVectorView_Package_ {
    val fnPtr = IPackage_VtblPtr!!.getPointer(9L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.Collections.IVectorView_Package_.ByReference()
    val hr = fn.invokeHR(arrayOf(IPackage_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIPackage(pointer.getPointer(0))

    public fun setValue(`value`: IPackage_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IPackage_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IPackage {
    public override val IPackage_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("163c792fbd75413cbf23b1fe7b95d825")

    public fun makeIPackage(ptr: Pointer?): IPackage = IPackage_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IPackage): Array<IPackage> = (elements as
        Array<IPackage>).castToImpl<IPackage,IPackage_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPackage?> = arrayOfNulls<IPackage_Impl>(size) as
        Array<IPackage?>
  }
}

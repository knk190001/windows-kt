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
import com.sun.jna.ptr.ByteByReference
import java.lang.RuntimeException
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit

public interface IPackageContentGroup : NativeMapped, IWinRTInterface {
  public val IPackageContentGroup_Ptr: Pointer?

  public val IPackageContentGroup_VtblPtr: Pointer?
    get() = IPackageContentGroup_Ptr?.getPointer(0)

  public fun get_Package(): Package {
    val fnPtr = IPackageContentGroup_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.ApplicationModel.Package.ByReference()
    val hr = fn.invokeHR(arrayOf(IPackageContentGroup_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun get_Name(): String {
    val fnPtr = IPackageContentGroup_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(IPackageContentGroup_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public fun get_State(): PackageContentGroupState {
    val fnPtr = IPackageContentGroup_VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.ApplicationModel.PackageContentGroupState.ByReference()
    val hr = fn.invokeHR(arrayOf(IPackageContentGroup_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun get_IsRequired(): Boolean {
    val fnPtr = IPackageContentGroup_VtblPtr!!.getPointer(9L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = ByteByReference()
    val hr = fn.invokeHR(arrayOf(IPackageContentGroup_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue != 0.toByte()
    return resultValue_Managed
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIPackageContentGroup(pointer.getPointer(0))

    public fun setValue(`value`: IPackageContentGroup_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IPackageContentGroup_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IPackageContentGroup {
    public override val IPackageContentGroup_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("8f62695d120a4798b5e15800dda8f2e1")

    public fun makeIPackageContentGroup(ptr: Pointer?): IPackageContentGroup =
        IPackageContentGroup_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IPackageContentGroup): Array<IPackageContentGroup> =
        (elements as
        Array<IPackageContentGroup>).castToImpl<IPackageContentGroup,IPackageContentGroup_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPackageContentGroup?> =
        arrayOfNulls<IPackageContentGroup_Impl>(size) as Array<IPackageContentGroup?>
  }
}

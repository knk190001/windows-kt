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

public interface IPackageContentGroupStatics : NativeMapped, IWinRTInterface {
  public val IPackageContentGroupStatics_Ptr: Pointer?

  public val IPackageContentGroupStatics_VtblPtr: Pointer?
    get() = IPackageContentGroupStatics_Ptr?.getPointer(0)

  public fun get_RequiredGroupName(): String {
    val fnPtr = IPackageContentGroupStatics_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(IPackageContentGroupStatics_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIPackageContentGroupStatics(pointer.getPointer(0))

    public fun setValue(`value`: IPackageContentGroupStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IPackageContentGroupStatics_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IPackageContentGroupStatics {
    public override val IPackageContentGroupStatics_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("70ee76195f124b92b9ea6ccada13bc75")

    public fun makeIPackageContentGroupStatics(ptr: Pointer?): IPackageContentGroupStatics =
        IPackageContentGroupStatics_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IPackageContentGroupStatics):
        Array<IPackageContentGroupStatics> = (elements as
        Array<IPackageContentGroupStatics>).castToImpl<IPackageContentGroupStatics,IPackageContentGroupStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPackageContentGroupStatics?> =
        arrayOfNulls<IPackageContentGroupStatics_Impl>(size) as Array<IPackageContentGroupStatics?>
  }
}

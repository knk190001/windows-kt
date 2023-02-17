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
import java.lang.RuntimeException
import kotlin.Array
import kotlin.Int
import kotlin.Unit

public interface IPackageStatics : NativeMapped, IWinRTInterface {
  public val IPackageStatics_Ptr: Pointer?

  public val IPackageStatics_VtblPtr: Pointer?
    get() = IPackageStatics_Ptr?.getPointer(0)

  public fun get_Current(): Package {
    val fnPtr = IPackageStatics_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.ApplicationModel.Package.ByReference()
    val hr = fn.invokeHR(arrayOf(IPackageStatics_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIPackageStatics(pointer.getPointer(0))

    public fun setValue(`value`: IPackageStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IPackageStatics_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IPackageStatics {
    public override val IPackageStatics_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("4e534bdf2960487897a49624deb72f2d")

    public fun makeIPackageStatics(ptr: Pointer?): IPackageStatics = IPackageStatics_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IPackageStatics): Array<IPackageStatics> = (elements as
        Array<IPackageStatics>).castToImpl<IPackageStatics,IPackageStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPackageStatics?> =
        arrayOfNulls<IPackageStatics_Impl>(size) as Array<IPackageStatics?>
  }
}

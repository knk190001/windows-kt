package Windows.ApplicationModel

import Windows.Foundation.Uri
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

public interface IAppInstallerInfo : NativeMapped, IWinRTInterface {
  public val IAppInstallerInfo_Ptr: Pointer?

  public val IAppInstallerInfo_VtblPtr: Pointer?
    get() = IAppInstallerInfo_Ptr?.getPointer(0)

  public fun get_Uri(): Uri {
    val fnPtr = IAppInstallerInfo_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.Uri.ByReference()
    val hr = fn.invokeHR(arrayOf(IAppInstallerInfo_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIAppInstallerInfo(pointer.getPointer(0))

    public fun setValue(`value`: IAppInstallerInfo_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IAppInstallerInfo_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IAppInstallerInfo {
    public override val IAppInstallerInfo_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("29ab2ac0d4f642a3adcdd6583c659508")

    public fun makeIAppInstallerInfo(ptr: Pointer?): IAppInstallerInfo = IAppInstallerInfo_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IAppInstallerInfo): Array<IAppInstallerInfo> = (elements
        as Array<IAppInstallerInfo>).castToImpl<IAppInstallerInfo,IAppInstallerInfo_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppInstallerInfo?> =
        arrayOfNulls<IAppInstallerInfo_Impl>(size) as Array<IAppInstallerInfo?>
  }
}

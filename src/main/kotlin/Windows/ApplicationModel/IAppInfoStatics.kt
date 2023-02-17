package Windows.ApplicationModel

import Windows.System.User
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
import kotlin.String
import kotlin.Unit

public interface IAppInfoStatics : NativeMapped, IWinRTInterface {
  public val IAppInfoStatics_Ptr: Pointer?

  public val IAppInfoStatics_VtblPtr: Pointer?
    get() = IAppInfoStatics_Ptr?.getPointer(0)

  public fun get_Current(): AppInfo {
    val fnPtr = IAppInfoStatics_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.ApplicationModel.AppInfo.ByReference()
    val hr = fn.invokeHR(arrayOf(IAppInfoStatics_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun GetFromAppUserModelId(appUserModelId: String): AppInfo {
    val fnPtr = IAppInfoStatics_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val appUserModelId_Native = appUserModelId.toHandle()
    val result = Windows.ApplicationModel.AppInfo.ByReference()
    val hr = fn.invokeHR(arrayOf(IAppInfoStatics_Ptr, appUserModelId_Native, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun GetFromAppUserModelIdForUser(user: User, appUserModelId: String): AppInfo {
    val fnPtr = IAppInfoStatics_VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val appUserModelId_Native = appUserModelId.toHandle()
    val result = Windows.ApplicationModel.AppInfo.ByReference()
    val hr = fn.invokeHR(arrayOf(IAppInfoStatics_Ptr, user, appUserModelId_Native, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIAppInfoStatics(pointer.getPointer(0))

    public fun setValue(`value`: IAppInfoStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IAppInfoStatics_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IAppInfoStatics {
    public override val IAppInfoStatics_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("cf1f782ae48b4f0c9b0b79c3f8957dd7")

    public fun makeIAppInfoStatics(ptr: Pointer?): IAppInfoStatics = IAppInfoStatics_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IAppInfoStatics): Array<IAppInfoStatics> = (elements as
        Array<IAppInfoStatics>).castToImpl<IAppInfoStatics,IAppInfoStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppInfoStatics?> =
        arrayOfNulls<IAppInfoStatics_Impl>(size) as Array<IAppInfoStatics?>
  }
}

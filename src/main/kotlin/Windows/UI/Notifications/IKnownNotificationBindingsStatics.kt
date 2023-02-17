package Windows.UI.Notifications

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

public interface IKnownNotificationBindingsStatics : NativeMapped, IWinRTInterface {
  public val IKnownNotificationBindingsStatics_Ptr: Pointer?

  public val IKnownNotificationBindingsStatics_VtblPtr: Pointer?
    get() = IKnownNotificationBindingsStatics_Ptr?.getPointer(0)

  public fun get_ToastGeneric(): String {
    val fnPtr = IKnownNotificationBindingsStatics_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(IKnownNotificationBindingsStatics_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIKnownNotificationBindingsStatics(pointer.getPointer(0))

    public fun setValue(`value`: IKnownNotificationBindingsStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IKnownNotificationBindingsStatics_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IKnownNotificationBindingsStatics {
    public override val IKnownNotificationBindingsStatics_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("79427baea8b74d5889ea76a7b7bccded")

    public fun makeIKnownNotificationBindingsStatics(ptr: Pointer?):
        IKnownNotificationBindingsStatics = IKnownNotificationBindingsStatics_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IKnownNotificationBindingsStatics):
        Array<IKnownNotificationBindingsStatics> = (elements as
        Array<IKnownNotificationBindingsStatics>).castToImpl<IKnownNotificationBindingsStatics,IKnownNotificationBindingsStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IKnownNotificationBindingsStatics?> =
        arrayOfNulls<IKnownNotificationBindingsStatics_Impl>(size) as
        Array<IKnownNotificationBindingsStatics?>
  }
}

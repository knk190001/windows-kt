package Windows.UI.Notifications

import Windows.Data.Xml.Dom.XmlDocument
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

public interface IToastNotificationManagerStatics : NativeMapped, IWinRTInterface {
  public val IToastNotificationManagerStatics_Ptr: Pointer?

  public val IToastNotificationManagerStatics_VtblPtr: Pointer?
    get() = IToastNotificationManagerStatics_Ptr?.getPointer(0)

  public fun CreateToastNotifier(): ToastNotifier {
    val fnPtr = IToastNotificationManagerStatics_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.UI.Notifications.ToastNotifier.ByReference()
    val hr = fn.invokeHR(arrayOf(IToastNotificationManagerStatics_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun CreateToastNotifier(applicationId: String): ToastNotifier {
    val fnPtr = IToastNotificationManagerStatics_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val applicationId_Native = applicationId.toHandle()
    val result = Windows.UI.Notifications.ToastNotifier.ByReference()
    val hr = fn.invokeHR(arrayOf(IToastNotificationManagerStatics_Ptr, applicationId_Native,
        result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun GetTemplateContent(type: ToastTemplateType): XmlDocument {
    val fnPtr = IToastNotificationManagerStatics_VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Data.Xml.Dom.XmlDocument.ByReference()
    val hr = fn.invokeHR(arrayOf(IToastNotificationManagerStatics_Ptr, type, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIToastNotificationManagerStatics(pointer.getPointer(0))

    public fun setValue(`value`: IToastNotificationManagerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IToastNotificationManagerStatics_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IToastNotificationManagerStatics {
    public override val IToastNotificationManagerStatics_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("50ac103fd2354598bbef98fe4d1a3ad4")

    public fun makeIToastNotificationManagerStatics(ptr: Pointer?): IToastNotificationManagerStatics
        = IToastNotificationManagerStatics_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IToastNotificationManagerStatics):
        Array<IToastNotificationManagerStatics> = (elements as
        Array<IToastNotificationManagerStatics>).castToImpl<IToastNotificationManagerStatics,IToastNotificationManagerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IToastNotificationManagerStatics?> =
        arrayOfNulls<IToastNotificationManagerStatics_Impl>(size) as
        Array<IToastNotificationManagerStatics?>
  }
}

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

public interface IBadgeUpdateManagerStatics : NativeMapped, IWinRTInterface {
  public val IBadgeUpdateManagerStatics_Ptr: Pointer?

  public val IBadgeUpdateManagerStatics_VtblPtr: Pointer?
    get() = IBadgeUpdateManagerStatics_Ptr?.getPointer(0)

  public fun CreateBadgeUpdaterForApplication(): BadgeUpdater {
    val fnPtr = IBadgeUpdateManagerStatics_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.UI.Notifications.BadgeUpdater.ByReference()
    val hr = fn.invokeHR(arrayOf(IBadgeUpdateManagerStatics_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun CreateBadgeUpdaterForApplication(applicationId: String): BadgeUpdater {
    val fnPtr = IBadgeUpdateManagerStatics_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val applicationId_Native = applicationId.toHandle()
    val result = Windows.UI.Notifications.BadgeUpdater.ByReference()
    val hr = fn.invokeHR(arrayOf(IBadgeUpdateManagerStatics_Ptr, applicationId_Native, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun CreateBadgeUpdaterForSecondaryTile(tileId: String): BadgeUpdater {
    val fnPtr = IBadgeUpdateManagerStatics_VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val tileId_Native = tileId.toHandle()
    val result = Windows.UI.Notifications.BadgeUpdater.ByReference()
    val hr = fn.invokeHR(arrayOf(IBadgeUpdateManagerStatics_Ptr, tileId_Native, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun GetTemplateContent(type: BadgeTemplateType): XmlDocument {
    val fnPtr = IBadgeUpdateManagerStatics_VtblPtr!!.getPointer(9L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Data.Xml.Dom.XmlDocument.ByReference()
    val hr = fn.invokeHR(arrayOf(IBadgeUpdateManagerStatics_Ptr, type, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIBadgeUpdateManagerStatics(pointer.getPointer(0))

    public fun setValue(`value`: IBadgeUpdateManagerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IBadgeUpdateManagerStatics_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IBadgeUpdateManagerStatics {
    public override val IBadgeUpdateManagerStatics_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("33400faa6dd54105aebc9b50fca492da")

    public fun makeIBadgeUpdateManagerStatics(ptr: Pointer?): IBadgeUpdateManagerStatics =
        IBadgeUpdateManagerStatics_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IBadgeUpdateManagerStatics):
        Array<IBadgeUpdateManagerStatics> = (elements as
        Array<IBadgeUpdateManagerStatics>).castToImpl<IBadgeUpdateManagerStatics,IBadgeUpdateManagerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBadgeUpdateManagerStatics?> =
        arrayOfNulls<IBadgeUpdateManagerStatics_Impl>(size) as Array<IBadgeUpdateManagerStatics?>
  }
}

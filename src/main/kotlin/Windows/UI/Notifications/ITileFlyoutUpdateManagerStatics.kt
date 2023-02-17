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

public interface ITileFlyoutUpdateManagerStatics : NativeMapped, IWinRTInterface {
  public val ITileFlyoutUpdateManagerStatics_Ptr: Pointer?

  public val ITileFlyoutUpdateManagerStatics_VtblPtr: Pointer?
    get() = ITileFlyoutUpdateManagerStatics_Ptr?.getPointer(0)

  public fun CreateTileFlyoutUpdaterForApplication(): TileFlyoutUpdater {
    val fnPtr = ITileFlyoutUpdateManagerStatics_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.UI.Notifications.TileFlyoutUpdater.ByReference()
    val hr = fn.invokeHR(arrayOf(ITileFlyoutUpdateManagerStatics_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun CreateTileFlyoutUpdaterForApplication(applicationId: String): TileFlyoutUpdater {
    val fnPtr = ITileFlyoutUpdateManagerStatics_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val applicationId_Native = applicationId.toHandle()
    val result = Windows.UI.Notifications.TileFlyoutUpdater.ByReference()
    val hr = fn.invokeHR(arrayOf(ITileFlyoutUpdateManagerStatics_Ptr, applicationId_Native, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun CreateTileFlyoutUpdaterForSecondaryTile(tileId: String): TileFlyoutUpdater {
    val fnPtr = ITileFlyoutUpdateManagerStatics_VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val tileId_Native = tileId.toHandle()
    val result = Windows.UI.Notifications.TileFlyoutUpdater.ByReference()
    val hr = fn.invokeHR(arrayOf(ITileFlyoutUpdateManagerStatics_Ptr, tileId_Native, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun GetTemplateContent(type: TileFlyoutTemplateType): XmlDocument {
    val fnPtr = ITileFlyoutUpdateManagerStatics_VtblPtr!!.getPointer(9L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Data.Xml.Dom.XmlDocument.ByReference()
    val hr = fn.invokeHR(arrayOf(ITileFlyoutUpdateManagerStatics_Ptr, type, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeITileFlyoutUpdateManagerStatics(pointer.getPointer(0))

    public fun setValue(`value`: ITileFlyoutUpdateManagerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class ITileFlyoutUpdateManagerStatics_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), ITileFlyoutUpdateManagerStatics {
    public override val ITileFlyoutUpdateManagerStatics_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("04363b0b1ac04b9988e7ada83e953d48")

    public fun makeITileFlyoutUpdateManagerStatics(ptr: Pointer?): ITileFlyoutUpdateManagerStatics =
        ITileFlyoutUpdateManagerStatics_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: ITileFlyoutUpdateManagerStatics):
        Array<ITileFlyoutUpdateManagerStatics> = (elements as
        Array<ITileFlyoutUpdateManagerStatics>).castToImpl<ITileFlyoutUpdateManagerStatics,ITileFlyoutUpdateManagerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITileFlyoutUpdateManagerStatics?> =
        arrayOfNulls<ITileFlyoutUpdateManagerStatics_Impl>(size) as
        Array<ITileFlyoutUpdateManagerStatics?>
  }
}

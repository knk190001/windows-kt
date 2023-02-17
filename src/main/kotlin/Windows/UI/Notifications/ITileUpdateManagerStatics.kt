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

public interface ITileUpdateManagerStatics : NativeMapped, IWinRTInterface {
  public val ITileUpdateManagerStatics_Ptr: Pointer?

  public val ITileUpdateManagerStatics_VtblPtr: Pointer?
    get() = ITileUpdateManagerStatics_Ptr?.getPointer(0)

  public fun CreateTileUpdaterForApplication(): TileUpdater {
    val fnPtr = ITileUpdateManagerStatics_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.UI.Notifications.TileUpdater.ByReference()
    val hr = fn.invokeHR(arrayOf(ITileUpdateManagerStatics_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun CreateTileUpdaterForApplication(applicationId: String): TileUpdater {
    val fnPtr = ITileUpdateManagerStatics_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val applicationId_Native = applicationId.toHandle()
    val result = Windows.UI.Notifications.TileUpdater.ByReference()
    val hr = fn.invokeHR(arrayOf(ITileUpdateManagerStatics_Ptr, applicationId_Native, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun CreateTileUpdaterForSecondaryTile(tileId: String): TileUpdater {
    val fnPtr = ITileUpdateManagerStatics_VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val tileId_Native = tileId.toHandle()
    val result = Windows.UI.Notifications.TileUpdater.ByReference()
    val hr = fn.invokeHR(arrayOf(ITileUpdateManagerStatics_Ptr, tileId_Native, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun GetTemplateContent(type: TileTemplateType): XmlDocument {
    val fnPtr = ITileUpdateManagerStatics_VtblPtr!!.getPointer(9L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Data.Xml.Dom.XmlDocument.ByReference()
    val hr = fn.invokeHR(arrayOf(ITileUpdateManagerStatics_Ptr, type, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeITileUpdateManagerStatics(pointer.getPointer(0))

    public fun setValue(`value`: ITileUpdateManagerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class ITileUpdateManagerStatics_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), ITileUpdateManagerStatics {
    public override val ITileUpdateManagerStatics_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("da159e5d3ea949868d84b09d5e12276d")

    public fun makeITileUpdateManagerStatics(ptr: Pointer?): ITileUpdateManagerStatics =
        ITileUpdateManagerStatics_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: ITileUpdateManagerStatics):
        Array<ITileUpdateManagerStatics> = (elements as
        Array<ITileUpdateManagerStatics>).castToImpl<ITileUpdateManagerStatics,ITileUpdateManagerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITileUpdateManagerStatics?> =
        arrayOfNulls<ITileUpdateManagerStatics_Impl>(size) as Array<ITileUpdateManagerStatics?>
  }
}

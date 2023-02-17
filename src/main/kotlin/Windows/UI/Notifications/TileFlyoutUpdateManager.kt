package Windows.UI.Notifications

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.interfaces.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.interfaces.IWinRTObject
import com.github.knk190001.winrtbinding.runtime.interfaces.getValue
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import kotlin.Array
import kotlin.String
import kotlin.Unit

public class TileFlyoutUpdateManager(
  ptr: Pointer? = Pointer.NULL,
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue(): TileFlyoutUpdateManager = TileFlyoutUpdateManager(pointer.getPointer(0))

    public fun setValue(`value`: TileFlyoutUpdateManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI {
    public val ITileFlyoutUpdateManagerStatics_Instance: ITileFlyoutUpdateManagerStatics by lazy {
      createITileFlyoutUpdateManagerStatics()
    }


    public fun createITileFlyoutUpdateManagerStatics(): ITileFlyoutUpdateManagerStatics {
      val refiid = Guid.REFIID(ITileFlyoutUpdateManagerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Notifications.TileFlyoutUpdateManager".toHandle(),refiid,interfacePtr)
      val result =
          ITileFlyoutUpdateManagerStatics.ABI.makeITileFlyoutUpdateManagerStatics(interfacePtr.value)
      return result
    }
  }

  public companion object {
    public fun CreateTileFlyoutUpdaterForApplication() =
        ABI.ITileFlyoutUpdateManagerStatics_Instance.CreateTileFlyoutUpdaterForApplication()

    public fun CreateTileFlyoutUpdaterForApplication(applicationId: String) =
        ABI.ITileFlyoutUpdateManagerStatics_Instance.CreateTileFlyoutUpdaterForApplication(applicationId)

    public fun CreateTileFlyoutUpdaterForSecondaryTile(tileId: String) =
        ABI.ITileFlyoutUpdateManagerStatics_Instance.CreateTileFlyoutUpdaterForSecondaryTile(tileId)

    public fun GetTemplateContent(type: TileFlyoutTemplateType) =
        ABI.ITileFlyoutUpdateManagerStatics_Instance.GetTemplateContent(type)
  }
}

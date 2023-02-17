package Windows.UI.Notifications

import Windows.System.User
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
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

public class TileUpdateManager(
  ptr: Pointer? = Pointer.NULL,
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue(): TileUpdateManager = TileUpdateManager(pointer.getPointer(0))

    public fun setValue(`value`: TileUpdateManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI {
    public val ITileUpdateManagerStatics_Instance: ITileUpdateManagerStatics by lazy {
      createITileUpdateManagerStatics()
    }


    public val ITileUpdateManagerStatics2_Instance: ITileUpdateManagerStatics2 by lazy {
      createITileUpdateManagerStatics2()
    }


    public fun createITileUpdateManagerStatics(): ITileUpdateManagerStatics {
      val refiid = Guid.REFIID(ITileUpdateManagerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Notifications.TileUpdateManager".toHandle(),refiid,interfacePtr)
      val result = ITileUpdateManagerStatics.ABI.makeITileUpdateManagerStatics(interfacePtr.value)
      return result
    }

    public fun createITileUpdateManagerStatics2(): ITileUpdateManagerStatics2 {
      val refiid = Guid.REFIID(ITileUpdateManagerStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Notifications.TileUpdateManager".toHandle(),refiid,interfacePtr)
      val result = ITileUpdateManagerStatics2.ABI.makeITileUpdateManagerStatics2(interfacePtr.value)
      return result
    }
  }

  public companion object {
    public fun CreateTileUpdaterForApplication() =
        ABI.ITileUpdateManagerStatics_Instance.CreateTileUpdaterForApplication()

    public fun CreateTileUpdaterForApplication(applicationId: String) =
        ABI.ITileUpdateManagerStatics_Instance.CreateTileUpdaterForApplication(applicationId)

    public fun CreateTileUpdaterForSecondaryTile(tileId: String) =
        ABI.ITileUpdateManagerStatics_Instance.CreateTileUpdaterForSecondaryTile(tileId)

    public fun GetTemplateContent(type: TileTemplateType) =
        ABI.ITileUpdateManagerStatics_Instance.GetTemplateContent(type)

    public fun GetForUser(user: User) = ABI.ITileUpdateManagerStatics2_Instance.GetForUser(user)
  }
}

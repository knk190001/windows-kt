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

public class BadgeUpdateManager(
  ptr: Pointer? = Pointer.NULL,
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue(): BadgeUpdateManager = BadgeUpdateManager(pointer.getPointer(0))

    public fun setValue(`value`: BadgeUpdateManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI {
    public val IBadgeUpdateManagerStatics2_Instance: IBadgeUpdateManagerStatics2 by lazy {
      createIBadgeUpdateManagerStatics2()
    }


    public val IBadgeUpdateManagerStatics_Instance: IBadgeUpdateManagerStatics by lazy {
      createIBadgeUpdateManagerStatics()
    }


    public fun createIBadgeUpdateManagerStatics2(): IBadgeUpdateManagerStatics2 {
      val refiid = Guid.REFIID(IBadgeUpdateManagerStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Notifications.BadgeUpdateManager".toHandle(),refiid,interfacePtr)
      val result =
          IBadgeUpdateManagerStatics2.ABI.makeIBadgeUpdateManagerStatics2(interfacePtr.value)
      return result
    }

    public fun createIBadgeUpdateManagerStatics(): IBadgeUpdateManagerStatics {
      val refiid = Guid.REFIID(IBadgeUpdateManagerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Notifications.BadgeUpdateManager".toHandle(),refiid,interfacePtr)
      val result = IBadgeUpdateManagerStatics.ABI.makeIBadgeUpdateManagerStatics(interfacePtr.value)
      return result
    }
  }

  public companion object {
    public fun GetForUser(user: User) = ABI.IBadgeUpdateManagerStatics2_Instance.GetForUser(user)

    public fun CreateBadgeUpdaterForApplication() =
        ABI.IBadgeUpdateManagerStatics_Instance.CreateBadgeUpdaterForApplication()

    public fun CreateBadgeUpdaterForApplication(applicationId: String) =
        ABI.IBadgeUpdateManagerStatics_Instance.CreateBadgeUpdaterForApplication(applicationId)

    public fun CreateBadgeUpdaterForSecondaryTile(tileId: String) =
        ABI.IBadgeUpdateManagerStatics_Instance.CreateBadgeUpdaterForSecondaryTile(tileId)

    public fun GetTemplateContent(type: BadgeTemplateType) =
        ABI.IBadgeUpdateManagerStatics_Instance.GetTemplateContent(type)
  }
}

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
import kotlin.Unit

public class KnownNotificationBindings(
  ptr: Pointer? = Pointer.NULL,
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue(): KnownNotificationBindings =
        KnownNotificationBindings(pointer.getPointer(0))

    public fun setValue(`value`: KnownNotificationBindings): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI {
    public val IKnownNotificationBindingsStatics_Instance: IKnownNotificationBindingsStatics by
        lazy {
      createIKnownNotificationBindingsStatics()
    }


    public fun createIKnownNotificationBindingsStatics(): IKnownNotificationBindingsStatics {
      val refiid = Guid.REFIID(IKnownNotificationBindingsStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Notifications.KnownNotificationBindings".toHandle(),refiid,interfacePtr)
      val result =
          IKnownNotificationBindingsStatics.ABI.makeIKnownNotificationBindingsStatics(interfacePtr.value)
      return result
    }
  }

  public companion object {
    public fun get_ToastGeneric() =
        ABI.IKnownNotificationBindingsStatics_Instance.get_ToastGeneric()
  }
}

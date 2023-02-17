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

public class KnownAdaptiveNotificationHints(
  ptr: Pointer? = Pointer.NULL,
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue(): KnownAdaptiveNotificationHints =
        KnownAdaptiveNotificationHints(pointer.getPointer(0))

    public fun setValue(`value`: KnownAdaptiveNotificationHints): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI {
    public val IKnownAdaptiveNotificationHintsStatics_Instance:
        IKnownAdaptiveNotificationHintsStatics by lazy {
      createIKnownAdaptiveNotificationHintsStatics()
    }


    public fun createIKnownAdaptiveNotificationHintsStatics():
        IKnownAdaptiveNotificationHintsStatics {
      val refiid = Guid.REFIID(IKnownAdaptiveNotificationHintsStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Notifications.KnownAdaptiveNotificationHints".toHandle(),refiid,interfacePtr)
      val result =
          IKnownAdaptiveNotificationHintsStatics.ABI.makeIKnownAdaptiveNotificationHintsStatics(interfacePtr.value)
      return result
    }
  }

  public companion object {
    public fun get_Style() = ABI.IKnownAdaptiveNotificationHintsStatics_Instance.get_Style()

    public fun get_Wrap() = ABI.IKnownAdaptiveNotificationHintsStatics_Instance.get_Wrap()

    public fun get_MaxLines() = ABI.IKnownAdaptiveNotificationHintsStatics_Instance.get_MaxLines()

    public fun get_MinLines() = ABI.IKnownAdaptiveNotificationHintsStatics_Instance.get_MinLines()

    public fun get_TextStacking() =
        ABI.IKnownAdaptiveNotificationHintsStatics_Instance.get_TextStacking()

    public fun get_Align() = ABI.IKnownAdaptiveNotificationHintsStatics_Instance.get_Align()
  }
}

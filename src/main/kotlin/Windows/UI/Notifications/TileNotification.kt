package Windows.UI.Notifications

import Windows.Data.Xml.Dom.XmlDocument
import Windows.UI.Notifications.ITileNotificationFactory.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.interfaces.IUnknownVtbl
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

public class TileNotification(
  ptr: Pointer? = Pointer.NULL,
) : PointerType(ptr), ITileNotification, IWinRTObject {
  public val ITileNotification_Interface: ITileNotification by lazy {
    asITileNotification()
  }


  public override val ITileNotification_Ptr: Pointer? by lazy {
    ITileNotification_Interface.ITileNotification_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(ITileNotification_Interface)

  public constructor(content: XmlDocument) : this(ABI.activate(content))

  private fun asITileNotification(): ITileNotification {
    if(pointer == Pointer.NULL) {
      return(ITileNotification.ABI.makeITileNotification(Pointer.NULL))
    }
    val refiid = Guid.REFIID(ITileNotification.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITileNotification.ABI.makeITileNotification(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue(): TileNotification = TileNotification(pointer.getPointer(0))

    public fun setValue(`value`: TileNotification): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI {
    public val ITileNotificationFactory_Instance: ITileNotificationFactory by lazy {
      createITileNotificationFactory()
    }


    public fun createITileNotificationFactory(): ITileNotificationFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Notifications.TileNotification".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ITileNotificationFactory.ABI.makeITileNotificationFactory(factoryActivatorPtr.value))
    }

    public fun activate(content: XmlDocument): Pointer =
        ITileNotificationFactory_Instance.CreateTileNotification(content).pointer
  }
}

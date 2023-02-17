package Windows.UI.Notifications

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

public class ShownTileNotification(
  ptr: Pointer? = Pointer.NULL,
) : PointerType(ptr), IShownTileNotification, IWinRTObject {
  public val IShownTileNotification_Interface: IShownTileNotification by lazy {
    asIShownTileNotification()
  }


  public override val IShownTileNotification_Ptr: Pointer? by lazy {
    IShownTileNotification_Interface.IShownTileNotification_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(IShownTileNotification_Interface)

  private fun asIShownTileNotification(): IShownTileNotification {
    if(pointer == Pointer.NULL) {
      return(IShownTileNotification.ABI.makeIShownTileNotification(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IShownTileNotification.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IShownTileNotification.ABI.makeIShownTileNotification(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue(): ShownTileNotification = ShownTileNotification(pointer.getPointer(0))

    public fun setValue(`value`: ShownTileNotification): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI
}

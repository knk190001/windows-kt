package Windows.UI.Notifications

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
import com.sun.jna.platform.win32.WinNT
import java.lang.RuntimeException
import kotlin.Array
import kotlin.Int
import kotlin.String
import kotlin.Unit

public interface IShownTileNotification : NativeMapped, IWinRTInterface {
  public val IShownTileNotification_Ptr: Pointer?

  public val IShownTileNotification_VtblPtr: Pointer?
    get() = IShownTileNotification_Ptr?.getPointer(0)

  public fun get_Arguments(): String {
    val fnPtr = IShownTileNotification_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(IShownTileNotification_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIShownTileNotification(pointer.getPointer(0))

    public fun setValue(`value`: IShownTileNotification_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IShownTileNotification_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IShownTileNotification {
    public override val IShownTileNotification_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("342d89885af2481aa6a3f2fdc78de88e")

    public fun makeIShownTileNotification(ptr: Pointer?): IShownTileNotification =
        IShownTileNotification_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IShownTileNotification): Array<IShownTileNotification> =
        (elements as
        Array<IShownTileNotification>).castToImpl<IShownTileNotification,IShownTileNotification_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IShownTileNotification?> =
        arrayOfNulls<IShownTileNotification_Impl>(size) as Array<IShownTileNotification?>
  }
}

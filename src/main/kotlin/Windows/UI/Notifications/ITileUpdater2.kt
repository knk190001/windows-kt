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
import java.lang.RuntimeException
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit

public interface ITileUpdater2 : NativeMapped, IWinRTInterface {
  public val ITileUpdater2_Ptr: Pointer?

  public val ITileUpdater2_VtblPtr: Pointer?
    get() = ITileUpdater2_Ptr?.getPointer(0)

  public fun EnableNotificationQueueForSquare150x150(enable: Boolean): Unit {
    val fnPtr = ITileUpdater2_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val enable_Native: Byte = if(enable) 1 else 0 
    val hr = fn.invokeHR(arrayOf(ITileUpdater2_Ptr, enable_Native,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun EnableNotificationQueueForWide310x150(enable: Boolean): Unit {
    val fnPtr = ITileUpdater2_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val enable_Native: Byte = if(enable) 1 else 0 
    val hr = fn.invokeHR(arrayOf(ITileUpdater2_Ptr, enable_Native,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun EnableNotificationQueueForSquare310x310(enable: Boolean): Unit {
    val fnPtr = ITileUpdater2_VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val enable_Native: Byte = if(enable) 1 else 0 
    val hr = fn.invokeHR(arrayOf(ITileUpdater2_Ptr, enable_Native,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeITileUpdater2(pointer.getPointer(0))

    public fun setValue(`value`: ITileUpdater2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class ITileUpdater2_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), ITileUpdater2 {
    public override val ITileUpdater2_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("a2266e1215ee43ed83f565b352bb1a84")

    public fun makeITileUpdater2(ptr: Pointer?): ITileUpdater2 = ITileUpdater2_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: ITileUpdater2): Array<ITileUpdater2> = (elements as
        Array<ITileUpdater2>).castToImpl<ITileUpdater2,ITileUpdater2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITileUpdater2?> =
        arrayOfNulls<ITileUpdater2_Impl>(size) as Array<ITileUpdater2?>
  }
}

package Windows.UI.Notifications

import Windows.System.User
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
import kotlin.Unit

public interface ITileUpdateManagerStatics2 : NativeMapped, IWinRTInterface {
  public val ITileUpdateManagerStatics2_Ptr: Pointer?

  public val ITileUpdateManagerStatics2_VtblPtr: Pointer?
    get() = ITileUpdateManagerStatics2_Ptr?.getPointer(0)

  public fun GetForUser(user: User): TileUpdateManagerForUser {
    val fnPtr = ITileUpdateManagerStatics2_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.UI.Notifications.TileUpdateManagerForUser.ByReference()
    val hr = fn.invokeHR(arrayOf(ITileUpdateManagerStatics2_Ptr, user, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeITileUpdateManagerStatics2(pointer.getPointer(0))

    public fun setValue(`value`: ITileUpdateManagerStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class ITileUpdateManagerStatics2_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), ITileUpdateManagerStatics2 {
    public override val ITileUpdateManagerStatics2_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("731c1ddc8e144b7ca34b9d22de76c84d")

    public fun makeITileUpdateManagerStatics2(ptr: Pointer?): ITileUpdateManagerStatics2 =
        ITileUpdateManagerStatics2_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: ITileUpdateManagerStatics2):
        Array<ITileUpdateManagerStatics2> = (elements as
        Array<ITileUpdateManagerStatics2>).castToImpl<ITileUpdateManagerStatics2,ITileUpdateManagerStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITileUpdateManagerStatics2?> =
        arrayOfNulls<ITileUpdateManagerStatics2_Impl>(size) as Array<ITileUpdateManagerStatics2?>
  }
}

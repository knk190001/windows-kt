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
import kotlin.String
import kotlin.Unit

public interface ITileUpdateManagerForUser : NativeMapped, IWinRTInterface {
  public val ITileUpdateManagerForUser_Ptr: Pointer?

  public val ITileUpdateManagerForUser_VtblPtr: Pointer?
    get() = ITileUpdateManagerForUser_Ptr?.getPointer(0)

  public fun CreateTileUpdaterForApplicationForUser(): TileUpdater {
    val fnPtr = ITileUpdateManagerForUser_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.UI.Notifications.TileUpdater.ByReference()
    val hr = fn.invokeHR(arrayOf(ITileUpdateManagerForUser_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun CreateTileUpdaterForApplication(applicationId: String): TileUpdater {
    val fnPtr = ITileUpdateManagerForUser_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val applicationId_Native = applicationId.toHandle()
    val result = Windows.UI.Notifications.TileUpdater.ByReference()
    val hr = fn.invokeHR(arrayOf(ITileUpdateManagerForUser_Ptr, applicationId_Native, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun CreateTileUpdaterForSecondaryTile(tileId: String): TileUpdater {
    val fnPtr = ITileUpdateManagerForUser_VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val tileId_Native = tileId.toHandle()
    val result = Windows.UI.Notifications.TileUpdater.ByReference()
    val hr = fn.invokeHR(arrayOf(ITileUpdateManagerForUser_Ptr, tileId_Native, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun get_User(): User {
    val fnPtr = ITileUpdateManagerForUser_VtblPtr!!.getPointer(9L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.System.User.ByReference()
    val hr = fn.invokeHR(arrayOf(ITileUpdateManagerForUser_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeITileUpdateManagerForUser(pointer.getPointer(0))

    public fun setValue(`value`: ITileUpdateManagerForUser_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class ITileUpdateManagerForUser_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), ITileUpdateManagerForUser {
    public override val ITileUpdateManagerForUser_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("551413482ee24e2d9cc1216a20decc9f")

    public fun makeITileUpdateManagerForUser(ptr: Pointer?): ITileUpdateManagerForUser =
        ITileUpdateManagerForUser_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: ITileUpdateManagerForUser):
        Array<ITileUpdateManagerForUser> = (elements as
        Array<ITileUpdateManagerForUser>).castToImpl<ITileUpdateManagerForUser,ITileUpdateManagerForUser_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITileUpdateManagerForUser?> =
        arrayOfNulls<ITileUpdateManagerForUser_Impl>(size) as Array<ITileUpdateManagerForUser?>
  }
}

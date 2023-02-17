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

public interface IBadgeUpdateManagerForUser : NativeMapped, IWinRTInterface {
  public val IBadgeUpdateManagerForUser_Ptr: Pointer?

  public val IBadgeUpdateManagerForUser_VtblPtr: Pointer?
    get() = IBadgeUpdateManagerForUser_Ptr?.getPointer(0)

  public fun CreateBadgeUpdaterForApplication(): BadgeUpdater {
    val fnPtr = IBadgeUpdateManagerForUser_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.UI.Notifications.BadgeUpdater.ByReference()
    val hr = fn.invokeHR(arrayOf(IBadgeUpdateManagerForUser_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun CreateBadgeUpdaterForApplication(applicationId: String): BadgeUpdater {
    val fnPtr = IBadgeUpdateManagerForUser_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val applicationId_Native = applicationId.toHandle()
    val result = Windows.UI.Notifications.BadgeUpdater.ByReference()
    val hr = fn.invokeHR(arrayOf(IBadgeUpdateManagerForUser_Ptr, applicationId_Native, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun CreateBadgeUpdaterForSecondaryTile(tileId: String): BadgeUpdater {
    val fnPtr = IBadgeUpdateManagerForUser_VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val tileId_Native = tileId.toHandle()
    val result = Windows.UI.Notifications.BadgeUpdater.ByReference()
    val hr = fn.invokeHR(arrayOf(IBadgeUpdateManagerForUser_Ptr, tileId_Native, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun get_User(): User {
    val fnPtr = IBadgeUpdateManagerForUser_VtblPtr!!.getPointer(9L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.System.User.ByReference()
    val hr = fn.invokeHR(arrayOf(IBadgeUpdateManagerForUser_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIBadgeUpdateManagerForUser(pointer.getPointer(0))

    public fun setValue(`value`: IBadgeUpdateManagerForUser_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IBadgeUpdateManagerForUser_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IBadgeUpdateManagerForUser {
    public override val IBadgeUpdateManagerForUser_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("996b21bc038644e5ba8d0c1077a62e92")

    public fun makeIBadgeUpdateManagerForUser(ptr: Pointer?): IBadgeUpdateManagerForUser =
        IBadgeUpdateManagerForUser_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IBadgeUpdateManagerForUser):
        Array<IBadgeUpdateManagerForUser> = (elements as
        Array<IBadgeUpdateManagerForUser>).castToImpl<IBadgeUpdateManagerForUser,IBadgeUpdateManagerForUser_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBadgeUpdateManagerForUser?> =
        arrayOfNulls<IBadgeUpdateManagerForUser_Impl>(size) as Array<IBadgeUpdateManagerForUser?>
  }
}

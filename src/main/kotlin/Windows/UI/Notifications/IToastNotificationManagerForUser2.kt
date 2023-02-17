package Windows.UI.Notifications

import Windows.Foundation.IAsyncOperation_ToastNotificationHistory_
import Windows.Foundation.IAsyncOperation_ToastNotifier_
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

public interface IToastNotificationManagerForUser2 : NativeMapped, IWinRTInterface {
  public val IToastNotificationManagerForUser2_Ptr: Pointer?

  public val IToastNotificationManagerForUser2_VtblPtr: Pointer?
    get() = IToastNotificationManagerForUser2_Ptr?.getPointer(0)

  public fun GetToastNotifierForToastCollectionIdAsync(collectionId: String):
      IAsyncOperation_ToastNotifier_ {
    val fnPtr = IToastNotificationManagerForUser2_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val collectionId_Native = collectionId.toHandle()
    val result = Windows.Foundation.IAsyncOperation_ToastNotifier_.ByReference()
    val hr = fn.invokeHR(arrayOf(IToastNotificationManagerForUser2_Ptr, collectionId_Native,
        result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun GetHistoryForToastCollectionIdAsync(collectionId: String):
      IAsyncOperation_ToastNotificationHistory_ {
    val fnPtr = IToastNotificationManagerForUser2_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val collectionId_Native = collectionId.toHandle()
    val result = Windows.Foundation.IAsyncOperation_ToastNotificationHistory_.ByReference()
    val hr = fn.invokeHR(arrayOf(IToastNotificationManagerForUser2_Ptr, collectionId_Native,
        result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun GetToastCollectionManager(): ToastCollectionManager {
    val fnPtr = IToastNotificationManagerForUser2_VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.UI.Notifications.ToastCollectionManager.ByReference()
    val hr = fn.invokeHR(arrayOf(IToastNotificationManagerForUser2_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun GetToastCollectionManager(appId: String): ToastCollectionManager {
    val fnPtr = IToastNotificationManagerForUser2_VtblPtr!!.getPointer(9L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val appId_Native = appId.toHandle()
    val result = Windows.UI.Notifications.ToastCollectionManager.ByReference()
    val hr = fn.invokeHR(arrayOf(IToastNotificationManagerForUser2_Ptr, appId_Native, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIToastNotificationManagerForUser2(pointer.getPointer(0))

    public fun setValue(`value`: IToastNotificationManagerForUser2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IToastNotificationManagerForUser2_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IToastNotificationManagerForUser2 {
    public override val IToastNotificationManagerForUser2_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("679c64b781ab42c28819c958767753f4")

    public fun makeIToastNotificationManagerForUser2(ptr: Pointer?):
        IToastNotificationManagerForUser2 = IToastNotificationManagerForUser2_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IToastNotificationManagerForUser2):
        Array<IToastNotificationManagerForUser2> = (elements as
        Array<IToastNotificationManagerForUser2>).castToImpl<IToastNotificationManagerForUser2,IToastNotificationManagerForUser2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IToastNotificationManagerForUser2?> =
        arrayOfNulls<IToastNotificationManagerForUser2_Impl>(size) as
        Array<IToastNotificationManagerForUser2?>
  }
}

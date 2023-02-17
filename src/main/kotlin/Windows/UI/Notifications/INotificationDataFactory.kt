package Windows.UI.Notifications

import Windows.Foundation.Collections.IIterable_IKeyValuePair_String_String__
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
import com.sun.jna.platform.win32.WinDef
import java.lang.RuntimeException
import kotlin.Array
import kotlin.Int
import kotlin.Unit

public interface INotificationDataFactory : NativeMapped, IWinRTInterface {
  public val INotificationDataFactory_Ptr: Pointer?

  public val INotificationDataFactory_VtblPtr: Pointer?
    get() = INotificationDataFactory_Ptr?.getPointer(0)

  public fun CreateNotificationData(initialValues: IIterable_IKeyValuePair_String_String__,
      sequenceNumber: WinDef.UINT): NotificationData {
    val fnPtr = INotificationDataFactory_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.UI.Notifications.NotificationData.ByReference()
    val hr = fn.invokeHR(arrayOf(INotificationDataFactory_Ptr, initialValues, sequenceNumber,
        result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun CreateNotificationData(initialValues: IIterable_IKeyValuePair_String_String__):
      NotificationData {
    val fnPtr = INotificationDataFactory_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.UI.Notifications.NotificationData.ByReference()
    val hr = fn.invokeHR(arrayOf(INotificationDataFactory_Ptr, initialValues, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeINotificationDataFactory(pointer.getPointer(0))

    public fun setValue(`value`: INotificationDataFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class INotificationDataFactory_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), INotificationDataFactory {
    public override val INotificationDataFactory_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("23c1e33a1c1046fb8040dec384621cf8")

    public fun makeINotificationDataFactory(ptr: Pointer?): INotificationDataFactory =
        INotificationDataFactory_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: INotificationDataFactory): Array<INotificationDataFactory>
        = (elements as
        Array<INotificationDataFactory>).castToImpl<INotificationDataFactory,INotificationDataFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INotificationDataFactory?> =
        arrayOfNulls<INotificationDataFactory_Impl>(size) as Array<INotificationDataFactory?>
  }
}

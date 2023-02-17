package Windows.UI.Notifications

import Windows.Foundation.IReference_DateTime_
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

public interface INotification : NativeMapped, IWinRTInterface {
  public val INotification_Ptr: Pointer?

  public val INotification_VtblPtr: Pointer?
    get() = INotification_Ptr?.getPointer(0)

  public fun get_ExpirationTime(): IReference_DateTime_ {
    val fnPtr = INotification_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.IReference_DateTime_.ByReference()
    val hr = fn.invokeHR(arrayOf(INotification_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun put_ExpirationTime(`value`: IReference_DateTime_): Unit {
    val fnPtr = INotification_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(INotification_Ptr, value,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun get_Visual(): NotificationVisual {
    val fnPtr = INotification_VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.UI.Notifications.NotificationVisual.ByReference()
    val hr = fn.invokeHR(arrayOf(INotification_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun put_Visual(`value`: NotificationVisual): Unit {
    val fnPtr = INotification_VtblPtr!!.getPointer(9L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(INotification_Ptr, value,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeINotification(pointer.getPointer(0))

    public fun setValue(`value`: INotification_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class INotification_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), INotification {
    public override val INotification_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("108037feeb764f8297bcda07530a2e20")

    public fun makeINotification(ptr: Pointer?): INotification = INotification_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: INotification): Array<INotification> = (elements as
        Array<INotification>).castToImpl<INotification,INotification_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INotification?> =
        arrayOfNulls<INotification_Impl>(size) as Array<INotification?>
  }
}

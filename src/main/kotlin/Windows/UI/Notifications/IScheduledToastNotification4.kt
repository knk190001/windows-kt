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

public interface IScheduledToastNotification4 : NativeMapped, IWinRTInterface {
  public val IScheduledToastNotification4_Ptr: Pointer?

  public val IScheduledToastNotification4_VtblPtr: Pointer?
    get() = IScheduledToastNotification4_Ptr?.getPointer(0)

  public fun get_ExpirationTime(): IReference_DateTime_ {
    val fnPtr = IScheduledToastNotification4_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.IReference_DateTime_.ByReference()
    val hr = fn.invokeHR(arrayOf(IScheduledToastNotification4_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun put_ExpirationTime(`value`: IReference_DateTime_): Unit {
    val fnPtr = IScheduledToastNotification4_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(IScheduledToastNotification4_Ptr, value,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIScheduledToastNotification4(pointer.getPointer(0))

    public fun setValue(`value`: IScheduledToastNotification4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IScheduledToastNotification4_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IScheduledToastNotification4 {
    public override val IScheduledToastNotification4_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("1d4761fdbdef4e4a96be0101369b58d2")

    public fun makeIScheduledToastNotification4(ptr: Pointer?): IScheduledToastNotification4 =
        IScheduledToastNotification4_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IScheduledToastNotification4):
        Array<IScheduledToastNotification4> = (elements as
        Array<IScheduledToastNotification4>).castToImpl<IScheduledToastNotification4,IScheduledToastNotification4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IScheduledToastNotification4?> =
        arrayOfNulls<IScheduledToastNotification4_Impl>(size) as
        Array<IScheduledToastNotification4?>
  }
}

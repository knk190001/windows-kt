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
import com.sun.jna.ptr.ByteByReference
import java.lang.RuntimeException
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit

public interface IToastNotification6 : NativeMapped, IWinRTInterface {
  public val IToastNotification6_Ptr: Pointer?

  public val IToastNotification6_VtblPtr: Pointer?
    get() = IToastNotification6_Ptr?.getPointer(0)

  public fun get_ExpiresOnReboot(): Boolean {
    val fnPtr = IToastNotification6_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = ByteByReference()
    val hr = fn.invokeHR(arrayOf(IToastNotification6_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue != 0.toByte()
    return resultValue_Managed
  }

  public fun put_ExpiresOnReboot(`value`: Boolean): Unit {
    val fnPtr = IToastNotification6_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val value_Native: Byte = if(value) 1 else 0 
    val hr = fn.invokeHR(arrayOf(IToastNotification6_Ptr, value_Native,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIToastNotification6(pointer.getPointer(0))

    public fun setValue(`value`: IToastNotification6_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IToastNotification6_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IToastNotification6 {
    public override val IToastNotification6_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("43ebfe5389ae5c1ea2793aecfe9b6f54")

    public fun makeIToastNotification6(ptr: Pointer?): IToastNotification6 =
        IToastNotification6_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IToastNotification6): Array<IToastNotification6> =
        (elements as
        Array<IToastNotification6>).castToImpl<IToastNotification6,IToastNotification6_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IToastNotification6?> =
        arrayOfNulls<IToastNotification6_Impl>(size) as Array<IToastNotification6?>
  }
}

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
import com.sun.jna.ptr.ByteByReference
import java.lang.RuntimeException
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit

public interface IScheduledToastNotification2 : NativeMapped, IWinRTInterface {
  public val IScheduledToastNotification2_Ptr: Pointer?

  public val IScheduledToastNotification2_VtblPtr: Pointer?
    get() = IScheduledToastNotification2_Ptr?.getPointer(0)

  public fun put_Tag(`value`: String): Unit {
    val fnPtr = IScheduledToastNotification2_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val value_Native = value.toHandle()
    val hr = fn.invokeHR(arrayOf(IScheduledToastNotification2_Ptr, value_Native,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun get_Tag(): String {
    val fnPtr = IScheduledToastNotification2_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(IScheduledToastNotification2_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public fun put_Group(`value`: String): Unit {
    val fnPtr = IScheduledToastNotification2_VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val value_Native = value.toHandle()
    val hr = fn.invokeHR(arrayOf(IScheduledToastNotification2_Ptr, value_Native,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun get_Group(): String {
    val fnPtr = IScheduledToastNotification2_VtblPtr!!.getPointer(9L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(IScheduledToastNotification2_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public fun put_SuppressPopup(`value`: Boolean): Unit {
    val fnPtr = IScheduledToastNotification2_VtblPtr!!.getPointer(10L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val value_Native: Byte = if(value) 1 else 0 
    val hr = fn.invokeHR(arrayOf(IScheduledToastNotification2_Ptr, value_Native,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun get_SuppressPopup(): Boolean {
    val fnPtr = IScheduledToastNotification2_VtblPtr!!.getPointer(11L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = ByteByReference()
    val hr = fn.invokeHR(arrayOf(IScheduledToastNotification2_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue != 0.toByte()
    return resultValue_Managed
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIScheduledToastNotification2(pointer.getPointer(0))

    public fun setValue(`value`: IScheduledToastNotification2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IScheduledToastNotification2_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IScheduledToastNotification2 {
    public override val IScheduledToastNotification2_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("a66ea09c31b443b0b5dd7a40e85363b1")

    public fun makeIScheduledToastNotification2(ptr: Pointer?): IScheduledToastNotification2 =
        IScheduledToastNotification2_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IScheduledToastNotification2):
        Array<IScheduledToastNotification2> = (elements as
        Array<IScheduledToastNotification2>).castToImpl<IScheduledToastNotification2,IScheduledToastNotification2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IScheduledToastNotification2?> =
        arrayOfNulls<IScheduledToastNotification2_Impl>(size) as
        Array<IScheduledToastNotification2?>
  }
}

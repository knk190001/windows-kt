package Windows.UI.Notifications

import Windows.Foundation.Collections.IMap_String_String_
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

public interface INotificationData : NativeMapped, IWinRTInterface {
  public val INotificationData_Ptr: Pointer?

  public val INotificationData_VtblPtr: Pointer?
    get() = INotificationData_Ptr?.getPointer(0)

  public fun get_Values(): IMap_String_String_ {
    val fnPtr = INotificationData_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.Collections.IMap_String_String_.ByReference()
    val hr = fn.invokeHR(arrayOf(INotificationData_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun get_SequenceNumber(): WinDef.UINT {
    val fnPtr = INotificationData_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinDef.UINTByReference()
    val hr = fn.invokeHR(arrayOf(INotificationData_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun put_SequenceNumber(`value`: WinDef.UINT): Unit {
    val fnPtr = INotificationData_VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(INotificationData_Ptr, value,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeINotificationData(pointer.getPointer(0))

    public fun setValue(`value`: INotificationData_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class INotificationData_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), INotificationData {
    public override val INotificationData_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("9ffd23129d6a4aafb6acff17f0c1f280")

    public fun makeINotificationData(ptr: Pointer?): INotificationData = INotificationData_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: INotificationData): Array<INotificationData> = (elements
        as Array<INotificationData>).castToImpl<INotificationData,INotificationData_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INotificationData?> =
        arrayOfNulls<INotificationData_Impl>(size) as Array<INotificationData?>
  }
}

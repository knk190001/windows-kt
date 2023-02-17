package Windows.UI.Notifications

import Windows.Foundation.Collections.IMap_String_String_
import Windows.Foundation.Collections.IVectorView_AdaptiveNotificationText_
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
import java.lang.RuntimeException
import kotlin.Array
import kotlin.Int
import kotlin.String
import kotlin.Unit

public interface INotificationBinding : NativeMapped, IWinRTInterface {
  public val INotificationBinding_Ptr: Pointer?

  public val INotificationBinding_VtblPtr: Pointer?
    get() = INotificationBinding_Ptr?.getPointer(0)

  public fun get_Template(): String {
    val fnPtr = INotificationBinding_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(INotificationBinding_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public fun put_Template(`value`: String): Unit {
    val fnPtr = INotificationBinding_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val value_Native = value.toHandle()
    val hr = fn.invokeHR(arrayOf(INotificationBinding_Ptr, value_Native,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun get_Language(): String {
    val fnPtr = INotificationBinding_VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(INotificationBinding_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public fun put_Language(`value`: String): Unit {
    val fnPtr = INotificationBinding_VtblPtr!!.getPointer(9L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val value_Native = value.toHandle()
    val hr = fn.invokeHR(arrayOf(INotificationBinding_Ptr, value_Native,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun get_Hints(): IMap_String_String_ {
    val fnPtr = INotificationBinding_VtblPtr!!.getPointer(10L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.Collections.IMap_String_String_.ByReference()
    val hr = fn.invokeHR(arrayOf(INotificationBinding_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun GetTextElements(): IVectorView_AdaptiveNotificationText_ {
    val fnPtr = INotificationBinding_VtblPtr!!.getPointer(11L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.Collections.IVectorView_AdaptiveNotificationText_.ByReference()
    val hr = fn.invokeHR(arrayOf(INotificationBinding_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeINotificationBinding(pointer.getPointer(0))

    public fun setValue(`value`: INotificationBinding_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class INotificationBinding_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), INotificationBinding {
    public override val INotificationBinding_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("f29e4b8503704ad3b4eada9e35e7eabf")

    public fun makeINotificationBinding(ptr: Pointer?): INotificationBinding =
        INotificationBinding_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: INotificationBinding): Array<INotificationBinding> =
        (elements as
        Array<INotificationBinding>).castToImpl<INotificationBinding,INotificationBinding_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INotificationBinding?> =
        arrayOfNulls<INotificationBinding_Impl>(size) as Array<INotificationBinding?>
  }
}

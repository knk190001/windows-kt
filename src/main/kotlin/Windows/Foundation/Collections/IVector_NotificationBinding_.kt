package Windows.Foundation.Collections

import Windows.UI.Notifications.NotificationBinding
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
import com.sun.jna.ptr.ByteByReference
import java.lang.RuntimeException
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit

public interface IVector_NotificationBinding_ : NativeMapped, IWinRTInterface {
  public val IVector_NotificationBinding__Ptr: Pointer?

  public val IVector_NotificationBinding__VtblPtr: Pointer?
    get() = IVector_NotificationBinding__Ptr?.getPointer(0)

  public fun GetAt(index: WinDef.UINT): NotificationBinding {
    val fnPtr = IVector_NotificationBinding__VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.UI.Notifications.NotificationBinding.ByReference()
    val hr = fn.invokeHR(arrayOf(IVector_NotificationBinding__Ptr, index, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun get_Size(): WinDef.UINT {
    val fnPtr = IVector_NotificationBinding__VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinDef.UINTByReference()
    val hr = fn.invokeHR(arrayOf(IVector_NotificationBinding__Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun GetView(): IVectorView_NotificationBinding_ {
    val fnPtr = IVector_NotificationBinding__VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.Collections.IVectorView_NotificationBinding_.ByReference()
    val hr = fn.invokeHR(arrayOf(IVector_NotificationBinding__Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun IndexOf(`value`: NotificationBinding, index: WinDef.UINT): Boolean {
    val fnPtr = IVector_NotificationBinding__VtblPtr!!.getPointer(9L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = ByteByReference()
    val hr = fn.invokeHR(arrayOf(IVector_NotificationBinding__Ptr, value, index, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue != 0.toByte()
    return resultValue_Managed
  }

  public fun SetAt(index: WinDef.UINT, `value`: NotificationBinding): Unit {
    val fnPtr = IVector_NotificationBinding__VtblPtr!!.getPointer(10L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(IVector_NotificationBinding__Ptr, index, value,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun InsertAt(index: WinDef.UINT, `value`: NotificationBinding): Unit {
    val fnPtr = IVector_NotificationBinding__VtblPtr!!.getPointer(11L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(IVector_NotificationBinding__Ptr, index, value,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun RemoveAt(index: WinDef.UINT): Unit {
    val fnPtr = IVector_NotificationBinding__VtblPtr!!.getPointer(12L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(IVector_NotificationBinding__Ptr, index,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun Append(`value`: NotificationBinding): Unit {
    val fnPtr = IVector_NotificationBinding__VtblPtr!!.getPointer(13L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(IVector_NotificationBinding__Ptr, value,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun RemoveAtEnd(): Unit {
    val fnPtr = IVector_NotificationBinding__VtblPtr!!.getPointer(14L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(IVector_NotificationBinding__Ptr, ))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun Clear(): Unit {
    val fnPtr = IVector_NotificationBinding__VtblPtr!!.getPointer(15L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(IVector_NotificationBinding__Ptr, ))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun GetMany(startIndex: WinDef.UINT, items: Array<NotificationBinding?>): WinDef.UINT {
    val fnPtr = IVector_NotificationBinding__VtblPtr!!.getPointer(16L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinDef.UINTByReference()
    val hr = fn.invokeHR(arrayOf(IVector_NotificationBinding__Ptr, startIndex, items.size, items,
        result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun ReplaceAll(items: Array<NotificationBinding?>): Unit {
    val fnPtr = IVector_NotificationBinding__VtblPtr!!.getPointer(17L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(IVector_NotificationBinding__Ptr, items.size, items,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIVector_NotificationBinding_(pointer.getPointer(0))

    public fun setValue(`value`: IVector_NotificationBinding__Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IVector_NotificationBinding__Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IVector_NotificationBinding_ {
    public override val IVector_NotificationBinding__Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val PIID: Guid.IID = Guid.IID("7f7d8ad7b4d25a03be6f2b89875fb32d")

    public val IID: Guid.IID = Guid.IID("913337e911a14345a3a24e7f956e222d")

    public fun makeIVector_NotificationBinding_(ptr: Pointer?): IVector_NotificationBinding_ =
        IVector_NotificationBinding__Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IVector_NotificationBinding_):
        Array<IVector_NotificationBinding_> = (elements as
        Array<IVector_NotificationBinding_>).castToImpl<IVector_NotificationBinding_,IVector_NotificationBinding__Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVector_NotificationBinding_?> =
        arrayOfNulls<IVector_NotificationBinding__Impl>(size) as
        Array<IVector_NotificationBinding_?>
  }
}

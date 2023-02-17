package Windows.Foundation.Collections

import Windows.Foundation.EventRegistrationToken
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

public interface IObservableMap_String_String_ : NativeMapped, IWinRTInterface {
  public val IObservableMap_String_String__Ptr: Pointer?

  public val IObservableMap_String_String__VtblPtr: Pointer?
    get() = IObservableMap_String_String__Ptr?.getPointer(0)

  public fun add_MapChanged(vhnd: MapChangedEventHandler_String_String_): EventRegistrationToken {
    val fnPtr = IObservableMap_String_String__VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.EventRegistrationToken.ByReference()
    val hr = fn.invokeHR(arrayOf(IObservableMap_String_String__Ptr, vhnd, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun remove_MapChanged(token: EventRegistrationToken.ByValue): Unit {
    val fnPtr = IObservableMap_String_String__VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(IObservableMap_String_String__Ptr, token,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIObservableMap_String_String_(pointer.getPointer(0))

    public fun setValue(`value`: IObservableMap_String_String__Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IObservableMap_String_String__Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IObservableMap_String_String_ {
    public override val IObservableMap_String_String__Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val PIID: Guid.IID = Guid.IID("1e0362762f6055f6b7f3f86079e6900b")

    public val IID: Guid.IID = Guid.IID("65df2bf5bf3941b5aebc5a9d865e472b")

    public fun makeIObservableMap_String_String_(ptr: Pointer?): IObservableMap_String_String_ =
        IObservableMap_String_String__Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IObservableMap_String_String_):
        Array<IObservableMap_String_String_> = (elements as
        Array<IObservableMap_String_String_>).castToImpl<IObservableMap_String_String_,IObservableMap_String_String__Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IObservableMap_String_String_?> =
        arrayOfNulls<IObservableMap_String_String__Impl>(size) as
        Array<IObservableMap_String_String_?>
  }
}
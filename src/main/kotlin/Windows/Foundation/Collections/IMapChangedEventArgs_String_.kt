package Windows.Foundation.Collections

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

public interface IMapChangedEventArgs_String_ : NativeMapped, IWinRTInterface {
  public val IMapChangedEventArgs_String__Ptr: Pointer?

  public val IMapChangedEventArgs_String__VtblPtr: Pointer?
    get() = IMapChangedEventArgs_String__Ptr?.getPointer(0)

  public fun get_CollectionChange(): CollectionChange {
    val fnPtr = IMapChangedEventArgs_String__VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.Collections.CollectionChange.ByReference()
    val hr = fn.invokeHR(arrayOf(IMapChangedEventArgs_String__Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun get_Key(): String {
    val fnPtr = IMapChangedEventArgs_String__VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(IMapChangedEventArgs_String__Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIMapChangedEventArgs_String_(pointer.getPointer(0))

    public fun setValue(`value`: IMapChangedEventArgs_String__Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IMapChangedEventArgs_String__Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IMapChangedEventArgs_String_ {
    public override val IMapChangedEventArgs_String__Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val PIID: Guid.IID = Guid.IID("60141efbf2f9537796fdf8c60d9558b5")

    public val IID: Guid.IID = Guid.IID("9939f4df050a4c0faa6077075f9c4777")

    public fun makeIMapChangedEventArgs_String_(ptr: Pointer?): IMapChangedEventArgs_String_ =
        IMapChangedEventArgs_String__Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IMapChangedEventArgs_String_):
        Array<IMapChangedEventArgs_String_> = (elements as
        Array<IMapChangedEventArgs_String_>).castToImpl<IMapChangedEventArgs_String_,IMapChangedEventArgs_String__Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMapChangedEventArgs_String_?> =
        arrayOfNulls<IMapChangedEventArgs_String__Impl>(size) as
        Array<IMapChangedEventArgs_String_?>
  }
}

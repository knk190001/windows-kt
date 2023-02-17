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
import com.sun.jna.platform.win32.WinDef
import java.lang.RuntimeException
import kotlin.Array
import kotlin.Int
import kotlin.Unit

public interface IVectorChangedEventArgs : NativeMapped, IWinRTInterface {
  public val IVectorChangedEventArgs_Ptr: Pointer?

  public val IVectorChangedEventArgs_VtblPtr: Pointer?
    get() = IVectorChangedEventArgs_Ptr?.getPointer(0)

  public fun get_CollectionChange(): CollectionChange {
    val fnPtr = IVectorChangedEventArgs_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.Collections.CollectionChange.ByReference()
    val hr = fn.invokeHR(arrayOf(IVectorChangedEventArgs_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun get_Index(): WinDef.UINT {
    val fnPtr = IVectorChangedEventArgs_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinDef.UINTByReference()
    val hr = fn.invokeHR(arrayOf(IVectorChangedEventArgs_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIVectorChangedEventArgs(pointer.getPointer(0))

    public fun setValue(`value`: IVectorChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IVectorChangedEventArgs_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IVectorChangedEventArgs {
    public override val IVectorChangedEventArgs_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("575933df34fe4480af1507691f3d5d9b")

    public fun makeIVectorChangedEventArgs(ptr: Pointer?): IVectorChangedEventArgs =
        IVectorChangedEventArgs_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IVectorChangedEventArgs): Array<IVectorChangedEventArgs> =
        (elements as
        Array<IVectorChangedEventArgs>).castToImpl<IVectorChangedEventArgs,IVectorChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVectorChangedEventArgs?> =
        arrayOfNulls<IVectorChangedEventArgs_Impl>(size) as Array<IVectorChangedEventArgs?>
  }
}

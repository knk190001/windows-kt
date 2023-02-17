package Windows.ApplicationModel.Core

import Windows.ApplicationModel.AppDisplayInfo
import Windows.Foundation.IAsyncOperation_Boolean_
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

public interface IAppListEntry : NativeMapped, IWinRTInterface {
  public val IAppListEntry_Ptr: Pointer?

  public val IAppListEntry_VtblPtr: Pointer?
    get() = IAppListEntry_Ptr?.getPointer(0)

  public fun get_DisplayInfo(): AppDisplayInfo {
    val fnPtr = IAppListEntry_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.ApplicationModel.AppDisplayInfo.ByReference()
    val hr = fn.invokeHR(arrayOf(IAppListEntry_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun LaunchAsync(): IAsyncOperation_Boolean_ {
    val fnPtr = IAppListEntry_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.IAsyncOperation_Boolean_.ByReference()
    val hr = fn.invokeHR(arrayOf(IAppListEntry_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIAppListEntry(pointer.getPointer(0))

    public fun setValue(`value`: IAppListEntry_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IAppListEntry_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IAppListEntry {
    public override val IAppListEntry_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("ef00f07f2108490a877a8a9f17c25fad")

    public fun makeIAppListEntry(ptr: Pointer?): IAppListEntry = IAppListEntry_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IAppListEntry): Array<IAppListEntry> = (elements as
        Array<IAppListEntry>).castToImpl<IAppListEntry,IAppListEntry_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppListEntry?> =
        arrayOfNulls<IAppListEntry_Impl>(size) as Array<IAppListEntry?>
  }
}

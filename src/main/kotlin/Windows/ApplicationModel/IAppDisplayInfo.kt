package Windows.ApplicationModel

import Windows.Foundation.Size
import Windows.Storage.Streams.RandomAccessStreamReference
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

public interface IAppDisplayInfo : NativeMapped, IWinRTInterface {
  public val IAppDisplayInfo_Ptr: Pointer?

  public val IAppDisplayInfo_VtblPtr: Pointer?
    get() = IAppDisplayInfo_Ptr?.getPointer(0)

  public fun get_DisplayName(): String {
    val fnPtr = IAppDisplayInfo_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(IAppDisplayInfo_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public fun get_Description(): String {
    val fnPtr = IAppDisplayInfo_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(IAppDisplayInfo_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public fun GetLogo(size: Size.ByValue): RandomAccessStreamReference {
    val fnPtr = IAppDisplayInfo_VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Storage.Streams.RandomAccessStreamReference.ByReference()
    val hr = fn.invokeHR(arrayOf(IAppDisplayInfo_Ptr, size, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIAppDisplayInfo(pointer.getPointer(0))

    public fun setValue(`value`: IAppDisplayInfo_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IAppDisplayInfo_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IAppDisplayInfo {
    public override val IAppDisplayInfo_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("1aeb1103e4d441aaa4f6c4a276e79eac")

    public fun makeIAppDisplayInfo(ptr: Pointer?): IAppDisplayInfo = IAppDisplayInfo_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IAppDisplayInfo): Array<IAppDisplayInfo> = (elements as
        Array<IAppDisplayInfo>).castToImpl<IAppDisplayInfo,IAppDisplayInfo_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppDisplayInfo?> =
        arrayOfNulls<IAppDisplayInfo_Impl>(size) as Array<IAppDisplayInfo?>
  }
}

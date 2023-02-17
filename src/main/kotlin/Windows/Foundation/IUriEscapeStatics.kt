package Windows.Foundation

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

public interface IUriEscapeStatics : NativeMapped, IWinRTInterface {
  public val IUriEscapeStatics_Ptr: Pointer?

  public val IUriEscapeStatics_VtblPtr: Pointer?
    get() = IUriEscapeStatics_Ptr?.getPointer(0)

  public fun UnescapeComponent(toUnescape: String): String {
    val fnPtr = IUriEscapeStatics_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val toUnescape_Native = toUnescape.toHandle()
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(IUriEscapeStatics_Ptr, toUnescape_Native, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public fun EscapeComponent(toEscape: String): String {
    val fnPtr = IUriEscapeStatics_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val toEscape_Native = toEscape.toHandle()
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(IUriEscapeStatics_Ptr, toEscape_Native, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIUriEscapeStatics(pointer.getPointer(0))

    public fun setValue(`value`: IUriEscapeStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IUriEscapeStatics_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IUriEscapeStatics {
    public override val IUriEscapeStatics_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("c1d432bac8244452a7fd512bc3bbe9a1")

    public fun makeIUriEscapeStatics(ptr: Pointer?): IUriEscapeStatics = IUriEscapeStatics_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IUriEscapeStatics): Array<IUriEscapeStatics> = (elements
        as Array<IUriEscapeStatics>).castToImpl<IUriEscapeStatics,IUriEscapeStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUriEscapeStatics?> =
        arrayOfNulls<IUriEscapeStatics_Impl>(size) as Array<IUriEscapeStatics?>
  }
}

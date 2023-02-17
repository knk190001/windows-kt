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

public interface IWwwFormUrlDecoderEntry : NativeMapped, IWinRTInterface {
  public val IWwwFormUrlDecoderEntry_Ptr: Pointer?

  public val IWwwFormUrlDecoderEntry_VtblPtr: Pointer?
    get() = IWwwFormUrlDecoderEntry_Ptr?.getPointer(0)

  public fun get_Name(): String {
    val fnPtr = IWwwFormUrlDecoderEntry_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(IWwwFormUrlDecoderEntry_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public fun get_Value(): String {
    val fnPtr = IWwwFormUrlDecoderEntry_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(IWwwFormUrlDecoderEntry_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIWwwFormUrlDecoderEntry(pointer.getPointer(0))

    public fun setValue(`value`: IWwwFormUrlDecoderEntry_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IWwwFormUrlDecoderEntry_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IWwwFormUrlDecoderEntry {
    public override val IWwwFormUrlDecoderEntry_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("125e7431f6784e8eb67020a9b06c512d")

    public fun makeIWwwFormUrlDecoderEntry(ptr: Pointer?): IWwwFormUrlDecoderEntry =
        IWwwFormUrlDecoderEntry_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IWwwFormUrlDecoderEntry): Array<IWwwFormUrlDecoderEntry> =
        (elements as
        Array<IWwwFormUrlDecoderEntry>).castToImpl<IWwwFormUrlDecoderEntry,IWwwFormUrlDecoderEntry_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWwwFormUrlDecoderEntry?> =
        arrayOfNulls<IWwwFormUrlDecoderEntry_Impl>(size) as Array<IWwwFormUrlDecoderEntry?>
  }
}

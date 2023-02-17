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

public interface IUriRuntimeClassWithAbsoluteCanonicalUri : NativeMapped, IWinRTInterface {
  public val IUriRuntimeClassWithAbsoluteCanonicalUri_Ptr: Pointer?

  public val IUriRuntimeClassWithAbsoluteCanonicalUri_VtblPtr: Pointer?
    get() = IUriRuntimeClassWithAbsoluteCanonicalUri_Ptr?.getPointer(0)

  public fun get_AbsoluteCanonicalUri(): String {
    val fnPtr = IUriRuntimeClassWithAbsoluteCanonicalUri_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(IUriRuntimeClassWithAbsoluteCanonicalUri_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public fun get_DisplayIri(): String {
    val fnPtr = IUriRuntimeClassWithAbsoluteCanonicalUri_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(IUriRuntimeClassWithAbsoluteCanonicalUri_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIUriRuntimeClassWithAbsoluteCanonicalUri(pointer.getPointer(0))

    public fun setValue(`value`: IUriRuntimeClassWithAbsoluteCanonicalUri_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IUriRuntimeClassWithAbsoluteCanonicalUri_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IUriRuntimeClassWithAbsoluteCanonicalUri {
    public override val IUriRuntimeClassWithAbsoluteCanonicalUri_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("758d9661221c480fa33950656673f46f")

    public fun makeIUriRuntimeClassWithAbsoluteCanonicalUri(ptr: Pointer?):
        IUriRuntimeClassWithAbsoluteCanonicalUri =
        IUriRuntimeClassWithAbsoluteCanonicalUri_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IUriRuntimeClassWithAbsoluteCanonicalUri):
        Array<IUriRuntimeClassWithAbsoluteCanonicalUri> = (elements as
        Array<IUriRuntimeClassWithAbsoluteCanonicalUri>).castToImpl<IUriRuntimeClassWithAbsoluteCanonicalUri,IUriRuntimeClassWithAbsoluteCanonicalUri_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUriRuntimeClassWithAbsoluteCanonicalUri?> =
        arrayOfNulls<IUriRuntimeClassWithAbsoluteCanonicalUri_Impl>(size) as
        Array<IUriRuntimeClassWithAbsoluteCanonicalUri?>
  }
}

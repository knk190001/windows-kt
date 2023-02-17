package Windows.Data.Xml.Dom

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
import com.sun.jna.platform.win32.COM.Unknown
import com.sun.jna.platform.win32.Guid
import java.lang.RuntimeException
import kotlin.Array
import kotlin.Int
import kotlin.Unit

public interface IDtdNotation : NativeMapped, IWinRTInterface {
  public val IDtdNotation_Ptr: Pointer?

  public val IDtdNotation_VtblPtr: Pointer?
    get() = IDtdNotation_Ptr?.getPointer(0)

  public fun get_PublicId(): Unknown {
    val fnPtr = IDtdNotation_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = com.sun.jna.platform.win32.COM.Unknown.ByReference()
    val hr = fn.invokeHR(arrayOf(IDtdNotation_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun get_SystemId(): Unknown {
    val fnPtr = IDtdNotation_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = com.sun.jna.platform.win32.COM.Unknown.ByReference()
    val hr = fn.invokeHR(arrayOf(IDtdNotation_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIDtdNotation(pointer.getPointer(0))

    public fun setValue(`value`: IDtdNotation_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IDtdNotation_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IDtdNotation {
    public override val IDtdNotation_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("8cb4e04d6d464edbab73df83c51ad397")

    public fun makeIDtdNotation(ptr: Pointer?): IDtdNotation = IDtdNotation_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IDtdNotation): Array<IDtdNotation> = (elements as
        Array<IDtdNotation>).castToImpl<IDtdNotation,IDtdNotation_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDtdNotation?> =
        arrayOfNulls<IDtdNotation_Impl>(size) as Array<IDtdNotation?>
  }
}

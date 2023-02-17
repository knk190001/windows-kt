package Windows.Data.Text

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

public interface ISelectableWordSegment : NativeMapped, IWinRTInterface {
  public val ISelectableWordSegment_Ptr: Pointer?

  public val ISelectableWordSegment_VtblPtr: Pointer?
    get() = ISelectableWordSegment_Ptr?.getPointer(0)

  public fun get_Text(): String {
    val fnPtr = ISelectableWordSegment_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(ISelectableWordSegment_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public fun get_SourceTextSegment(): TextSegment {
    val fnPtr = ISelectableWordSegment_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Data.Text.TextSegment.ByReference()
    val hr = fn.invokeHR(arrayOf(ISelectableWordSegment_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeISelectableWordSegment(pointer.getPointer(0))

    public fun setValue(`value`: ISelectableWordSegment_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class ISelectableWordSegment_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), ISelectableWordSegment {
    public override val ISelectableWordSegment_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("916a4cb78aa74c78b3745dedb752e60b")

    public fun makeISelectableWordSegment(ptr: Pointer?): ISelectableWordSegment =
        ISelectableWordSegment_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: ISelectableWordSegment): Array<ISelectableWordSegment> =
        (elements as
        Array<ISelectableWordSegment>).castToImpl<ISelectableWordSegment,ISelectableWordSegment_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISelectableWordSegment?> =
        arrayOfNulls<ISelectableWordSegment_Impl>(size) as Array<ISelectableWordSegment?>
  }
}

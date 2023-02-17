package Windows.Storage.FileProperties

import Windows.Foundation.DateTime
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

public interface IBasicProperties : NativeMapped, IWinRTInterface {
  public val IBasicProperties_Ptr: Pointer?

  public val IBasicProperties_VtblPtr: Pointer?
    get() = IBasicProperties_Ptr?.getPointer(0)

  public fun get_Size(): WinDef.ULONG {
    val fnPtr = IBasicProperties_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinDef.ULONGByReference()
    val hr = fn.invokeHR(arrayOf(IBasicProperties_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun get_DateModified(): DateTime {
    val fnPtr = IBasicProperties_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.DateTime.ByReference()
    val hr = fn.invokeHR(arrayOf(IBasicProperties_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun get_ItemDate(): DateTime {
    val fnPtr = IBasicProperties_VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.DateTime.ByReference()
    val hr = fn.invokeHR(arrayOf(IBasicProperties_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIBasicProperties(pointer.getPointer(0))

    public fun setValue(`value`: IBasicProperties_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IBasicProperties_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IBasicProperties {
    public override val IBasicProperties_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("d05d55db785e4a66be029beec58aea81")

    public fun makeIBasicProperties(ptr: Pointer?): IBasicProperties = IBasicProperties_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IBasicProperties): Array<IBasicProperties> = (elements as
        Array<IBasicProperties>).castToImpl<IBasicProperties,IBasicProperties_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBasicProperties?> =
        arrayOfNulls<IBasicProperties_Impl>(size) as Array<IBasicProperties?>
  }
}

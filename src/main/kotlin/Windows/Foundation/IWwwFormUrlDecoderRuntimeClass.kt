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

public interface IWwwFormUrlDecoderRuntimeClass : NativeMapped, IWinRTInterface {
  public val IWwwFormUrlDecoderRuntimeClass_Ptr: Pointer?

  public val IWwwFormUrlDecoderRuntimeClass_VtblPtr: Pointer?
    get() = IWwwFormUrlDecoderRuntimeClass_Ptr?.getPointer(0)

  public fun GetFirstValueByName(name: String): String {
    val fnPtr = IWwwFormUrlDecoderRuntimeClass_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val name_Native = name.toHandle()
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(IWwwFormUrlDecoderRuntimeClass_Ptr, name_Native, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIWwwFormUrlDecoderRuntimeClass(pointer.getPointer(0))

    public fun setValue(`value`: IWwwFormUrlDecoderRuntimeClass_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IWwwFormUrlDecoderRuntimeClass_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IWwwFormUrlDecoderRuntimeClass {
    public override val IWwwFormUrlDecoderRuntimeClass_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("d45a0451f225454292960e1df5d254df")

    public fun makeIWwwFormUrlDecoderRuntimeClass(ptr: Pointer?): IWwwFormUrlDecoderRuntimeClass =
        IWwwFormUrlDecoderRuntimeClass_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IWwwFormUrlDecoderRuntimeClass):
        Array<IWwwFormUrlDecoderRuntimeClass> = (elements as
        Array<IWwwFormUrlDecoderRuntimeClass>).castToImpl<IWwwFormUrlDecoderRuntimeClass,IWwwFormUrlDecoderRuntimeClass_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWwwFormUrlDecoderRuntimeClass?> =
        arrayOfNulls<IWwwFormUrlDecoderRuntimeClass_Impl>(size) as
        Array<IWwwFormUrlDecoderRuntimeClass?>
  }
}

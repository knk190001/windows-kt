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
import com.sun.jna.platform.win32.Guid
import com.sun.jna.platform.win32.WinNT
import java.lang.RuntimeException
import kotlin.Array
import kotlin.Int
import kotlin.String
import kotlin.Unit

public interface IXmlProcessingInstruction : NativeMapped, IWinRTInterface {
  public val IXmlProcessingInstruction_Ptr: Pointer?

  public val IXmlProcessingInstruction_VtblPtr: Pointer?
    get() = IXmlProcessingInstruction_Ptr?.getPointer(0)

  public fun get_Target(): String {
    val fnPtr = IXmlProcessingInstruction_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(IXmlProcessingInstruction_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public fun get_Data(): String {
    val fnPtr = IXmlProcessingInstruction_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(IXmlProcessingInstruction_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public fun put_Data(`value`: String): Unit {
    val fnPtr = IXmlProcessingInstruction_VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val value_Native = value.toHandle()
    val hr = fn.invokeHR(arrayOf(IXmlProcessingInstruction_Ptr, value_Native,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIXmlProcessingInstruction(pointer.getPointer(0))

    public fun setValue(`value`: IXmlProcessingInstruction_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IXmlProcessingInstruction_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IXmlProcessingInstruction {
    public override val IXmlProcessingInstruction_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("2707fd1e1e924eceb6f426f069078ddc")

    public fun makeIXmlProcessingInstruction(ptr: Pointer?): IXmlProcessingInstruction =
        IXmlProcessingInstruction_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IXmlProcessingInstruction):
        Array<IXmlProcessingInstruction> = (elements as
        Array<IXmlProcessingInstruction>).castToImpl<IXmlProcessingInstruction,IXmlProcessingInstruction_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IXmlProcessingInstruction?> =
        arrayOfNulls<IXmlProcessingInstruction_Impl>(size) as Array<IXmlProcessingInstruction?>
  }
}

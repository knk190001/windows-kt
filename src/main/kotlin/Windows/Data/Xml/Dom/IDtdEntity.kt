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

public interface IDtdEntity : NativeMapped, IWinRTInterface {
  public val IDtdEntity_Ptr: Pointer?

  public val IDtdEntity_VtblPtr: Pointer?
    get() = IDtdEntity_Ptr?.getPointer(0)

  public fun get_PublicId(): Unknown {
    val fnPtr = IDtdEntity_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = com.sun.jna.platform.win32.COM.Unknown.ByReference()
    val hr = fn.invokeHR(arrayOf(IDtdEntity_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun get_SystemId(): Unknown {
    val fnPtr = IDtdEntity_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = com.sun.jna.platform.win32.COM.Unknown.ByReference()
    val hr = fn.invokeHR(arrayOf(IDtdEntity_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun get_NotationName(): Unknown {
    val fnPtr = IDtdEntity_VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = com.sun.jna.platform.win32.COM.Unknown.ByReference()
    val hr = fn.invokeHR(arrayOf(IDtdEntity_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIDtdEntity(pointer.getPointer(0))

    public fun setValue(`value`: IDtdEntity_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IDtdEntity_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IDtdEntity {
    public override val IDtdEntity_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("6a0b5ffc63b4480f9e6a8a92816aade4")

    public fun makeIDtdEntity(ptr: Pointer?): IDtdEntity = IDtdEntity_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IDtdEntity): Array<IDtdEntity> = (elements as
        Array<IDtdEntity>).castToImpl<IDtdEntity,IDtdEntity_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDtdEntity?> = arrayOfNulls<IDtdEntity_Impl>(size)
        as Array<IDtdEntity?>
  }
}

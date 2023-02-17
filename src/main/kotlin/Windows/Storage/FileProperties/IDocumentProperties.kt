package Windows.Storage.FileProperties

import Windows.Foundation.Collections.IVector_String_
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

public interface IDocumentProperties : NativeMapped, IWinRTInterface {
  public val IDocumentProperties_Ptr: Pointer?

  public val IDocumentProperties_VtblPtr: Pointer?
    get() = IDocumentProperties_Ptr?.getPointer(0)

  public fun get_Author(): IVector_String_ {
    val fnPtr = IDocumentProperties_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.Collections.IVector_String_.ByReference()
    val hr = fn.invokeHR(arrayOf(IDocumentProperties_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun get_Title(): String {
    val fnPtr = IDocumentProperties_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(IDocumentProperties_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public fun put_Title(`value`: String): Unit {
    val fnPtr = IDocumentProperties_VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val value_Native = value.toHandle()
    val hr = fn.invokeHR(arrayOf(IDocumentProperties_Ptr, value_Native,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun get_Keywords(): IVector_String_ {
    val fnPtr = IDocumentProperties_VtblPtr!!.getPointer(9L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.Collections.IVector_String_.ByReference()
    val hr = fn.invokeHR(arrayOf(IDocumentProperties_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun get_Comment(): String {
    val fnPtr = IDocumentProperties_VtblPtr!!.getPointer(10L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(IDocumentProperties_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public fun put_Comment(`value`: String): Unit {
    val fnPtr = IDocumentProperties_VtblPtr!!.getPointer(11L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val value_Native = value.toHandle()
    val hr = fn.invokeHR(arrayOf(IDocumentProperties_Ptr, value_Native,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIDocumentProperties(pointer.getPointer(0))

    public fun setValue(`value`: IDocumentProperties_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IDocumentProperties_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IDocumentProperties {
    public override val IDocumentProperties_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("7eab19bc18214923b4a90aea404d0070")

    public fun makeIDocumentProperties(ptr: Pointer?): IDocumentProperties =
        IDocumentProperties_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IDocumentProperties): Array<IDocumentProperties> =
        (elements as
        Array<IDocumentProperties>).castToImpl<IDocumentProperties,IDocumentProperties_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDocumentProperties?> =
        arrayOfNulls<IDocumentProperties_Impl>(size) as Array<IDocumentProperties?>
  }
}

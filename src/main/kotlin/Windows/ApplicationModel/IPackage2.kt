package Windows.ApplicationModel

import Windows.Foundation.Uri
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
import com.sun.jna.ptr.ByteByReference
import java.lang.RuntimeException
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit

public interface IPackage2 : NativeMapped, IWinRTInterface {
  public val IPackage2_Ptr: Pointer?

  public val IPackage2_VtblPtr: Pointer?
    get() = IPackage2_Ptr?.getPointer(0)

  public fun get_DisplayName(): String {
    val fnPtr = IPackage2_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(IPackage2_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public fun get_PublisherDisplayName(): String {
    val fnPtr = IPackage2_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(IPackage2_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public fun get_Description(): String {
    val fnPtr = IPackage2_VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(IPackage2_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public fun get_Logo(): Uri {
    val fnPtr = IPackage2_VtblPtr!!.getPointer(9L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.Uri.ByReference()
    val hr = fn.invokeHR(arrayOf(IPackage2_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun get_IsResourcePackage(): Boolean {
    val fnPtr = IPackage2_VtblPtr!!.getPointer(10L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = ByteByReference()
    val hr = fn.invokeHR(arrayOf(IPackage2_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue != 0.toByte()
    return resultValue_Managed
  }

  public fun get_IsBundle(): Boolean {
    val fnPtr = IPackage2_VtblPtr!!.getPointer(11L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = ByteByReference()
    val hr = fn.invokeHR(arrayOf(IPackage2_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue != 0.toByte()
    return resultValue_Managed
  }

  public fun get_IsDevelopmentMode(): Boolean {
    val fnPtr = IPackage2_VtblPtr!!.getPointer(12L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = ByteByReference()
    val hr = fn.invokeHR(arrayOf(IPackage2_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue != 0.toByte()
    return resultValue_Managed
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIPackage2(pointer.getPointer(0))

    public fun setValue(`value`: IPackage2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IPackage2_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IPackage2 {
    public override val IPackage2_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("a6612fb676884ace95fb359538e7aa01")

    public fun makeIPackage2(ptr: Pointer?): IPackage2 = IPackage2_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IPackage2): Array<IPackage2> = (elements as
        Array<IPackage2>).castToImpl<IPackage2,IPackage2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPackage2?> = arrayOfNulls<IPackage2_Impl>(size)
        as Array<IPackage2?>
  }
}

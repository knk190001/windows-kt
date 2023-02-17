package Windows.Foundation.Collections

import Windows.Data.Json.IJsonValue
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
import com.sun.jna.ptr.ByteByReference
import java.lang.RuntimeException
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit

public interface IVectorView_IJsonValue_ : NativeMapped, IWinRTInterface {
  public val IVectorView_IJsonValue__Ptr: Pointer?

  public val IVectorView_IJsonValue__VtblPtr: Pointer?
    get() = IVectorView_IJsonValue__Ptr?.getPointer(0)

  public fun GetAt(index: WinDef.UINT): IJsonValue {
    val fnPtr = IVectorView_IJsonValue__VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Data.Json.IJsonValue.ByReference()
    val hr = fn.invokeHR(arrayOf(IVectorView_IJsonValue__Ptr, index, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun get_Size(): WinDef.UINT {
    val fnPtr = IVectorView_IJsonValue__VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinDef.UINTByReference()
    val hr = fn.invokeHR(arrayOf(IVectorView_IJsonValue__Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun IndexOf(`value`: IJsonValue, index: WinDef.UINT): Boolean {
    val fnPtr = IVectorView_IJsonValue__VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = ByteByReference()
    val hr = fn.invokeHR(arrayOf(IVectorView_IJsonValue__Ptr, value, index, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue != 0.toByte()
    return resultValue_Managed
  }

  public fun GetMany(startIndex: WinDef.UINT, items: Array<IJsonValue?>): WinDef.UINT {
    val fnPtr = IVectorView_IJsonValue__VtblPtr!!.getPointer(9L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinDef.UINTByReference()
    val hr = fn.invokeHR(arrayOf(IVectorView_IJsonValue__Ptr, startIndex, items.size, items,
        result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIVectorView_IJsonValue_(pointer.getPointer(0))

    public fun setValue(`value`: IVectorView_IJsonValue__Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IVectorView_IJsonValue__Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IVectorView_IJsonValue_ {
    public override val IVectorView_IJsonValue__Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val PIID: Guid.IID = Guid.IID("cffabb0f6bc45ff69b9e7a9df6c687c8")

    public val IID: Guid.IID = Guid.IID("bbe1fa4cb0e34583baef1f1b2e483e56")

    public fun makeIVectorView_IJsonValue_(ptr: Pointer?): IVectorView_IJsonValue_ =
        IVectorView_IJsonValue__Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IVectorView_IJsonValue_): Array<IVectorView_IJsonValue_> =
        (elements as
        Array<IVectorView_IJsonValue_>).castToImpl<IVectorView_IJsonValue_,IVectorView_IJsonValue__Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVectorView_IJsonValue_?> =
        arrayOfNulls<IVectorView_IJsonValue__Impl>(size) as Array<IVectorView_IJsonValue_?>
  }
}

package Windows.Foundation.Collections

import Windows.ApplicationModel.PackageContentGroup
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

public interface IVectorView_PackageContentGroup_ : NativeMapped, IWinRTInterface {
  public val IVectorView_PackageContentGroup__Ptr: Pointer?

  public val IVectorView_PackageContentGroup__VtblPtr: Pointer?
    get() = IVectorView_PackageContentGroup__Ptr?.getPointer(0)

  public fun GetAt(index: WinDef.UINT): PackageContentGroup {
    val fnPtr = IVectorView_PackageContentGroup__VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.ApplicationModel.PackageContentGroup.ByReference()
    val hr = fn.invokeHR(arrayOf(IVectorView_PackageContentGroup__Ptr, index, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun get_Size(): WinDef.UINT {
    val fnPtr = IVectorView_PackageContentGroup__VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinDef.UINTByReference()
    val hr = fn.invokeHR(arrayOf(IVectorView_PackageContentGroup__Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun IndexOf(`value`: PackageContentGroup, index: WinDef.UINT): Boolean {
    val fnPtr = IVectorView_PackageContentGroup__VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = ByteByReference()
    val hr = fn.invokeHR(arrayOf(IVectorView_PackageContentGroup__Ptr, value, index, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue != 0.toByte()
    return resultValue_Managed
  }

  public fun GetMany(startIndex: WinDef.UINT, items: Array<PackageContentGroup?>): WinDef.UINT {
    val fnPtr = IVectorView_PackageContentGroup__VtblPtr!!.getPointer(9L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinDef.UINTByReference()
    val hr = fn.invokeHR(arrayOf(IVectorView_PackageContentGroup__Ptr, startIndex, items.size,
        items, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIVectorView_PackageContentGroup_(pointer.getPointer(0))

    public fun setValue(`value`: IVectorView_PackageContentGroup__Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IVectorView_PackageContentGroup__Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IVectorView_PackageContentGroup_ {
    public override val IVectorView_PackageContentGroup__Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val PIID: Guid.IID = Guid.IID("deae10f105465e61bd3fe05da30078ac")

    public val IID: Guid.IID = Guid.IID("bbe1fa4cb0e34583baef1f1b2e483e56")

    public fun makeIVectorView_PackageContentGroup_(ptr: Pointer?): IVectorView_PackageContentGroup_
        = IVectorView_PackageContentGroup__Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IVectorView_PackageContentGroup_):
        Array<IVectorView_PackageContentGroup_> = (elements as
        Array<IVectorView_PackageContentGroup_>).castToImpl<IVectorView_PackageContentGroup_,IVectorView_PackageContentGroup__Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVectorView_PackageContentGroup_?> =
        arrayOfNulls<IVectorView_PackageContentGroup__Impl>(size) as
        Array<IVectorView_PackageContentGroup_?>
  }
}

package Windows.Foundation.Collections

import Windows.System.User
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

public interface IVectorView_User_ : NativeMapped, IWinRTInterface {
  public val IVectorView_User__Ptr: Pointer?

  public val IVectorView_User__VtblPtr: Pointer?
    get() = IVectorView_User__Ptr?.getPointer(0)

  public fun GetAt(index: WinDef.UINT): User {
    val fnPtr = IVectorView_User__VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.System.User.ByReference()
    val hr = fn.invokeHR(arrayOf(IVectorView_User__Ptr, index, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun get_Size(): WinDef.UINT {
    val fnPtr = IVectorView_User__VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinDef.UINTByReference()
    val hr = fn.invokeHR(arrayOf(IVectorView_User__Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun IndexOf(`value`: User, index: WinDef.UINT): Boolean {
    val fnPtr = IVectorView_User__VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = ByteByReference()
    val hr = fn.invokeHR(arrayOf(IVectorView_User__Ptr, value, index, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue != 0.toByte()
    return resultValue_Managed
  }

  public fun GetMany(startIndex: WinDef.UINT, items: Array<User?>): WinDef.UINT {
    val fnPtr = IVectorView_User__VtblPtr!!.getPointer(9L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinDef.UINTByReference()
    val hr = fn.invokeHR(arrayOf(IVectorView_User__Ptr, startIndex, items.size, items, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIVectorView_User_(pointer.getPointer(0))

    public fun setValue(`value`: IVectorView_User__Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IVectorView_User__Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IVectorView_User_ {
    public override val IVectorView_User__Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val PIID: Guid.IID = Guid.IID("8cbd762a12225ee5b745489e7a42c6ec")

    public val IID: Guid.IID = Guid.IID("bbe1fa4cb0e34583baef1f1b2e483e56")

    public fun makeIVectorView_User_(ptr: Pointer?): IVectorView_User_ = IVectorView_User__Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IVectorView_User_): Array<IVectorView_User_> = (elements
        as Array<IVectorView_User_>).castToImpl<IVectorView_User_,IVectorView_User__Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVectorView_User_?> =
        arrayOfNulls<IVectorView_User__Impl>(size) as Array<IVectorView_User_?>
  }
}

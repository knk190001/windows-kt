package Windows.Foundation.Collections

import Windows.Storage.StorageFolder
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

public interface IVectorView_StorageFolder_ : NativeMapped, IWinRTInterface {
  public val IVectorView_StorageFolder__Ptr: Pointer?

  public val IVectorView_StorageFolder__VtblPtr: Pointer?
    get() = IVectorView_StorageFolder__Ptr?.getPointer(0)

  public fun GetAt(index: WinDef.UINT): StorageFolder {
    val fnPtr = IVectorView_StorageFolder__VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Storage.StorageFolder.ByReference()
    val hr = fn.invokeHR(arrayOf(IVectorView_StorageFolder__Ptr, index, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun get_Size(): WinDef.UINT {
    val fnPtr = IVectorView_StorageFolder__VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinDef.UINTByReference()
    val hr = fn.invokeHR(arrayOf(IVectorView_StorageFolder__Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun IndexOf(`value`: StorageFolder, index: WinDef.UINT): Boolean {
    val fnPtr = IVectorView_StorageFolder__VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = ByteByReference()
    val hr = fn.invokeHR(arrayOf(IVectorView_StorageFolder__Ptr, value, index, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue != 0.toByte()
    return resultValue_Managed
  }

  public fun GetMany(startIndex: WinDef.UINT, items: Array<StorageFolder?>): WinDef.UINT {
    val fnPtr = IVectorView_StorageFolder__VtblPtr!!.getPointer(9L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinDef.UINTByReference()
    val hr = fn.invokeHR(arrayOf(IVectorView_StorageFolder__Ptr, startIndex, items.size, items,
        result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIVectorView_StorageFolder_(pointer.getPointer(0))

    public fun setValue(`value`: IVectorView_StorageFolder__Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IVectorView_StorageFolder__Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IVectorView_StorageFolder_ {
    public override val IVectorView_StorageFolder__Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val PIID: Guid.IID = Guid.IID("e20debc6dc4e542ea2e7a24d19c8dd62")

    public val IID: Guid.IID = Guid.IID("bbe1fa4cb0e34583baef1f1b2e483e56")

    public fun makeIVectorView_StorageFolder_(ptr: Pointer?): IVectorView_StorageFolder_ =
        IVectorView_StorageFolder__Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IVectorView_StorageFolder_):
        Array<IVectorView_StorageFolder_> = (elements as
        Array<IVectorView_StorageFolder_>).castToImpl<IVectorView_StorageFolder_,IVectorView_StorageFolder__Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVectorView_StorageFolder_?> =
        arrayOfNulls<IVectorView_StorageFolder__Impl>(size) as Array<IVectorView_StorageFolder_?>
  }
}

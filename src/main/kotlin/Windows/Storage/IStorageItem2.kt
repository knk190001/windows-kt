package Windows.Storage

import Windows.Foundation.IAsyncOperation_StorageFolder_
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
import com.sun.jna.ptr.ByteByReference
import java.lang.RuntimeException
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit

public interface IStorageItem2 : NativeMapped, IWinRTInterface {
  public val IStorageItem2_Ptr: Pointer?

  public val IStorageItem2_VtblPtr: Pointer?
    get() = IStorageItem2_Ptr?.getPointer(0)

  public fun GetParentAsync(): IAsyncOperation_StorageFolder_ {
    val fnPtr = IStorageItem2_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.IAsyncOperation_StorageFolder_.ByReference()
    val hr = fn.invokeHR(arrayOf(IStorageItem2_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun IsEqual(item: IStorageItem): Boolean {
    val fnPtr = IStorageItem2_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = ByteByReference()
    val hr = fn.invokeHR(arrayOf(IStorageItem2_Ptr, item, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue != 0.toByte()
    return resultValue_Managed
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIStorageItem2(pointer.getPointer(0))

    public fun setValue(`value`: IStorageItem2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IStorageItem2_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IStorageItem2 {
    public override val IStorageItem2_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("53f926d2083c4283b45b81c007237e44")

    public fun makeIStorageItem2(ptr: Pointer?): IStorageItem2 = IStorageItem2_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IStorageItem2): Array<IStorageItem2> = (elements as
        Array<IStorageItem2>).castToImpl<IStorageItem2,IStorageItem2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStorageItem2?> =
        arrayOfNulls<IStorageItem2_Impl>(size) as Array<IStorageItem2?>
  }
}

package Windows.Storage

import Windows.Foundation.IAsyncAction
import Windows.Storage.Streams.IRandomAccessStream
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
import java.lang.RuntimeException
import kotlin.Array
import kotlin.Int
import kotlin.Unit

public interface IStorageStreamTransaction : NativeMapped, IWinRTInterface {
  public val IStorageStreamTransaction_Ptr: Pointer?

  public val IStorageStreamTransaction_VtblPtr: Pointer?
    get() = IStorageStreamTransaction_Ptr?.getPointer(0)

  public fun get_Stream(): IRandomAccessStream {
    val fnPtr = IStorageStreamTransaction_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Storage.Streams.IRandomAccessStream.ByReference()
    val hr = fn.invokeHR(arrayOf(IStorageStreamTransaction_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun CommitAsync(): IAsyncAction {
    val fnPtr = IStorageStreamTransaction_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.IAsyncAction.ByReference()
    val hr = fn.invokeHR(arrayOf(IStorageStreamTransaction_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIStorageStreamTransaction(pointer.getPointer(0))

    public fun setValue(`value`: IStorageStreamTransaction_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IStorageStreamTransaction_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IStorageStreamTransaction {
    public override val IStorageStreamTransaction_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("f67cf363a53d4d94ae2c67232d93acdd")

    public fun makeIStorageStreamTransaction(ptr: Pointer?): IStorageStreamTransaction =
        IStorageStreamTransaction_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IStorageStreamTransaction):
        Array<IStorageStreamTransaction> = (elements as
        Array<IStorageStreamTransaction>).castToImpl<IStorageStreamTransaction,IStorageStreamTransaction_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStorageStreamTransaction?> =
        arrayOfNulls<IStorageStreamTransaction_Impl>(size) as Array<IStorageStreamTransaction?>
  }
}

package Windows.Storage

import Windows.Foundation.IAsyncOperation_StorageFolder_
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
import java.lang.RuntimeException
import kotlin.Array
import kotlin.Int
import kotlin.String
import kotlin.Unit

public interface IStorageFolderStatics2 : NativeMapped, IWinRTInterface {
  public val IStorageFolderStatics2_Ptr: Pointer?

  public val IStorageFolderStatics2_VtblPtr: Pointer?
    get() = IStorageFolderStatics2_Ptr?.getPointer(0)

  public fun GetFolderFromPathForUserAsync(user: User, path: String):
      IAsyncOperation_StorageFolder_ {
    val fnPtr = IStorageFolderStatics2_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val path_Native = path.toHandle()
    val result = Windows.Foundation.IAsyncOperation_StorageFolder_.ByReference()
    val hr = fn.invokeHR(arrayOf(IStorageFolderStatics2_Ptr, user, path_Native, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIStorageFolderStatics2(pointer.getPointer(0))

    public fun setValue(`value`: IStorageFolderStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IStorageFolderStatics2_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IStorageFolderStatics2 {
    public override val IStorageFolderStatics2_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("b4656dc371d2467d8b29371f0f62bf6f")

    public fun makeIStorageFolderStatics2(ptr: Pointer?): IStorageFolderStatics2 =
        IStorageFolderStatics2_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IStorageFolderStatics2): Array<IStorageFolderStatics2> =
        (elements as
        Array<IStorageFolderStatics2>).castToImpl<IStorageFolderStatics2,IStorageFolderStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStorageFolderStatics2?> =
        arrayOfNulls<IStorageFolderStatics2_Impl>(size) as Array<IStorageFolderStatics2?>
  }
}

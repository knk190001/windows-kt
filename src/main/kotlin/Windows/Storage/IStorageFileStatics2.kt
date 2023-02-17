package Windows.Storage

import Windows.Foundation.IAsyncOperation_StorageFile_
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

public interface IStorageFileStatics2 : NativeMapped, IWinRTInterface {
  public val IStorageFileStatics2_Ptr: Pointer?

  public val IStorageFileStatics2_VtblPtr: Pointer?
    get() = IStorageFileStatics2_Ptr?.getPointer(0)

  public fun GetFileFromPathForUserAsync(user: User, path: String): IAsyncOperation_StorageFile_ {
    val fnPtr = IStorageFileStatics2_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val path_Native = path.toHandle()
    val result = Windows.Foundation.IAsyncOperation_StorageFile_.ByReference()
    val hr = fn.invokeHR(arrayOf(IStorageFileStatics2_Ptr, user, path_Native, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIStorageFileStatics2(pointer.getPointer(0))

    public fun setValue(`value`: IStorageFileStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IStorageFileStatics2_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IStorageFileStatics2 {
    public override val IStorageFileStatics2_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("5c76a781212e4af98f04740cae108974")

    public fun makeIStorageFileStatics2(ptr: Pointer?): IStorageFileStatics2 =
        IStorageFileStatics2_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IStorageFileStatics2): Array<IStorageFileStatics2> =
        (elements as
        Array<IStorageFileStatics2>).castToImpl<IStorageFileStatics2,IStorageFileStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStorageFileStatics2?> =
        arrayOfNulls<IStorageFileStatics2_Impl>(size) as Array<IStorageFileStatics2?>
  }
}

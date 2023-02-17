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
import java.lang.RuntimeException
import kotlin.Array
import kotlin.Int
import kotlin.String
import kotlin.Unit

public interface IStorageFolderStatics : NativeMapped, IWinRTInterface {
  public val IStorageFolderStatics_Ptr: Pointer?

  public val IStorageFolderStatics_VtblPtr: Pointer?
    get() = IStorageFolderStatics_Ptr?.getPointer(0)

  public fun GetFolderFromPathAsync(path: String): IAsyncOperation_StorageFolder_ {
    val fnPtr = IStorageFolderStatics_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val path_Native = path.toHandle()
    val result = Windows.Foundation.IAsyncOperation_StorageFolder_.ByReference()
    val hr = fn.invokeHR(arrayOf(IStorageFolderStatics_Ptr, path_Native, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIStorageFolderStatics(pointer.getPointer(0))

    public fun setValue(`value`: IStorageFolderStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IStorageFolderStatics_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IStorageFolderStatics {
    public override val IStorageFolderStatics_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("08f327ff85d548b9aee928511e339f9f")

    public fun makeIStorageFolderStatics(ptr: Pointer?): IStorageFolderStatics =
        IStorageFolderStatics_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IStorageFolderStatics): Array<IStorageFolderStatics> =
        (elements as
        Array<IStorageFolderStatics>).castToImpl<IStorageFolderStatics,IStorageFolderStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStorageFolderStatics?> =
        arrayOfNulls<IStorageFolderStatics_Impl>(size) as Array<IStorageFolderStatics?>
  }
}

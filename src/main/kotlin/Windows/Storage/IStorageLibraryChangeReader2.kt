package Windows.Storage

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
import java.lang.RuntimeException
import kotlin.Array
import kotlin.Int
import kotlin.Unit

public interface IStorageLibraryChangeReader2 : NativeMapped, IWinRTInterface {
  public val IStorageLibraryChangeReader2_Ptr: Pointer?

  public val IStorageLibraryChangeReader2_VtblPtr: Pointer?
    get() = IStorageLibraryChangeReader2_Ptr?.getPointer(0)

  public fun GetLastChangeId(): WinDef.ULONG {
    val fnPtr = IStorageLibraryChangeReader2_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinDef.ULONGByReference()
    val hr = fn.invokeHR(arrayOf(IStorageLibraryChangeReader2_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIStorageLibraryChangeReader2(pointer.getPointer(0))

    public fun setValue(`value`: IStorageLibraryChangeReader2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IStorageLibraryChangeReader2_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IStorageLibraryChangeReader2 {
    public override val IStorageLibraryChangeReader2_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("abf4868bfbcc4a4f999ee7ab7c646dbe")

    public fun makeIStorageLibraryChangeReader2(ptr: Pointer?): IStorageLibraryChangeReader2 =
        IStorageLibraryChangeReader2_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IStorageLibraryChangeReader2):
        Array<IStorageLibraryChangeReader2> = (elements as
        Array<IStorageLibraryChangeReader2>).castToImpl<IStorageLibraryChangeReader2,IStorageLibraryChangeReader2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStorageLibraryChangeReader2?> =
        arrayOfNulls<IStorageLibraryChangeReader2_Impl>(size) as
        Array<IStorageLibraryChangeReader2?>
  }
}

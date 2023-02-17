package Windows.Storage.Streams

import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.handleToString
import com.github.knk190001.winrtbinding.runtime.interfaces.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.interfaces.getValue
import com.github.knk190001.winrtbinding.runtime.invokeHR
import com.github.knk190001.winrtbinding.runtime.makeOutArray
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import kotlin.Array
import kotlin.Int
import kotlin.Unit

public interface IRandomAccessStreamWithContentType : NativeMapped, IWinRTInterface {
  public val IRandomAccessStreamWithContentType_Ptr: Pointer?

  public val IRandomAccessStreamWithContentType_VtblPtr: Pointer?
    get() = IRandomAccessStreamWithContentType_Ptr?.getPointer(0)

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIRandomAccessStreamWithContentType(pointer.getPointer(0))

    public fun setValue(`value`: IRandomAccessStreamWithContentType_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IRandomAccessStreamWithContentType_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IRandomAccessStreamWithContentType {
    public override val IRandomAccessStreamWithContentType_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("cc2548274b3d438f923210c76bc7e038")

    public fun makeIRandomAccessStreamWithContentType(ptr: Pointer?):
        IRandomAccessStreamWithContentType = IRandomAccessStreamWithContentType_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IRandomAccessStreamWithContentType):
        Array<IRandomAccessStreamWithContentType> = (elements as
        Array<IRandomAccessStreamWithContentType>).castToImpl<IRandomAccessStreamWithContentType,IRandomAccessStreamWithContentType_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRandomAccessStreamWithContentType?> =
        arrayOfNulls<IRandomAccessStreamWithContentType_Impl>(size) as
        Array<IRandomAccessStreamWithContentType?>
  }
}

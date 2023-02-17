package Windows.Storage.Search

import Windows.Foundation.Collections.IMap_String_IVectorView_TextSegment__
import Windows.Storage.StorageFile
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

public interface IStorageFileQueryResult2 : NativeMapped, IWinRTInterface {
  public val IStorageFileQueryResult2_Ptr: Pointer?

  public val IStorageFileQueryResult2_VtblPtr: Pointer?
    get() = IStorageFileQueryResult2_Ptr?.getPointer(0)

  public fun GetMatchingPropertiesWithRanges(`file`: StorageFile):
      IMap_String_IVectorView_TextSegment__ {
    val fnPtr = IStorageFileQueryResult2_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.Collections.IMap_String_IVectorView_TextSegment__.ByReference()
    val hr = fn.invokeHR(arrayOf(IStorageFileQueryResult2_Ptr, file, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIStorageFileQueryResult2(pointer.getPointer(0))

    public fun setValue(`value`: IStorageFileQueryResult2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IStorageFileQueryResult2_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IStorageFileQueryResult2 {
    public override val IStorageFileQueryResult2_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("4e5db9dd714146c48be3e9dc9e27275c")

    public fun makeIStorageFileQueryResult2(ptr: Pointer?): IStorageFileQueryResult2 =
        IStorageFileQueryResult2_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IStorageFileQueryResult2): Array<IStorageFileQueryResult2>
        = (elements as
        Array<IStorageFileQueryResult2>).castToImpl<IStorageFileQueryResult2,IStorageFileQueryResult2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStorageFileQueryResult2?> =
        arrayOfNulls<IStorageFileQueryResult2_Impl>(size) as Array<IStorageFileQueryResult2?>
  }
}

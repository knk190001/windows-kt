package Windows.Foundation.Collections

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

public interface IPropertySet : NativeMapped, IWinRTInterface {
  public val IPropertySet_Ptr: Pointer?

  public val IPropertySet_VtblPtr: Pointer?
    get() = IPropertySet_Ptr?.getPointer(0)

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIPropertySet(pointer.getPointer(0))

    public fun setValue(`value`: IPropertySet_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IPropertySet_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IPropertySet {
    public override val IPropertySet_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("8a43ed9ff4e64421acf91dab2986820c")

    public fun makeIPropertySet(ptr: Pointer?): IPropertySet = IPropertySet_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IPropertySet): Array<IPropertySet> = (elements as
        Array<IPropertySet>).castToImpl<IPropertySet,IPropertySet_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPropertySet?> =
        arrayOfNulls<IPropertySet_Impl>(size) as Array<IPropertySet?>
  }
}

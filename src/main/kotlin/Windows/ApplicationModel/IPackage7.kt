package Windows.ApplicationModel

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
import java.lang.RuntimeException
import kotlin.Array
import kotlin.Int
import kotlin.Unit

public interface IPackage7 : NativeMapped, IWinRTInterface {
  public val IPackage7_Ptr: Pointer?

  public val IPackage7_VtblPtr: Pointer?
    get() = IPackage7_Ptr?.getPointer(0)

  public fun get_MutableLocation(): StorageFolder {
    val fnPtr = IPackage7_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Storage.StorageFolder.ByReference()
    val hr = fn.invokeHR(arrayOf(IPackage7_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun get_EffectiveLocation(): StorageFolder {
    val fnPtr = IPackage7_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Storage.StorageFolder.ByReference()
    val hr = fn.invokeHR(arrayOf(IPackage7_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIPackage7(pointer.getPointer(0))

    public fun setValue(`value`: IPackage7_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IPackage7_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IPackage7 {
    public override val IPackage7_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("86ff8d31a2e445e09732283a6d88fde1")

    public fun makeIPackage7(ptr: Pointer?): IPackage7 = IPackage7_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IPackage7): Array<IPackage7> = (elements as
        Array<IPackage7>).castToImpl<IPackage7,IPackage7_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPackage7?> = arrayOfNulls<IPackage7_Impl>(size)
        as Array<IPackage7?>
  }
}

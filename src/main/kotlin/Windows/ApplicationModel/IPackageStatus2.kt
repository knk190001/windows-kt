package Windows.ApplicationModel

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

public interface IPackageStatus2 : NativeMapped, IWinRTInterface {
  public val IPackageStatus2_Ptr: Pointer?

  public val IPackageStatus2_VtblPtr: Pointer?
    get() = IPackageStatus2_Ptr?.getPointer(0)

  public fun get_IsPartiallyStaged(): Boolean {
    val fnPtr = IPackageStatus2_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = ByteByReference()
    val hr = fn.invokeHR(arrayOf(IPackageStatus2_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue != 0.toByte()
    return resultValue_Managed
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIPackageStatus2(pointer.getPointer(0))

    public fun setValue(`value`: IPackageStatus2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IPackageStatus2_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IPackageStatus2 {
    public override val IPackageStatus2_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("f428fa937c564862acfaabaedcc0694d")

    public fun makeIPackageStatus2(ptr: Pointer?): IPackageStatus2 = IPackageStatus2_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IPackageStatus2): Array<IPackageStatus2> = (elements as
        Array<IPackageStatus2>).castToImpl<IPackageStatus2,IPackageStatus2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPackageStatus2?> =
        arrayOfNulls<IPackageStatus2_Impl>(size) as Array<IPackageStatus2?>
  }
}

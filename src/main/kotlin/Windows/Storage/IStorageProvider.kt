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
import com.sun.jna.platform.win32.WinNT
import java.lang.RuntimeException
import kotlin.Array
import kotlin.Int
import kotlin.String
import kotlin.Unit

public interface IStorageProvider : NativeMapped, IWinRTInterface {
  public val IStorageProvider_Ptr: Pointer?

  public val IStorageProvider_VtblPtr: Pointer?
    get() = IStorageProvider_Ptr?.getPointer(0)

  public fun get_Id(): String {
    val fnPtr = IStorageProvider_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(IStorageProvider_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public fun get_DisplayName(): String {
    val fnPtr = IStorageProvider_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(IStorageProvider_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIStorageProvider(pointer.getPointer(0))

    public fun setValue(`value`: IStorageProvider_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IStorageProvider_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IStorageProvider {
    public override val IStorageProvider_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("e705eed4d47847d6ba461a8ebe114a20")

    public fun makeIStorageProvider(ptr: Pointer?): IStorageProvider = IStorageProvider_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IStorageProvider): Array<IStorageProvider> = (elements as
        Array<IStorageProvider>).castToImpl<IStorageProvider,IStorageProvider_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStorageProvider?> =
        arrayOfNulls<IStorageProvider_Impl>(size) as Array<IStorageProvider?>
  }
}

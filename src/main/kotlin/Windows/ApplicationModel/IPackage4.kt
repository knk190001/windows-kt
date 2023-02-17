package Windows.ApplicationModel

import Windows.Foundation.IAsyncOperation_Boolean_
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

public interface IPackage4 : NativeMapped, IWinRTInterface {
  public val IPackage4_Ptr: Pointer?

  public val IPackage4_VtblPtr: Pointer?
    get() = IPackage4_Ptr?.getPointer(0)

  public fun get_SignatureKind(): PackageSignatureKind {
    val fnPtr = IPackage4_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.ApplicationModel.PackageSignatureKind.ByReference()
    val hr = fn.invokeHR(arrayOf(IPackage4_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun get_IsOptional(): Boolean {
    val fnPtr = IPackage4_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = ByteByReference()
    val hr = fn.invokeHR(arrayOf(IPackage4_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue != 0.toByte()
    return resultValue_Managed
  }

  public fun VerifyContentIntegrityAsync(): IAsyncOperation_Boolean_ {
    val fnPtr = IPackage4_VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.IAsyncOperation_Boolean_.ByReference()
    val hr = fn.invokeHR(arrayOf(IPackage4_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIPackage4(pointer.getPointer(0))

    public fun setValue(`value`: IPackage4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IPackage4_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IPackage4 {
    public override val IPackage4_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("65aed1aeb95b450c882b6255187f397e")

    public fun makeIPackage4(ptr: Pointer?): IPackage4 = IPackage4_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IPackage4): Array<IPackage4> = (elements as
        Array<IPackage4>).castToImpl<IPackage4,IPackage4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPackage4?> = arrayOfNulls<IPackage4_Impl>(size)
        as Array<IPackage4?>
  }
}

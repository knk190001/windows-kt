package Windows.ApplicationModel

import Windows.Foundation.Collections.IIterable_String_
import Windows.Foundation.IAsyncOperation_Boolean_
import Windows.Foundation.IAsyncOperation_IVector_PackageContentGroup__
import Windows.Foundation.IAsyncOperation_PackageContentGroup_
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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit

public interface IPackage5 : NativeMapped, IWinRTInterface {
  public val IPackage5_Ptr: Pointer?

  public val IPackage5_VtblPtr: Pointer?
    get() = IPackage5_Ptr?.getPointer(0)

  public fun GetContentGroupsAsync(): IAsyncOperation_IVector_PackageContentGroup__ {
    val fnPtr = IPackage5_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.IAsyncOperation_IVector_PackageContentGroup__.ByReference()
    val hr = fn.invokeHR(arrayOf(IPackage5_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun GetContentGroupAsync(name: String): IAsyncOperation_PackageContentGroup_ {
    val fnPtr = IPackage5_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val name_Native = name.toHandle()
    val result = Windows.Foundation.IAsyncOperation_PackageContentGroup_.ByReference()
    val hr = fn.invokeHR(arrayOf(IPackage5_Ptr, name_Native, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun StageContentGroupsAsync(names: IIterable_String_):
      IAsyncOperation_IVector_PackageContentGroup__ {
    val fnPtr = IPackage5_VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.IAsyncOperation_IVector_PackageContentGroup__.ByReference()
    val hr = fn.invokeHR(arrayOf(IPackage5_Ptr, names, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun StageContentGroupsAsync(names: IIterable_String_, moveToHeadOfQueue: Boolean):
      IAsyncOperation_IVector_PackageContentGroup__ {
    val fnPtr = IPackage5_VtblPtr!!.getPointer(9L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val moveToHeadOfQueue_Native: Byte = if(moveToHeadOfQueue) 1 else 0 
    val result = Windows.Foundation.IAsyncOperation_IVector_PackageContentGroup__.ByReference()
    val hr = fn.invokeHR(arrayOf(IPackage5_Ptr, names, moveToHeadOfQueue_Native, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun SetInUseAsync(inUse: Boolean): IAsyncOperation_Boolean_ {
    val fnPtr = IPackage5_VtblPtr!!.getPointer(10L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val inUse_Native: Byte = if(inUse) 1 else 0 
    val result = Windows.Foundation.IAsyncOperation_Boolean_.ByReference()
    val hr = fn.invokeHR(arrayOf(IPackage5_Ptr, inUse_Native, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIPackage5(pointer.getPointer(0))

    public fun setValue(`value`: IPackage5_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IPackage5_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IPackage5 {
    public override val IPackage5_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("0e842dd4d9ac45ed9a1e74ce056b2635")

    public fun makeIPackage5(ptr: Pointer?): IPackage5 = IPackage5_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IPackage5): Array<IPackage5> = (elements as
        Array<IPackage5>).castToImpl<IPackage5,IPackage5_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPackage5?> = arrayOfNulls<IPackage5_Impl>(size)
        as Array<IPackage5?>
  }
}

package Windows.System

import Windows.Foundation.IAsyncOperation_IVectorView_User__
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

public interface IUserStatics : NativeMapped, IWinRTInterface {
  public val IUserStatics_Ptr: Pointer?

  public val IUserStatics_VtblPtr: Pointer?
    get() = IUserStatics_Ptr?.getPointer(0)

  public fun CreateWatcher(): UserWatcher {
    val fnPtr = IUserStatics_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.System.UserWatcher.ByReference()
    val hr = fn.invokeHR(arrayOf(IUserStatics_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun FindAllAsync(): IAsyncOperation_IVectorView_User__ {
    val fnPtr = IUserStatics_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.IAsyncOperation_IVectorView_User__.ByReference()
    val hr = fn.invokeHR(arrayOf(IUserStatics_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun FindAllAsync(type: UserType): IAsyncOperation_IVectorView_User__ {
    val fnPtr = IUserStatics_VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.IAsyncOperation_IVectorView_User__.ByReference()
    val hr = fn.invokeHR(arrayOf(IUserStatics_Ptr, type, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun FindAllAsync(type: UserType, status: UserAuthenticationStatus):
      IAsyncOperation_IVectorView_User__ {
    val fnPtr = IUserStatics_VtblPtr!!.getPointer(9L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.IAsyncOperation_IVectorView_User__.ByReference()
    val hr = fn.invokeHR(arrayOf(IUserStatics_Ptr, type, status, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun GetFromId(nonRoamableId: String): User {
    val fnPtr = IUserStatics_VtblPtr!!.getPointer(10L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val nonRoamableId_Native = nonRoamableId.toHandle()
    val result = Windows.System.User.ByReference()
    val hr = fn.invokeHR(arrayOf(IUserStatics_Ptr, nonRoamableId_Native, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIUserStatics(pointer.getPointer(0))

    public fun setValue(`value`: IUserStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IUserStatics_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IUserStatics {
    public override val IUserStatics_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("155eb23b242a45e0a2e93171fc6a7fdd")

    public fun makeIUserStatics(ptr: Pointer?): IUserStatics = IUserStatics_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IUserStatics): Array<IUserStatics> = (elements as
        Array<IUserStatics>).castToImpl<IUserStatics,IUserStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUserStatics?> =
        arrayOfNulls<IUserStatics_Impl>(size) as Array<IUserStatics?>
  }
}

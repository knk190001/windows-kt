package Windows.System

import Windows.Foundation.Collections.IVectorView_String_
import Windows.Foundation.IAsyncOperation_IPropertySet_
import Windows.Foundation.IAsyncOperation_IRandomAccessStreamReference_
import Windows.Foundation.IAsyncOperation_Object_
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

public interface IUser : NativeMapped, IWinRTInterface {
  public val IUser_Ptr: Pointer?

  public val IUser_VtblPtr: Pointer?
    get() = IUser_Ptr?.getPointer(0)

  public fun get_NonRoamableId(): String {
    val fnPtr = IUser_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(IUser_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public fun get_AuthenticationStatus(): UserAuthenticationStatus {
    val fnPtr = IUser_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.System.UserAuthenticationStatus.ByReference()
    val hr = fn.invokeHR(arrayOf(IUser_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun get_Type(): UserType {
    val fnPtr = IUser_VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.System.UserType.ByReference()
    val hr = fn.invokeHR(arrayOf(IUser_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun GetPropertyAsync(`value`: String): IAsyncOperation_Object_ {
    val fnPtr = IUser_VtblPtr!!.getPointer(9L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val value_Native = value.toHandle()
    val result = Windows.Foundation.IAsyncOperation_Object_.ByReference()
    val hr = fn.invokeHR(arrayOf(IUser_Ptr, value_Native, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun GetPropertiesAsync(values: IVectorView_String_): IAsyncOperation_IPropertySet_ {
    val fnPtr = IUser_VtblPtr!!.getPointer(10L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.IAsyncOperation_IPropertySet_.ByReference()
    val hr = fn.invokeHR(arrayOf(IUser_Ptr, values, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun GetPictureAsync(desiredSize: UserPictureSize):
      IAsyncOperation_IRandomAccessStreamReference_ {
    val fnPtr = IUser_VtblPtr!!.getPointer(11L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.IAsyncOperation_IRandomAccessStreamReference_.ByReference()
    val hr = fn.invokeHR(arrayOf(IUser_Ptr, desiredSize, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIUser(pointer.getPointer(0))

    public fun setValue(`value`: IUser_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IUser_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IUser {
    public override val IUser_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("df9a26c6e7464bcdb5d4120103c4209b")

    public fun makeIUser(ptr: Pointer?): IUser = IUser_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IUser): Array<IUser> = (elements as
        Array<IUser>).castToImpl<IUser,IUser_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUser?> = arrayOfNulls<IUser_Impl>(size) as
        Array<IUser?>
  }
}

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
import com.sun.jna.platform.win32.WinNT
import java.lang.RuntimeException
import kotlin.Array
import kotlin.Int
import kotlin.String
import kotlin.Unit

public interface IAppInfo : NativeMapped, IWinRTInterface {
  public val IAppInfo_Ptr: Pointer?

  public val IAppInfo_VtblPtr: Pointer?
    get() = IAppInfo_Ptr?.getPointer(0)

  public fun get_Id(): String {
    val fnPtr = IAppInfo_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(IAppInfo_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public fun get_AppUserModelId(): String {
    val fnPtr = IAppInfo_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(IAppInfo_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public fun get_DisplayInfo(): AppDisplayInfo {
    val fnPtr = IAppInfo_VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.ApplicationModel.AppDisplayInfo.ByReference()
    val hr = fn.invokeHR(arrayOf(IAppInfo_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun get_PackageFamilyName(): String {
    val fnPtr = IAppInfo_VtblPtr!!.getPointer(9L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(IAppInfo_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIAppInfo(pointer.getPointer(0))

    public fun setValue(`value`: IAppInfo_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IAppInfo_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IAppInfo {
    public override val IAppInfo_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("cf7f59b36a094de8a6c05792d56880d1")

    public fun makeIAppInfo(ptr: Pointer?): IAppInfo = IAppInfo_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IAppInfo): Array<IAppInfo> = (elements as
        Array<IAppInfo>).castToImpl<IAppInfo,IAppInfo_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppInfo?> = arrayOfNulls<IAppInfo_Impl>(size) as
        Array<IAppInfo?>
  }
}

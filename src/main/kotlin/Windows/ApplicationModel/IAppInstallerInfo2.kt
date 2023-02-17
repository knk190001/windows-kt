package Windows.ApplicationModel

import Windows.Foundation.Collections.IVectorView_Uri_
import Windows.Foundation.DateTime
import Windows.Foundation.IReference_DateTime_
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
import com.sun.jna.platform.win32.WinDef
import com.sun.jna.ptr.ByteByReference
import java.lang.RuntimeException
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit

public interface IAppInstallerInfo2 : NativeMapped, IWinRTInterface {
  public val IAppInstallerInfo2_Ptr: Pointer?

  public val IAppInstallerInfo2_VtblPtr: Pointer?
    get() = IAppInstallerInfo2_Ptr?.getPointer(0)

  public fun get_OnLaunch(): Boolean {
    val fnPtr = IAppInstallerInfo2_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = ByteByReference()
    val hr = fn.invokeHR(arrayOf(IAppInstallerInfo2_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue != 0.toByte()
    return resultValue_Managed
  }

  public fun get_HoursBetweenUpdateChecks(): WinDef.UINT {
    val fnPtr = IAppInstallerInfo2_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinDef.UINTByReference()
    val hr = fn.invokeHR(arrayOf(IAppInstallerInfo2_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun get_ShowPrompt(): Boolean {
    val fnPtr = IAppInstallerInfo2_VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = ByteByReference()
    val hr = fn.invokeHR(arrayOf(IAppInstallerInfo2_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue != 0.toByte()
    return resultValue_Managed
  }

  public fun get_UpdateBlocksActivation(): Boolean {
    val fnPtr = IAppInstallerInfo2_VtblPtr!!.getPointer(9L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = ByteByReference()
    val hr = fn.invokeHR(arrayOf(IAppInstallerInfo2_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue != 0.toByte()
    return resultValue_Managed
  }

  public fun get_AutomaticBackgroundTask(): Boolean {
    val fnPtr = IAppInstallerInfo2_VtblPtr!!.getPointer(10L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = ByteByReference()
    val hr = fn.invokeHR(arrayOf(IAppInstallerInfo2_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue != 0.toByte()
    return resultValue_Managed
  }

  public fun get_ForceUpdateFromAnyVersion(): Boolean {
    val fnPtr = IAppInstallerInfo2_VtblPtr!!.getPointer(11L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = ByteByReference()
    val hr = fn.invokeHR(arrayOf(IAppInstallerInfo2_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue != 0.toByte()
    return resultValue_Managed
  }

  public fun get_IsAutoRepairEnabled(): Boolean {
    val fnPtr = IAppInstallerInfo2_VtblPtr!!.getPointer(12L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = ByteByReference()
    val hr = fn.invokeHR(arrayOf(IAppInstallerInfo2_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue != 0.toByte()
    return resultValue_Managed
  }

  public fun get_Version(): PackageVersion {
    val fnPtr = IAppInstallerInfo2_VtblPtr!!.getPointer(13L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.ApplicationModel.PackageVersion.ByReference()
    val hr = fn.invokeHR(arrayOf(IAppInstallerInfo2_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun get_LastChecked(): DateTime {
    val fnPtr = IAppInstallerInfo2_VtblPtr!!.getPointer(14L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.DateTime.ByReference()
    val hr = fn.invokeHR(arrayOf(IAppInstallerInfo2_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun get_PausedUntil(): IReference_DateTime_ {
    val fnPtr = IAppInstallerInfo2_VtblPtr!!.getPointer(15L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.IReference_DateTime_.ByReference()
    val hr = fn.invokeHR(arrayOf(IAppInstallerInfo2_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun get_UpdateUris(): IVectorView_Uri_ {
    val fnPtr = IAppInstallerInfo2_VtblPtr!!.getPointer(16L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.Collections.IVectorView_Uri_.ByReference()
    val hr = fn.invokeHR(arrayOf(IAppInstallerInfo2_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun get_RepairUris(): IVectorView_Uri_ {
    val fnPtr = IAppInstallerInfo2_VtblPtr!!.getPointer(17L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.Collections.IVectorView_Uri_.ByReference()
    val hr = fn.invokeHR(arrayOf(IAppInstallerInfo2_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun get_DependencyPackageUris(): IVectorView_Uri_ {
    val fnPtr = IAppInstallerInfo2_VtblPtr!!.getPointer(18L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.Collections.IVectorView_Uri_.ByReference()
    val hr = fn.invokeHR(arrayOf(IAppInstallerInfo2_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun get_OptionalPackageUris(): IVectorView_Uri_ {
    val fnPtr = IAppInstallerInfo2_VtblPtr!!.getPointer(19L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.Collections.IVectorView_Uri_.ByReference()
    val hr = fn.invokeHR(arrayOf(IAppInstallerInfo2_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun get_PolicySource(): AppInstallerPolicySource {
    val fnPtr = IAppInstallerInfo2_VtblPtr!!.getPointer(20L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.ApplicationModel.AppInstallerPolicySource.ByReference()
    val hr = fn.invokeHR(arrayOf(IAppInstallerInfo2_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIAppInstallerInfo2(pointer.getPointer(0))

    public fun setValue(`value`: IAppInstallerInfo2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IAppInstallerInfo2_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IAppInstallerInfo2 {
    public override val IAppInstallerInfo2_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("d20f13888256597c8511c84ec50d5e2b")

    public fun makeIAppInstallerInfo2(ptr: Pointer?): IAppInstallerInfo2 =
        IAppInstallerInfo2_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IAppInstallerInfo2): Array<IAppInstallerInfo2> = (elements
        as Array<IAppInstallerInfo2>).castToImpl<IAppInstallerInfo2,IAppInstallerInfo2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppInstallerInfo2?> =
        arrayOfNulls<IAppInstallerInfo2_Impl>(size) as Array<IAppInstallerInfo2?>
  }
}

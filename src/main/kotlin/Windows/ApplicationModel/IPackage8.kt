package Windows.ApplicationModel

import Windows.Foundation.Collections.IVectorView_AppListEntry_
import Windows.Foundation.Size
import Windows.Storage.StorageFolder
import Windows.Storage.Streams.RandomAccessStreamReference
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
import com.sun.jna.ptr.ByteByReference
import java.lang.RuntimeException
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit

public interface IPackage8 : NativeMapped, IWinRTInterface {
  public val IPackage8_Ptr: Pointer?

  public val IPackage8_VtblPtr: Pointer?
    get() = IPackage8_Ptr?.getPointer(0)

  public fun get_EffectiveExternalLocation(): StorageFolder {
    val fnPtr = IPackage8_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Storage.StorageFolder.ByReference()
    val hr = fn.invokeHR(arrayOf(IPackage8_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun get_MachineExternalLocation(): StorageFolder {
    val fnPtr = IPackage8_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Storage.StorageFolder.ByReference()
    val hr = fn.invokeHR(arrayOf(IPackage8_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun get_UserExternalLocation(): StorageFolder {
    val fnPtr = IPackage8_VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Storage.StorageFolder.ByReference()
    val hr = fn.invokeHR(arrayOf(IPackage8_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun get_InstalledPath(): String {
    val fnPtr = IPackage8_VtblPtr!!.getPointer(9L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(IPackage8_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public fun get_MutablePath(): String {
    val fnPtr = IPackage8_VtblPtr!!.getPointer(10L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(IPackage8_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public fun get_EffectivePath(): String {
    val fnPtr = IPackage8_VtblPtr!!.getPointer(11L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(IPackage8_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public fun get_EffectiveExternalPath(): String {
    val fnPtr = IPackage8_VtblPtr!!.getPointer(12L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(IPackage8_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public fun get_MachineExternalPath(): String {
    val fnPtr = IPackage8_VtblPtr!!.getPointer(13L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(IPackage8_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public fun get_UserExternalPath(): String {
    val fnPtr = IPackage8_VtblPtr!!.getPointer(14L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(IPackage8_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public fun GetLogoAsRandomAccessStreamReference(size: Size.ByValue): RandomAccessStreamReference {
    val fnPtr = IPackage8_VtblPtr!!.getPointer(15L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Storage.Streams.RandomAccessStreamReference.ByReference()
    val hr = fn.invokeHR(arrayOf(IPackage8_Ptr, size, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun GetAppListEntries(): IVectorView_AppListEntry_ {
    val fnPtr = IPackage8_VtblPtr!!.getPointer(16L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.Collections.IVectorView_AppListEntry_.ByReference()
    val hr = fn.invokeHR(arrayOf(IPackage8_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun get_IsStub(): Boolean {
    val fnPtr = IPackage8_VtblPtr!!.getPointer(17L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = ByteByReference()
    val hr = fn.invokeHR(arrayOf(IPackage8_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue != 0.toByte()
    return resultValue_Managed
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIPackage8(pointer.getPointer(0))

    public fun setValue(`value`: IPackage8_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IPackage8_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IPackage8 {
    public override val IPackage8_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("2c584f7bce2a4be6a09377cfbb2a7ea1")

    public fun makeIPackage8(ptr: Pointer?): IPackage8 = IPackage8_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IPackage8): Array<IPackage8> = (elements as
        Array<IPackage8>).castToImpl<IPackage8,IPackage8_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPackage8?> = arrayOfNulls<IPackage8_Impl>(size)
        as Array<IPackage8?>
  }
}

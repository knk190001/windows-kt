package Windows.Storage

import Windows.Foundation.IAsyncOperation_IStorageItem_
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

public interface IStorageLibraryChange : NativeMapped, IWinRTInterface {
  public val IStorageLibraryChange_Ptr: Pointer?

  public val IStorageLibraryChange_VtblPtr: Pointer?
    get() = IStorageLibraryChange_Ptr?.getPointer(0)

  public fun get_ChangeType(): StorageLibraryChangeType {
    val fnPtr = IStorageLibraryChange_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Storage.StorageLibraryChangeType.ByReference()
    val hr = fn.invokeHR(arrayOf(IStorageLibraryChange_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun get_Path(): String {
    val fnPtr = IStorageLibraryChange_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(IStorageLibraryChange_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public fun get_PreviousPath(): String {
    val fnPtr = IStorageLibraryChange_VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(IStorageLibraryChange_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public fun IsOfType(type: StorageItemTypes): Boolean {
    val fnPtr = IStorageLibraryChange_VtblPtr!!.getPointer(9L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = ByteByReference()
    val hr = fn.invokeHR(arrayOf(IStorageLibraryChange_Ptr, type, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue != 0.toByte()
    return resultValue_Managed
  }

  public fun GetStorageItemAsync(): IAsyncOperation_IStorageItem_ {
    val fnPtr = IStorageLibraryChange_VtblPtr!!.getPointer(10L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.IAsyncOperation_IStorageItem_.ByReference()
    val hr = fn.invokeHR(arrayOf(IStorageLibraryChange_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIStorageLibraryChange(pointer.getPointer(0))

    public fun setValue(`value`: IStorageLibraryChange_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IStorageLibraryChange_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IStorageLibraryChange {
    public override val IStorageLibraryChange_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("00980b232be24909aa48159f5203a51e")

    public fun makeIStorageLibraryChange(ptr: Pointer?): IStorageLibraryChange =
        IStorageLibraryChange_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IStorageLibraryChange): Array<IStorageLibraryChange> =
        (elements as
        Array<IStorageLibraryChange>).castToImpl<IStorageLibraryChange,IStorageLibraryChange_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStorageLibraryChange?> =
        arrayOfNulls<IStorageLibraryChange_Impl>(size) as Array<IStorageLibraryChange?>
  }
}

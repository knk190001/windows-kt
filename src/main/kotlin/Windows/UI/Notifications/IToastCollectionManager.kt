package Windows.UI.Notifications

import Windows.Foundation.IAsyncAction
import Windows.Foundation.IAsyncOperation_IVectorView_ToastCollection__
import Windows.Foundation.IAsyncOperation_ToastCollection_
import Windows.System.User
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

public interface IToastCollectionManager : NativeMapped, IWinRTInterface {
  public val IToastCollectionManager_Ptr: Pointer?

  public val IToastCollectionManager_VtblPtr: Pointer?
    get() = IToastCollectionManager_Ptr?.getPointer(0)

  public fun SaveToastCollectionAsync(collection: ToastCollection): IAsyncAction {
    val fnPtr = IToastCollectionManager_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.IAsyncAction.ByReference()
    val hr = fn.invokeHR(arrayOf(IToastCollectionManager_Ptr, collection, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun FindAllToastCollectionsAsync(): IAsyncOperation_IVectorView_ToastCollection__ {
    val fnPtr = IToastCollectionManager_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.IAsyncOperation_IVectorView_ToastCollection__.ByReference()
    val hr = fn.invokeHR(arrayOf(IToastCollectionManager_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun GetToastCollectionAsync(collectionId: String): IAsyncOperation_ToastCollection_ {
    val fnPtr = IToastCollectionManager_VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val collectionId_Native = collectionId.toHandle()
    val result = Windows.Foundation.IAsyncOperation_ToastCollection_.ByReference()
    val hr = fn.invokeHR(arrayOf(IToastCollectionManager_Ptr, collectionId_Native, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun RemoveToastCollectionAsync(collectionId: String): IAsyncAction {
    val fnPtr = IToastCollectionManager_VtblPtr!!.getPointer(9L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val collectionId_Native = collectionId.toHandle()
    val result = Windows.Foundation.IAsyncAction.ByReference()
    val hr = fn.invokeHR(arrayOf(IToastCollectionManager_Ptr, collectionId_Native, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun RemoveAllToastCollectionsAsync(): IAsyncAction {
    val fnPtr = IToastCollectionManager_VtblPtr!!.getPointer(10L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.IAsyncAction.ByReference()
    val hr = fn.invokeHR(arrayOf(IToastCollectionManager_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun get_User(): User {
    val fnPtr = IToastCollectionManager_VtblPtr!!.getPointer(11L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.System.User.ByReference()
    val hr = fn.invokeHR(arrayOf(IToastCollectionManager_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun get_AppId(): String {
    val fnPtr = IToastCollectionManager_VtblPtr!!.getPointer(12L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinNT.HANDLEByReference()
    val hr = fn.invokeHR(arrayOf(IToastCollectionManager_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIToastCollectionManager(pointer.getPointer(0))

    public fun setValue(`value`: IToastCollectionManager_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IToastCollectionManager_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IToastCollectionManager {
    public override val IToastCollectionManager_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("2a1821fe179d49bcb79da527920d3665")

    public fun makeIToastCollectionManager(ptr: Pointer?): IToastCollectionManager =
        IToastCollectionManager_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IToastCollectionManager): Array<IToastCollectionManager> =
        (elements as
        Array<IToastCollectionManager>).castToImpl<IToastCollectionManager,IToastCollectionManager_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IToastCollectionManager?> =
        arrayOfNulls<IToastCollectionManager_Impl>(size) as Array<IToastCollectionManager?>
  }
}

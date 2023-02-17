package Windows.UI.Notifications

import Windows.Foundation.Uri
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

public interface IToastCollectionFactory : NativeMapped, IWinRTInterface {
  public val IToastCollectionFactory_Ptr: Pointer?

  public val IToastCollectionFactory_VtblPtr: Pointer?
    get() = IToastCollectionFactory_Ptr?.getPointer(0)

  public fun CreateInstance(
    collectionId: String,
    displayName: String,
    launchArgs: String,
    iconUri: Uri,
  ): ToastCollection {
    val fnPtr = IToastCollectionFactory_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val collectionId_Native = collectionId.toHandle()
    val displayName_Native = displayName.toHandle()
    val launchArgs_Native = launchArgs.toHandle()
    val result = Windows.UI.Notifications.ToastCollection.ByReference()
    val hr = fn.invokeHR(arrayOf(IToastCollectionFactory_Ptr, collectionId_Native,
        displayName_Native, launchArgs_Native, iconUri, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIToastCollectionFactory(pointer.getPointer(0))

    public fun setValue(`value`: IToastCollectionFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IToastCollectionFactory_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IToastCollectionFactory {
    public override val IToastCollectionFactory_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("164dd3d773c444f7b4fffb6d4bf1f4c6")

    public fun makeIToastCollectionFactory(ptr: Pointer?): IToastCollectionFactory =
        IToastCollectionFactory_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IToastCollectionFactory): Array<IToastCollectionFactory> =
        (elements as
        Array<IToastCollectionFactory>).castToImpl<IToastCollectionFactory,IToastCollectionFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IToastCollectionFactory?> =
        arrayOfNulls<IToastCollectionFactory_Impl>(size) as Array<IToastCollectionFactory?>
  }
}

package Windows.UI.Notifications

import Windows.Foundation.Uri
import Windows.UI.Notifications.IToastCollectionFactory.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.interfaces.IUnknownVtbl
import com.github.knk190001.winrtbinding.runtime.interfaces.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.interfaces.IWinRTObject
import com.github.knk190001.winrtbinding.runtime.interfaces.getValue
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import kotlin.Array
import kotlin.String
import kotlin.Unit

public class ToastCollection(
  ptr: Pointer? = Pointer.NULL,
) : PointerType(ptr), IToastCollection, IWinRTObject {
  public val IToastCollection_Interface: IToastCollection by lazy {
    asIToastCollection()
  }


  public override val IToastCollection_Ptr: Pointer? by lazy {
    IToastCollection_Interface.IToastCollection_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(IToastCollection_Interface)

  public constructor(
    collectionId: String,
    displayName: String,
    launchArgs: String,
    iconUri: Uri,
  ) : this(ABI.activate(collectionId, displayName, launchArgs, iconUri))

  private fun asIToastCollection(): IToastCollection {
    if(pointer == Pointer.NULL) {
      return(IToastCollection.ABI.makeIToastCollection(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IToastCollection.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IToastCollection.ABI.makeIToastCollection(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue(): ToastCollection = ToastCollection(pointer.getPointer(0))

    public fun setValue(`value`: ToastCollection): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI {
    public val IToastCollectionFactory_Instance: IToastCollectionFactory by lazy {
      createIToastCollectionFactory()
    }


    public fun createIToastCollectionFactory(): IToastCollectionFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Notifications.ToastCollection".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IToastCollectionFactory.ABI.makeIToastCollectionFactory(factoryActivatorPtr.value))
    }

    public fun activate(
      collectionId: String,
      displayName: String,
      launchArgs: String,
      iconUri: Uri,
    ): Pointer = IToastCollectionFactory_Instance.CreateInstance(collectionId, displayName,
        launchArgs, iconUri).pointer
  }
}

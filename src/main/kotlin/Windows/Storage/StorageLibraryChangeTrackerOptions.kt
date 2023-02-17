package Windows.Storage

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.interfaces.IActivationFactory
import com.github.knk190001.winrtbinding.runtime.interfaces.IActivationFactory.Companion.IID
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
import kotlin.Unit

public class StorageLibraryChangeTrackerOptions(
  ptr: Pointer? = Pointer.NULL,
) : PointerType(ptr), IStorageLibraryChangeTrackerOptions, IWinRTObject {
  public val IStorageLibraryChangeTrackerOptions_Interface: IStorageLibraryChangeTrackerOptions by
      lazy {
    asIStorageLibraryChangeTrackerOptions()
  }


  public override val IStorageLibraryChangeTrackerOptions_Ptr: Pointer? by lazy {
    IStorageLibraryChangeTrackerOptions_Interface.IStorageLibraryChangeTrackerOptions_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(IStorageLibraryChangeTrackerOptions_Interface)

  public constructor() : this(ABI.activate())

  private fun asIStorageLibraryChangeTrackerOptions(): IStorageLibraryChangeTrackerOptions {
    if(pointer == Pointer.NULL) {
      return(IStorageLibraryChangeTrackerOptions.ABI.makeIStorageLibraryChangeTrackerOptions(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IStorageLibraryChangeTrackerOptions.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStorageLibraryChangeTrackerOptions.ABI.makeIStorageLibraryChangeTrackerOptions(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue(): StorageLibraryChangeTrackerOptions =
        StorageLibraryChangeTrackerOptions(pointer.getPointer(0))

    public fun setValue(`value`: StorageLibraryChangeTrackerOptions): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Storage.StorageLibraryChangeTrackerOptions".toHandle(),refiid,iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): Pointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }
  }
}

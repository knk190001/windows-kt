package Windows.Storage.Search

import Windows.Foundation.Collections.IIterable_String_
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
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

public class QueryOptions(
  ptr: Pointer? = Pointer.NULL,
) : PointerType(ptr), IQueryOptions, IQueryOptionsWithProviderFilter, IWinRTObject {
  public val IQueryOptions_Interface: IQueryOptions by lazy {
    asIQueryOptions()
  }


  public val IQueryOptionsWithProviderFilter_Interface: IQueryOptionsWithProviderFilter by lazy {
    asIQueryOptionsWithProviderFilter()
  }


  public override val IQueryOptions_Ptr: Pointer? by lazy {
    IQueryOptions_Interface.IQueryOptions_Ptr
  }


  public override val IQueryOptionsWithProviderFilter_Ptr: Pointer? by lazy {
    IQueryOptionsWithProviderFilter_Interface.IQueryOptionsWithProviderFilter_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(IQueryOptions_Interface, IQueryOptionsWithProviderFilter_Interface)

  public constructor() : this(ABI.activate())

  public constructor(query: CommonFileQuery, fileTypeFilter: IIterable_String_) :
      this(ABI.activate(query, fileTypeFilter))

  public constructor(query: CommonFolderQuery) : this(ABI.activate(query))

  private fun asIQueryOptions(): IQueryOptions {
    if(pointer == Pointer.NULL) {
      return(IQueryOptions.ABI.makeIQueryOptions(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IQueryOptions.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IQueryOptions.ABI.makeIQueryOptions(ref.value))
  }

  private fun asIQueryOptionsWithProviderFilter(): IQueryOptionsWithProviderFilter {
    if(pointer == Pointer.NULL) {
      return(IQueryOptionsWithProviderFilter.ABI.makeIQueryOptionsWithProviderFilter(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IQueryOptionsWithProviderFilter.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IQueryOptionsWithProviderFilter.ABI.makeIQueryOptionsWithProviderFilter(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue(): QueryOptions = QueryOptions(pointer.getPointer(0))

    public fun setValue(`value`: QueryOptions): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IQueryOptionsFactory_Instance: IQueryOptionsFactory by lazy {
      createIQueryOptionsFactory()
    }


    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Storage.Search.QueryOptions".toHandle(),refiid,iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): Pointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public fun createIQueryOptionsFactory(): IQueryOptionsFactory {
      val refiid = Guid.REFIID(IQueryOptionsFactory.ABI.IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Storage.Search.QueryOptions".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IQueryOptionsFactory.ABI.makeIQueryOptionsFactory(factoryActivatorPtr.value))
    }

    public fun activate(query: CommonFileQuery, fileTypeFilter: IIterable_String_): Pointer =
        IQueryOptionsFactory_Instance.CreateCommonFileQuery(query, fileTypeFilter).pointer

    public fun activate(query: CommonFolderQuery): Pointer =
        IQueryOptionsFactory_Instance.CreateCommonFolderQuery(query).pointer
  }
}

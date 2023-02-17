package Windows.Data.Text

import Windows.Data.Text.ISemanticTextQueryFactory.ABI.IID
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

public class SemanticTextQuery(
  ptr: Pointer? = Pointer.NULL,
) : PointerType(ptr), ISemanticTextQuery, IWinRTObject {
  public val ISemanticTextQuery_Interface: ISemanticTextQuery by lazy {
    asISemanticTextQuery()
  }


  public override val ISemanticTextQuery_Ptr: Pointer? by lazy {
    ISemanticTextQuery_Interface.ISemanticTextQuery_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(ISemanticTextQuery_Interface)

  public constructor(aqsFilter: String) : this(ABI.activate(aqsFilter))

  public constructor(aqsFilter: String, filterLanguage: String) : this(ABI.activate(aqsFilter,
      filterLanguage))

  private fun asISemanticTextQuery(): ISemanticTextQuery {
    if(pointer == Pointer.NULL) {
      return(ISemanticTextQuery.ABI.makeISemanticTextQuery(Pointer.NULL))
    }
    val refiid = Guid.REFIID(ISemanticTextQuery.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISemanticTextQuery.ABI.makeISemanticTextQuery(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue(): SemanticTextQuery = SemanticTextQuery(pointer.getPointer(0))

    public fun setValue(`value`: SemanticTextQuery): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI {
    public val ISemanticTextQueryFactory_Instance: ISemanticTextQueryFactory by lazy {
      createISemanticTextQueryFactory()
    }


    public fun createISemanticTextQueryFactory(): ISemanticTextQueryFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Data.Text.SemanticTextQuery".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ISemanticTextQueryFactory.ABI.makeISemanticTextQueryFactory(factoryActivatorPtr.value))
    }

    public fun activate(aqsFilter: String): Pointer =
        ISemanticTextQueryFactory_Instance.Create(aqsFilter).pointer

    public fun activate(aqsFilter: String, filterLanguage: String): Pointer =
        ISemanticTextQueryFactory_Instance.CreateWithLanguage(aqsFilter, filterLanguage).pointer
  }
}

package Windows.Data.Text

import Windows.Data.Text.ISelectableWordsSegmenterFactory.ABI.IID
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

public class SelectableWordsSegmenter(
  ptr: Pointer? = Pointer.NULL,
) : PointerType(ptr), ISelectableWordsSegmenter, IWinRTObject {
  public val ISelectableWordsSegmenter_Interface: ISelectableWordsSegmenter by lazy {
    asISelectableWordsSegmenter()
  }


  public override val ISelectableWordsSegmenter_Ptr: Pointer? by lazy {
    ISelectableWordsSegmenter_Interface.ISelectableWordsSegmenter_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(ISelectableWordsSegmenter_Interface)

  public constructor(language: String) : this(ABI.activate(language))

  private fun asISelectableWordsSegmenter(): ISelectableWordsSegmenter {
    if(pointer == Pointer.NULL) {
      return(ISelectableWordsSegmenter.ABI.makeISelectableWordsSegmenter(Pointer.NULL))
    }
    val refiid = Guid.REFIID(ISelectableWordsSegmenter.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISelectableWordsSegmenter.ABI.makeISelectableWordsSegmenter(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue(): SelectableWordsSegmenter =
        SelectableWordsSegmenter(pointer.getPointer(0))

    public fun setValue(`value`: SelectableWordsSegmenter): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI {
    public val ISelectableWordsSegmenterFactory_Instance: ISelectableWordsSegmenterFactory by lazy {
      createISelectableWordsSegmenterFactory()
    }


    public fun createISelectableWordsSegmenterFactory(): ISelectableWordsSegmenterFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Data.Text.SelectableWordsSegmenter".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ISelectableWordsSegmenterFactory.ABI.makeISelectableWordsSegmenterFactory(factoryActivatorPtr.value))
    }

    public fun activate(language: String): Pointer =
        ISelectableWordsSegmenterFactory_Instance.CreateWithLanguage(language).pointer
  }
}

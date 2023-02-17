package Windows.Data.Text

import Windows.Data.Text.IWordsSegmenterFactory.ABI.IID
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

public class WordsSegmenter(
  ptr: Pointer? = Pointer.NULL,
) : PointerType(ptr), IWordsSegmenter, IWinRTObject {
  public val IWordsSegmenter_Interface: IWordsSegmenter by lazy {
    asIWordsSegmenter()
  }


  public override val IWordsSegmenter_Ptr: Pointer? by lazy {
    IWordsSegmenter_Interface.IWordsSegmenter_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(IWordsSegmenter_Interface)

  public constructor(language: String) : this(ABI.activate(language))

  private fun asIWordsSegmenter(): IWordsSegmenter {
    if(pointer == Pointer.NULL) {
      return(IWordsSegmenter.ABI.makeIWordsSegmenter(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IWordsSegmenter.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWordsSegmenter.ABI.makeIWordsSegmenter(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue(): WordsSegmenter = WordsSegmenter(pointer.getPointer(0))

    public fun setValue(`value`: WordsSegmenter): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI {
    public val IWordsSegmenterFactory_Instance: IWordsSegmenterFactory by lazy {
      createIWordsSegmenterFactory()
    }


    public fun createIWordsSegmenterFactory(): IWordsSegmenterFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Data.Text.WordsSegmenter".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IWordsSegmenterFactory.ABI.makeIWordsSegmenterFactory(factoryActivatorPtr.value))
    }

    public fun activate(language: String): Pointer =
        IWordsSegmenterFactory_Instance.CreateWithLanguage(language).pointer
  }
}

package Windows.Data.Text

import Windows.Data.Text.ITextPredictionGeneratorFactory.ABI.IID
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

public class TextPredictionGenerator(
  ptr: Pointer? = Pointer.NULL,
) : PointerType(ptr), ITextPredictionGenerator, ITextPredictionGenerator2, IWinRTObject {
  public val ITextPredictionGenerator_Interface: ITextPredictionGenerator by lazy {
    asITextPredictionGenerator()
  }


  public val ITextPredictionGenerator2_Interface: ITextPredictionGenerator2 by lazy {
    asITextPredictionGenerator2()
  }


  public override val ITextPredictionGenerator_Ptr: Pointer? by lazy {
    ITextPredictionGenerator_Interface.ITextPredictionGenerator_Ptr
  }


  public override val ITextPredictionGenerator2_Ptr: Pointer? by lazy {
    ITextPredictionGenerator2_Interface.ITextPredictionGenerator2_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(ITextPredictionGenerator_Interface, ITextPredictionGenerator2_Interface)

  public constructor(languageTag: String) : this(ABI.activate(languageTag))

  private fun asITextPredictionGenerator(): ITextPredictionGenerator {
    if(pointer == Pointer.NULL) {
      return(ITextPredictionGenerator.ABI.makeITextPredictionGenerator(Pointer.NULL))
    }
    val refiid = Guid.REFIID(ITextPredictionGenerator.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITextPredictionGenerator.ABI.makeITextPredictionGenerator(ref.value))
  }

  private fun asITextPredictionGenerator2(): ITextPredictionGenerator2 {
    if(pointer == Pointer.NULL) {
      return(ITextPredictionGenerator2.ABI.makeITextPredictionGenerator2(Pointer.NULL))
    }
    val refiid = Guid.REFIID(ITextPredictionGenerator2.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITextPredictionGenerator2.ABI.makeITextPredictionGenerator2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue(): TextPredictionGenerator = TextPredictionGenerator(pointer.getPointer(0))

    public fun setValue(`value`: TextPredictionGenerator): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI {
    public val ITextPredictionGeneratorFactory_Instance: ITextPredictionGeneratorFactory by lazy {
      createITextPredictionGeneratorFactory()
    }


    public fun createITextPredictionGeneratorFactory(): ITextPredictionGeneratorFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Data.Text.TextPredictionGenerator".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ITextPredictionGeneratorFactory.ABI.makeITextPredictionGeneratorFactory(factoryActivatorPtr.value))
    }

    public fun activate(languageTag: String): Pointer =
        ITextPredictionGeneratorFactory_Instance.Create(languageTag).pointer
  }
}

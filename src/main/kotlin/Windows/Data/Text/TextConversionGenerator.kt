package Windows.Data.Text

import Windows.Data.Text.ITextConversionGeneratorFactory.ABI.IID
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

public class TextConversionGenerator(
  ptr: Pointer? = Pointer.NULL,
) : PointerType(ptr), ITextConversionGenerator, IWinRTObject {
  public val ITextConversionGenerator_Interface: ITextConversionGenerator by lazy {
    asITextConversionGenerator()
  }


  public override val ITextConversionGenerator_Ptr: Pointer? by lazy {
    ITextConversionGenerator_Interface.ITextConversionGenerator_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(ITextConversionGenerator_Interface)

  public constructor(languageTag: String) : this(ABI.activate(languageTag))

  private fun asITextConversionGenerator(): ITextConversionGenerator {
    if(pointer == Pointer.NULL) {
      return(ITextConversionGenerator.ABI.makeITextConversionGenerator(Pointer.NULL))
    }
    val refiid = Guid.REFIID(ITextConversionGenerator.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITextConversionGenerator.ABI.makeITextConversionGenerator(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue(): TextConversionGenerator = TextConversionGenerator(pointer.getPointer(0))

    public fun setValue(`value`: TextConversionGenerator): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI {
    public val ITextConversionGeneratorFactory_Instance: ITextConversionGeneratorFactory by lazy {
      createITextConversionGeneratorFactory()
    }


    public fun createITextConversionGeneratorFactory(): ITextConversionGeneratorFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Data.Text.TextConversionGenerator".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ITextConversionGeneratorFactory.ABI.makeITextConversionGeneratorFactory(factoryActivatorPtr.value))
    }

    public fun activate(languageTag: String): Pointer =
        ITextConversionGeneratorFactory_Instance.Create(languageTag).pointer
  }
}

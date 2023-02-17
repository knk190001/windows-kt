package Windows.Data.Text

import Windows.Data.Text.ITextReverseConversionGeneratorFactory.ABI.IID
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

public class TextReverseConversionGenerator(
  ptr: Pointer? = Pointer.NULL,
) : PointerType(ptr), ITextReverseConversionGenerator, ITextReverseConversionGenerator2,
    IWinRTObject {
  public val ITextReverseConversionGenerator_Interface: ITextReverseConversionGenerator by lazy {
    asITextReverseConversionGenerator()
  }


  public val ITextReverseConversionGenerator2_Interface: ITextReverseConversionGenerator2 by lazy {
    asITextReverseConversionGenerator2()
  }


  public override val ITextReverseConversionGenerator_Ptr: Pointer? by lazy {
    ITextReverseConversionGenerator_Interface.ITextReverseConversionGenerator_Ptr
  }


  public override val ITextReverseConversionGenerator2_Ptr: Pointer? by lazy {
    ITextReverseConversionGenerator2_Interface.ITextReverseConversionGenerator2_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(ITextReverseConversionGenerator_Interface,
        ITextReverseConversionGenerator2_Interface)

  public constructor(languageTag: String) : this(ABI.activate(languageTag))

  private fun asITextReverseConversionGenerator(): ITextReverseConversionGenerator {
    if(pointer == Pointer.NULL) {
      return(ITextReverseConversionGenerator.ABI.makeITextReverseConversionGenerator(Pointer.NULL))
    }
    val refiid = Guid.REFIID(ITextReverseConversionGenerator.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITextReverseConversionGenerator.ABI.makeITextReverseConversionGenerator(ref.value))
  }

  private fun asITextReverseConversionGenerator2(): ITextReverseConversionGenerator2 {
    if(pointer == Pointer.NULL) {
      return(ITextReverseConversionGenerator2.ABI.makeITextReverseConversionGenerator2(Pointer.NULL))
    }
    val refiid = Guid.REFIID(ITextReverseConversionGenerator2.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITextReverseConversionGenerator2.ABI.makeITextReverseConversionGenerator2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue(): TextReverseConversionGenerator =
        TextReverseConversionGenerator(pointer.getPointer(0))

    public fun setValue(`value`: TextReverseConversionGenerator): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI {
    public val ITextReverseConversionGeneratorFactory_Instance:
        ITextReverseConversionGeneratorFactory by lazy {
      createITextReverseConversionGeneratorFactory()
    }


    public fun createITextReverseConversionGeneratorFactory():
        ITextReverseConversionGeneratorFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Data.Text.TextReverseConversionGenerator".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ITextReverseConversionGeneratorFactory.ABI.makeITextReverseConversionGeneratorFactory(factoryActivatorPtr.value))
    }

    public fun activate(languageTag: String): Pointer =
        ITextReverseConversionGeneratorFactory_Instance.Create(languageTag).pointer
  }
}

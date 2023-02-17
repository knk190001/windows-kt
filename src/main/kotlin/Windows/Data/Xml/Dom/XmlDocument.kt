package Windows.Data.Xml.Dom

import Windows.Foundation.Uri
import Windows.Storage.IStorageFile
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

public class XmlDocument(
  ptr: Pointer? = Pointer.NULL,
) : PointerType(ptr), IXmlDocument, IXmlNode, IXmlNodeSerializer, IXmlNodeSelector, IXmlDocumentIO,
    IXmlDocumentIO2, IWinRTObject {
  public val IXmlDocument_Interface: IXmlDocument by lazy {
    asIXmlDocument()
  }


  public val IXmlNode_Interface: IXmlNode by lazy {
    asIXmlNode()
  }


  public val IXmlNodeSerializer_Interface: IXmlNodeSerializer by lazy {
    asIXmlNodeSerializer()
  }


  public val IXmlNodeSelector_Interface: IXmlNodeSelector by lazy {
    asIXmlNodeSelector()
  }


  public val IXmlDocumentIO_Interface: IXmlDocumentIO by lazy {
    asIXmlDocumentIO()
  }


  public val IXmlDocumentIO2_Interface: IXmlDocumentIO2 by lazy {
    asIXmlDocumentIO2()
  }


  public override val IXmlDocument_Ptr: Pointer? by lazy {
    IXmlDocument_Interface.IXmlDocument_Ptr
  }


  public override val IXmlNode_Ptr: Pointer? by lazy {
    IXmlNode_Interface.IXmlNode_Ptr
  }


  public override val IXmlNodeSerializer_Ptr: Pointer? by lazy {
    IXmlNodeSerializer_Interface.IXmlNodeSerializer_Ptr
  }


  public override val IXmlNodeSelector_Ptr: Pointer? by lazy {
    IXmlNodeSelector_Interface.IXmlNodeSelector_Ptr
  }


  public override val IXmlDocumentIO_Ptr: Pointer? by lazy {
    IXmlDocumentIO_Interface.IXmlDocumentIO_Ptr
  }


  public override val IXmlDocumentIO2_Ptr: Pointer? by lazy {
    IXmlDocumentIO2_Interface.IXmlDocumentIO2_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(IXmlDocument_Interface, IXmlNode_Interface, IXmlNodeSerializer_Interface,
        IXmlNodeSelector_Interface, IXmlDocumentIO_Interface, IXmlDocumentIO2_Interface)

  public constructor() : this(ABI.activate())

  private fun asIXmlDocument(): IXmlDocument {
    if(pointer == Pointer.NULL) {
      return(IXmlDocument.ABI.makeIXmlDocument(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IXmlDocument.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IXmlDocument.ABI.makeIXmlDocument(ref.value))
  }

  private fun asIXmlNode(): IXmlNode {
    if(pointer == Pointer.NULL) {
      return(IXmlNode.ABI.makeIXmlNode(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IXmlNode.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IXmlNode.ABI.makeIXmlNode(ref.value))
  }

  private fun asIXmlNodeSerializer(): IXmlNodeSerializer {
    if(pointer == Pointer.NULL) {
      return(IXmlNodeSerializer.ABI.makeIXmlNodeSerializer(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IXmlNodeSerializer.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IXmlNodeSerializer.ABI.makeIXmlNodeSerializer(ref.value))
  }

  private fun asIXmlNodeSelector(): IXmlNodeSelector {
    if(pointer == Pointer.NULL) {
      return(IXmlNodeSelector.ABI.makeIXmlNodeSelector(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IXmlNodeSelector.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IXmlNodeSelector.ABI.makeIXmlNodeSelector(ref.value))
  }

  private fun asIXmlDocumentIO(): IXmlDocumentIO {
    if(pointer == Pointer.NULL) {
      return(IXmlDocumentIO.ABI.makeIXmlDocumentIO(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IXmlDocumentIO.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IXmlDocumentIO.ABI.makeIXmlDocumentIO(ref.value))
  }

  private fun asIXmlDocumentIO2(): IXmlDocumentIO2 {
    if(pointer == Pointer.NULL) {
      return(IXmlDocumentIO2.ABI.makeIXmlDocumentIO2(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IXmlDocumentIO2.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IXmlDocumentIO2.ABI.makeIXmlDocumentIO2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue(): XmlDocument = XmlDocument(pointer.getPointer(0))

    public fun setValue(`value`: XmlDocument): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IXmlDocumentStatics_Instance: IXmlDocumentStatics by lazy {
      createIXmlDocumentStatics()
    }


    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Data.Xml.Dom.XmlDocument".toHandle(),refiid,iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): Pointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public fun createIXmlDocumentStatics(): IXmlDocumentStatics {
      val refiid = Guid.REFIID(IXmlDocumentStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Data.Xml.Dom.XmlDocument".toHandle(),refiid,interfacePtr)
      val result = IXmlDocumentStatics.ABI.makeIXmlDocumentStatics(interfacePtr.value)
      return result
    }
  }

  public companion object {
    public fun LoadFromUriAsync(uri: Uri) = ABI.IXmlDocumentStatics_Instance.LoadFromUriAsync(uri)

    public fun LoadFromUriAsync(uri: Uri, loadSettings: XmlLoadSettings) =
        ABI.IXmlDocumentStatics_Instance.LoadFromUriAsync(uri, loadSettings)

    public fun LoadFromFileAsync(`file`: IStorageFile) =
        ABI.IXmlDocumentStatics_Instance.LoadFromFileAsync(file)

    public fun LoadFromFileAsync(`file`: IStorageFile, loadSettings: XmlLoadSettings) =
        ABI.IXmlDocumentStatics_Instance.LoadFromFileAsync(file, loadSettings)
  }
}

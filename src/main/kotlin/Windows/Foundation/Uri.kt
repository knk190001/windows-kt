package Windows.Foundation

import Windows.Foundation.IUriRuntimeClassFactory.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
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

public class Uri(
  ptr: Pointer? = Pointer.NULL,
) : PointerType(ptr), IUriRuntimeClass, IUriRuntimeClassWithAbsoluteCanonicalUri, IStringable,
    IWinRTObject {
  public val IUriRuntimeClass_Interface: IUriRuntimeClass by lazy {
    asIUriRuntimeClass()
  }


  public val IUriRuntimeClassWithAbsoluteCanonicalUri_Interface:
      IUriRuntimeClassWithAbsoluteCanonicalUri by lazy {
    asIUriRuntimeClassWithAbsoluteCanonicalUri()
  }


  public val IStringable_Interface: IStringable by lazy {
    asIStringable()
  }


  public override val IUriRuntimeClass_Ptr: Pointer? by lazy {
    IUriRuntimeClass_Interface.IUriRuntimeClass_Ptr
  }


  public override val IUriRuntimeClassWithAbsoluteCanonicalUri_Ptr: Pointer? by lazy {
    IUriRuntimeClassWithAbsoluteCanonicalUri_Interface.IUriRuntimeClassWithAbsoluteCanonicalUri_Ptr
  }


  public override val IStringable_Ptr: Pointer? by lazy {
    IStringable_Interface.IStringable_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(IUriRuntimeClass_Interface, IUriRuntimeClassWithAbsoluteCanonicalUri_Interface,
        IStringable_Interface)

  public constructor(uri: String) : this(ABI.activate(uri))

  public constructor(baseUri: String, relativeUri: String) : this(ABI.activate(baseUri,
      relativeUri))

  private fun asIUriRuntimeClass(): IUriRuntimeClass {
    if(pointer == Pointer.NULL) {
      return(IUriRuntimeClass.ABI.makeIUriRuntimeClass(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IUriRuntimeClass.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUriRuntimeClass.ABI.makeIUriRuntimeClass(ref.value))
  }

  private fun asIUriRuntimeClassWithAbsoluteCanonicalUri():
      IUriRuntimeClassWithAbsoluteCanonicalUri {
    if(pointer == Pointer.NULL) {
      return(IUriRuntimeClassWithAbsoluteCanonicalUri.ABI.makeIUriRuntimeClassWithAbsoluteCanonicalUri(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IUriRuntimeClassWithAbsoluteCanonicalUri.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUriRuntimeClassWithAbsoluteCanonicalUri.ABI.makeIUriRuntimeClassWithAbsoluteCanonicalUri(ref.value))
  }

  private fun asIStringable(): IStringable {
    if(pointer == Pointer.NULL) {
      return(IStringable.ABI.makeIStringable(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IStringable.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStringable.ABI.makeIStringable(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue(): Uri = Uri(pointer.getPointer(0))

    public fun setValue(`value`: Uri): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI {
    public val IUriEscapeStatics_Instance: IUriEscapeStatics by lazy {
      createIUriEscapeStatics()
    }


    public val IUriRuntimeClassFactory_Instance: IUriRuntimeClassFactory by lazy {
      createIUriRuntimeClassFactory()
    }


    public fun createIUriEscapeStatics(): IUriEscapeStatics {
      val refiid = Guid.REFIID(IUriEscapeStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Foundation.Uri".toHandle(),refiid,interfacePtr)
      val result = IUriEscapeStatics.ABI.makeIUriEscapeStatics(interfacePtr.value)
      return result
    }

    public fun createIUriRuntimeClassFactory(): IUriRuntimeClassFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Foundation.Uri".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IUriRuntimeClassFactory.ABI.makeIUriRuntimeClassFactory(factoryActivatorPtr.value))
    }

    public fun activate(uri: String): Pointer =
        IUriRuntimeClassFactory_Instance.CreateUri(uri).pointer

    public fun activate(baseUri: String, relativeUri: String): Pointer =
        IUriRuntimeClassFactory_Instance.CreateWithRelativeUri(baseUri, relativeUri).pointer
  }

  public companion object {
    public fun UnescapeComponent(toUnescape: String) =
        ABI.IUriEscapeStatics_Instance.UnescapeComponent(toUnescape)

    public fun EscapeComponent(toEscape: String) =
        ABI.IUriEscapeStatics_Instance.EscapeComponent(toEscape)
  }
}

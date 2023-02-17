package Windows.Foundation

import Windows.Foundation.Collections.IIterable_IWwwFormUrlDecoderEntry_
import Windows.Foundation.Collections.IVectorView_IWwwFormUrlDecoderEntry_
import Windows.Foundation.IWwwFormUrlDecoderRuntimeClassFactory.ABI.IID
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

public class WwwFormUrlDecoder(
  ptr: Pointer? = Pointer.NULL,
) : PointerType(ptr), IWwwFormUrlDecoderRuntimeClass, IVectorView_IWwwFormUrlDecoderEntry_,
    IIterable_IWwwFormUrlDecoderEntry_, IWinRTObject {
  public val IWwwFormUrlDecoderRuntimeClass_Interface: IWwwFormUrlDecoderRuntimeClass by lazy {
    asIWwwFormUrlDecoderRuntimeClass()
  }


  public val IVectorView_IWwwFormUrlDecoderEntry__Interface: IVectorView_IWwwFormUrlDecoderEntry_ by
      lazy {
    asIVectorView_IWwwFormUrlDecoderEntry_()
  }


  public val IIterable_IWwwFormUrlDecoderEntry__Interface: IIterable_IWwwFormUrlDecoderEntry_ by
      lazy {
    asIIterable_IWwwFormUrlDecoderEntry_()
  }


  public override val IWwwFormUrlDecoderRuntimeClass_Ptr: Pointer? by lazy {
    IWwwFormUrlDecoderRuntimeClass_Interface.IWwwFormUrlDecoderRuntimeClass_Ptr
  }


  public override val IVectorView_IWwwFormUrlDecoderEntry__Ptr: Pointer? by lazy {
    IVectorView_IWwwFormUrlDecoderEntry__Interface.IVectorView_IWwwFormUrlDecoderEntry__Ptr
  }


  public override val IIterable_IWwwFormUrlDecoderEntry__Ptr: Pointer? by lazy {
    IIterable_IWwwFormUrlDecoderEntry__Interface.IIterable_IWwwFormUrlDecoderEntry__Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(IWwwFormUrlDecoderRuntimeClass_Interface,
        IVectorView_IWwwFormUrlDecoderEntry__Interface,
        IIterable_IWwwFormUrlDecoderEntry__Interface)

  public constructor(query: String) : this(ABI.activate(query))

  private fun asIWwwFormUrlDecoderRuntimeClass(): IWwwFormUrlDecoderRuntimeClass {
    if(pointer == Pointer.NULL) {
      return(IWwwFormUrlDecoderRuntimeClass.ABI.makeIWwwFormUrlDecoderRuntimeClass(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IWwwFormUrlDecoderRuntimeClass.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWwwFormUrlDecoderRuntimeClass.ABI.makeIWwwFormUrlDecoderRuntimeClass(ref.value))
  }

  private fun asIVectorView_IWwwFormUrlDecoderEntry_(): IVectorView_IWwwFormUrlDecoderEntry_ {
    if(pointer == Pointer.NULL) {
      return(IVectorView_IWwwFormUrlDecoderEntry_.ABI.makeIVectorView_IWwwFormUrlDecoderEntry_(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IVectorView_IWwwFormUrlDecoderEntry_.ABI.PIID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVectorView_IWwwFormUrlDecoderEntry_.ABI.makeIVectorView_IWwwFormUrlDecoderEntry_(ref.value))
  }

  private fun asIIterable_IWwwFormUrlDecoderEntry_(): IIterable_IWwwFormUrlDecoderEntry_ {
    if(pointer == Pointer.NULL) {
      return(IIterable_IWwwFormUrlDecoderEntry_.ABI.makeIIterable_IWwwFormUrlDecoderEntry_(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IIterable_IWwwFormUrlDecoderEntry_.ABI.PIID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IIterable_IWwwFormUrlDecoderEntry_.ABI.makeIIterable_IWwwFormUrlDecoderEntry_(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue(): WwwFormUrlDecoder = WwwFormUrlDecoder(pointer.getPointer(0))

    public fun setValue(`value`: WwwFormUrlDecoder): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI {
    public val IWwwFormUrlDecoderRuntimeClassFactory_Instance: IWwwFormUrlDecoderRuntimeClassFactory
        by lazy {
      createIWwwFormUrlDecoderRuntimeClassFactory()
    }


    public fun createIWwwFormUrlDecoderRuntimeClassFactory():
        IWwwFormUrlDecoderRuntimeClassFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Foundation.WwwFormUrlDecoder".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IWwwFormUrlDecoderRuntimeClassFactory.ABI.makeIWwwFormUrlDecoderRuntimeClassFactory(factoryActivatorPtr.value))
    }

    public fun activate(query: String): Pointer =
        IWwwFormUrlDecoderRuntimeClassFactory_Instance.CreateWwwFormUrlDecoder(query).pointer
  }
}

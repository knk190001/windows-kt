package Windows.Data.Xml.Dom

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

public class XmlLoadSettings(
  ptr: Pointer? = Pointer.NULL,
) : PointerType(ptr), IXmlLoadSettings, IWinRTObject {
  public val IXmlLoadSettings_Interface: IXmlLoadSettings by lazy {
    asIXmlLoadSettings()
  }


  public override val IXmlLoadSettings_Ptr: Pointer? by lazy {
    IXmlLoadSettings_Interface.IXmlLoadSettings_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(IXmlLoadSettings_Interface)

  public constructor() : this(ABI.activate())

  private fun asIXmlLoadSettings(): IXmlLoadSettings {
    if(pointer == Pointer.NULL) {
      return(IXmlLoadSettings.ABI.makeIXmlLoadSettings(Pointer.NULL))
    }
    val refiid = Guid.REFIID(IXmlLoadSettings.ABI.IID)
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IXmlLoadSettings.ABI.makeIXmlLoadSettings(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue(): XmlLoadSettings = XmlLoadSettings(pointer.getPointer(0))

    public fun setValue(`value`: XmlLoadSettings): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Data.Xml.Dom.XmlLoadSettings".toHandle(),refiid,iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): Pointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }
  }
}

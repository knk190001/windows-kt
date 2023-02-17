package Windows.Data.Json

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.checkHR
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
import kotlin.Int
import kotlin.Unit

public class JsonError(
  ptr: Pointer? = Pointer.NULL,
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue(): JsonError = JsonError(pointer.getPointer(0))

    public fun setValue(`value`: JsonError): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI {
    public val IJsonErrorStatics2_Instance: IJsonErrorStatics2 by lazy {
      createIJsonErrorStatics2()
    }


    public fun createIJsonErrorStatics2(): IJsonErrorStatics2 {
      val refiid = Guid.REFIID(IJsonErrorStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Data.Json.JsonError".toHandle(),refiid,interfacePtr)
      val result = IJsonErrorStatics2.ABI.makeIJsonErrorStatics2(interfacePtr.value)
      return result
    }
  }

  public companion object {
    public fun GetJsonStatus(hresult: Int) = ABI.IJsonErrorStatics2_Instance.GetJsonStatus(hresult)
  }
}

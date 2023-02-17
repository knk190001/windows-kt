package Windows.Foundation.Collections

import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.handleToString
import com.github.knk190001.winrtbinding.runtime.interfaces.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.interfaces.getValue
import com.github.knk190001.winrtbinding.runtime.invokeHR
import com.github.knk190001.winrtbinding.runtime.makeOutArray
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Function
import com.sun.jna.Function.ALT_CONVENTION
import com.sun.jna.Native
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.platform.win32.WinDef
import com.sun.jna.ptr.ByteByReference
import java.lang.RuntimeException
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit

public interface IMapView_String_IVectorView_TextSegment__ : NativeMapped, IWinRTInterface {
  public val IMapView_String_IVectorView_TextSegment___Ptr: Pointer?

  public val IMapView_String_IVectorView_TextSegment___VtblPtr: Pointer?
    get() = IMapView_String_IVectorView_TextSegment___Ptr?.getPointer(0)

  public fun Lookup(key: String): IVectorView_TextSegment_ {
    val fnPtr = IMapView_String_IVectorView_TextSegment___VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val key_Native = key.toHandle()
    val result = Windows.Foundation.Collections.IVectorView_TextSegment_.ByReference()
    val hr = fn.invokeHR(arrayOf(IMapView_String_IVectorView_TextSegment___Ptr, key_Native, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun get_Size(): WinDef.UINT {
    val fnPtr = IMapView_String_IVectorView_TextSegment___VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinDef.UINTByReference()
    val hr = fn.invokeHR(arrayOf(IMapView_String_IVectorView_TextSegment___Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun HasKey(key: String): Boolean {
    val fnPtr = IMapView_String_IVectorView_TextSegment___VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val key_Native = key.toHandle()
    val result = ByteByReference()
    val hr = fn.invokeHR(arrayOf(IMapView_String_IVectorView_TextSegment___Ptr, key_Native, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue != 0.toByte()
    return resultValue_Managed
  }

  public fun Split(first: IMapView_String_IVectorView_TextSegment__.ByReference,
      second: IMapView_String_IVectorView_TextSegment__.ByReference): Unit {
    val fnPtr = IMapView_String_IVectorView_TextSegment___VtblPtr!!.getPointer(9L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val hr = fn.invokeHR(arrayOf(IMapView_String_IVectorView_TextSegment___Ptr, first, second,))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIMapView_String_IVectorView_TextSegment__(pointer.getPointer(0))

    public fun setValue(`value`: IMapView_String_IVectorView_TextSegment___Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IMapView_String_IVectorView_TextSegment___Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IMapView_String_IVectorView_TextSegment__ {
    public override val IMapView_String_IVectorView_TextSegment___Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val PIID: Guid.IID = Guid.IID("91d443d637775102b0bc3d4183a26ff9")

    public val IID: Guid.IID = Guid.IID("e480ce40a3384adaadcf272272e48cb9")

    public fun makeIMapView_String_IVectorView_TextSegment__(ptr: Pointer?):
        IMapView_String_IVectorView_TextSegment__ =
        IMapView_String_IVectorView_TextSegment___Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IMapView_String_IVectorView_TextSegment__):
        Array<IMapView_String_IVectorView_TextSegment__> = (elements as
        Array<IMapView_String_IVectorView_TextSegment__>).castToImpl<IMapView_String_IVectorView_TextSegment__,IMapView_String_IVectorView_TextSegment___Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMapView_String_IVectorView_TextSegment__?> =
        arrayOfNulls<IMapView_String_IVectorView_TextSegment___Impl>(size) as
        Array<IMapView_String_IVectorView_TextSegment__?>
  }
}

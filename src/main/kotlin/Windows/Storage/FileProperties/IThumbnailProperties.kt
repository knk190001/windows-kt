package Windows.Storage.FileProperties

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
import kotlin.Unit

public interface IThumbnailProperties : NativeMapped, IWinRTInterface {
  public val IThumbnailProperties_Ptr: Pointer?

  public val IThumbnailProperties_VtblPtr: Pointer?
    get() = IThumbnailProperties_Ptr?.getPointer(0)

  public fun get_OriginalWidth(): WinDef.UINT {
    val fnPtr = IThumbnailProperties_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinDef.UINTByReference()
    val hr = fn.invokeHR(arrayOf(IThumbnailProperties_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun get_OriginalHeight(): WinDef.UINT {
    val fnPtr = IThumbnailProperties_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = WinDef.UINTByReference()
    val hr = fn.invokeHR(arrayOf(IThumbnailProperties_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun get_ReturnedSmallerCachedSize(): Boolean {
    val fnPtr = IThumbnailProperties_VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = ByteByReference()
    val hr = fn.invokeHR(arrayOf(IThumbnailProperties_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue != 0.toByte()
    return resultValue_Managed
  }

  public fun get_Type(): ThumbnailType {
    val fnPtr = IThumbnailProperties_VtblPtr!!.getPointer(9L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Storage.FileProperties.ThumbnailType.ByReference()
    val hr = fn.invokeHR(arrayOf(IThumbnailProperties_Ptr,  result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIThumbnailProperties(pointer.getPointer(0))

    public fun setValue(`value`: IThumbnailProperties_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IThumbnailProperties_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IThumbnailProperties {
    public override val IThumbnailProperties_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("693dd42fdbe749b5b3b32893ac5d3423")

    public fun makeIThumbnailProperties(ptr: Pointer?): IThumbnailProperties =
        IThumbnailProperties_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IThumbnailProperties): Array<IThumbnailProperties> =
        (elements as
        Array<IThumbnailProperties>).castToImpl<IThumbnailProperties,IThumbnailProperties_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IThumbnailProperties?> =
        arrayOfNulls<IThumbnailProperties_Impl>(size) as Array<IThumbnailProperties?>
  }
}

package Windows.Data.Xml.Dom

import Windows.Foundation.IAsyncOperation_XmlDocument_
import Windows.Foundation.Uri
import Windows.Storage.IStorageFile
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
import java.lang.RuntimeException
import kotlin.Array
import kotlin.Int
import kotlin.Unit

public interface IXmlDocumentStatics : NativeMapped, IWinRTInterface {
  public val IXmlDocumentStatics_Ptr: Pointer?

  public val IXmlDocumentStatics_VtblPtr: Pointer?
    get() = IXmlDocumentStatics_Ptr?.getPointer(0)

  public fun LoadFromUriAsync(uri: Uri): IAsyncOperation_XmlDocument_ {
    val fnPtr = IXmlDocumentStatics_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.IAsyncOperation_XmlDocument_.ByReference()
    val hr = fn.invokeHR(arrayOf(IXmlDocumentStatics_Ptr, uri, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun LoadFromUriAsync(uri: Uri, loadSettings: XmlLoadSettings):
      IAsyncOperation_XmlDocument_ {
    val fnPtr = IXmlDocumentStatics_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.IAsyncOperation_XmlDocument_.ByReference()
    val hr = fn.invokeHR(arrayOf(IXmlDocumentStatics_Ptr, uri, loadSettings, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun LoadFromFileAsync(`file`: IStorageFile): IAsyncOperation_XmlDocument_ {
    val fnPtr = IXmlDocumentStatics_VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.IAsyncOperation_XmlDocument_.ByReference()
    val hr = fn.invokeHR(arrayOf(IXmlDocumentStatics_Ptr, file, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public fun LoadFromFileAsync(`file`: IStorageFile, loadSettings: XmlLoadSettings):
      IAsyncOperation_XmlDocument_ {
    val fnPtr = IXmlDocumentStatics_VtblPtr!!.getPointer(9L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
    val result = Windows.Foundation.IAsyncOperation_XmlDocument_.ByReference()
    val hr = fn.invokeHR(arrayOf(IXmlDocumentStatics_Ptr, file, loadSettings, result))
    if (hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val resultValue = result.getValue()
    return resultValue
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE) {
    public fun getValue() = ABI.makeIXmlDocumentStatics(pointer.getPointer(0))

    public fun setValue(`value`: IXmlDocumentStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public class IXmlDocumentStatics_Impl(
    ptr: Pointer? = Pointer.NULL,
  ) : PointerType(ptr), IXmlDocumentStatics {
    public override val IXmlDocumentStatics_Ptr: Pointer?
      get() = pointer
  }

  public object ABI {
    public val IID: Guid.IID = Guid.IID("5543d254d7574b799539232b18f50bf1")

    public fun makeIXmlDocumentStatics(ptr: Pointer?): IXmlDocumentStatics =
        IXmlDocumentStatics_Impl(ptr)
  }

  public companion object {
    public fun makeArray(vararg elements: IXmlDocumentStatics): Array<IXmlDocumentStatics> =
        (elements as
        Array<IXmlDocumentStatics>).castToImpl<IXmlDocumentStatics,IXmlDocumentStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IXmlDocumentStatics?> =
        arrayOfNulls<IXmlDocumentStatics_Impl>(size) as Array<IXmlDocumentStatics?>
  }
}

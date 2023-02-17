package Windows.Storage.FileProperties

import com.sun.jna.FromNativeContext
import com.sun.jna.NativeMapped
import java.lang.Class
import java.lang.IllegalArgumentException
import java.lang.Integer
import kotlin.Any
import kotlin.Int
import kotlin.Unit

public enum class PhotoOrientation(
  public val `value`: Int,
) : NativeMapped {
  Unspecified(0),
  Normal(1),
  FlipHorizontal(2),
  Rotate180(3),
  FlipVertical(4),
  Transpose(5),
  Rotate270(6),
  Transverse(7),
  Rotate90(8),
  ;

  public override fun fromNative(nativeValue: Any?, context: FromNativeContext?): PhotoOrientation {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Unspecified
      1 -> Normal
      2 -> FlipHorizontal
      3 -> Rotate180
      4 -> FlipVertical
      5 -> Transpose
      6 -> Rotate270
      7 -> Transverse
      8 -> Rotate90
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4) {
    public fun setValue(newValue: PhotoOrientation): Unit {
      pointer.setInt(0, newValue.value)
    }

    public fun getValue(): PhotoOrientation =
        PhotoOrientation.values()[0].fromNative(this.pointer.getInt(0), null)
  }
}

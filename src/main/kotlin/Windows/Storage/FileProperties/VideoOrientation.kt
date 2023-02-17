package Windows.Storage.FileProperties

import com.sun.jna.FromNativeContext
import com.sun.jna.NativeMapped
import java.lang.Class
import java.lang.IllegalArgumentException
import java.lang.Integer
import kotlin.Any
import kotlin.Int
import kotlin.Unit

public enum class VideoOrientation(
  public val `value`: Int,
) : NativeMapped {
  Normal(0),
  Rotate90(90),
  Rotate180(180),
  Rotate270(270),
  ;

  public override fun fromNative(nativeValue: Any?, context: FromNativeContext?): VideoOrientation {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Normal
      90 -> Rotate90
      180 -> Rotate180
      270 -> Rotate270
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4) {
    public fun setValue(newValue: VideoOrientation): Unit {
      pointer.setInt(0, newValue.value)
    }

    public fun getValue(): VideoOrientation =
        VideoOrientation.values()[0].fromNative(this.pointer.getInt(0), null)
  }
}

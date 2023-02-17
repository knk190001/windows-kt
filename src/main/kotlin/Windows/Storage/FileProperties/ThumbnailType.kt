package Windows.Storage.FileProperties

import com.sun.jna.FromNativeContext
import com.sun.jna.NativeMapped
import java.lang.Class
import java.lang.IllegalArgumentException
import java.lang.Integer
import kotlin.Any
import kotlin.Int
import kotlin.Unit

public enum class ThumbnailType(
  public val `value`: Int,
) : NativeMapped {
  Image(0),
  Icon(1),
  ;

  public override fun fromNative(nativeValue: Any?, context: FromNativeContext?): ThumbnailType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Image
      1 -> Icon
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4) {
    public fun setValue(newValue: ThumbnailType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public fun getValue(): ThumbnailType =
        ThumbnailType.values()[0].fromNative(this.pointer.getInt(0), null)
  }
}

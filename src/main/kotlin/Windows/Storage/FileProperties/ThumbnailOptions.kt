package Windows.Storage.FileProperties

import com.sun.jna.FromNativeContext
import com.sun.jna.NativeMapped
import java.lang.Class
import java.lang.IllegalArgumentException
import java.lang.Integer
import kotlin.Any
import kotlin.Int
import kotlin.Unit

public enum class ThumbnailOptions(
  public val `value`: Int,
) : NativeMapped {
  None(0),
  ReturnOnlyIfCached(1),
  ResizeThumbnail(2),
  UseCurrentScale(4),
  ;

  public override fun fromNative(nativeValue: Any?, context: FromNativeContext?): ThumbnailOptions {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> ReturnOnlyIfCached
      2 -> ResizeThumbnail
      4 -> UseCurrentScale
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4) {
    public fun setValue(newValue: ThumbnailOptions): Unit {
      pointer.setInt(0, newValue.value)
    }

    public fun getValue(): ThumbnailOptions =
        ThumbnailOptions.values()[0].fromNative(this.pointer.getInt(0), null)
  }
}

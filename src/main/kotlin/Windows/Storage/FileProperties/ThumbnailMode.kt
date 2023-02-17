package Windows.Storage.FileProperties

import com.sun.jna.FromNativeContext
import com.sun.jna.NativeMapped
import java.lang.Class
import java.lang.IllegalArgumentException
import java.lang.Integer
import kotlin.Any
import kotlin.Int
import kotlin.Unit

public enum class ThumbnailMode(
  public val `value`: Int,
) : NativeMapped {
  PicturesView(0),
  VideosView(1),
  MusicView(2),
  DocumentsView(3),
  ListView(4),
  SingleItem(5),
  ;

  public override fun fromNative(nativeValue: Any?, context: FromNativeContext?): ThumbnailMode {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> PicturesView
      1 -> VideosView
      2 -> MusicView
      3 -> DocumentsView
      4 -> ListView
      5 -> SingleItem
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4) {
    public fun setValue(newValue: ThumbnailMode): Unit {
      pointer.setInt(0, newValue.value)
    }

    public fun getValue(): ThumbnailMode =
        ThumbnailMode.values()[0].fromNative(this.pointer.getInt(0), null)
  }
}

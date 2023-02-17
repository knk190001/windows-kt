package Windows.Storage.FileProperties

import com.sun.jna.FromNativeContext
import com.sun.jna.NativeMapped
import java.lang.Class
import java.lang.IllegalArgumentException
import java.lang.Integer
import kotlin.Any
import kotlin.Int
import kotlin.Unit

public enum class PropertyPrefetchOptions(
  public val `value`: Int,
) : NativeMapped {
  None(0),
  MusicProperties(1),
  VideoProperties(2),
  ImageProperties(4),
  DocumentProperties(8),
  BasicProperties(16),
  ;

  public override fun fromNative(nativeValue: Any?, context: FromNativeContext?):
      PropertyPrefetchOptions {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> MusicProperties
      2 -> VideoProperties
      4 -> ImageProperties
      8 -> DocumentProperties
      16 -> BasicProperties
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4) {
    public fun setValue(newValue: PropertyPrefetchOptions): Unit {
      pointer.setInt(0, newValue.value)
    }

    public fun getValue(): PropertyPrefetchOptions =
        PropertyPrefetchOptions.values()[0].fromNative(this.pointer.getInt(0), null)
  }
}

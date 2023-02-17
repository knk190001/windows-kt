package Windows.System

import com.sun.jna.FromNativeContext
import com.sun.jna.NativeMapped
import java.lang.Class
import java.lang.IllegalArgumentException
import java.lang.Integer
import kotlin.Any
import kotlin.Int
import kotlin.Unit

public enum class UserPictureSize(
  public val `value`: Int,
) : NativeMapped {
  Size64x64(0),
  Size208x208(1),
  Size424x424(2),
  Size1080x1080(3),
  ;

  public override fun fromNative(nativeValue: Any?, context: FromNativeContext?): UserPictureSize {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Size64x64
      1 -> Size208x208
      2 -> Size424x424
      3 -> Size1080x1080
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4) {
    public fun setValue(newValue: UserPictureSize): Unit {
      pointer.setInt(0, newValue.value)
    }

    public fun getValue(): UserPictureSize =
        UserPictureSize.values()[0].fromNative(this.pointer.getInt(0), null)
  }
}

package Windows.UI.Notifications

import com.sun.jna.FromNativeContext
import com.sun.jna.NativeMapped
import java.lang.Class
import java.lang.IllegalArgumentException
import java.lang.Integer
import kotlin.Any
import kotlin.Int
import kotlin.Unit

public enum class AdaptiveNotificationContentKind(
  public val `value`: Int,
) : NativeMapped {
  Text(0),
  ;

  public override fun fromNative(nativeValue: Any?, context: FromNativeContext?):
      AdaptiveNotificationContentKind {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Text
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4) {
    public fun setValue(newValue: AdaptiveNotificationContentKind): Unit {
      pointer.setInt(0, newValue.value)
    }

    public fun getValue(): AdaptiveNotificationContentKind =
        AdaptiveNotificationContentKind.values()[0].fromNative(this.pointer.getInt(0), null)
  }
}

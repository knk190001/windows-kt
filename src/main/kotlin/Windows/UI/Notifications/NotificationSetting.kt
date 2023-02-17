package Windows.UI.Notifications

import com.sun.jna.FromNativeContext
import com.sun.jna.NativeMapped
import java.lang.Class
import java.lang.IllegalArgumentException
import java.lang.Integer
import kotlin.Any
import kotlin.Int
import kotlin.Unit

public enum class NotificationSetting(
  public val `value`: Int,
) : NativeMapped {
  Enabled(0),
  DisabledForApplication(1),
  DisabledForUser(2),
  DisabledByGroupPolicy(3),
  DisabledByManifest(4),
  ;

  public override fun fromNative(nativeValue: Any?, context: FromNativeContext?):
      NotificationSetting {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Enabled
      1 -> DisabledForApplication
      2 -> DisabledForUser
      3 -> DisabledByGroupPolicy
      4 -> DisabledByManifest
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4) {
    public fun setValue(newValue: NotificationSetting): Unit {
      pointer.setInt(0, newValue.value)
    }

    public fun getValue(): NotificationSetting =
        NotificationSetting.values()[0].fromNative(this.pointer.getInt(0), null)
  }
}

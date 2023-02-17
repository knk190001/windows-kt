package Windows.UI.Notifications

import com.sun.jna.FromNativeContext
import com.sun.jna.NativeMapped
import java.lang.Class
import java.lang.IllegalArgumentException
import java.lang.Integer
import kotlin.Any
import kotlin.Int
import kotlin.Unit

public enum class ToastNotificationPriority(
  public val `value`: Int,
) : NativeMapped {
  Default(0),
  High(1),
  ;

  public override fun fromNative(nativeValue: Any?, context: FromNativeContext?):
      ToastNotificationPriority {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Default
      1 -> High
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4) {
    public fun setValue(newValue: ToastNotificationPriority): Unit {
      pointer.setInt(0, newValue.value)
    }

    public fun getValue(): ToastNotificationPriority =
        ToastNotificationPriority.values()[0].fromNative(this.pointer.getInt(0), null)
  }
}

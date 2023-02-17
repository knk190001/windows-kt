package Windows.UI.Notifications

import com.sun.jna.FromNativeContext
import com.sun.jna.NativeMapped
import java.lang.Class
import java.lang.IllegalArgumentException
import java.lang.Integer
import kotlin.Any
import kotlin.Int
import kotlin.Unit

public enum class ToastNotificationMode(
  public val `value`: Int,
) : NativeMapped {
  Unrestricted(0),
  PriorityOnly(1),
  AlarmsOnly(2),
  ;

  public override fun fromNative(nativeValue: Any?, context: FromNativeContext?):
      ToastNotificationMode {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Unrestricted
      1 -> PriorityOnly
      2 -> AlarmsOnly
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4) {
    public fun setValue(newValue: ToastNotificationMode): Unit {
      pointer.setInt(0, newValue.value)
    }

    public fun getValue(): ToastNotificationMode =
        ToastNotificationMode.values()[0].fromNative(this.pointer.getInt(0), null)
  }
}

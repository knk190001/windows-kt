package Windows.UI.Notifications

import com.sun.jna.FromNativeContext
import com.sun.jna.NativeMapped
import java.lang.Class
import java.lang.IllegalArgumentException
import java.lang.Integer
import kotlin.Any
import kotlin.Int
import kotlin.Unit

public enum class NotificationUpdateResult(
  public val `value`: Int,
) : NativeMapped {
  Succeeded(0),
  Failed(1),
  NotificationNotFound(2),
  ;

  public override fun fromNative(nativeValue: Any?, context: FromNativeContext?):
      NotificationUpdateResult {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Succeeded
      1 -> Failed
      2 -> NotificationNotFound
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4) {
    public fun setValue(newValue: NotificationUpdateResult): Unit {
      pointer.setInt(0, newValue.value)
    }

    public fun getValue(): NotificationUpdateResult =
        NotificationUpdateResult.values()[0].fromNative(this.pointer.getInt(0), null)
  }
}

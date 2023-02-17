package Windows.UI.Notifications

import com.sun.jna.FromNativeContext
import com.sun.jna.NativeMapped
import java.lang.Class
import java.lang.IllegalArgumentException
import java.lang.Integer
import kotlin.Any
import kotlin.Int
import kotlin.Unit

public enum class UserNotificationChangedKind(
  public val `value`: Int,
) : NativeMapped {
  Added(0),
  Removed(1),
  ;

  public override fun fromNative(nativeValue: Any?, context: FromNativeContext?):
      UserNotificationChangedKind {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Added
      1 -> Removed
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4) {
    public fun setValue(newValue: UserNotificationChangedKind): Unit {
      pointer.setInt(0, newValue.value)
    }

    public fun getValue(): UserNotificationChangedKind =
        UserNotificationChangedKind.values()[0].fromNative(this.pointer.getInt(0), null)
  }
}

package Windows.UI.Notifications

import com.sun.jna.FromNativeContext
import com.sun.jna.NativeMapped
import java.lang.Class
import java.lang.IllegalArgumentException
import java.lang.Integer
import kotlin.Any
import kotlin.Int
import kotlin.Unit

public enum class NotificationMirroring(
  public val `value`: Int,
) : NativeMapped {
  Allowed(0),
  Disabled(1),
  ;

  public override fun fromNative(nativeValue: Any?, context: FromNativeContext?):
      NotificationMirroring {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Allowed
      1 -> Disabled
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4) {
    public fun setValue(newValue: NotificationMirroring): Unit {
      pointer.setInt(0, newValue.value)
    }

    public fun getValue(): NotificationMirroring =
        NotificationMirroring.values()[0].fromNative(this.pointer.getInt(0), null)
  }
}

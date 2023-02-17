package Windows.UI.Notifications

import com.sun.jna.FromNativeContext
import com.sun.jna.NativeMapped
import java.lang.Class
import java.lang.IllegalArgumentException
import java.lang.Integer
import kotlin.Any
import kotlin.Int
import kotlin.Unit

public enum class ToastDismissalReason(
  public val `value`: Int,
) : NativeMapped {
  UserCanceled(0),
  ApplicationHidden(1),
  TimedOut(2),
  ;

  public override fun fromNative(nativeValue: Any?, context: FromNativeContext?):
      ToastDismissalReason {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> UserCanceled
      1 -> ApplicationHidden
      2 -> TimedOut
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4) {
    public fun setValue(newValue: ToastDismissalReason): Unit {
      pointer.setInt(0, newValue.value)
    }

    public fun getValue(): ToastDismissalReason =
        ToastDismissalReason.values()[0].fromNative(this.pointer.getInt(0), null)
  }
}

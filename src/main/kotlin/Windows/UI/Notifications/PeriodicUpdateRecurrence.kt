package Windows.UI.Notifications

import com.sun.jna.FromNativeContext
import com.sun.jna.NativeMapped
import java.lang.Class
import java.lang.IllegalArgumentException
import java.lang.Integer
import kotlin.Any
import kotlin.Int
import kotlin.Unit

public enum class PeriodicUpdateRecurrence(
  public val `value`: Int,
) : NativeMapped {
  HalfHour(0),
  Hour(1),
  SixHours(2),
  TwelveHours(3),
  Daily(4),
  ;

  public override fun fromNative(nativeValue: Any?, context: FromNativeContext?):
      PeriodicUpdateRecurrence {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> HalfHour
      1 -> Hour
      2 -> SixHours
      3 -> TwelveHours
      4 -> Daily
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4) {
    public fun setValue(newValue: PeriodicUpdateRecurrence): Unit {
      pointer.setInt(0, newValue.value)
    }

    public fun getValue(): PeriodicUpdateRecurrence =
        PeriodicUpdateRecurrence.values()[0].fromNative(this.pointer.getInt(0), null)
  }
}

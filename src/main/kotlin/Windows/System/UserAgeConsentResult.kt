package Windows.System

import com.sun.jna.FromNativeContext
import com.sun.jna.NativeMapped
import java.lang.Class
import java.lang.IllegalArgumentException
import java.lang.Integer
import kotlin.Any
import kotlin.Int
import kotlin.Unit

public enum class UserAgeConsentResult(
  public val `value`: Int,
) : NativeMapped {
  NotEnforced(0),
  Included(1),
  NotIncluded(2),
  Unknown(3),
  Ambiguous(4),
  ;

  public override fun fromNative(nativeValue: Any?, context: FromNativeContext?):
      UserAgeConsentResult {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> NotEnforced
      1 -> Included
      2 -> NotIncluded
      3 -> Unknown
      4 -> Ambiguous
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4) {
    public fun setValue(newValue: UserAgeConsentResult): Unit {
      pointer.setInt(0, newValue.value)
    }

    public fun getValue(): UserAgeConsentResult =
        UserAgeConsentResult.values()[0].fromNative(this.pointer.getInt(0), null)
  }
}

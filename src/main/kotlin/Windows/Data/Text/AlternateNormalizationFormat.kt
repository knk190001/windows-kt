package Windows.Data.Text

import com.sun.jna.FromNativeContext
import com.sun.jna.NativeMapped
import java.lang.Class
import java.lang.IllegalArgumentException
import java.lang.Integer
import kotlin.Any
import kotlin.Int
import kotlin.Unit

public enum class AlternateNormalizationFormat(
  public val `value`: Int,
) : NativeMapped {
  NotNormalized(0),
  Number(1),
  Currency(3),
  Date(4),
  Time(5),
  ;

  public override fun fromNative(nativeValue: Any?, context: FromNativeContext?):
      AlternateNormalizationFormat {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> NotNormalized
      1 -> Number
      3 -> Currency
      4 -> Date
      5 -> Time
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4) {
    public fun setValue(newValue: AlternateNormalizationFormat): Unit {
      pointer.setInt(0, newValue.value)
    }

    public fun getValue(): AlternateNormalizationFormat =
        AlternateNormalizationFormat.values()[0].fromNative(this.pointer.getInt(0), null)
  }
}

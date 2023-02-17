package Windows.Data.Text

import com.sun.jna.FromNativeContext
import com.sun.jna.NativeMapped
import java.lang.Class
import java.lang.IllegalArgumentException
import java.lang.Integer
import kotlin.Any
import kotlin.Int
import kotlin.Unit

public enum class TextPredictionOptions(
  public val `value`: Int,
) : NativeMapped {
  None(0),
  Predictions(1),
  Corrections(2),
  ;

  public override fun fromNative(nativeValue: Any?, context: FromNativeContext?):
      TextPredictionOptions {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> Predictions
      2 -> Corrections
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4) {
    public fun setValue(newValue: TextPredictionOptions): Unit {
      pointer.setInt(0, newValue.value)
    }

    public fun getValue(): TextPredictionOptions =
        TextPredictionOptions.values()[0].fromNative(this.pointer.getInt(0), null)
  }
}

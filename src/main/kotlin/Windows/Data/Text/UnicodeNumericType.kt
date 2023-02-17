package Windows.Data.Text

import com.sun.jna.FromNativeContext
import com.sun.jna.NativeMapped
import java.lang.Class
import java.lang.IllegalArgumentException
import java.lang.Integer
import kotlin.Any
import kotlin.Int
import kotlin.Unit

public enum class UnicodeNumericType(
  public val `value`: Int,
) : NativeMapped {
  None(0),
  Decimal(1),
  Digit(2),
  Numeric(3),
  ;

  public override fun fromNative(nativeValue: Any?, context: FromNativeContext?):
      UnicodeNumericType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> Decimal
      2 -> Digit
      3 -> Numeric
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4) {
    public fun setValue(newValue: UnicodeNumericType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public fun getValue(): UnicodeNumericType =
        UnicodeNumericType.values()[0].fromNative(this.pointer.getInt(0), null)
  }
}

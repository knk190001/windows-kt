package Windows.Data.Json

import com.sun.jna.FromNativeContext
import com.sun.jna.NativeMapped
import java.lang.Class
import java.lang.IllegalArgumentException
import java.lang.Integer
import kotlin.Any
import kotlin.Int
import kotlin.Unit

public enum class JsonValueType(
  public val `value`: Int,
) : NativeMapped {
  Null(0),
  Boolean(1),
  Number(2),
  String(3),
  Array(4),
  Object(5),
  ;

  public override fun fromNative(nativeValue: Any?, context: FromNativeContext?): JsonValueType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Null
      1 -> Boolean
      2 -> Number
      3 -> String
      4 -> Array
      5 -> Object
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4) {
    public fun setValue(newValue: JsonValueType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public fun getValue(): JsonValueType =
        JsonValueType.values()[0].fromNative(this.pointer.getInt(0), null)
  }
}

package Windows.Data.Json

import com.sun.jna.FromNativeContext
import com.sun.jna.NativeMapped
import java.lang.Class
import java.lang.IllegalArgumentException
import java.lang.Integer
import kotlin.Any
import kotlin.Int
import kotlin.Unit

public enum class JsonErrorStatus(
  public val `value`: Int,
) : NativeMapped {
  Unknown(0),
  InvalidJsonString(1),
  InvalidJsonNumber(2),
  JsonValueNotFound(3),
  ImplementationLimit(4),
  ;

  public override fun fromNative(nativeValue: Any?, context: FromNativeContext?): JsonErrorStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Unknown
      1 -> InvalidJsonString
      2 -> InvalidJsonNumber
      3 -> JsonValueNotFound
      4 -> ImplementationLimit
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4) {
    public fun setValue(newValue: JsonErrorStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public fun getValue(): JsonErrorStatus =
        JsonErrorStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }
}

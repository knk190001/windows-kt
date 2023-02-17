package Windows.Foundation

import com.sun.jna.FromNativeContext
import com.sun.jna.NativeMapped
import java.lang.Class
import java.lang.IllegalArgumentException
import java.lang.Integer
import kotlin.Any
import kotlin.Int
import kotlin.Unit

public enum class AsyncStatus(
  public val `value`: Int,
) : NativeMapped {
  Canceled(2),
  Completed(1),
  Error(3),
  Started(0),
  ;

  public override fun fromNative(nativeValue: Any?, context: FromNativeContext?): AsyncStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      2 -> Canceled
      1 -> Completed
      3 -> Error
      0 -> Started
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4) {
    public fun setValue(newValue: AsyncStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public fun getValue(): AsyncStatus = AsyncStatus.values()[0].fromNative(this.pointer.getInt(0),
        null)
  }
}

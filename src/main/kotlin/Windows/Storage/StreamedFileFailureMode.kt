package Windows.Storage

import com.sun.jna.FromNativeContext
import com.sun.jna.NativeMapped
import java.lang.Class
import java.lang.IllegalArgumentException
import java.lang.Integer
import kotlin.Any
import kotlin.Int
import kotlin.Unit

public enum class StreamedFileFailureMode(
  public val `value`: Int,
) : NativeMapped {
  Failed(0),
  CurrentlyUnavailable(1),
  Incomplete(2),
  ;

  public override fun fromNative(nativeValue: Any?, context: FromNativeContext?):
      StreamedFileFailureMode {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Failed
      1 -> CurrentlyUnavailable
      2 -> Incomplete
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4) {
    public fun setValue(newValue: StreamedFileFailureMode): Unit {
      pointer.setInt(0, newValue.value)
    }

    public fun getValue(): StreamedFileFailureMode =
        StreamedFileFailureMode.values()[0].fromNative(this.pointer.getInt(0), null)
  }
}

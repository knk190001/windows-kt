package Windows.ApplicationModel

import com.sun.jna.FromNativeContext
import com.sun.jna.NativeMapped
import java.lang.Class
import java.lang.IllegalArgumentException
import java.lang.Integer
import kotlin.Any
import kotlin.Int
import kotlin.Unit

public enum class AppExecutionContext(
  public val `value`: Int,
) : NativeMapped {
  Unknown(0),
  Host(1),
  Guest(2),
  ;

  public override fun fromNative(nativeValue: Any?, context: FromNativeContext?):
      AppExecutionContext {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Unknown
      1 -> Host
      2 -> Guest
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4) {
    public fun setValue(newValue: AppExecutionContext): Unit {
      pointer.setInt(0, newValue.value)
    }

    public fun getValue(): AppExecutionContext =
        AppExecutionContext.values()[0].fromNative(this.pointer.getInt(0), null)
  }
}

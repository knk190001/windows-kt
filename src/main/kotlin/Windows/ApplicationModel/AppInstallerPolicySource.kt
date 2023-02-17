package Windows.ApplicationModel

import com.sun.jna.FromNativeContext
import com.sun.jna.NativeMapped
import java.lang.Class
import java.lang.IllegalArgumentException
import java.lang.Integer
import kotlin.Any
import kotlin.Int
import kotlin.Unit

public enum class AppInstallerPolicySource(
  public val `value`: Int,
) : NativeMapped {
  Default(0),
  System(1),
  ;

  public override fun fromNative(nativeValue: Any?, context: FromNativeContext?):
      AppInstallerPolicySource {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Default
      1 -> System
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4) {
    public fun setValue(newValue: AppInstallerPolicySource): Unit {
      pointer.setInt(0, newValue.value)
    }

    public fun getValue(): AppInstallerPolicySource =
        AppInstallerPolicySource.values()[0].fromNative(this.pointer.getInt(0), null)
  }
}

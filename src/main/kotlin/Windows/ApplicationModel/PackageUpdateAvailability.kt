package Windows.ApplicationModel

import com.sun.jna.FromNativeContext
import com.sun.jna.NativeMapped
import java.lang.Class
import java.lang.IllegalArgumentException
import java.lang.Integer
import kotlin.Any
import kotlin.Int
import kotlin.Unit

public enum class PackageUpdateAvailability(
  public val `value`: Int,
) : NativeMapped {
  Unknown(0),
  NoUpdates(1),
  Available(2),
  Required(3),
  Error(4),
  ;

  public override fun fromNative(nativeValue: Any?, context: FromNativeContext?):
      PackageUpdateAvailability {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Unknown
      1 -> NoUpdates
      2 -> Available
      3 -> Required
      4 -> Error
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4) {
    public fun setValue(newValue: PackageUpdateAvailability): Unit {
      pointer.setInt(0, newValue.value)
    }

    public fun getValue(): PackageUpdateAvailability =
        PackageUpdateAvailability.values()[0].fromNative(this.pointer.getInt(0), null)
  }
}

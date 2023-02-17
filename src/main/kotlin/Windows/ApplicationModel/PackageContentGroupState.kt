package Windows.ApplicationModel

import com.sun.jna.FromNativeContext
import com.sun.jna.NativeMapped
import java.lang.Class
import java.lang.IllegalArgumentException
import java.lang.Integer
import kotlin.Any
import kotlin.Int
import kotlin.Unit

public enum class PackageContentGroupState(
  public val `value`: Int,
) : NativeMapped {
  NotStaged(0),
  Queued(1),
  Staging(2),
  Staged(3),
  ;

  public override fun fromNative(nativeValue: Any?, context: FromNativeContext?):
      PackageContentGroupState {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> NotStaged
      1 -> Queued
      2 -> Staging
      3 -> Staged
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4) {
    public fun setValue(newValue: PackageContentGroupState): Unit {
      pointer.setInt(0, newValue.value)
    }

    public fun getValue(): PackageContentGroupState =
        PackageContentGroupState.values()[0].fromNative(this.pointer.getInt(0), null)
  }
}

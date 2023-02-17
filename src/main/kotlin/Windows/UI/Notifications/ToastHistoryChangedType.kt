package Windows.UI.Notifications

import com.sun.jna.FromNativeContext
import com.sun.jna.NativeMapped
import java.lang.Class
import java.lang.IllegalArgumentException
import java.lang.Integer
import kotlin.Any
import kotlin.Int
import kotlin.Unit

public enum class ToastHistoryChangedType(
  public val `value`: Int,
) : NativeMapped {
  Cleared(0),
  Removed(1),
  Expired(2),
  Added(3),
  ;

  public override fun fromNative(nativeValue: Any?, context: FromNativeContext?):
      ToastHistoryChangedType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Cleared
      1 -> Removed
      2 -> Expired
      3 -> Added
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4) {
    public fun setValue(newValue: ToastHistoryChangedType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public fun getValue(): ToastHistoryChangedType =
        ToastHistoryChangedType.values()[0].fromNative(this.pointer.getInt(0), null)
  }
}

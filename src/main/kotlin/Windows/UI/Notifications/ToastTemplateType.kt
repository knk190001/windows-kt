package Windows.UI.Notifications

import com.sun.jna.FromNativeContext
import com.sun.jna.NativeMapped
import java.lang.Class
import java.lang.IllegalArgumentException
import java.lang.Integer
import kotlin.Any
import kotlin.Int
import kotlin.Unit

public enum class ToastTemplateType(
  public val `value`: Int,
) : NativeMapped {
  ToastImageAndText01(0),
  ToastImageAndText02(1),
  ToastImageAndText03(2),
  ToastImageAndText04(3),
  ToastText01(4),
  ToastText02(5),
  ToastText03(6),
  ToastText04(7),
  ;

  public override fun fromNative(nativeValue: Any?, context: FromNativeContext?):
      ToastTemplateType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> ToastImageAndText01
      1 -> ToastImageAndText02
      2 -> ToastImageAndText03
      3 -> ToastImageAndText04
      4 -> ToastText01
      5 -> ToastText02
      6 -> ToastText03
      7 -> ToastText04
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4) {
    public fun setValue(newValue: ToastTemplateType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public fun getValue(): ToastTemplateType =
        ToastTemplateType.values()[0].fromNative(this.pointer.getInt(0), null)
  }
}

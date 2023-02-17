package Windows.ApplicationModel

import com.sun.jna.FromNativeContext
import com.sun.jna.NativeMapped
import java.lang.Class
import java.lang.IllegalArgumentException
import java.lang.Integer
import kotlin.Any
import kotlin.Int
import kotlin.Unit

public enum class PackageSignatureKind(
  public val `value`: Int,
) : NativeMapped {
  None(0),
  Developer(1),
  Enterprise(2),
  Store(3),
  System(4),
  ;

  public override fun fromNative(nativeValue: Any?, context: FromNativeContext?):
      PackageSignatureKind {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> Developer
      2 -> Enterprise
      3 -> Store
      4 -> System
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4) {
    public fun setValue(newValue: PackageSignatureKind): Unit {
      pointer.setInt(0, newValue.value)
    }

    public fun getValue(): PackageSignatureKind =
        PackageSignatureKind.values()[0].fromNative(this.pointer.getInt(0), null)
  }
}

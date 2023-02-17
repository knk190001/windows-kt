package Windows.Storage

import com.sun.jna.FromNativeContext
import com.sun.jna.NativeMapped
import java.lang.Class
import java.lang.IllegalArgumentException
import java.lang.Integer
import kotlin.Any
import kotlin.Int
import kotlin.Unit

public enum class CreationCollisionOption(
  public val `value`: Int,
) : NativeMapped {
  GenerateUniqueName(0),
  ReplaceExisting(1),
  FailIfExists(2),
  OpenIfExists(3),
  ;

  public override fun fromNative(nativeValue: Any?, context: FromNativeContext?):
      CreationCollisionOption {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> GenerateUniqueName
      1 -> ReplaceExisting
      2 -> FailIfExists
      3 -> OpenIfExists
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4) {
    public fun setValue(newValue: CreationCollisionOption): Unit {
      pointer.setInt(0, newValue.value)
    }

    public fun getValue(): CreationCollisionOption =
        CreationCollisionOption.values()[0].fromNative(this.pointer.getInt(0), null)
  }
}
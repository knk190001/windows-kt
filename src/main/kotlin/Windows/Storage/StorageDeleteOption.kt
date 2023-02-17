package Windows.Storage

import com.sun.jna.FromNativeContext
import com.sun.jna.NativeMapped
import java.lang.Class
import java.lang.IllegalArgumentException
import java.lang.Integer
import kotlin.Any
import kotlin.Int
import kotlin.Unit

public enum class StorageDeleteOption(
  public val `value`: Int,
) : NativeMapped {
  Default(0),
  PermanentDelete(1),
  ;

  public override fun fromNative(nativeValue: Any?, context: FromNativeContext?):
      StorageDeleteOption {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Default
      1 -> PermanentDelete
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4) {
    public fun setValue(newValue: StorageDeleteOption): Unit {
      pointer.setInt(0, newValue.value)
    }

    public fun getValue(): StorageDeleteOption =
        StorageDeleteOption.values()[0].fromNative(this.pointer.getInt(0), null)
  }
}

package Windows.Storage

import com.sun.jna.FromNativeContext
import com.sun.jna.NativeMapped
import java.lang.Class
import java.lang.IllegalArgumentException
import java.lang.Integer
import kotlin.Any
import kotlin.Int
import kotlin.Unit

public enum class FileAttributes(
  public val `value`: Int,
) : NativeMapped {
  Normal(0),
  ReadOnly(1),
  Directory(16),
  Archive(32),
  Temporary(256),
  LocallyIncomplete(512),
  ;

  public override fun fromNative(nativeValue: Any?, context: FromNativeContext?): FileAttributes {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Normal
      1 -> ReadOnly
      16 -> Directory
      32 -> Archive
      256 -> Temporary
      512 -> LocallyIncomplete
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4) {
    public fun setValue(newValue: FileAttributes): Unit {
      pointer.setInt(0, newValue.value)
    }

    public fun getValue(): FileAttributes =
        FileAttributes.values()[0].fromNative(this.pointer.getInt(0), null)
  }
}

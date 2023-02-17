package Windows.Storage

import com.sun.jna.FromNativeContext
import com.sun.jna.NativeMapped
import java.lang.Class
import java.lang.IllegalArgumentException
import java.lang.Integer
import kotlin.Any
import kotlin.Int
import kotlin.Unit

public enum class StorageItemTypes(
  public val `value`: Int,
) : NativeMapped {
  None(0),
  File(1),
  Folder(2),
  ;

  public override fun fromNative(nativeValue: Any?, context: FromNativeContext?): StorageItemTypes {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> File
      2 -> Folder
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4) {
    public fun setValue(newValue: StorageItemTypes): Unit {
      pointer.setInt(0, newValue.value)
    }

    public fun getValue(): StorageItemTypes =
        StorageItemTypes.values()[0].fromNative(this.pointer.getInt(0), null)
  }
}

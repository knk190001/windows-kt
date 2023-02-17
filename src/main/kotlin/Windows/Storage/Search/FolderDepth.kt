package Windows.Storage.Search

import com.sun.jna.FromNativeContext
import com.sun.jna.NativeMapped
import java.lang.Class
import java.lang.IllegalArgumentException
import java.lang.Integer
import kotlin.Any
import kotlin.Int
import kotlin.Unit

public enum class FolderDepth(
  public val `value`: Int,
) : NativeMapped {
  Shallow(0),
  Deep(1),
  ;

  public override fun fromNative(nativeValue: Any?, context: FromNativeContext?): FolderDepth {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Shallow
      1 -> Deep
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4) {
    public fun setValue(newValue: FolderDepth): Unit {
      pointer.setInt(0, newValue.value)
    }

    public fun getValue(): FolderDepth = FolderDepth.values()[0].fromNative(this.pointer.getInt(0),
        null)
  }
}

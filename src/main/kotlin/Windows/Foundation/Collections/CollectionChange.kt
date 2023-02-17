package Windows.Foundation.Collections

import com.sun.jna.FromNativeContext
import com.sun.jna.NativeMapped
import java.lang.Class
import java.lang.IllegalArgumentException
import java.lang.Integer
import kotlin.Any
import kotlin.Int
import kotlin.Unit

public enum class CollectionChange(
  public val `value`: Int,
) : NativeMapped {
  Reset(0),
  ItemInserted(1),
  ItemRemoved(2),
  ItemChanged(3),
  ;

  public override fun fromNative(nativeValue: Any?, context: FromNativeContext?): CollectionChange {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Reset
      1 -> ItemInserted
      2 -> ItemRemoved
      3 -> ItemChanged
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4) {
    public fun setValue(newValue: CollectionChange): Unit {
      pointer.setInt(0, newValue.value)
    }

    public fun getValue(): CollectionChange =
        CollectionChange.values()[0].fromNative(this.pointer.getInt(0), null)
  }
}

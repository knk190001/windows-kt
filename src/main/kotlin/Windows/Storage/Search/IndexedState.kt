package Windows.Storage.Search

import com.sun.jna.FromNativeContext
import com.sun.jna.NativeMapped
import java.lang.Class
import java.lang.IllegalArgumentException
import java.lang.Integer
import kotlin.Any
import kotlin.Int
import kotlin.Unit

public enum class IndexedState(
  public val `value`: Int,
) : NativeMapped {
  Unknown(0),
  NotIndexed(1),
  PartiallyIndexed(2),
  FullyIndexed(3),
  ;

  public override fun fromNative(nativeValue: Any?, context: FromNativeContext?): IndexedState {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Unknown
      1 -> NotIndexed
      2 -> PartiallyIndexed
      3 -> FullyIndexed
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4) {
    public fun setValue(newValue: IndexedState): Unit {
      pointer.setInt(0, newValue.value)
    }

    public fun getValue(): IndexedState =
        IndexedState.values()[0].fromNative(this.pointer.getInt(0), null)
  }
}

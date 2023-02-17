package Windows.Storage.Search

import com.sun.jna.FromNativeContext
import com.sun.jna.NativeMapped
import java.lang.Class
import java.lang.IllegalArgumentException
import java.lang.Integer
import kotlin.Any
import kotlin.Int
import kotlin.Unit

public enum class IndexerOption(
  public val `value`: Int,
) : NativeMapped {
  UseIndexerWhenAvailable(0),
  OnlyUseIndexer(1),
  DoNotUseIndexer(2),
  OnlyUseIndexerAndOptimizeForIndexedProperties(3),
  ;

  public override fun fromNative(nativeValue: Any?, context: FromNativeContext?): IndexerOption {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> UseIndexerWhenAvailable
      1 -> OnlyUseIndexer
      2 -> DoNotUseIndexer
      3 -> OnlyUseIndexerAndOptimizeForIndexedProperties
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4) {
    public fun setValue(newValue: IndexerOption): Unit {
      pointer.setInt(0, newValue.value)
    }

    public fun getValue(): IndexerOption =
        IndexerOption.values()[0].fromNative(this.pointer.getInt(0), null)
  }
}

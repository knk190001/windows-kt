package Windows.Storage.Search

import com.sun.jna.FromNativeContext
import com.sun.jna.NativeMapped
import java.lang.Class
import java.lang.IllegalArgumentException
import java.lang.Integer
import kotlin.Any
import kotlin.Int
import kotlin.Unit

public enum class CommonFileQuery(
  public val `value`: Int,
) : NativeMapped {
  DefaultQuery(0),
  OrderByName(1),
  OrderByTitle(2),
  OrderByMusicProperties(3),
  OrderBySearchRank(4),
  OrderByDate(5),
  ;

  public override fun fromNative(nativeValue: Any?, context: FromNativeContext?): CommonFileQuery {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> DefaultQuery
      1 -> OrderByName
      2 -> OrderByTitle
      3 -> OrderByMusicProperties
      4 -> OrderBySearchRank
      5 -> OrderByDate
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4) {
    public fun setValue(newValue: CommonFileQuery): Unit {
      pointer.setInt(0, newValue.value)
    }

    public fun getValue(): CommonFileQuery =
        CommonFileQuery.values()[0].fromNative(this.pointer.getInt(0), null)
  }
}

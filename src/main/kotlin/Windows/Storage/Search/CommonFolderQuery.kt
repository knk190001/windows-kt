package Windows.Storage.Search

import com.sun.jna.FromNativeContext
import com.sun.jna.NativeMapped
import java.lang.Class
import java.lang.IllegalArgumentException
import java.lang.Integer
import kotlin.Any
import kotlin.Int
import kotlin.Unit

public enum class CommonFolderQuery(
  public val `value`: Int,
) : NativeMapped {
  DefaultQuery(0),
  GroupByYear(100),
  GroupByMonth(101),
  GroupByArtist(102),
  GroupByAlbum(103),
  GroupByAlbumArtist(104),
  GroupByComposer(105),
  GroupByGenre(106),
  GroupByPublishedYear(107),
  GroupByRating(108),
  GroupByTag(109),
  GroupByAuthor(110),
  GroupByType(111),
  ;

  public override fun fromNative(nativeValue: Any?, context: FromNativeContext?):
      CommonFolderQuery {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> DefaultQuery
      100 -> GroupByYear
      101 -> GroupByMonth
      102 -> GroupByArtist
      103 -> GroupByAlbum
      104 -> GroupByAlbumArtist
      105 -> GroupByComposer
      106 -> GroupByGenre
      107 -> GroupByPublishedYear
      108 -> GroupByRating
      109 -> GroupByTag
      110 -> GroupByAuthor
      111 -> GroupByType
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4) {
    public fun setValue(newValue: CommonFolderQuery): Unit {
      pointer.setInt(0, newValue.value)
    }

    public fun getValue(): CommonFolderQuery =
        CommonFolderQuery.values()[0].fromNative(this.pointer.getInt(0), null)
  }
}

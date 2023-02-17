package Windows.Storage

import com.sun.jna.FromNativeContext
import com.sun.jna.NativeMapped
import java.lang.Class
import java.lang.IllegalArgumentException
import java.lang.Integer
import kotlin.Any
import kotlin.Int
import kotlin.Unit

public enum class StorageLibraryChangeType(
  public val `value`: Int,
) : NativeMapped {
  Created(0),
  Deleted(1),
  MovedOrRenamed(2),
  ContentsChanged(3),
  MovedOutOfLibrary(4),
  MovedIntoLibrary(5),
  ContentsReplaced(6),
  IndexingStatusChanged(7),
  EncryptionChanged(8),
  ChangeTrackingLost(9),
  ;

  public override fun fromNative(nativeValue: Any?, context: FromNativeContext?):
      StorageLibraryChangeType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Created
      1 -> Deleted
      2 -> MovedOrRenamed
      3 -> ContentsChanged
      4 -> MovedOutOfLibrary
      5 -> MovedIntoLibrary
      6 -> ContentsReplaced
      7 -> IndexingStatusChanged
      8 -> EncryptionChanged
      9 -> ChangeTrackingLost
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4) {
    public fun setValue(newValue: StorageLibraryChangeType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public fun getValue(): StorageLibraryChangeType =
        StorageLibraryChangeType.values()[0].fromNative(this.pointer.getInt(0), null)
  }
}

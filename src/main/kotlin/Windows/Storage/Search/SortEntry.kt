package Windows.Storage.Search

import com.github.knk190001.winrtbinding.runtime.interfaces.getValue
import com.sun.jna.Pointer
import com.sun.jna.Structure
import kotlin.Boolean
import kotlin.String

@Structure.FieldOrder("PropertyName, AscendingOrder")
public sealed class SortEntry(
  ptr: Pointer? = Pointer.NULL,
) : Structure(ptr) {
  public var PropertyName: String? = null

  public var AscendingOrder: Boolean? = null

  public class ByReference : SortEntry(), Structure.ByReference {
    public fun getValue(): SortEntry = this
  }

  public class ByValue : SortEntry(), Structure.ByValue
}

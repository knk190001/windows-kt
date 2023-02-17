package Windows.Foundation

import com.github.knk190001.winrtbinding.runtime.interfaces.getValue
import com.sun.jna.Pointer
import com.sun.jna.Structure
import kotlin.Long

@Structure.FieldOrder("UniversalTime")
public sealed class DateTime(
  ptr: Pointer? = Pointer.NULL,
) : Structure(ptr) {
  public var UniversalTime: Long? = null

  public class ByReference : DateTime(), Structure.ByReference {
    public fun getValue(): DateTime = this
  }

  public class ByValue : DateTime(), Structure.ByValue
}

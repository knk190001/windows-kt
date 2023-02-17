package Windows.Foundation

import com.github.knk190001.winrtbinding.runtime.interfaces.getValue
import com.sun.jna.Pointer
import com.sun.jna.Structure
import kotlin.Long

@Structure.FieldOrder("Duration")
public sealed class TimeSpan(
  ptr: Pointer? = Pointer.NULL,
) : Structure(ptr) {
  public var Duration: Long? = null

  public class ByReference : TimeSpan(), Structure.ByReference {
    public fun getValue(): TimeSpan = this
  }

  public class ByValue : TimeSpan(), Structure.ByValue
}

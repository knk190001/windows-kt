package Windows.Foundation

import com.github.knk190001.winrtbinding.runtime.interfaces.getValue
import com.sun.jna.Pointer
import com.sun.jna.Structure
import kotlin.Long

@Structure.FieldOrder("Value")
public sealed class EventRegistrationToken(
  ptr: Pointer? = Pointer.NULL,
) : Structure(ptr) {
  public var Value: Long? = null

  public class ByReference : EventRegistrationToken(), Structure.ByReference {
    public fun getValue(): EventRegistrationToken = this
  }

  public class ByValue : EventRegistrationToken(), Structure.ByValue
}

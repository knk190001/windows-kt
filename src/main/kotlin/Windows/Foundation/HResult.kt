package Windows.Foundation

import com.github.knk190001.winrtbinding.runtime.interfaces.getValue
import com.sun.jna.Pointer
import com.sun.jna.Structure
import kotlin.Int

@Structure.FieldOrder("Value")
public sealed class HResult(
  ptr: Pointer? = Pointer.NULL,
) : Structure(ptr) {
  public var Value: Int? = null

  public class ByReference : HResult(), Structure.ByReference {
    public fun getValue(): HResult = this
  }

  public class ByValue : HResult(), Structure.ByValue
}

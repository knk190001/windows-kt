package Windows.Foundation

import com.github.knk190001.winrtbinding.runtime.interfaces.getValue
import com.sun.jna.Pointer
import com.sun.jna.Structure
import kotlin.Float

@Structure.FieldOrder("Width, Height")
public sealed class Size(
  ptr: Pointer? = Pointer.NULL,
) : Structure(ptr) {
  public var Width: Float? = null

  public var Height: Float? = null

  public class ByReference : Size(), Structure.ByReference {
    public fun getValue(): Size = this
  }

  public class ByValue : Size(), Structure.ByValue
}

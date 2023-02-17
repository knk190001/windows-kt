package Windows.Data.Text

import com.github.knk190001.winrtbinding.runtime.interfaces.getValue
import com.sun.jna.Pointer
import com.sun.jna.Structure
import com.sun.jna.platform.win32.WinDef

@Structure.FieldOrder("StartPosition, Length")
public sealed class TextSegment(
  ptr: Pointer? = Pointer.NULL,
) : Structure(ptr) {
  public var StartPosition: WinDef.UINT? = null

  public var Length: WinDef.UINT? = null

  public class ByReference : TextSegment(), Structure.ByReference {
    public fun getValue(): TextSegment = this
  }

  public class ByValue : TextSegment(), Structure.ByValue
}

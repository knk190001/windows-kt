package Windows.ApplicationModel

import com.github.knk190001.winrtbinding.runtime.interfaces.getValue
import com.sun.jna.Pointer
import com.sun.jna.Structure
import com.sun.jna.platform.win32.WinDef

@Structure.FieldOrder("Major, Minor, Build, Revision")
public sealed class PackageVersion(
  ptr: Pointer? = Pointer.NULL,
) : Structure(ptr) {
  public var Major: WinDef.USHORT? = null

  public var Minor: WinDef.USHORT? = null

  public var Build: WinDef.USHORT? = null

  public var Revision: WinDef.USHORT? = null

  public class ByReference : PackageVersion(), Structure.ByReference {
    public fun getValue(): PackageVersion = this
  }

  public class ByValue : PackageVersion(), Structure.ByValue
}

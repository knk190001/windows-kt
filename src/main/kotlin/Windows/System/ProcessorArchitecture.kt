package Windows.System

import com.sun.jna.FromNativeContext
import com.sun.jna.NativeMapped
import java.lang.Class
import java.lang.IllegalArgumentException
import java.lang.Integer
import kotlin.Any
import kotlin.Int
import kotlin.Unit

public enum class ProcessorArchitecture(
  public val `value`: Int,
) : NativeMapped {
  X86(0),
  Arm(5),
  X64(9),
  Neutral(11),
  Arm64(12),
  X86OnArm64(14),
  Unknown(65535),
  ;

  public override fun fromNative(nativeValue: Any?, context: FromNativeContext?):
      ProcessorArchitecture {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> X86
      5 -> Arm
      9 -> X64
      11 -> Neutral
      12 -> Arm64
      14 -> X86OnArm64
      65535 -> Unknown
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4) {
    public fun setValue(newValue: ProcessorArchitecture): Unit {
      pointer.setInt(0, newValue.value)
    }

    public fun getValue(): ProcessorArchitecture =
        ProcessorArchitecture.values()[0].fromNative(this.pointer.getInt(0), null)
  }
}

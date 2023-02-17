package Windows.System

import com.sun.jna.FromNativeContext
import com.sun.jna.NativeMapped
import java.lang.Class
import java.lang.IllegalArgumentException
import java.lang.Integer
import kotlin.Any
import kotlin.Int
import kotlin.Unit

public enum class UserAuthenticationStatus(
  public val `value`: Int,
) : NativeMapped {
  Unauthenticated(0),
  LocallyAuthenticated(1),
  RemotelyAuthenticated(2),
  ;

  public override fun fromNative(nativeValue: Any?, context: FromNativeContext?):
      UserAuthenticationStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Unauthenticated
      1 -> LocallyAuthenticated
      2 -> RemotelyAuthenticated
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4) {
    public fun setValue(newValue: UserAuthenticationStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public fun getValue(): UserAuthenticationStatus =
        UserAuthenticationStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }
}

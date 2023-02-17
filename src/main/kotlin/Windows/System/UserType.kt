package Windows.System

import com.sun.jna.FromNativeContext
import com.sun.jna.NativeMapped
import java.lang.Class
import java.lang.IllegalArgumentException
import java.lang.Integer
import kotlin.Any
import kotlin.Int
import kotlin.Unit

public enum class UserType(
  public val `value`: Int,
) : NativeMapped {
  LocalUser(0),
  RemoteUser(1),
  LocalGuest(2),
  RemoteGuest(3),
  SystemManaged(4),
  ;

  public override fun fromNative(nativeValue: Any?, context: FromNativeContext?): UserType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> LocalUser
      1 -> RemoteUser
      2 -> LocalGuest
      3 -> RemoteGuest
      4 -> SystemManaged
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4) {
    public fun setValue(newValue: UserType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public fun getValue(): UserType = UserType.values()[0].fromNative(this.pointer.getInt(0), null)
  }
}

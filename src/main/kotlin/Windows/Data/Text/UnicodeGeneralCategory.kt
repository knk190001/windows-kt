package Windows.Data.Text

import com.sun.jna.FromNativeContext
import com.sun.jna.NativeMapped
import java.lang.Class
import java.lang.IllegalArgumentException
import java.lang.Integer
import kotlin.Any
import kotlin.Int
import kotlin.Unit

public enum class UnicodeGeneralCategory(
  public val `value`: Int,
) : NativeMapped {
  UppercaseLetter(0),
  LowercaseLetter(1),
  TitlecaseLetter(2),
  ModifierLetter(3),
  OtherLetter(4),
  NonspacingMark(5),
  SpacingCombiningMark(6),
  EnclosingMark(7),
  DecimalDigitNumber(8),
  LetterNumber(9),
  OtherNumber(10),
  SpaceSeparator(11),
  LineSeparator(12),
  ParagraphSeparator(13),
  Control(14),
  Format(15),
  Surrogate(16),
  PrivateUse(17),
  ConnectorPunctuation(18),
  DashPunctuation(19),
  OpenPunctuation(20),
  ClosePunctuation(21),
  InitialQuotePunctuation(22),
  FinalQuotePunctuation(23),
  OtherPunctuation(24),
  MathSymbol(25),
  CurrencySymbol(26),
  ModifierSymbol(27),
  OtherSymbol(28),
  NotAssigned(29),
  ;

  public override fun fromNative(nativeValue: Any?, context: FromNativeContext?):
      UnicodeGeneralCategory {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> UppercaseLetter
      1 -> LowercaseLetter
      2 -> TitlecaseLetter
      3 -> ModifierLetter
      4 -> OtherLetter
      5 -> NonspacingMark
      6 -> SpacingCombiningMark
      7 -> EnclosingMark
      8 -> DecimalDigitNumber
      9 -> LetterNumber
      10 -> OtherNumber
      11 -> SpaceSeparator
      12 -> LineSeparator
      13 -> ParagraphSeparator
      14 -> Control
      15 -> Format
      16 -> Surrogate
      17 -> PrivateUse
      18 -> ConnectorPunctuation
      19 -> DashPunctuation
      20 -> OpenPunctuation
      21 -> ClosePunctuation
      22 -> InitialQuotePunctuation
      23 -> FinalQuotePunctuation
      24 -> OtherPunctuation
      25 -> MathSymbol
      26 -> CurrencySymbol
      27 -> ModifierSymbol
      28 -> OtherSymbol
      29 -> NotAssigned
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4) {
    public fun setValue(newValue: UnicodeGeneralCategory): Unit {
      pointer.setInt(0, newValue.value)
    }

    public fun getValue(): UnicodeGeneralCategory =
        UnicodeGeneralCategory.values()[0].fromNative(this.pointer.getInt(0), null)
  }
}

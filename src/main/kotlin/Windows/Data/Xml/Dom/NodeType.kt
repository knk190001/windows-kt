package Windows.Data.Xml.Dom

import com.sun.jna.FromNativeContext
import com.sun.jna.NativeMapped
import java.lang.Class
import java.lang.IllegalArgumentException
import java.lang.Integer
import kotlin.Any
import kotlin.Int
import kotlin.Unit

public enum class NodeType(
  public val `value`: Int,
) : NativeMapped {
  Invalid(0),
  ElementNode(1),
  AttributeNode(2),
  TextNode(3),
  DataSectionNode(4),
  EntityReferenceNode(5),
  EntityNode(6),
  ProcessingInstructionNode(7),
  CommentNode(8),
  DocumentNode(9),
  DocumentTypeNode(10),
  DocumentFragmentNode(11),
  NotationNode(12),
  ;

  public override fun fromNative(nativeValue: Any?, context: FromNativeContext?): NodeType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Invalid
      1 -> ElementNode
      2 -> AttributeNode
      3 -> TextNode
      4 -> DataSectionNode
      5 -> EntityReferenceNode
      6 -> EntityNode
      7 -> ProcessingInstructionNode
      8 -> CommentNode
      9 -> DocumentNode
      10 -> DocumentTypeNode
      11 -> DocumentFragmentNode
      12 -> NotationNode
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4) {
    public fun setValue(newValue: NodeType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public fun getValue(): NodeType = NodeType.values()[0].fromNative(this.pointer.getInt(0), null)
  }
}

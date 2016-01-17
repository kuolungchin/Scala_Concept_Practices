package ch14

object exercise8 {
  sealed abstract class BinaryTree
  case class Leaf(value: Int) extends BinaryTree
  case class Node(opr: Char, ts: List[BinaryTree]) extends BinaryTree;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(569); 
  
  def leafSum(tree: BinaryTree): Int = {
    tree match {
      case Leaf(v) => v
      case Node(sign ,ts) => {
        sign match {
          case '-' => -1 * ts.map(leafSum(_)).reduce(_+_)
          case '+' => ts.map(leafSum(_)).reduce(_+_)
          case '*' => ts.map(leafSum(_)).product
          case '/' => -1 * ts.map(leafSum(_)).reduce(_/_)
        }
      }
    }
  };System.out.println("""leafSum: (tree: ch14.exercise8.BinaryTree)Int""");$skip(99); 
  
  val tree = Node('+', List(Node('*', List(Leaf(3),Leaf(8))),Leaf(2),Node('-', List(Leaf(5)))));System.out.println("""tree  : ch14.exercise8.Node = """ + $show(tree ));$skip(20); val res$0 = 
   
  leafSum(tree);System.out.println("""res0: Int = """ + $show(res$0))}
}

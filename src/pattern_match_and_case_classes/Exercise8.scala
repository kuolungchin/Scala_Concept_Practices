package pattern_match_and_case_classes

object Exercise8 extends App{
  sealed abstract class BinaryTree
  case class Leaf(value: Int) extends BinaryTree
  case class Node(opr: Char, ts: List[BinaryTree]) extends BinaryTree
  
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
  } 
  
  val tree = Node('+', List(Node('*', List(Leaf(3),Leaf(8))),Leaf(2),Node('-', List(Leaf(5)))))
  
  println( leafSum(tree) )

}
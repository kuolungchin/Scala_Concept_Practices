package pattern_match_and_case_classes

object Exercise6 extends App{
  sealed abstract class BinaryTree
  case class Leaf(value: Int) extends BinaryTree
  case class Node(leftTree: BinaryTree, rightTree: BinaryTree) extends BinaryTree
  
  def leafSum(tree: BinaryTree): Int = {
    /*
    tree match {
      case lf: Leaf => lf.value
      case nd: Node => leafSum(nd.leftTree) + leafSum(nd.rightTree)
    }
    */
    tree match {
      case Leaf(v) => v
      case Node(lt,rt) => leafSum(lt) + leafSum(rt)
    }
  }
  
  val binaryTree = Node(Node(Leaf(2),Leaf(3) ),Node(Leaf(5),Node(Leaf(6),Leaf(8) )))
  println(leafSum(binaryTree))
}
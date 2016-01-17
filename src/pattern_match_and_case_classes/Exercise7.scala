package pattern_match_and_case_classes

object Exercise7 extends App{
  sealed abstract class Tree
  case class Leaf(value: Int) extends Tree
  case class Node(trees: Tree*) extends Tree
  
  def leafSum(tree: Tree): Int = {
    tree match {
      case Leaf(v) => v
      case Node(ts @ _*) => ts.map( t => leafSum(t)).sum
    }
  }
  
  val tree = Node(Node(Leaf(2),Leaf(3)),Node(Leaf(5),Node(Leaf(6),Leaf(8),Leaf(1) )))  
  println(leafSum(tree)) 

}
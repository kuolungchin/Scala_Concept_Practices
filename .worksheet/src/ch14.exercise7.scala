package ch14

object exercise7 {
  sealed abstract class Tree
  case class Leaf(value: Int) extends Tree
  case class Node(trees: Tree*) extends Tree;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(295); 
  
  def leafSum(tree: Tree): Int = {
    tree match {
      case Leaf(v) => v
      case Node(ts @ _*) => ts.map( t => leafSum(t)).sum
    }
  };System.out.println("""leafSum: (tree: ch14.exercise7.Tree)Int""");$skip(90); 
  
   val tree = Node(Node(Leaf(2),Leaf(3)),Node(Leaf(5),Node(Leaf(6),Leaf(8),Leaf(1) )));System.out.println("""tree  : ch14.exercise7.Node = """ + $show(tree ));$skip(17); val res$0 = 
   leafSum(tree);System.out.println("""res0: Int = """ + $show(res$0))}
}

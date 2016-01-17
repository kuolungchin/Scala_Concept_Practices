package ch14

object exercise6 {
  sealed abstract class BinaryTree
  case class Leaf(value: Int) extends BinaryTree
  case class Node(leftTree: BinaryTree, rightTree: BinaryTree) extends BinaryTree;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(483); 
  
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
   };System.out.println("""leafSum: (tree: ch14.exercise6.BinaryTree)Int""");$skip(88); 
  
  val binaryTree = Node(Node(Leaf(2),Leaf(3) ),Node(Leaf(5),Node(Leaf(6),Leaf(8) )));System.out.println("""binaryTree  : ch14.exercise6.Node = """ + $show(binaryTree ));$skip(22); val res$0 = 
  leafSum(binaryTree);System.out.println("""res0: Int = """ + $show(res$0))}
}

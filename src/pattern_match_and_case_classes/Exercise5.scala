package pattern_match_and_case_classes

object Exercise5 extends App{
  val listTree = List(List(3,List(2,List(5),3),8),2,List(5))
                                                  
  def leafSum(lst: List[Any]): Int = {
  
   lst match {
     case head :: tail => head match {
       case i:Int => i + leafSum(tail)
       case listAny: List[Any] => leafSum(listAny) + leafSum(tail)
     }
     case Nil => 0
   
   }
  }
  
  println(leafSum(listTree))
}
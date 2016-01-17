package ch14

object exercise5 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(93); 
  val listTree = List(List(3,List(2,List(5),3),8),2,List(5));System.out.println("""listTree  : List[Any] = """ + $show(listTree ));$skip(497); 
  
  def leafSum(lst: List[Any]): Int = {
  
   lst match {
     case head :: tail => head match {
       case i:Int => i + leafSum(tail)
       case listAny: List[Any] => leafSum(listAny) + leafSum(tail)
     }
     case Nil => 0
   
   }
   
    /*
    lst.map( lstElem => lstElem match {
               case listAny: List[Any] => leafSum(listAny)
               case e: List[Int] => e.map(x => x).sum
               case i: Int => i
               case Nil => 0
             }).sum
	 */
	 
  };System.out.println("""leafSum: (lst: List[Any])Int""");$skip(24); val res$0 = 
  
   leafSum(listTree);System.out.println("""res0: Int = """ + $show(res$0))}
   
  
}

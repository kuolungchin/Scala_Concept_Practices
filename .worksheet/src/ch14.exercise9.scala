package ch14

object exercise9 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(136); 
  def sumOptions(lst: List[Option[Int]]):Int = {
    (for(elem <- lst) yield elem.getOrElse(0)).sum
  };System.out.println("""sumOptions: (lst: List[Option[Int]])Int""");$skip(83); 
  
  val list = List(Some(1),Some(2),Some(3),Some(4),Some(5),None,Some(6),Some(9));System.out.println("""list  : List[Option[Int]] = """ + $show(list ));$skip(19); val res$0 = 
  sumOptions(list);System.out.println("""res0: Int = """ + $show(res$0))}
}

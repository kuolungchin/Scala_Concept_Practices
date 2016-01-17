package pattern_match_and_case_classes

object Exercise9 {
  def sumOptions(lst: List[Option[Int]]):Int = {
    (for(elem <- lst) yield elem.getOrElse(0)).sum
  }
  
  val list = List(Some(1),Some(2),Some(3),Some(4),Some(5),None,Some(6),Some(9))
  
  println(sumOptions(list))
}
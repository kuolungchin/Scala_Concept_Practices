package pattern_match_and_case_classes

object Exercise3 extends App{
  def swap(arr: Array[Any]) = {
			arr match {
			  case Array(a,b, t @ _*) => Array(b,a) ++ t
			}
  }  
  
  val arr = swap(Array("a","b","c","d","e"))
  arr.map( elem => println(elem))
}
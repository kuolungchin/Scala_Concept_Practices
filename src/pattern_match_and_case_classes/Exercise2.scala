package pattern_match_and_case_classes

object Exercise2 extends App{
  def swap(pair: (Int, Int)) = pair match {
      case (a,b) => (b,a)
      case _ => "Nothing"
  } 
  
  println(swap((5,6))) 
}
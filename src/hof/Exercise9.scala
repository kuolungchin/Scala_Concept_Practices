package hof

object Exercise9 extends App{
  def corresponds2[A,B](a: Seq[A], b: Seq[B], f:(A,B) => Boolean) = {
    val flag = (a zip b).map(pair => f(pair._1, pair._2)).count(!_)
    flag == 0
  }
  
  val c = Array("Hello", "World")                
  val d = Array("Hello", "World")               
  
  println( corresponds2(c,d, (s1: String, s2: String) => s1 == s2 ) )
}
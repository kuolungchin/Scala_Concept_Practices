package collections
	
object Exercise5 extends App{
  val arr5 = Array("Tom", "Fred", "Harry")        
  
  def mkString(s: scala.collection.immutable.Seq[String], separator: String): String = {
    s.reduceLeft(_ + separator + _)
  }                                              
  
  println( mkString(arr5.toList, " , ") )  
}
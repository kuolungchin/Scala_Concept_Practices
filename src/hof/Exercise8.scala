package hof

object Exercise8 extends App{
  val a = Array("Hello", "World")                 
  val b = a.map(_.length)                       

  println( a.corresponds(b)(_.length == _) )      
}
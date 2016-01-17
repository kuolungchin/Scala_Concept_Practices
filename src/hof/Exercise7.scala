package hof

object Exercise7 extends App{
  val pairs = (1 to 10) zip (11 to 20)
  def adjustToPair(f: (Int,Int) => Int)(x: Int,y: Int) = {
  	f(x,y)
  }
  
  println( pairs.map(pair => adjustToPair(_*_)(pair._1,pair._2)).sum )
}
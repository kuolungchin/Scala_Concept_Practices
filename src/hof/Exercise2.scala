package hof

object Exercise2 extends App{
  def maxInt(x:Int, y:Int): Int = {
  	if(x>y) x
  	else y
  }
  
  println(Array(5,4,3,9,5).reduceLeft(maxInt) )
}
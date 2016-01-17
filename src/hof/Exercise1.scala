package hof

object Exercise1 extends App{
  def f(fun: (Int) => Int, low: Int, high: Int): Seq[(Int,Int)] = {
  	for( i <- low to high) yield
  	  (i,fun(i) )
  } 
  
  println(f((x) => x*x, -5,5))
}
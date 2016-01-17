package hof

object Exercise5 extends App{
  def largest(fun:(Int) => Int, inputs: Seq[Int]): Int = {
  	val num = inputs.reduceLeft( (x,y) =>
  	  {
  	     if(fun(x) > fun(y)) x else y
  	  }
  	)
  	fun(num)
  }                                             

  println(largest(x => 10 * x - x * x, 1 to 10))
}
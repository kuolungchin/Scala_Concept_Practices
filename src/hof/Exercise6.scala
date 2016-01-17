package hof

object Exercise6 extends App{
  def largestInputElem(fun:(Int) => Int, inputs: Seq[Int]): Int = {
  val num = inputs.reduceLeft( (x,y) =>
  	  {
  	     if(fun(x) > fun(y)) x else y
  	  }
    )
  	num
  }
  
  println( largestInputElem(x => 10 * x - x * x, 1 to 10) )
}
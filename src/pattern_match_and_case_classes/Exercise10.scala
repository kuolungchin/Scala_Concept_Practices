package pattern_match_and_case_classes

import scala.math._
object Exercise10 extends App{
  def f(x: Double) = if(x >= 0) Some(sqrt(x)) else None
  def g(x: Double) = if(x != 0) Some(1/(x-1)) else None
  
  def compose(f:Double => Option[Double], g:Double => Option[Double]) = {
    //Use Partial Funcation: A set of case clauses enclosed in braces is a partial function -
    // a function which MAY NOT be defined for ALL inputs.
    (value: Double) => f(value) match{
      case Some(_) => g(value)
      case None => None
    }
  }
  
  val h = compose(f,g)
  println(h(2))
}
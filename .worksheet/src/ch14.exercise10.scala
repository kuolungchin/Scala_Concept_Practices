package ch14
import scala.math._
object exercise10 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(108); 
  def f(x: Double) = if(x >= 0) Some(sqrt(x)) else None;System.out.println("""f: (x: Double)Option[Double]""");$skip(56); 
  def g(x: Double) = if(x != 0) Some(1/(x-1)) else None;System.out.println("""g: (x: Double)Option[Double]""");$skip(333); 
  
  
  def compose(f:Double => Option[Double], g:Double => Option[Double]) = {
    //Use Partial Funcation: A set of case clauses enclosed in braces is a partial function -
    // a function which MAY NOT be defined for ALL inputs.
    (value: Double) => f(value) match{
      case Some(_) => g(_)
      case None => None
    }
  };System.out.println("""compose: (f: Double => Option[Double], g: Double => Option[Double])Double => Object""");$skip(23); 
  val h = compose(f,g);System.out.println("""h  : Double => Object = """ + $show(h ));$skip(7); val res$0 = 
  h(0);System.out.println("""res0: Object = """ + $show(res$0))}
}

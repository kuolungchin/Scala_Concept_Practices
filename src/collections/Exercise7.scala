package collections
	
object Exercise7 extends App{
  def tupled(p: (Double, Int)):Double = {
    p._1 * p._2
  }                                               
                                                  
  val prices = List(5.0,20.0,9.95)                
  val quantities = List(10,2,1)                  

 println( (prices zip quantities).map( tupled(_) ).sum )  
}
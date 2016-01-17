package collections
	
object Exercise3 extends App{
  def removeZero(lst: List[Int]): List[Int] = lst match {
    case Nil => Nil
    case head::tail => if(head == 0) removeZero(tail) else head :: removeZero(tail)
  }                                             
  
  val lstNum = List(1,0,9,0,8,0,8)              
  println(removeZero(lstNum))  
}
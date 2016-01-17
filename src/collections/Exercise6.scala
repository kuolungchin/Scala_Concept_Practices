package collections
	
object Exercise6 extends App{
  val lst = List(1, 2, 3, 4, 5)                
  val first = (lst :\ List[Int]())(_ :: _)      
  val second = (List[Int]() /: lst)(_ :+ _)    
  //from the previous two fold functions, we know only list can be appended.
  val reverse = (List[Int]() /: lst)((left, right) => right :: left)
}
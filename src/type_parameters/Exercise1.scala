package type_parameters

class Pair[T](val first: T, val second: T) {
  override def toString = "(" + first + "," + second + ")"
  def swap: Pair[T] = new Pair(second, first) 
}
	
object Exercise1 extends App{
  val pair = new Pair(20,"ABC")
  println(pair.swap)
} 
package type_parameters

class Pair3[T, S](val first: T, val second: S) {
  override def toString = "(" + first + "," + second + ")"
  def swap(p: Pair3[T,S]) = new Pair3(p.second, p.first)
}
	
object Exercise3 extends App{
  val pair = new Pair3(20,"ABC")
  println(pair.swap(pair))
} 
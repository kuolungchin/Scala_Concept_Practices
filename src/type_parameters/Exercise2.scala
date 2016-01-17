package type_parameters

class Pair2[T](var first: T, var second: T) {
  override def toString = "(" + first + "," + second + ")"
  def swap: Pair2[T] = new Pair2(second, first)
}

object Exercise2 extends App{
  val pair = new Pair2(20,"ABC")
  println(pair.swap)
} 
package ch8

object ex9 {
class Creature {
  def range: Int = 10
  val env: Array[Int] = new Array[Int](range)
}

class Ant extends Creature {
  override def range = 2
}

val ant = new Ant                                 //> ant  : ch8.ex9.Ant = ch8.ex9$Ant@1e64a937
ant.env                                           //> res0: Array[Int] = Array(0, 0)
}
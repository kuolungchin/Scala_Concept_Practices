package inheritance

class Creature {
  def range: Int = 10
  val env: Array[Int] = new Array[Int](range)
}

class Ant extends Creature {
  override def range = 2
}
/*
 * 1st replacement (from val range to def range at Creature class) will cause empty Array of env , range getter return 0
 * 2nd replacement range getter return 2 so def range is overrided before parent object initiate 
 */
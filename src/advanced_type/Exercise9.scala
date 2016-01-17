package advanced_type

abstract class Dim[T](val value: Double, val name: String){
  this: T =>
    protected def create(v: Double): T
    def +(other: Dim[T]) = create(value + other.value)
    override def toString() = value + " " + name
}

class Seconds(v: Double) extends Dim[Seconds](v, "s"){
  protected def create(v: Double): Seconds = new Seconds(v)
}

/*  class Meters won't pass compilation because we have defined SELF TYPE in the superclass Dim[T]
class Meters(v: Double) extends Dim[Seconds](v, "s"){
  protected def create(v: Double): Seconds = new Seconds(v)
}
*/
package type_parameters
//Using Type Constraint:
// T =:= U
// T <:< U
// T >:> U
class Pair10[S,T](val first: T, val second: T) {
  override def toString = "(" + first + "," + second + ")"
  def swap(implicit ev: S=:=T ): Pair10[S,T] = new Pair10(second, first) 
}

object Exercise10 extends App{
  // val pair = new Pair10(100. "ABC")  //Error
 val pair = new Pair10("ABC","XYZ")  //Error
}
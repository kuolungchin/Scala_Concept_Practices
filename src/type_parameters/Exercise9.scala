package type_parameters

/*
class Pair9[+T](val first: T, val second: T) {
   def replaceFirst(newFirst: T) = { new Pair9(first, second) } 
   //Compile Error: 
     //covariant type T occurs in contravariant position 
     //in type T of value newFirst
}

class NastyDoublePair[Double] ( override val first: Double, override val second: Double) extends Pair9[Double](first,second){
  override def replaceFirst(newFirst: Double) = { new Pair9( scala.math.sqrt(newFirst) , second) }
}

object Exercise9 extends App {
  val pair: Pair[Any] = new NastyDoublePair[Double](1.0, 2.0)
  pair.replaceFirst("Hello")
}

*/
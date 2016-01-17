package implicits

class Any2ArrowAssoc[A](a: A) {
  implicit def ->[B](b: B) = (a,b)
}

object Exersie1 extends App{
  println("Hello" -> 42)
}
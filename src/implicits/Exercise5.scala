package implicits

import scala.math._

class Fraction(n: Int, d: Int) {
  val num: Int = if (d == 0) 1 else n * sign(d) / gcd(n, d);
  val den: Int = if (d == 0) 0 else d * sign(d) / gcd(n, d);
  override def toString = num + "/" + den
  def sign(a: Int) = if (a > 0) 1 else if (a < 0) -1 else 0
  def gcd(a: Int, b: Int): Int = if (b == 0) abs(a) else gcd(b, a % b)

  def *(other: Fraction) = new Fraction(num * other.num, den * other.den)
}

object Fraction {
  def apply(n: Int, d: Int) = new Fraction(n, d)
}

class RichFraction(val thes: Fraction) extends Ordered[Fraction] {
  def compare(that: Fraction): Int = (thes.num * that.den) - (that.num * thes.den)
}

object Exercise5 extends App{
  // Define implicit parameter, the implicit parameter will use the default value here.
  def smaller[T](a: T, b: T)(implicit order: T => Ordered[T])
    = if (order(a) < b) a else b
  
  // We need the medthod from RichFraction, so we need get its object from implicit conversion. 
  implicit def fraction2RichFraction(thes: Fraction) = new RichFraction(thes)
    
   println( smaller( Fraction(1,7),Fraction(2,9)))
}
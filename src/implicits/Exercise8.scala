package implicits

/*

Section 21.5

scala> case class Delimiters(left: String, right: String)
defined class Delimiters

scala> implicit val quoteDelimiters = Delimiters("«", "»")
quoteDelimiters: Delimiters = Delimiters(«,»)

scala> def quote(what: String) = implicitly[Delimiters].left + what + implicitly[Delimiters].right
quote: (what: String)String

scala> quote("Book")
res0: String = «Book»

Answer: Get: "Delimiters(«,»)"

Section 21.6

scala> def smaller[T](a: T, b: T)(implicit order: T => Ordered[T]) = if (a < b) a else b 
smaller: [T](a: T, b: T)(implicit order: T => Ordered[T])T

scala> smaller("Good","Morning")
res1: String = Good

Answer: Get: implicit order

scala> 




 
*/
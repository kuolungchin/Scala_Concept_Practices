package implicits

case class Delimiters(left: String, right: String)

class Something{
	def quote(what: String)(implicit delims: Delimiters) =
			delims.left + what + delims.right
}

object FrenchPunctuation extends App{
  
  implicit val quoteDelimiters = Delimiters("«", "»")  // default value
  val sth = new Something
  val theQuote = sth.quote("Bonjour le monde")  
  // The compiler will look for implicit value, 
  // according to implicit parameter defined in the method definition.  
  println(theQuote)
}
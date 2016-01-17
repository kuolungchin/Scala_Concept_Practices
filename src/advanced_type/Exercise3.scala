package advanced_type

abstract class BookInfo
object Title extends BookInfo
object Author extends BookInfo

class Document {
  private var title = ""
  private var author = ""
  private var useNextArgAs: Any = null
  def set(obj: Any): this.type = { useNextArgAs = obj; this }
  def to(arg: String): this.type = {
    useNextArgAs match{
      case _: Title.type => title = arg
      case _: Author.type => author = arg
    }
    this
  } 
  override def toString = getClass.getName + "[title=" + title + "," +  " author=" + author + "]"
}

object Exercise3 extends App{
  val book = new Document
  book set Title to "Scala for Imoatient" set Author to "Cay Horstman"
  println( book.toString )
}
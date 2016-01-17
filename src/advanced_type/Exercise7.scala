package advanced_type

// Type Parameter of Structure Type
class CloseInStructureType[T <: {def close():Unit}] {
  def process(a: T){
    try{
      println("processing an object of " + a.getClass.getName )
    }finally{
      a.close()
    }
  }
  
}

class Book{
  def close(){
    println("close a book object.")
  }
}

object Exercise7 extends App{
  val c = new CloseInStructureType[Book]
  val book = new Book
  c.process(book)
}
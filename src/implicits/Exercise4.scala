package implicits

import scala.language.implicitConversions

abstract class ReadType
object anInt extends ReadType
object aDouble extends ReadType
object aString extends ReadType
  
class Reader {
  def read(readType: ReadType) = readType match {
    case _:anInt.type => readLine.toInt
    case _:aDouble.type => readLine.toDouble
    case _:aString.type => readLine
    case _ => None
  }
}
 
  //type Reader = Read.type
abstract class FluentAsker { def askingFor(name:String): Reader}  
  
  // The sequence of Fluent API Use is: in -> asker -> and(in) -> asker -> and(in) -> asker .....   
class FluentReader(reader: Reader) {
  private def showQuestion(question: String) = print(question + " >> ")	
    // This method is used to return Asker
    def in(rt: ReadType): FluentAsker = new FluentAsker { 
      def askingFor(name:String): Reader = {
        showQuestion(name)
        val msg = reader.read(rt)
        println(name + " : " + msg)
        reader
      }
    }
    //This method is used to ask question.
    def and(at: ReadType): FluentAsker = in(at)
}

object Exercise4 extends App {
  implicit def read2FluentReader(reader: Reader) =  new FluentReader(reader)
  val Read = new Reader
  Read in aString askingFor "Your name" and anInt askingFor "Your age" and aDouble askingFor "Your weight"
}
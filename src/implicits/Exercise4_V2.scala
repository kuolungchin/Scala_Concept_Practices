package implicits;
/*
package ch21


import scala.language.implicitConversions

  abstract class ReadType
  object anInt extends ReadType
  object aDouble extends ReadType
  object aString extends ReadType
  
 

/**
 * Some people are fond of “fluent APIs” that read vaguely like English sentences.
 * Create such an API for reading integers, floating-point numbers, and strings from the console.
 * For example:
 * Read in aString askingFor "Your name" and anInt askingFor "Your age" and aDouble askingFor "Your weight" .
 */
object Exercise4 extends App {
   object Read {
    def read(readType: ReadType) = readType match {
      case _:anInt.type => readLine.toInt
      case _:aDouble.type => readLine.toDouble
      case _:aString.type => readLine
      case _ => None
    }
  }
 
  type Reader = Read.type
  abstract class FluentAsker { def askingFor(name:String): Reader}
  
  
  // The sequence of Fluent API Use is: in -> asker -> and(in) -> asker -> and(in) -> asker .....   
  class FluentReader(reader: Reader) {
    private def showQuestion(question: String) = print(question + " >> ")	
      // This method is used to return Asker
      def in(at: ReadType): FluentAsker = new FluentAsker { 
        def askingFor(name:String): Reader = {
          showQuestion(name)
          val msg = reader.read(at)
          println(name + " : " + msg)
          reader
        }
      }
      //This method is used to ask question.
      def and(at: ReadType): FluentAsker = in(at)
  }
  
  implicit def read2FluentReader(reader: Reader) =  new FluentReader(reader)
  Read in aString askingFor "Your name" and anInt askingFor "Your age" and aDouble askingFor "Your weight"

}
*/
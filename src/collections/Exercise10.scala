package collections

import scala.io.Source

object Exercise10 extends App{
  val frequencies = new collection.immutable.HashMap[Char,Int]
  val fileString = Source.fromFile("XXX.txt").mkString
  
  fileString.par.aggregate(frequencies)((f,c) =>
    f + (c -> (f.getOrElse( c, 0) + 1)),
  	(leftMap,rightMap) => leftMap.map( kvp => kvp._1 -> (kvp._2 + rightMap.getOrElse(kvp._1, 0) ))
  )
}
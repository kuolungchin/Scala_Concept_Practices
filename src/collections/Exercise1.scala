package collections

import scala.collection.mutable._

object Exercise1 extends App{
  def index(str: String) = {
	var result = new HashMap[Char, LinkedHashSet[Int]]()
	for( (c,i) <- str.zipWithIndex){
	  val set = result.getOrElse(c, new LinkedHashSet[Int])
	  set += i
	  result(c) = set
	}
	result
  }                                         //> index: (str: String)scala.collection.mutable.HashMap[Char,scala.collection.m
  
  println( index("Mississipi") )
}
package collections
	
object Exercise4 extends App{
  val arr = Array("Tom", "Fred", "Harry")        
  val map = scala.collection.immutable.Map("Tom" -> 3, "Dick" -> 4, "Harry" -> 5)
                                                  
  def fun(a: Array[String], m: scala.collection.immutable.Map[String, Int]) = {
    a.map(str => m.get(str)).flatMap( x => x)
  }
  
  fun(arr,map).map(elem => println(elem)) 
}
package collections
	
object Exercise8 extends App{
  def turnMultiDimensionArray(a: Array[Int], numOfGounpElem: Int) = {
  	a.grouped(numOfGounpElem).toArray
  }                                              
  
  turnMultiDimensionArray( (1 to 9).toArray, 5).map(arr => { arr.map(x=> println(x)); println() })
  
}
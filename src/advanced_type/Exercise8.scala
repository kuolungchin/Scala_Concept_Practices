package advanced_type

object Exercise8 extends App{
	def printValues(f:{ def apply(value: Int):Int }, from: Int, to: Int){
	  for(i <- from to to) print(f(i) + " ")
	}
  
	printValues((x: Int) => x*x , 3,6) 
	println
	printValues(Array(1,1,2,3,5,8,13,21,34,55) , 3,6)
}
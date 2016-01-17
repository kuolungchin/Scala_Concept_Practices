package implicits

class FactorialOps(val x: Int){
	def ! = (1 to x).product
}

object Exercise3 extends App{
	implicit def factorial(x: Int) = new FactorialOps(x)
	println(5!)
}
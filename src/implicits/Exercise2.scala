package implicits



class NumberPercentage(val a: Int) {
    def +%(b: Int): Double = a * (1 + b/100D)
}
  
object Exercise2 extends App {
    //Using implicit for Enriching Existing Libraries
	implicit def intPlus2Percentage(a: Int) =  new NumberPercentage(a)
	println( 120 +% 10)
}
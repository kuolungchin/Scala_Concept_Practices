package hof

object Exercise4 extends App{
    def factorial2 = (1 to 5).foldLeft(1)(_*_) 
    def factorial2v2 = (0 to 5).foldLeft(1)((x,y) => if(y < 1) x else x*y )
    
    println(factorial2)
    println(factorial2v2)
	
}
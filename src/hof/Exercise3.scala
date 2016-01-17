package hof

object Exercise3 extends App{
   def factorial = (0 to 5).reduceLeft((x,y) => if( x == 0 ) 1 else x*y )
   println(factorial)
}
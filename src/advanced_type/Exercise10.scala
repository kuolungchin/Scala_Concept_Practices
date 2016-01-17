package advanced_type

trait One {
  def property = "A"
}

trait Two {
  this: One =>
    val propertyVal = property
}

class Nums{
  this: Two => 
    val prop = propertyVal 
}

object Exercise10 extends App {
  
  val nums = new Nums with One with Two
  
  /*
   * propertyVal in trait Two be initiated before trait One's property, 
   * so the self type in class Nums takes the higher priority to initiate trait Two, before initiate trait One.
   */
  println("Chain the property from Num to Two to One:" + nums.prop )
} 

/*
trait A {
  def sing() = "from a"
}

trait C {
  this: A =>
  val w = sing + "from c"

}

class B {
  this: C =>
  val k = w
}

object a extends App {
  val b = new B with C with A
  println(b.k)

}
*/
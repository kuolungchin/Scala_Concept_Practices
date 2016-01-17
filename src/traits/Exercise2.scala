package traits

import java.awt.Point
import scala.math.Ordered
class OrderedPoint extends Point with Ordered[Point]{
/*
class OrderedPoint needs to be abstract, 
since method compare in trait Ordered of type (that: java.awt.Point)Int 
*/
  def compare(that: Point): Int = {
    if(x < that.x) -1
    else if(x == that.x && y < that.y ) -1
    else if(x == that.x && y == that.y ) 0
    else 1
  }
}
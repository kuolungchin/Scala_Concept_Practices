package objects

class Point private (x:Int, y:Int)

object Point {
  def apply(x:Int, y:Int) = new Point(x,y)
}
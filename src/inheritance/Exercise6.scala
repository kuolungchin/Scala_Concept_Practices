package inheritance

abstract class Shape {
  def centerPoint: (Double, Double)
}

class Rectangle extends Shape {
  override def centerPoint = {(1.0,1.0)}
}

class Circle extends Shape {
   override def centerPoint = {(1.0,1.0)}
}

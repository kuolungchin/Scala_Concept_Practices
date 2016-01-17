package objects

abstract class UnitConversion {
  def convert(unit: Double): Double
}

object InchesToCentimeters {
  private val i2c = 30.48
  def convert(unit: Double): Double = {
    unit * i2c
  }
}

object GallonsToLiters {
  private val g2l = 3.785411784 
  def convert(unit: Double): Double = {
    unit * g2l
  }
}

object MilesToKilometers {
  private val m2k = 1.609344
  def convert(unit: Double): Double = {
    unit * m2k
  }
}
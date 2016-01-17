package objects

object Conversion {
    private val i2c = 30.48
    private val g2l = 3.785411784
    private val m2k = 1.609344

    def inchesToCentimeters(inch: Double): Double = {
        inch * i2c 
    }

    def gallonsToLiters(gallon: Double): Double = {
        gallon * g2l
    }

    def milesToKilometers(mile: Double): Double = {
        mile * m2k
    }
}
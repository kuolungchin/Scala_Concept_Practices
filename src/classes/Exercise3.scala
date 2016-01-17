package classes

class Time(val hours:Int,val minutes:Int) {
  def before(other: Time): Boolean = {
    if( ( hours * 60 + minutes) < ( other.hours * 60 + other.minutes) ) true
    else false
  }
}
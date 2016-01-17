package classes

class Time2(val hours:Int,val minutes:Int) {
  
  private val numOfMinutes = hours * 60 + minutes
  
  def before(other: Time2): Boolean = {
    numOfMinutes < other.numOfMinutes
  }
}
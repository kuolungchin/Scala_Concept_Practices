package advanced_type

class Exercise6 {
  /*
   * A common use of Either is as an alternative to 
   * Option for dealing with possible missing values.  
   * Convention dictates that Left is used for failure and Right is used for success.
   */
  
  def getEitherIndex(arr: Seq[Int], value: Int): Int Either Int
  = if(arr.contains(value)) Right(arr.indexOf(value))
    else{
     val left = arr.reduce( (x,y) => 
           if( math.abs(x - value) > math.abs(y - value) ) x
           else y
         )
     Left(left)
    }
}
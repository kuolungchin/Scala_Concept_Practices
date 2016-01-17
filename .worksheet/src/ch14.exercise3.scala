package ch14

object exercise3 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(137); 

  def swap(arr: Array[Any]) = {
			arr match {
			  case Array(a,b, t @ _*) => Array(b,a) ++ t
			}
  };System.out.println("""swap: (arr: Array[Any])Array[Any]""");$skip(46); 
  
  val x = swap(Array("a","b","c","d","e"));System.out.println("""x  : Array[Any] = """ + $show(x ))}
}

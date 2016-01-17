package ch17

object ec17 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(151); 

def convert2Array[T: Manifest](xs: Vector[T]): Array[T] = {
		var arr = new Array[T](xs.length)
		arr = xs.toArray
		arr
};System.out.println("""convert2Array: [T](xs: Vector[T])(implicit evidence$2: Manifest[T])Array[T]""")}

}

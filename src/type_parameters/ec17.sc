package ch17

object ec17 {

def convert2Array[T: Manifest](xs: Vector[T]): Array[T] = {
		var arr = new Array[T](xs.length)
		arr = xs.toArray
		arr
}                                                 //> convert2Array: [T](xs: Vector[T])(implicit evidence$2: Manifest[T])Array[T]

}
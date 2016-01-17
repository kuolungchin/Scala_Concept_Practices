package type_parameters;
/*  Why does RichInt implement Comparable[Int] and not Comparable[RichInt]?

class Pair[T <% Comparable[T]](val first: T, val second: T)

Answer:
It is because of implicit conversion: 
  RichInt can be converted to Comparable[Int] when it cannot find the method defined.
*/
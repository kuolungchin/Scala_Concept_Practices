package type_parameters;
/*
Why don't we need lower bound for the replaceFirst method in Section 17.3,
"Bounds for Type Variables," on page 232 if we want to replace the first component
of a Pair[Person] with a Student?

package ch17

class Pair[T](val first: T, val second: T) {
  def replaceFirst[R >: T](newFirst: R) = new Pair(newFirst, second)
  override def toString = "(" + first + "," + second + ")"
}

Answer: It's because the method return type, Person, is the supertype of Student.
        So that we use the upper bound constraint: [R >: T] and we don't need the lower bound.

*/
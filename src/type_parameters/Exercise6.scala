package type_parameters

class Object extends App{
  def middle[T](itr: Iterable[T]): T = {
    val lst = itr.toList
    lst(lst.length/2)
  }
}
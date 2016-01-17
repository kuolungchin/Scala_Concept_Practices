package type_parameters;
/*
  In section 17.10.

  def replaceFirst[R >: T](newFirst: R) = new Pair[R](newFirst, second)

  We use bound of type parameter [R >: T] here.    
  
  It is because we cannot set the value of parameter in Person type when type T is Student. 

*/
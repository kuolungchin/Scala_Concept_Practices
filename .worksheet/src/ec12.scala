object ec12 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(144); 
  // 1.
  def f(fun: (Int) => Int, low: Int, high: Int): Seq[(Int,Int)] = {
  		for( i <- low to high) yield
  			 (i,fun(i) )
  };System.out.println("""f: (fun: Int => Int, low: Int, high: Int)Seq[(Int, Int)]""");$skip(25); val res$0 = 
  
  f((x) => x*x, -5,5);System.out.println("""res0: Seq[(Int, Int)] = """ + $show(res$0));$skip(122); 
                                                  
  // 2.
  def maxInt(x:Int, y:Int): Int = {
  	if(x>y) x
  	else y
  };System.out.println("""maxInt: (x: Int, y: Int)Int""");$skip(38); val res$1 = 

	Array(5,4,3,9,5).reduceLeft(maxInt);System.out.println("""res1: Int = """ + $show(res$1));$skip(80); val res$2 = 
    // or
  Array(5,4,100,9,5).reduceLeft((x:Int, y:Int) => if(x > y) x else y);System.out.println("""res2: Int = """ + $show(res$2));$skip(152); 
                                                  
  // 3.
  // 5! = 5*4*3*2*1
  def factorial = (0 to 5).reduceLeft((x,y) => if( x == 0 ) 1 else x*y );System.out.println("""factorial: => Int""");$skip(12); val res$3 = 
  factorial;System.out.println("""res3: Int = """ + $show(res$3));$skip(54); 
  
  //4
  def factorial2 = (1 to 5).foldLeft(1)(_*_);System.out.println("""factorial2: => Int""");$skip(13); val res$4 = 
  factorial2;System.out.println("""res4: Int = """ + $show(res$4));$skip(77); 
  
  def factorial2v2 = (0 to 5).foldLeft(1)((x,y) => if(y < 1) x else x*y );System.out.println("""factorial2v2: => Int""");$skip(15); val res$5 = 
  factorial2v2;System.out.println("""res5: Int = """ + $show(res$5));$skip(209); 

  // 5. About Higher Order Function
  def largest(fun:(Int) => Int, inputs: Seq[Int]): Int = {
  	val num = inputs.reduceLeft( (x,y) =>
  	  {
  	     if(fun(x) > fun(y)) x else y
  	  }
  	)
  	fun(num)
  };System.out.println("""largest: (fun: Int => Int, inputs: Seq[Int])Int""");$skip(41); val res$6 = 

  largest(x => 10 * x - x * x, 1 to 10);System.out.println("""res6: Int = """ + $show(res$6));$skip(90); 
  
  def largest2(fun:(Int) => Int, inputs: Seq[Int]): Int = {
  	inputs.map(fun).max
  };System.out.println("""largest2: (fun: Int => Int, inputs: Seq[Int])Int""");$skip(44); val res$7 = 
  
  largest2(x => 10 * x - x * x, 1 to 10);System.out.println("""res7: Int = """ + $show(res$7));$skip(186); 
  // 6.
    def largestInputElem(fun:(Int) => Int, inputs: Seq[Int]): Int = {
  	val num = inputs.reduceLeft( (x,y) =>
  	  {
  	     if(fun(x) > fun(y)) x else y
  	  }
  	)
  	num
  };System.out.println("""largestInputElem: (fun: Int => Int, inputs: Seq[Int])Int""");$skip(49); val res$8 = 
  largestInputElem(x => 10 * x - x * x, 1 to 10);System.out.println("""res8: Int = """ + $show(res$8));$skip(141); 

  // 7. Currying: A function that returns a function to consume the following (second) parameter(s).
  val pairs = (1 to 10) zip (11 to 20);System.out.println("""pairs  : scala.collection.immutable.IndexedSeq[(Int, Int)] = """ + $show(pairs ));$skip(79); 
    

  def adjustToPair(f: (Int,Int) => Int)(x: Int,y: Int) = {
  	f(x,y)
  };System.out.println("""adjustToPair: (f: (Int, Int) => Int)(x: Int, y: Int)Int""");$skip(26); val res$9 = 

  adjustToPair(_*_)(6,7);System.out.println("""res9: Int = """ + $show(res$9));$skip(104); val res$10 = 
  
 // pairs.map( pair => println(pair))
  
  pairs.map(pair => adjustToPair(_*_)(pair._1,pair._2)).sum;System.out.println("""res10: Int = """ + $show(res$10));$skip(42); 
  // 8.
  val a = Array("Hello", "World");System.out.println("""a  : Array[String] = """ + $show(a ));$skip(26); 
  val b = a.map(_.length);System.out.println("""b  : Array[Int] = """ + $show(b ));$skip(35); val res$11 = 

  a.corresponds(b)(_.length == _);System.out.println("""res11: Boolean = """ + $show(res$11));$skip(167); 
  
  // 9.
  def corresponds2[A,B](a: Seq[A], b: Seq[B], f:(A,B) => Boolean) = {
    val flag = (a zip b).map(pair => f(pair._1, pair._2)).count(!_)
    flag == 0
  };System.out.println("""corresponds2: [A, B](a: Seq[A], b: Seq[B], f: (A, B) => Boolean)Boolean""");$skip(35); 
   val c = Array("Hello", "World");System.out.println("""c  : Array[String] = """ + $show(c ));$skip(35); 
   val d = Array("Hello", "World");System.out.println("""d  : Array[String] = """ + $show(d ));$skip(59); val res$12 = 
  corresponds2(c,d, (s1: String, s2: String) => s1 == s2 );System.out.println("""res12: Boolean = """ + $show(res$12))}
}

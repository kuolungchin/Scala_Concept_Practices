object ec2 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(87); 
 def signum(num:Int) = {
 	if(num > 0) 1
 	else if(num < 0) -1
 	else 0
 };System.out.println("""signum: (num: Int)Int""");$skip(55); 

	// 10 to 1 by -1
	for(i <- 10 to 1 by -1) println(i);$skip(96); 
  
  // procedure returns Unit
  def countdown(n:Int) {
  	for( i <- n to 0 by -1) print(i)
  };System.out.println("""countdown: (n: Int)Unit""");$skip(20); 
 
  var x:Long = 1L;System.out.println("""x  : Long = """ + $show(x ));$skip(32); 
  for(c <- "Hello") x*=c.toLong;$skip(4); val res$0 = 
  x;System.out.println("""res0: Long = """ + $show(res$0));$skip(38); val res$1 = 

	"Hello".foldLeft(1L)( _ * _.toLong);System.out.println("""res1: Long = """ + $show(res$1));$skip(97); 
	
	def product(str:String): Long = {
	  var y: Long = 1L
	  for(d <- str )  y *= d.toLong
		y
	};System.out.println("""product: (str: String)Long""");$skip(22); val res$2 = 
  
  product("Hello");System.out.println("""res2: Long = """ + $show(res$2));$skip(137); 

	
	def recProduct(strList:Seq[Char]): Long ={
	  if(strList.length == 0 ) 1L
	  else strList.head.toLong * recProduct( strList.tail)
	};System.out.println("""recProduct: (strList: Seq[Char])Long""");$skip(22); val res$3 = 

	recProduct("Hello");System.out.println("""res3: Long = """ + $show(res$3));$skip(167); 
	

	def recProduct2(partial: Long, strList:Seq[Char]): Long = {
		if(strList.length == 0) partial
		else recProduct2( partial * strList.head.toLong , strList.tail)
	};System.out.println("""recProduct2: (partial: Long, strList: Seq[Char])Long""");$skip(27); val res$4 = 
	
	recProduct2(1, "Hello");System.out.println("""res4: Long = """ + $show(res$4));$skip(89); 

	def factorial(x:Int, n: Int): Int = {
		if(n == 0) 1
		else x *  factorial(x , n-1)
	};System.out.println("""factorial: (x: Int, n: Int)Int""");$skip(17); val res$5 = 

 factorial(2,5);System.out.println("""res5: Int = """ + $show(res$5));$skip(114); val res$6 = 
 
 
 // foldLeft with Block
 (Map[Char, Int]() /: "Missisipi") {
 	(m,c) => m + (c -> (m.getOrElse(c,0) + 1) )
 };System.out.println("""res6: scala.collection.immutable.Map[Char,Int] = """ + $show(res$6))}







}

object ec13 {
  /*
  import scala.collection.mutable._
  var res = new HashMap[Char, LinkedHashSet[Int]]()

	for((c, i) <- s.zipWithIndex) {
  */
	// 1.  Use Mutable Collections
	import scala.collection.mutable._;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(444); 

	def index(str: String) = {
		var result = new HashMap[Char, LinkedHashSet[Int]]()
	  for( (c,i) <- str.zipWithIndex){
	    val set = result.getOrElse(c, new LinkedHashSet[Int])
	    set += i
	    result(c) = set
	  }
	  result
	};System.out.println("""index: (str: String)scala.collection.mutable.HashMap[Char,scala.collection.mutable.LinkedHashSet[Int]]""");$skip(23); val res$0 = 

  index("Mississipi")

  // 2. Use Immutable Collection
  import scala.collection.immutable._;System.out.println("""res0: scala.collection.mutable.HashMap[Char,scala.collection.mutable.LinkedHashSet[Int]] = """ + $show(res$0));$skip(227); 
 //str.zipWithIndex.groupBy(_._1)
  def index2(str: String) {
	  str.zipWithIndex.groupBy( pair => pair._1).map( kv => ( kv._1, kv._2.map(p => p._2)))
  };System.out.println("""index2: (str: String)Unit""");$skip(23); 
  index2("Mississipi");$skip(216); 

  // 3. Remove all zeroes, using filter and list
  def removeZero(lst: List[Int]): List[Int] = lst match {
    case Nil => Nil
    case head::tail => if(head == 0) removeZero(tail) else head :: removeZero(tail)
  };System.out.println("""removeZero: (lst: List[Int])List[Int]""");$skip(38); 
  
  val lstNum = List(1,0,9,0,8,0,8);System.out.println("""lstNum  : List[Int] = """ + $show(lstNum ));$skip(21); val res$1 = 
  removeZero(lstNum);System.out.println("""res1: List[Int] = """ + $show(res$1));$skip(53); 
  
  // 4.
  val arr = Array("Tom", "Fred", "Harry");System.out.println("""arr  : Array[String] = """ + $show(arr ));$skip(82); 
  val map = scala.collection.immutable.Map("Tom" -> 3, "Dick" -> 4, "Harry" -> 5);System.out.println("""map  : scala.collection.immutable.Map[String,Int] = """ + $show(map ));$skip(197); 
  def fun(a: Array[String], m: scala.collection.immutable.Map[String, Int]) = {
    a.map(str => m.get(str)).flatMap( x => x)  // Use flatMap to combine the Option value returned by m.get(str)
  };System.out.println("""fun: (a: Array[String], m: scala.collection.immutable.Map[String,Int])Array[Int]""");$skip(15); val res$2 = 
  fun(arr,map);System.out.println("""res2: Array[Int] = """ + $show(res$2));$skip(54); 
  
  // 5.
  val arr5 = Array("Tom", "Fred", "Harry");System.out.println("""arr5  : Array[String] = """ + $show(arr5 ));$skip(132); 
  
  def mkString(s: scala.collection.immutable.Seq[String], separator: String): String = {
    s.reduceLeft(_ + separator + _)
  };System.out.println("""mkString: (s: scala.collection.immutable.Seq[String], separator: String)String""");$skip(31); val res$3 = 
  mkString(arr5.toList, " , ");System.out.println("""res3: String = """ + $show(res$3));$skip(43); 
  
  // 6.
  val lst = List(1, 2, 3, 4, 5);System.out.println("""lst  : List[Int] = """ + $show(lst ));$skip(43); 
  val first = (lst :\ List[Int]())(_ :: _);System.out.println("""first  : List[Int] = """ + $show(first ));$skip(44); 
  val second = (List[Int]() /: lst)(_ :+ _);System.out.println("""second  : List[Int] = """ + $show(second ));$skip(146); 
  //from the previous two fold functions, we know only list can be appended.
  val reverse = (List[Int]() /: lst)((left, right) => right :: left);System.out.println("""reverse  : List[Int] = """ + $show(reverse ));$skip(121); 
                                                  
  // 7.
  def tupled(p: (Double, Int)):Double = {
    p._1 * p._2
  };System.out.println("""tupled: (p: (Double, Int))Double""");$skip(86); 
                                                  
  val prices = List(5.0,20.0,9.95);System.out.println("""prices  : List[Double] = """ + $show(prices ));$skip(32); 
  val quantities = List(10,2,1);System.out.println("""quantities  : List[Int] = """ + $show(quantities ));$skip(48); val res$4 = 

  (prices zip quantities).map( tupled(_) ).sum;System.out.println("""res4: Double = """ + $show(res$4));$skip(122); 
  
  // 8.
  def turnMultiDimensionArray(a: Array[Int], numOfGounpElem: Int) = {
  	a.grouped(numOfGounpElem).toArray
  };System.out.println("""turnMultiDimensionArray: (a: Array[Int], numOfGounpElem: Int)Array[Array[Int]]""");$skip(51); val res$5 = 
  
  turnMultiDimensionArray( (1 to 9).toArray, 5)

  // 10.
  import scala.io.Source;System.out.println("""res5: Array[Array[Int]] = """ + $show(res$5));$skip(98); 
  val frequencies = new collection.immutable.HashMap[Char,Int];System.out.println("""frequencies  : scala.collection.immutable.HashMap[Char,Int] = """ + $show(frequencies ));$skip(55); 
  val fileString = Source.fromFile("XXX.txt").mkString;System.out.println("""fileString  : String = """ + $show(fileString ));$skip(383); val res$6 = 
                           // frequencies is like intial value of foldLeft
  fileString.par.aggregate(frequencies)((f,c) =>
    f + (c -> (f.getOrElse( c, 0) + 1)),
  	// here is like foldLeft's coll(i) opr coll(i+1)
  	(leftMap,rightMap) => leftMap.map( kvp => kvp._1 -> (kvp._2 + rightMap.getOrElse(kvp._1, 0) ))
  	//(a,b) => a.map(e => e._1 -> (b.getOrElse(e._1, 0) + e._2))
  );System.out.println("""res6: scala.collection.immutable.HashMap[Char,Int] = """ + $show(res$6))}

  
  

}

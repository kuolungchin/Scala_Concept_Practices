object ec3 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(24); val res$0 = 
  0 until 9;System.out.println("""res0: scala.collection.immutable.Range = """ + $show(res$0));$skip(31); 

 var arr = Array(1,2,3,4,5,6);System.out.println("""arr  : Array[Int] = """ + $show(arr ));$skip(111); 
 for( i <- 0 until arr.length -1 by 2 ) {
   
   val temp = arr(i)
   arr(i) = arr(i+1)
   arr(i+1) = temp
 
};$skip(5); val res$1 = 
 arr;System.out.println("""res1: Array[Int] = """ + $show(res$1));$skip(218); 

 
 
 def swapAdj(arr2: Array[Int] ) = {
 	for( i <- 0 until arr2.length ) yield {
 		if( i == arr2.length -1)
 			if(i % 2 == 0)  arr2(i)
 			else  arr2(i-1)
 		else if (i % 2 == 0) arr2(i+1)
 		else arr2(i-1)
 	}
 };System.out.println("""swapAdj: (arr2: Array[Int])scala.collection.immutable.IndexedSeq[Int]""");$skip(36); val res$2 = 
 
 swapAdj(Array[Int](1,2,3,4,5,6))
 
 
 import scala.collection.mutable.ArrayBuffer;System.out.println("""res2: scala.collection.immutable.IndexedSeq[Int] = """ + $show(res$2));$skip(100); 
 val arr3 = ArrayBuffer(2,3,4,-1,9,8,11,15,0,-2,9);System.out.println("""arr3  : scala.collection.mutable.ArrayBuffer[Int] = """ + $show(arr3 ));$skip(32); 
 
 val col1 = arr3.filter(_ >0);System.out.println("""col1  : scala.collection.mutable.ArrayBuffer[Int] = """ + $show(col1 ));$skip(32); 
 val col2 = arr3.filter(_ <= 0);System.out.println("""col2  : scala.collection.mutable.ArrayBuffer[Int] = """ + $show(col2 ));$skip(28); 
 val result = col1 ++= col2;System.out.println("""result  : ec3.col1.type = """ + $show(result ));$skip(59); 
 
 
 val arr5 = Array[Double](3,3,5,5,3,3,7,7,5,5,9,9,5,5);System.out.println("""arr5  : Array[Double] = """ + $show(arr5 ));$skip(34); 
 
 val avg = arr5.sum/arr5.length;System.out.println("""avg  : Double = """ + $show(avg ));$skip(39); 
 
 val arr6 = ArrayBuffer(1,3,5,6,7,8);System.out.println("""arr6  : scala.collection.mutable.ArrayBuffer[Int] = """ + $show(arr6 ));$skip(22); val res$3 = 
 arr6.toArray.reverse;System.out.println("""res3: Array[Int] = """ + $show(res$3));$skip(58); 
 
  val arr7 = Array[Double](3,3,5,5,3,3,7,7,5,5,9,9,5,5);System.out.println("""arr7  : Array[Double] = """ + $show(arr7 ));$skip(16); val res$4 = 
  arr7.distinct;System.out.println("""res4: Array[Double] = """ + $show(res$4));$skip(64); 
  
  
  
  
  val arr8 = ArrayBuffer(2,3,4,-1,9,8,11,15,0,-2,9);System.out.println("""arr8  : scala.collection.mutable.ArrayBuffer[Int] = """ + $show(arr8 ));$skip(120); 
  ( for(index <- 0 until arr8.length;  if( arr8(index) < 0 )) yield index).reverse.dropRight(1).foreach(arr8.remove(_));$skip(8); val res$5 = 

  arr8;System.out.println("""res5: scala.collection.mutable.ArrayBuffer[Int] = """ + $show(res$5));$skip(218); 
                                                  
                                                  
                                                  
  val timeZoneColl = java.util.TimeZone.getAvailableIDs.toBuffer;System.out.println("""timeZoneColl  : scala.collection.mutable.Buffer[String] = """ + $show(timeZoneColl ));$skip(147); 
  for(i <- 0 until timeZoneColl.length; if(timeZoneColl(i).startsWith( "America/" )) ){
  	timeZoneColl(i) = timeZoneColl(i).drop("America/".size)
  };$skip(19); val res$6 = 
  timeZoneColl
import java.awt.datatransfer._
import collection.JavaConversions.asScalaBuffer
import collection.mutable.Buffer;System.out.println("""res6: scala.collection.mutable.Buffer[String] = """ + $show(res$6));$skip(193); 

val flavors = SystemFlavorMap.getDefaultFlavorMap.asInstanceOf[SystemFlavorMap];System.out.println("""flavors  : java.awt.datatransfer.SystemFlavorMap = """ + $show(flavors ));$skip(79); 

val res: Buffer[String] = flavors.getNativesForFlavor(DataFlavor.imageFlavor);System.out.println("""res  : scala.collection.mutable.Buffer[String] = """ + $show(res ));$skip(14); 

println(res)}

}

package ch14


object exercise2 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(133); 
  def swap(pair: (Int, Int)) = pair match {
      case (a,b) => (b,a)
      case _ => "Nothing"
  };System.out.println("""swap: (pair: (Int, Int))java.io.Serializable""");$skip(15); val res$0 = 

  swap((5,6));System.out.println("""res0: java.io.Serializable = """ + $show(res$0))}
}

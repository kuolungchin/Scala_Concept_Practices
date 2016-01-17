package ch8

object ex9 {
class Creature {
  def range: Int = 10
  val env: Array[Int] = new Array[Int](range)
}

class Ant extends Creature {
  override def range = 2
};import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(188); 

val ant = new Ant;System.out.println("""ant  : ch8.ex9.Ant = """ + $show(ant ));$skip(8); val res$0 = 
ant.env;System.out.println("""res0: Array[Int] = """ + $show(res$0))}
}

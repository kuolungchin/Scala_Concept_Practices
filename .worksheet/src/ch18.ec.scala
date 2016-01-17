package ch18

object ec {

import scala.collection.mutable. ArrayBuffer

class Network {
  class Member(val name: String) {
    val contacts = new ArrayBuffer[Network#Member]  // for a Member of Any Network
    override def toString = getClass.getName + "[name=" + name +
      ",contacts=" + contacts.map(_.name).mkString("[", ",", "]") + "]"
  
    def equal(that: Any): Boolean = {
    
    	val b = that match {
    	  case _: Member => true
    	  case _ => false
    	}
      b
    }
  }

  private val members = new ArrayBuffer[Member]


  def join(name: String) = {
    val m = new Member(name)
    members += m
    m
  }

  override def toString = getClass.getName + "[members=" + members + "]"
};import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(735); 

  val NetworkA = new Network;System.out.println("""NetworkA  : ch18.ec.Network = """ + $show(NetworkA ));$skip(29); 
  val NetworkB = new Network;System.out.println("""NetworkB  : ch18.ec.Network = """ + $show(NetworkB ));$skip(40); 

  val Basile = NetworkA.join("Basile");System.out.println("""Basile  : ch18.ec.NetworkA.Member = """ + $show(Basile ));$skip(35); 
  val John = NetworkA.join("John");System.out.println("""John  : ch18.ec.NetworkA.Member = """ + $show(John ));$skip(39); 
  val Alfred = NetworkB.join("Alfred");System.out.println("""Alfred  : ch18.ec.NetworkB.Member = """ + $show(Alfred ));$skip(23); val res$0 = 
  Basile.equal(Alfred);System.out.println("""res0: Boolean = """ + $show(res$0))}
}

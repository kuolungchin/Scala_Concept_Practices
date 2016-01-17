package advanced_type

import scala.collection.mutable. ArrayBuffer

class Network {
  class Member(val name: String) {
    val contacts = new ArrayBuffer[Network#Member]  // for a Member of Any Network
    override def toString = getClass.getName + "[name=" + name + 
      ",contacts=" + contacts.map(_.name).mkString("[", ",", "]") + "]"
  
    override def equals(that: Any): Boolean = {
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
}

object Exercise4 extends App {
  val chatter = new Network
  val myFace = new Network

  val fred = chatter.join("Fred")
  val wilma = chatter.join("Wilma")
  fred.contacts += wilma // OK
  val barney = myFace.join("Barney")
  fred.contacts += barney // Also OK

  println(fred.equals(wilma))
  println(fred.equals(barney))
  
}
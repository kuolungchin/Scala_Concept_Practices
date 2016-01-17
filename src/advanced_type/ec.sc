package advanced_type

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
}

  val NetworkA = new Network                      //> NetworkA  : advanced_type.ec.Network = advanced_type.ec$Network[members=Arra
                                                  //| yBuffer()]
  val NetworkB = new Network                      //> NetworkB  : advanced_type.ec.Network = advanced_type.ec$Network[members=Arra
                                                  //| yBuffer()]

  val Basile = NetworkA.join("Basile")            //> Basile  : advanced_type.ec.NetworkA.Member = advanced_type.ec$Network$Member
                                                  //| [name=Basile,contacts=[]]
  val John = NetworkA.join("John")                //> John  : advanced_type.ec.NetworkA.Member = advanced_type.ec$Network$Member[n
                                                  //| ame=John,contacts=[]]
  val Alfred = NetworkB.join("Alfred")            //> Alfred  : advanced_type.ec.NetworkB.Member = advanced_type.ec$Network$Member
                                                  //| [name=Alfred,contacts=[]]
  Basile.equal(Alfred)                            //> res0: Boolean = false
}
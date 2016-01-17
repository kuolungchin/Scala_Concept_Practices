package classes

class Person2(val name: String) {
  def firstName = name.splitAt(name.indexOf(" "))._1 
  def lastName = name.splitAt(name.indexOf(" "))._2.trim()
}
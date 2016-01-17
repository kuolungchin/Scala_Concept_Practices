package classes

class Employee {
  private var n: String = "John Q. Public"
  var salary: Double = 0.0

  def this(name: String, salary: Double) {
    this()
    n = name
    this.salary = salary
  }

  def name = n
}
package classes

class Person(var age: Int) {
  //This statements will be executed during primary construction phase.
  if(age < 0) age = 0 
}
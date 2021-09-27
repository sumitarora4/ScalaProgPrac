package Exercises

import scala.util.Sorting

object SortInReverseAgeOrder extends  App {

  case class Person(name: String, age: Int)
  val personArray = Array(Person("Sumit", 37), Person("Kumar", 38), Person("Arora", 40) )

  val fruits = Array("cherry", "apple", "banana")

object ReverseAgeOrder extends Ordering[Person]{
  override def compare(x: Person, y: Person): Int = y.age.compare(x.age)
}

Sorting.quickSort(personArray)(ReverseAgeOrder)

  print("result="+ personArray.mkString(","))
}
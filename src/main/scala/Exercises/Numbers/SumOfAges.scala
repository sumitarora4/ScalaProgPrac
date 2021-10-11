package Exercises.Numbers

object SumOfAges extends App {

  val aSeq = Seq(
    "James", 7,
    "Andy", 8,
    "Tommy", 10,
    "Bob", 13,
    "Sam", 10
  )

  //  to collect any value of specific type from sequence we can use collect partial function
  val getAgeFromSeq = aSeq.collect{
    case age: Int => age
  }
  println(getAgeFromSeq)

  val ageSum = getAgeFromSeq.sum
  println(ageSum)
}

package Chapter3

case class Person(firstName: String, lastName: String, age: Int) {
  def description = s"$firstName $lastName is $age ${if (age <= 1) "year" else "years"} old"
}

object Person {
  def filterAdult(ref: List[Person]): List[Person] = {
    ref.filter(r1 => r1.age >=18)
  }
}

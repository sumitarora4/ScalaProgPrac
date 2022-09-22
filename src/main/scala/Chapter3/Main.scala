package Chapter3

//import Chapter3.Person

object Main extends App{

  val persons = List(
    Person(firstName = "Akira", lastName = "Sakura", age = 12),
    Person(firstName = "Peter", lastName = "Müller", age = 34),
    Person(firstName = "Nick", lastName = "Tagart", age = 52)
  )

  val adults = Person.filterAdult(persons)
  val description = adults.map( p => p.description  ).mkString("\n\t")

  println(s"the adults are \n$description")


}

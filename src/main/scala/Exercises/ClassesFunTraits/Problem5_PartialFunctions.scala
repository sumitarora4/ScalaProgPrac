package Exercises.ClassesFunTraits

object Problem5_PartialFunctions extends App{

  val nameIsJohn : PartialFunction[String, Boolean] = {
    case "John" => true
  }

  val nameIsJoe: PartialFunction[String, Boolean] = {
    case "Joe" => true
  }

  val nameIsJackOrJill: PartialFunction[String, Boolean] = {
    case "Jack" | "Jill" => true
  }

  val invalidName: PartialFunction[String, Boolean] = {
    case _ => false
  }

  val name = nameIsJoe orElse nameIsJohn orElse nameIsJackOrJill orElse(invalidName)
  println(name("sumit"))
  println(name("Jack"))

}

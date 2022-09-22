package FunProgramming

object FunctionalProgrammingSimplified {

  def main(args: Array[String]): Unit = {

    val numbers = List(1,2,3,4)

    val isEven = (i: Int) => i % 2 ==0
    println(numbers.filter(isEven))

//    val sumation = (a: Int, b: Int) => a + b
//    println(numbers.map{
//      x => x.sumation
//    })

    // using functions as a variable
    val double =(i : Int) => i * 2
    val triple =(i: Int) => i * 3

    val functions = Map("2x" -> double, "3x" -> triple)

    val dub = functions("2x")
    println("dub="+dub(2))

    val trip = functions("3x")
    println("trip="+trip(2))

    // using functions as a variable through case class
    case class Person(firstName: String, middleName:String, lastName: String)
    val fullName = (p: Person) => s"${p.firstName} ${p.lastName}"

    val listOfPerson = List(Person("Sumit","Kumar", "Arora"), Person("Abeer", "Kumar", "Arora"))
    println(listOfPerson.map(fullName))







  }


}

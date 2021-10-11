package Exercises.ClassesFunTraits

object Problem9_Option extends App{

  case class StudentSnack(name: String, age: Int, snack: Option[String])

  val jack = StudentSnack("Jack", 15, Some("Cupcake"))
  val jill = StudentSnack("Jill", 10, Some("Icecream"))
  val Joe = StudentSnack("Joe", 7, None)
  val james = StudentSnack("James", 10, Some("Chocolate"))
  val john = StudentSnack("John", 11, None)

//  The student Joe now wants to add his favorite snack and it is a cupcake.
  val joeUpdated = Joe.copy(snack = Some("cupcake"))

  val studentList = List(jack, jill, joeUpdated, james, john)

  printStudentList(studentList)

  def printStudentList(studentList: List[StudentSnack]):Unit ={

    studentList.foreach{

      student => println(s"name = ${student.name} is ${student.age} years old. Favorite snack is ${student.snack.getOrElse(" nothing!")}")
    }
  }

}

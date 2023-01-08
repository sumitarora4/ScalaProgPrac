package Exercises.ClassesFunTraits

import scala.annotation.tailrec


/**
 * http://allaboutscala.com/tutorials/scala-exercises-solutions/
 */
object Problem7_RecursiveFirst extends App{

  case class Student(name: String, age: Int)

  val john = Student("John", 7)
  val jack = Student("Jack", 13)
  val joe = Student("Joe", 15)
  val jill = Student("Jill", 15)
  val james = Student("John", 11)

  val studentsVector = Vector(john, jack, joe, jill, james)
  println(studentsVector.mkString("\n"))

//  val studentsAge = studentsVector.collect{
//    case stud => stud.age
//  }

  def studentAgeFunction(studentsVector: Vector[Student]) = {

//    Recursive Understanding
//    Vector(john, jack, joe, jill, james).student = studentTailRec(Vector(john, jack, joe, jill, james), 0)
//    = studentTailRec(Vector(john, jack, joe, jill, james), 1)
//    = studentTailRec(Vector(john, jack, joe, jill, james), 2)
//    = studentTailRec(Vector(john, jack, joe, jill, james), 3)
//    = studentTailRec(Vector(john, jack, joe, jill, james), 4)
//    Complexity O(N)

    @tailrec
    def studentTailRec(studentsVector: Vector[Student], index: Int): Boolean = {
      if(studentsVector.length == index) false
      else if(studentsVector(index).age == 15) true
      else studentTailRec(studentsVector, index + 1)
    }

    studentTailRec(studentsVector, 0)
  }

  println(s" is there any student who's age is 15: ${studentAgeFunction(studentsVector)}")
}

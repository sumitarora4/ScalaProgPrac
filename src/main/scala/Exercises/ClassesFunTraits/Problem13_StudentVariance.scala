package Exercises.ClassesFunTraits

object Problem13_StudentVariance {

  def main(args: Array[String]): Unit = {

    abstract class Student(name: String, age: Int) {
      def studentId(): Unit
    }

    case class PrimarySchoolStudent(name: String, age: Int) extends Student(name, age) {
      override def studentId(): Unit = {
        println(s"[${this.getClass}] - name: $name - age: $age")
      }
    }


    case class SecondarySchoolStudent(name: String, age: Int) extends Student(name, age) {
      override def studentId(): Unit = {
        println(s"[${this.getClass}] - name: $name - age: $age")
      }
    }


    class School[+S <: Student](students: List[S]) {
      def printStudents(): Unit = {
        students.foreach(_.studentId())
      }
    }


    val jill: PrimarySchoolStudent = PrimarySchoolStudent("Jill", 8)
    val joe: PrimarySchoolStudent = PrimarySchoolStudent("Joe", 7)
    val jack: SecondarySchoolStudent = SecondarySchoolStudent("Jack", 15)
    val james: SecondarySchoolStudent = SecondarySchoolStudent("James", 10)
    val john: SecondarySchoolStudent = SecondarySchoolStudent("John", 11)

    val students = List(jack, james, john, jill, joe)

    val school = new School(students)
    school.printStudents()
  }
}

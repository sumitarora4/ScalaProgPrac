package Chapter3

object Test2 extends  App {

trait Summable[T]{
  def sumElements(list: List[T]): T
}

def processOfList[T](list: List[T]) (implicit summable:Summable[T]):T = {
  summable.sumElements(list)
}

implicit object IntSummbale extends Summable[Int] {
  override def sumElements(list: List[Int]): Int = list.sum
}

implicit object StringSummable extends  Summable[String] {
  override def sumElements(list: List[String]): String = list.mkString("")
}

println(processOfList(List(1,2,3)))
println(processOfList(List("sumit", "Kumar","arora")))
//  println(processOfList((List(true,false,true))))



  val list1 = List(1,2,3)
  val list2 = List(4,5,6)

  val rs1 = list1.zip(list2)
  val res2 = rs1.map{
    x=> x._1 * x._2

  }

  println(res2)




  list1.map{x => list2.map{
    y => x * y
  }


  }


   case class Employee(id: Int, name: String, salary: Double)
   val emp1 = Employee(1, "sumit", 10.0)
 val empsalr= emp1.copy(salary= 20.0)
//  val empSalary = emp1.salary(20.0)


  val str = "HCLTechnologies".toUpperCase
  val freq = str.groupBy(identity).mapValues(_.size)
  println(freq)




  /*for{
    res1 <- future(List(1,2,3))
    res2 <- future(List("sumit", "arora"))

  } yield( res1)
*/



}

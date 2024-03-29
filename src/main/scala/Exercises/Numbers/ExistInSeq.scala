package Exercises.Numbers

object ExistInSeq extends App{

  // 1) normal approach
  val aSeq = Seq(10, 77, 90, 50, 100, 110)
  val result = aSeq.contains(77)
  println(result)

  // 2) using boolean function value
  val anExistFunction: Int => Boolean = i => i==77

  // 3) using boolean method
  def anExistFunction2(i: Int): Boolean = i == 77

  val result2 = aSeq.exists(anExistFunction)
  println(result2)
}

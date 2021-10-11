package Exercises.Numbers

object OddNumbersBtwRange extends App{


  // 1) using boolean function
  val aList = List.range(300, 350)

  val oddNumberFun:(Int) => Boolean = i => (i % 2==0)

  val result = aList.filterNot(oddNumberFun)
  println(result.take(20).mkString("||"))

  //2) using syntax sugar
  val oddNumbers = (300 to 350).filter(_ % 2 != 0).take(20).mkString("||")
  print(oddNumbers)
}

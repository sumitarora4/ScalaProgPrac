package Exercises.Numbers

object NotCommonLiterals {

  def main(args: Array[String]): Unit = {

    val s1 = Set(1, 3, 5, 10, 20)
    val s2 = Set(20, 17, 18, 99, 0)

    //    1) normal approach
    val result1 = s1.filterNot(x => s2.contains(x))
    val result2 = s2.filterNot(x => s1.contains(x))

    println(result1)
    println(result2)

    //   2) in build function
    val result11 = s1 -- s2
    val result22 = s2 -- s1

    println(result11)
    println(result22)


  }
}

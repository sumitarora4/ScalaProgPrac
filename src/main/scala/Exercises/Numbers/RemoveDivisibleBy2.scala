package Exercises.Numbers

object RemoveDivisibleBy2 extends App{

  val aSeq = Seq(2, 8, 19, 20, 25, 50, 100, 10)

  val divisibleBy2Fun:(Int) => Boolean = (i) => (i % 2 == 0)

  // remove all elements which are divisible by 2
  val result = aSeq.filterNot(divisibleBy2Fun)
  println(result)

  // and stop removing elements as soon as a number literal is not a factor of two
  val result2 = aSeq.dropWhile(divisibleBy2Fun)
  println(result2)

}

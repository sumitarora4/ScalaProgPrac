package Chapter3

object Test3 extends App{

  val list = List(1, 2, 3)
  val listContain: Int => Boolean = i => i == 77
  val res = list.exists(listContain)

// simple approach
  val res2 = list.contains(77)
  println(res2)


  // odd number between range
  val list1 = List.range(300,350)

  val aBoolean: Int => Boolean = i => i %2 ==0

  // function as a variable
  val aBoolean_v2 = (i: Int) => i % 2 ==0

  val resOddNumber  = list1.filterNot(aBoolean_v2)

  println(resOddNumber)

}

package Chapter3

object test {

  def square(a: Int): Int = {
     a * a
  }

  def sumOfValues(f:Int=> Int) = {
    val list = List(1,2,3)
    val result: List[Int] = list.map(x => f(x))
   result
  }

/*
  val dbValues: List[String] = List("sumit", "arora", null)

  dbValues.foreach{ x: String => x match {
    case Some(x) => println("thats great")
    case None => println("no values found")
  }

  }

  val mutableList = scala.collection.mutable.List()

  val modifiedMutalbeList = mutableList.map{ x =>
    x = x + 1
  }

   mutableList :: modifiedMutalbeList*/




  val immutableList = scala.collection.immutable.List(1,2,3)




  def main(args: Array[String]): Unit = {

    println(sumOfValues(square))
  }





}
